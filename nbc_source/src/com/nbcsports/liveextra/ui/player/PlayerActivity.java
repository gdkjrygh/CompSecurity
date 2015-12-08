// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import butterknife.ButterKnife;
import com.adobe.adobepass.accessenabler.api.AccessEnabler;
import com.adobe.adobepass.accessenabler.api.IAccessEnablerDelegate;
import com.adobe.adobepass.accessenabler.models.Mvpd;
import com.adobe.mediacore.ABRControlParameters;
import com.adobe.mediacore.BufferControlParameters;
import com.adobe.mediacore.DefaultMediaPlayer;
import com.adobe.mediacore.MediaPlayer;
import com.adobe.mediacore.metadata.AdSignalingMode;
import com.nbcsports.liveextra.analytics.PlayerAnalytics;
import com.nbcsports.liveextra.content.podbuster.NbcAdvertisingFactory;
import com.nbcsports.liveextra.library.api.models.Asset;
import com.nbcsports.liveextra.library.api.models.VideoSource;
import com.nbcsports.liveextra.library.configuration.Configuration;
import com.nbcsports.liveextra.library.tve.AuthDelegate;
import com.nbcsports.liveextra.library.tve.AuthService;
import com.nbcsports.liveextra.library.ui.systemui.SystemUiHelper;
import com.nbcsports.liveextra.ui.core.BaseActivity;
import com.nbcsports.liveextra.ui.main.core.AssetViewModel;
import com.nbcsports.liveextra.ui.player.dataviews.DataEngine;
import com.nbcsports.liveextra.ui.player.dataviews.PanelBottom;
import com.nbcsports.liveextra.ui.player.dataviews.PanelSide;
import com.nbcsports.liveextra.ui.player.dataviews.PanelTop;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueComponent;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueModule;
import com.phunware.nbc.sochi.NBCSportsApplication;
import com.phunware.nbc.sochi.accessenable.SelectProviderActivity;
import com.phunware.nbc.sochi.fragments.TempPassDialogFragment;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.commons.collections4.CollectionUtils;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerView, DaggerPlayerActivity_Component, PlayerPresenter, AltCamPresenter, 
//            PlayerPresenterListener, ActionBarSponsorView, AdOverlay, AltCamOverlay, 
//            PlayerControlBar, PlayerQosOverlayView, PlayerToolbar, AbstractPresenterListener

public class PlayerActivity extends BaseActivity
{
    public static interface Component
    {

        public abstract PlayerActivity activity();

        public abstract void inject(ActionBarSponsorView actionbarsponsorview);

        public abstract void inject(AdOverlay adoverlay);

        public abstract void inject(AltCamOverlay altcamoverlay);

        public abstract void inject(PlayerActivity playeractivity);

        public abstract void inject(PlayerControlBar playercontrolbar);

        public abstract void inject(PlayerQosOverlayView playerqosoverlayview);

        public abstract void inject(PlayerToolbar playertoolbar);

        public abstract void inject(PlayerView playerview);

        public abstract void inject(PanelBottom panelbottom);

        public abstract void inject(PanelSide panelside);

        public abstract void inject(PanelTop paneltop);

        public abstract void inject(TempPassDialogFragment temppassdialogfragment);

        public abstract PremierLeagueComponent premierLeague(PremierLeagueModule premierleaguemodule);
    }

    public class Module
    {

        private final PlayerActivity activity;
        final PlayerActivity this$0;

        Context context()
        {
            return activity;
        }

        MediaPlayer player()
        {
            MediaPlayer mediaplayer = DefaultMediaPlayer.create(activity.getApplicationContext());
            mediaplayer.setBufferControlParameters(BufferControlParameters.createDual(2000L, 18000L));
            mediaplayer.setABRControlParameters(new ABRControlParameters(0, 0, 0x44aa20, com.adobe.mediacore.ABRControlParameters.ABRPolicy.ABR_AGGRESSIVE));
            return mediaplayer;
        }

        PlayerActivity playerActivity()
        {
            return activity;
        }

        SystemUiHelper systemUiHelper()
        {
            if (android.os.Build.VERSION.SDK_INT >= 19)
            {
                return new SystemUiHelper(activity, 3, 0);
            } else
            {
                return new SystemUiHelper(activity, 2, 0);
            }
        }

        AssetViewModel viewModel()
        {
            return PlayerActivity.this.viewModel;
        }

        public Module(PlayerActivity playeractivity1)
        {
            this$0 = PlayerActivity.this;
            super();
            activity = playeractivity1;
        }
    }


