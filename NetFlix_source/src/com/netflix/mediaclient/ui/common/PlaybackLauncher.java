// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.common;

import android.content.Context;
import android.os.Handler;
import android.util.Pair;
import android.widget.Toast;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.webclient.model.BillboardDetails;
import com.netflix.mediaclient.servicemgr.IMdx;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.MovieDetails;
import com.netflix.mediaclient.servicemgr.Playable;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.ShowDetails;
import com.netflix.mediaclient.servicemgr.VideoDetails;
import com.netflix.mediaclient.servicemgr.VideoType;
import com.netflix.mediaclient.ui.Asset;
import com.netflix.mediaclient.ui.mdx.MdxMiniPlayerFrag;
import com.netflix.mediaclient.ui.pin.PinDialogVault;
import com.netflix.mediaclient.ui.pin.PinVerifier;
import com.netflix.mediaclient.ui.player.PlayerActivity;
import com.netflix.mediaclient.util.StringUtils;

// Referenced classes of package com.netflix.mediaclient.ui.common:
//            PlayContext

public final class PlaybackLauncher
{
    private static class FetchVideoDetailsForMdxCallback extends LoggingManagerCallback
    {

        private final NetflixActivity activity;
        private final PlayContext playContext;

        private void handleResponse(VideoDetails videodetails, int i)
        {
            if (activity.destroyed())
            {
                return;
            }
            if (i != 0 || videodetails == null)
            {
                Log.w("nf_play", "Error loading video details for MDX launch - hiding mini player");
                Toast.makeText(activity, 0x7f0c00fe, 1).show();
                activity.hideMdxMiniPlayer();
                return;
            } else
            {
                PlaybackLauncher.startPlaybackAfterPIN(activity, videodetails, playContext);
                return;
            }
        }

        public void onMovieDetailsFetched(MovieDetails moviedetails, int i)
        {
            super.onMovieDetailsFetched(moviedetails, i);
            handleResponse(moviedetails, i);
        }

        public void onShowDetailsFetched(ShowDetails showdetails, int i)
        {
            super.onShowDetailsFetched(showdetails, i);
            handleResponse(showdetails, i);
        }

        public FetchVideoDetailsForMdxCallback(NetflixActivity netflixactivity, PlayContext playcontext)
        {
            super("nf_play");
            activity = netflixactivity;
            playContext = playcontext;
        }
    }


    private static final String TAG = "nf_play";

    private PlaybackLauncher()
    {
    }

    public static void getDetailsAndStartPlayback(NetflixActivity netflixactivity, BillboardDetails billboarddetails, PlayContext playcontext)
    {
label0:
        {
            ServiceManager servicemanager;
label1:
            {
                if (!shouldPlayOnRemoteTarget(netflixactivity.getServiceManager()))
                {
                    break label0;
                }
                servicemanager = netflixactivity.getServiceManager();
                if (servicemanager != null)
                {
                    Log.d("nf_play", "Getting video details for mdx playback");
                    MdxMiniPlayerFrag.sendShowAndDisableIntent(netflixactivity);
                    if (billboarddetails.getType() != VideoType.MOVIE)
                    {
                        break label1;
                    }
                    servicemanager.fetchMovieDetails(billboarddetails.getId(), new FetchVideoDetailsForMdxCallback(netflixactivity, playcontext));
                }
                return;
            }
            if (billboarddetails.getType() == VideoType.SHOW)
            {
                servicemanager.fetchShowDetails(billboarddetails.getId(), null, new FetchVideoDetailsForMdxCallback(netflixactivity, playcontext));
                return;
            } else
            {
                throw new IllegalStateException((new StringBuilder()).append("Invalid billboard video type: ").append(billboarddetails.getType()).toString());
            }
        }
        Log.d("nf_play", "Starting local playback, asking for video details first");
        PlayerActivity.getDetailsAndPlayVideo(netflixactivity, billboarddetails, playcontext);
    }

