// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.activity;

import android.app.ActionBar;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Html;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.ConfigurationUtils;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.framework.view.activity.HomeActivity;
import com.kohls.mcommerce.opal.wallet.rest.WalletService;
import com.kohls.mcommerce.opal.wallet.rest.containers.WalletResponse;
import com.kohls.mcommerce.opal.wallet.util.Appconfig;
import com.kohls.mcommerce.opal.wallet.util.WalletFontCache;
import java.lang.ref.WeakReference;
import java.util.List;

public class WalletActivity extends FragmentActivity
    implements android.view.View.OnClickListener
{
    class DownloadWalletData extends AsyncTask
    {

        final WalletActivity this$0;

        protected transient Boolean doInBackground(Integer ainteger[])
        {
            if (Appconfig.isNetworkAvailable(getApplicationContext()))
            {
                ainteger = new WalletService(new WeakReference(getApplicationContext()));
                String s = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getWalletId();
                if (TextUtils.isEmpty(s))
                {
                    ainteger = ainteger.getWalletbyEmail(null);
                } else
                {
                    ainteger = ainteger.getWalletData(s);
                }
                if (ainteger != null && !ainteger.isSuccess())
                {
                    return Boolean.valueOf(false);
                }
                KohlsPhoneApplication.getInstance().getAuthenticationUtils().setWalletId(ainteger.getWalletId());
                if (ainteger != null && ainteger.getWalletItems() != null && ainteger.getWalletItems().size() > 0)
                {
                    return Boolean.valueOf(true);
                }
            }
            return Boolean.valueOf(false);
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Integer[])aobj);
        }

        protected void onPostExecute(Boolean boolean1)
        {
            super.onPostExecute(boolean1);
            if (boolean1.booleanValue())
            {
                boolean1 = new Intent(getApplicationContext(), com/kohls/mcommerce/opal/framework/view/activity/HomeActivity);
                boolean1.putExtra("open_screen_key", "open_my_wallet");
                startActivity(boolean1);
                finish();
            }
            ((ProgressBar)findViewById(0x7f0d010b)).setVisibility(8);
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Boolean)obj);
        }

        DownloadWalletData()
        {
            this$0 = WalletActivity.this;
            super();
        }
    }


    MediaController controller;
    String hint;
    int pauseTime;

    public WalletActivity()
    {
        hint = "<html><body style=\"text-align:justify\"><b>Have you ever gone to check out and realized you forgot your Kohl's Cash at home? Now you can store your Kohl's Cash on your smartphone and get reminders before it expires!</b></body></Html>";
        pauseTime = -1;
    }

    public void initActionBar()
    {
        ActionBar actionbar = getActionBar();
        if (actionbar != null)
        {
            actionbar.setDisplayHomeAsUpEnabled(true);
            actionbar.setDisplayUseLogoEnabled(false);
            actionbar.show();
        }
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
    }

    public void onBackPressed()
    {
        super.onBackPressed();
    }

    public void onClick(View view)
    {
        view.getId();
        JVM INSTR tableswitch 2131558665 2131558666: default 28
    //                   2131558665 29
    //                   2131558666 44;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        UtilityMethods.openAccountActivity(this, true, "wallet", 7001);
        finish();
        return;
_L3:
        if (!((VideoView)findViewById(0x7f0d010c)).isPlaying() && ((VideoView)findViewById(0x7f0d010c)).getCurrentPosition() <= 0)
        {
            controller = new MediaController(((VideoView)findViewById(0x7f0d010c)).getContext());
            ((ProgressBar)findViewById(0x7f0d010b)).setVisibility(0);
            ((VideoView)findViewById(0x7f0d010c)).setVisibility(0);
            ((VideoView)findViewById(0x7f0d010c)).setVideoPath(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getWalletVideoURL());
            ((VideoView)findViewById(0x7f0d010c)).setMediaController(controller);
            ((VideoView)findViewById(0x7f0d010c)).setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() {

                final WalletActivity this$0;

                public void onCompletion(MediaPlayer mediaplayer)
                {
                    ((VideoView)findViewById(0x7f0d010c)).setVisibility(8);
                    setRequestedOrientation(1);
                }

            
            {
                this$0 = WalletActivity.this;
                super();
            }
            });
            ((VideoView)findViewById(0x7f0d010c)).setOnPreparedListener(new android.media.MediaPlayer.OnPreparedListener() {

                final WalletActivity this$0;

                public void onPrepared(MediaPlayer mediaplayer)
                {
                    ((ProgressBar)findViewById(0x7f0d010b)).setVisibility(8);
                    mediaplayer.seekTo(pauseTime);
                    setRequestedOrientation(4);
                }

            
            {
                this$0 = WalletActivity.this;
                super();
            }
            });
            ((VideoView)findViewById(0x7f0d010c)).setOnErrorListener(new android.media.MediaPlayer.OnErrorListener() {

                final WalletActivity this$0;

                public boolean onError(MediaPlayer mediaplayer, int i, int j)
                {
                    ((ProgressBar)findViewById(0x7f0d010b)).setVisibility(8);
                    return false;
                }

            
            {
                this$0 = WalletActivity.this;
                super();
            }
            });
            ((VideoView)findViewById(0x7f0d010c)).start();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2 && ((VideoView)findViewById(0x7f0d010c)).isPlaying())
        {
            getActionBar().hide();
            getWindow().addFlags(1024);
            ((VideoView)findViewById(0x7f0d010c)).setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
            ((VideoView)findViewById(0x7f0d010c)).bringToFront();
        } else
        {
            if (configuration.orientation == 1)
            {
                getActionBar().show();
                getWindow().clearFlags(1024);
                configuration = (android.widget.RelativeLayout.LayoutParams)((VideoView)findViewById(0x7f0d010c)).getLayoutParams();
                configuration.addRule(15, -1);
                configuration.addRule(3, 0x7f0d0107);
                ((VideoView)findViewById(0x7f0d010c)).setLayoutParams(configuration);
                return;
            }
            if (configuration.orientation == 2)
            {
                setRequestedOrientation(1);
                return;
            }
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03001e);
        ((TextView)findViewById(0x7f0d0108)).setText(Html.fromHtml(hint));
        ((TextView)findViewById(0x7f0d0108)).setTypeface(WalletFontCache.getGothamBold(getApplicationContext()), 1);
        ((TextView)findViewById(0x7f0d0106)).setTypeface(WalletFontCache.getGothamBook(getApplicationContext()));
        ((TextView)findViewById(0x7f0d0107)).setTypeface(WalletFontCache.getGothamBook(getApplicationContext()));
        ((TextView)findViewById(0x7f0d0109)).setTypeface(WalletFontCache.getGothamBook(getApplicationContext()), 1);
        ((ProgressBar)findViewById(0x7f0d010b)).setVisibility(8);
        findViewById(0x7f0d010a).setOnClickListener(this);
        findViewById(0x7f0d0109).setOnClickListener(this);
        if (!getIntent().getBooleanExtra("signin", false))
        {
            ((TextView)findViewById(0x7f0d0109)).setVisibility(8);
        } else
        {
            ((TextView)findViewById(0x7f0d0109)).setVisibility(0);
        }
        initActionBar();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        onBackPressed();
        return true;
    }

    protected void onPause()
    {
        if (controller != null)
        {
            pauseTime = ((VideoView)findViewById(0x7f0d010c)).getCurrentPosition();
        }
        super.onPause();
    }

    protected void onResume()
    {
        if (!TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUsernameFromPref()) && !Appconfig.isSignInShown && getIntent().getBooleanExtra("signin", false))
        {
            ((ProgressBar)findViewById(0x7f0d010b)).setVisibility(0);
            (new DownloadWalletData()).execute(new Integer[] {
                Integer.valueOf(0)
            });
            (new DownloadWalletData()).execute(new Integer[] {
                Integer.valueOf(1)
            });
        }
        if ((VideoView)findViewById(0x7f0d010c) != null && controller != null)
        {
            ((VideoView)findViewById(0x7f0d010c)).start();
            ((ProgressBar)findViewById(0x7f0d010b)).setVisibility(0);
        }
        String s = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSigninStatus();
        if (!TextUtils.isEmpty(s) && s.equalsIgnoreCase("YES"))
        {
            ((TextView)findViewById(0x7f0d0109)).setTypeface(WalletFontCache.getGothamBook(getApplicationContext()), 1);
            ((TextView)findViewById(0x7f0d0109)).setVisibility(4);
        }
        if (!TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getUserAccessTokenFromPref()))
        {
            ((TextView)findViewById(0x7f0d0109)).setTypeface(WalletFontCache.getGothamBook(getApplicationContext()), 1);
            ((TextView)findViewById(0x7f0d0109)).setVisibility(4);
        } else
        {
            ((TextView)findViewById(0x7f0d0109)).setTypeface(WalletFontCache.getGothamBook(getApplicationContext()), 1);
            ((TextView)findViewById(0x7f0d0109)).setVisibility(0);
        }
        getIntent().putExtra("signin", false);
        super.onResume();
    }
}