    public static final int REQUEST_AUTHENTICATION_TEMP_PASS = 200;
    private static Component component;
    AltCamPresenter altCamPresenter;
    Set analyticsSet;
    OkHttpClient client;
    Configuration config;
    List dataViews;
    private IAccessEnablerDelegate _flddelegate;
    DataEngine engine;
    private PlayerPresenterListener listener;
    View overlayShim;
    AuthService pass;
    Picasso picasso;
    MediaPlayer player;
    PlayerPresenter playerPresenter;
    View playerShim;
    PlayerView playerView;
    private boolean preventPlay;
    private String resource;
    SystemUiHelper systemUiHelper;
    private String token;
    private Call verifyCall;
    private AssetViewModel viewModel;

    public PlayerActivity()
    {
        _flddelegate = new AuthDelegate() {

            final PlayerActivity this$0;

            public void setToken(String s, String s1)
            {
                super.setToken(s, s1);
                token = s;
                resource = s1;
                Timber.d("Token Request SUCCESS\n\tResource: %s\n\tToken: %s", new Object[] {
                    s1, s
                });
                if (!viewModel.isFree())
                {
                    verifyAuth();
                }
            }

            public void tokenRequestFailed(String s, final String code, String s1)
            {
                super.tokenRequestFailed(s, code, s1);
                Timber.w("Token Request FAIL\n\tResource: %s\n\tCode: %s\n\tDescription: %s", new Object[] {
                    s, code, s1
                });
                runOnUiThread(s1. new Runnable() {

                    final _cls5 this$1;
                    final String val$code;
                    final String val$description;

                    public void run()
                    {
                        if (isFinishing())
                        {
                            return;
                        } else
                        {
                            (new android.app.AlertDialog.Builder(_fld0)).setTitle(code).setMessage(description).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

                                final _cls1 this$2;

                                public void onClick(DialogInterface dialoginterface, int i)
                                {
                                    finish();
                                }

            
            {
                this$2 = _cls1.this;
                super();
            }
                            }).setCancelable(false).show();
                            return;
                        }
                    }

            
            {
                this$1 = final__pcls5;
                code = s;
                description = String.this;
                super();
            }
                });
            }

            
            {
                this$0 = PlayerActivity.this;
                super();
            }
        };
        listener = new AbstractPresenterListener() {

            final PlayerActivity this$0;

            public void onSourceSelected(VideoSource videosource)
            {
                super.onSourceSelected(videosource);
                if (preventPlay)
                {
                    preventPlay = false;
                    return;
                } else
                {
                    play();
                    return;
                }
            }

            public void onToggleFullScreen(boolean flag)
            {
                super.onToggleFullScreen(flag);
                if (dataViews != null)
                {
                    ButterKnife.apply(dataViews, flag. new butterknife.ButterKnife.Action() {

                        final _cls7 this$1;
                        final boolean val$isFullScreen;

                        public void apply(View view, int i)
                        {
                            if (isFullScreen)
                            {
                                i = 8;
                            } else
                            {
                                i = 0;
                            }
                            view.setVisibility(i);
                        }

            
            {
                this$1 = final__pcls7;
                isFullScreen = Z.this;
                super();
            }
                    });
                    if (overlayShim != null)
                    {
                        if (flag)
                        {
                            playerShim.setVisibility(0);
                            overlayShim.setVisibility(8);
                            return;
                        } else
                        {
                            playerShim.setVisibility(8);
                            overlayShim.setVisibility(0);
                            return;
                        }
                    }
                }
            }

            
            {
                this$0 = PlayerActivity.this;
                super();
            }
        };
    }

    public static Component component()
    {
        return component;
    }

    private void playVideo()
    {
        if (playerView != null)
        {
            playerView.bind(viewModel);
        }
    }

    private void setupPodbusters(AssetViewModel assetviewmodel)
    {
        AdSignalingMode adsignalingmode;
        if (assetviewmodel.isVod())
        {
            adsignalingmode = AdSignalingMode.SERVER_MAP;
        } else
        if (assetviewmodel.isReplay())
        {
            adsignalingmode = AdSignalingMode.MANIFEST_CUES;
        } else
        {
            adsignalingmode = AdSignalingMode.MANIFEST_CUES;
        }
        assetviewmodel = new NbcAdvertisingFactory(assetviewmodel.asset().getPid(), assetviewmodel.isLive(), adsignalingmode, this);
        player.registerAdClientFactory(assetviewmodel);
    }

    public void createComponent()
    {
        component = DaggerPlayerActivity_Component.builder().applicationComponent(NBCSportsApplication.component()).module(new Module(this)).build();
    }

    public void inject()
    {
        component().inject(this);
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        i;
        JVM INSTR tableswitch 200 200: default 28
    //                   200 29;
           goto _L1 _L2
_L1:
        return;
_L2:
        switch (j)
        {
        default:
            return;

        case -1: 
            continue; /* Loop/switch isn't completed */

        case 0: // '\0'
            preventPlay = true;
            (new android.app.AlertDialog.Builder(this)).setMessage(0x7f070132).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

                final PlayerActivity this$0;

                public void onClick(DialogInterface dialoginterface, int k)
                {
                    finish();
                }

            
            {
                this$0 = PlayerActivity.this;
                super();
            }
            }).setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

                final PlayerActivity this$0;

                public void onCancel(DialogInterface dialoginterface)
                {
                    finish();
                }

            
            {
                this$0 = PlayerActivity.this;
                super();
            }
            }).setCancelable(true).create().show();
            break;
        }
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            return;
        }
        bundle = getIntent().getExtras();
        if (bundle == null)
        {
            finish();
            return;
        }
        viewModel = new AssetViewModel((Asset)bundle.getParcelable("asset"));
        viewModel.initSelectedSource(getString(0x7f070032));
        createComponent();
        setContentView(0x7f04008b);
        inject();
        setupPodbusters(viewModel);
        for (bundle = analyticsSet.iterator(); bundle.hasNext(); ((PlayerAnalytics)bundle.next()).attachPlayer(player)) { }
        if (engine != null)
        {
            engine.start(player);
        }
        playerPresenter.hideChrome();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (engine != null)
        {
            engine.stop();
        }
        if (!CollectionUtils.isEmpty(analyticsSet))
        {
            PlayerAnalytics playeranalytics;
            for (Iterator iterator = analyticsSet.iterator(); iterator.hasNext(); playeranalytics.onDestroy())
            {
                playeranalytics = (PlayerAnalytics)iterator.next();
                playeranalytics.onPause();
            }

        }
        try
        {
            if (player != null && player.getStatus() != com.adobe.mediacore.MediaPlayer.PlayerState.RELEASED)
            {
                player.release();
            }
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            Timber.d(illegalstateexception, "Player not in correct state to release", new Object[0]);
        }
    }

    protected void onPause()
    {
        super.onPause();
        if (pass != null)
        {
            if (pass.getSelectedMvpd() != null && pass.getSelectedMvpd().getId().startsWith("TempPass"))
            {
                pass.getInstance().logout();
            }
            pass.unregister(_flddelegate);
        }
        try
        {
            (new Thread(new Runnable() {

                final PlayerActivity this$0;

                public void run()
                {
                    if (verifyCall != null)
                    {
                        verifyCall.cancel();
                    }
                }

            
            {
                this$0 = PlayerActivity.this;
                super();
            }
            })).start();
        }
        catch (Exception exception)
        {
            Timber.d(exception, "Could not cancel call", new Object[0]);
        }
        if (playerPresenter != null)
        {
            playerPresenter.unregister(listener);
        }
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        viewModel = new AssetViewModel((Asset)bundle.getParcelable("asset"));
    }

    protected void onResume()
    {
        super.onResume();
        if (pass == null || playerPresenter == null)
        {
            finish();
            return;
        } else
        {
            pass.register(_flddelegate);
            playerPresenter.register(listener);
            return;
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("asset", viewModel.asset());
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1)
        {
            playerPresenter.playerTouched();
            return true;
        } else
        {
            return false;
        }
    }

    void play()
    {
        if (viewModel.asset().isFree())
        {
            playVideo();
            return;
        } else
        {
            pass.checkAuthorization(viewModel.asset().getChannel());
            return;
        }
    }

    public void showTempPassDialog(boolean flag)
    {
        if (!isFinishing())
        {
            try
            {
                String s = (new StringBuilder()).append("tempPassDialog").append(Boolean.toString(flag)).toString();
                Object obj = getSupportFragmentManager();
                if (((FragmentManager) (obj)).findFragmentByTag(s) == null)
                {
                    obj = ((FragmentManager) (obj)).beginTransaction();
                    TempPassDialogFragment temppassdialogfragment = TempPassDialogFragment.newInstance(flag);
                    temppassdialogfragment.setCallback(new com.phunware.nbc.sochi.fragments.TempPassDialogFragment.Callback() {

                        final PlayerActivity this$0;

                        public void pause()
                        {
                            if (player.getStatus() == com.adobe.mediacore.MediaPlayer.PlayerState.PLAYING)
                            {
                                player.pause();
                            }
                        }

                        public void play()
                        {
                            if (player.getStatus() == com.adobe.mediacore.MediaPlayer.PlayerState.PAUSED)
                            {
                                player.play();
                            }
                        }

                        public void stop()
                        {
                            pass.unregister(_flddelegate);
                            Intent intent = new Intent(PlayerActivity.this, com/phunware/nbc/sochi/accessenable/SelectProviderActivity);
                            intent.putExtra("asset", viewModel.asset());
                            intent.putExtra("allow_temp_pass", pass.isTempPassEnabled());
                            startActivityForResult(intent, 200);
                            overridePendingTransition(0x7f05000c, 0x7f05000d);
                        }

            
            {
                this$0 = PlayerActivity.this;
                super();
            }
                    });
                    ((FragmentTransaction) (obj)).add(temppassdialogfragment, s).commit();
                    return;
                }
            }
            catch (IllegalStateException illegalstateexception)
            {
                Timber.d(illegalstateexception.toString(), new Object[0]);
                return;
            }
        }
    }

    void verifyAuth()
    {
        Object obj = Uri.parse("https://sp.auth.adobe.com/tvs/v1/sign");
        if (token == null || resource == null || viewModel == null)
        {
            finish();
        }
        com.squareup.okhttp.RequestBody requestbody = (new FormEncodingBuilder()).add("mediaToken", Base64.encodeToString(token.getBytes(), 0)).add("resource", Base64.encodeToString(resource.getBytes(), 0)).add("cdn", "akamai").add("url", viewModel.getStreamUrl()).build();
        obj = (new com.squareup.okhttp.Request.Builder()).url(((Uri) (obj)).toString()).post(requestbody).header("Accept", "text/plain").build();
        verifyCall = client.newCall(((Request) (obj)));
        verifyCall.enqueue(new Callback() {

            final PlayerActivity this$0;

            public void onFailure(Request request, IOException ioexception)
            {
                runOnUiThread(ioexception. new Runnable() {

                    final _cls4 this$1;
                    final IOException val$e;

                    public void run()
                    {
                        if (isFinishing())
                        {
                            return;
                        } else
                        {
                            (new android.app.AlertDialog.Builder(_fld0)).setTitle("Token verification request failed").setMessage(e.getMessage()).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

                                final _cls1 this$2;

                                public void onClick(DialogInterface dialoginterface, int i)
                                {
                                    finish();
                                }

            
            {
                this$2 = _cls1.this;
                super();
            }
                            }).setCancelable(false).show();
                            return;
                        }
                    }

            
            {
                this$1 = final__pcls4;
                e = IOException.this;
                super();
            }
                });
            }

            public void onResponse(Response response)
                throws IOException
            {
                if (response.isSuccessful())
                {
                    try
                    {
                        viewModel.setAuthenticatedStreamUrl(response.body().string());
                    }
                    // Misplaced declaration of an exception variable
                    catch (Response response)
                    {
                        Timber.e(response, "Token verification failed", new Object[0]);
                    }
                    runOnUiThread(new Runnable() {

                        final _cls4 this$1;

                        public void run()
                        {
                            playVideo();
                        }

            
            {
                this$1 = _cls4.this;
                super();
            }
                    });
                    return;
                } else
                {
                    runOnUiThread(new Runnable() {

                        final _cls4 this$1;

                        public void run()
                        {
                            if (isFinishing())
                            {
                                return;
                            } else
                            {
                                (new android.app.AlertDialog.Builder(_fld0)).setTitle("Token verification failed").setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

                                    final _cls3 this$2;

                                    public void onClick(DialogInterface dialoginterface, int i)
                                    {
                                        finish();
                                    }

            
            {
                this$2 = _cls3.this;
                super();
            }
                                }).setCancelable(false).show();
                                return;
                            }
                        }

            
            {
                this$1 = _cls4.this;
                super();
            }
                    });
                    return;
                }
            }

            
            {
                this$0 = PlayerActivity.this;
                super();
            }
        });
    }





/*
    static String access$302(PlayerActivity playeractivity, String s)
    {
        playeractivity.token = s;
        return s;
    }

*/


/*
    static String access$402(PlayerActivity playeractivity, String s)
    {
        playeractivity.resource = s;
        return s;
    }

*/




/*
    static boolean access$602(PlayerActivity playeractivity, boolean flag)
    {
        playeractivity.preventPlay = flag;
        return flag;
    }

*/
}