    private static boolean isExisitingMdxTargetAvailable(IMdx imdx, String s)
    {
        if (Log.isLoggable("nf_play", 3))
        {
            Log.d("nf_play", (new StringBuilder()).append("Check if MDX remote target exist in target list: ").append(s).toString());
        }
        if (!imdx.isReady())
        {
            Log.w("nf_play", "MDX service is NOT ready");
            return false;
        }
        imdx = imdx.getTargetList();
        if (imdx == null || imdx.length < 1)
        {
            Log.w("nf_play", "No MDX remote targets found");
            return false;
        }
        for (int i = 0; i < imdx.length; i++)
        {
            if (s.equals(((Pair) (imdx[i])).first))
            {
                Log.d("nf_play", "Target found");
                return true;
            }
        }

        Log.w("nf_play", "Target NOT found!");
        return false;
    }

    private static void logMdx(IMdx imdx)
    {
        if (Log.isLoggable("nf_play", 3))
        {
            Log.d("nf_play", (new StringBuilder()).append("MDX is ready ").append(imdx.isReady()).toString());
            if (imdx.getTargetList() != null)
            {
                Log.d("nf_play", (new StringBuilder()).append("MDX found targets: ").append(imdx.getTargetList().length).toString());
            } else
            {
                Log.d("nf_play", "MDX found no targets ");
            }
            Log.d("nf_play", (new StringBuilder()).append("MDX current target '").append(imdx.getCurrentTarget()).append("'").toString());
        }
    }

    public static boolean shouldPlayOnRemoteTarget(ServiceManager servicemanager)
    {
        if (servicemanager == null || !servicemanager.isReady() || servicemanager.getMdx() == null)
        {
            Log.e("nf_play", "MDX or service manager are null! That should NOT happen. Default to local.");
            return false;
        }
        servicemanager = servicemanager.getMdx();
        logMdx(servicemanager);
        String s = servicemanager.getCurrentTarget();
        if (StringUtils.isEmpty(s))
        {
            Log.d("nf_play", "Local target, play on device");
            return false;
        } else
        {
            return isExisitingMdxTargetAvailable(servicemanager, s);
        }
    }

    public static void startPlaybackAfterPIN(NetflixActivity netflixactivity, Playable playable, PlayContext playcontext)
    {
        startPlaybackAfterPIN(netflixactivity, Asset.create(playable, playcontext, PlayerActivity.PIN_VERIFIED.booleanValue()));
    }

    public static void startPlaybackAfterPIN(NetflixActivity netflixactivity, Asset asset)
    {
        verifyPinAndPlay(netflixactivity, asset, shouldPlayOnRemoteTarget(netflixactivity.getServiceManager()));
    }

    public static void startPlaybackForceLocal(NetflixActivity netflixactivity, Asset asset)
    {
        verifyPinAndPlay(netflixactivity, asset, false);
    }

    public static void startPlaybackForceRemote(NetflixActivity netflixactivity, Asset asset)
    {
        verifyPinAndPlay(netflixactivity, asset, true);
    }

    public static void startPlaybackOnPINSuccess(NetflixActivity netflixactivity, Asset asset, boolean flag)
    {
        if (flag)
        {
            Log.d("nf_play", "Starting MDX remote playback");
            if (!com.netflix.mediaclient.service.mdx.MdxAgent.Utils.playVideo(netflixactivity, asset, false))
            {
                return;
            } else
            {
                asset = netflixactivity.getApplication();
                (new Handler(netflixactivity.getMainLooper())).postDelayed(new Runnable(asset) {

                    final Context val$context;

                    public void run()
                    {
                        MdxMiniPlayerFrag.sendShowAndDisableIntent(context);
                    }

            
            {
                context = context1;
                super();
            }
                }, 250L);
                return;
            }
        } else
        {
            Log.d("nf_play", "Start local playback");
            PlayerActivity.playVideo(netflixactivity, asset);
            return;
        }
    }

    private static void verifyPinAndPlay(NetflixActivity netflixactivity, Asset asset, boolean flag)
    {
        Log.d("nf_play", String.format("nf_pin verifyPinAndPlay - %s protected:%b", new Object[] {
            asset.getPlayableId(), Boolean.valueOf(asset.isPinProtected())
        }));
        PinDialogVault pindialogvault = new PinDialogVault(com.netflix.mediaclient.ui.pin.PinDialogVault.PinInvokedFrom.PLAY_LAUNCHER.getValue(), asset, flag);
        PinVerifier.getInstance().verify(netflixactivity, asset.isPinProtected(), pindialogvault);
    }
}
