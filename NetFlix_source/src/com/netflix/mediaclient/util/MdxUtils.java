// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Pair;
import android.view.View;
import android.widget.AdapterView;
import android.widget.SeekBar;
import android.widget.Toast;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.logging.client.model.ActionOnUIError;
import com.netflix.mediaclient.servicemgr.EpisodeDetails;
import com.netflix.mediaclient.servicemgr.IMdx;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.Playable;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.VideoDetails;
import com.netflix.mediaclient.ui.Asset;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.mdx.MdxTarget;
import com.netflix.mediaclient.ui.mdx.MdxTargetSelection;
import com.netflix.mediaclient.ui.mdx.RemotePlayer;
import com.netflix.mediaclient.ui.player.PlayerActivity;

// Referenced classes of package com.netflix.mediaclient.util:
//            StringUtils, LogUtils

public final class MdxUtils
{
    public static interface MdxTargetSelectionDialogInterface
    {

        public abstract long getCurrentPositionMs();

        public abstract PlayContext getPlayContext();

        public abstract RemotePlayer getPlayer();

        public abstract MdxTargetSelection getTargetSelection();

        public abstract Playable getVideoDetails();

        public abstract boolean isPlayingLocally();

        public abstract boolean isPlayingRemotely();

        public abstract void notifyPlayingBackLocal();

        public abstract void notifyPlayingBackRemote();
    }

    public static class SetVideoRatingCallback extends LoggingManagerCallback
    {

        private final NetflixActivity activity;
        private final float rating;

        public void onVideoRatingSet(int i)
        {
            super.onVideoRatingSet(i);
            if (activity.destroyed())
            {
                return;
            }
            if (i != 0)
            {
                Log.w("MdxUtils", "Invalid status code failed");
                Toast.makeText(activity, 0x7f0c0150, 1).show();
                Log.d("MdxUtils", "Report rate action ended");
                LogUtils.LogReportErrorArgs logreporterrorargs = new LogUtils.LogReportErrorArgs(i, ActionOnUIError.displayedError, "", null);
                LogUtils.reportRateActionEnded(activity, logreporterrorargs.getReason(), logreporterrorargs.getError(), null, Integer.valueOf((int)rating));
                return;
            } else
            {
                Log.v("MdxUtils", "Rating has been updated ok");
                Toast.makeText(activity, 0x7f0c0151, 1).show();
                LogUtils.reportRateActionEnded(activity, com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.success, null, null, Integer.valueOf((int)rating));
                return;
            }
        }

        public SetVideoRatingCallback(NetflixActivity netflixactivity, float f)
        {
            super("MdxUtils");
            activity = netflixactivity;
            rating = f;
        }
    }


    private static final int MDX_EOS_DELTA_INSECOND = 10;
    private static final String TAG = "MdxUtils";

    private MdxUtils()
    {
    }

    public static AlertDialog createMdxTargetSelectionDialog(NetflixActivity netflixactivity, MdxTargetSelectionDialogInterface mdxtargetselectiondialoginterface)
    {
        ServiceManager servicemanager = netflixactivity.getServiceManager();
        MdxTargetSelection mdxtargetselection = mdxtargetselectiondialoginterface.getTargetSelection();
        int i = mdxtargetselection.getDevicePositionByUUID(servicemanager.getMdx().getCurrentTarget());
        mdxtargetselection.setTarget(i);
        com.netflix.mediaclient.ui.mdx.MdxTargetSelectionDialog.Builder builder = new com.netflix.mediaclient.ui.mdx.MdxTargetSelectionDialog.Builder(netflixactivity);
        builder.setCancelable(true);
        builder.setTitle(0x7f0c011e);
        builder.setAdapterData(mdxtargetselection.getTargets(netflixactivity));
        String s1 = "";
        String s = s1;
        if (mdxtargetselectiondialoginterface.getVideoDetails() != null)
        {
            s = s1;
            if (StringUtils.isNotEmpty(mdxtargetselectiondialoginterface.getVideoDetails().getTitle()))
            {
                s = String.format(netflixactivity.getString(0x7f0c017a), new Object[] {
                    mdxtargetselectiondialoginterface.getVideoDetails().getTitle()
                });
            }
        }
        builder.setSelection(i, s);
        builder.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener(netflixactivity, servicemanager, mdxtargetselection, mdxtargetselectiondialoginterface) {

            final NetflixActivity val$activity;
            final MdxTargetSelectionDialogInterface val$callbacks;
            final MdxTargetSelection val$mdxTargetSelector;
            final ServiceManager val$serviceManager;

            public void onItemClick(AdapterView adapterview, View view, int j, long l)
            {
                Log.d("MdxUtils", (new StringBuilder()).append("Mdx target clicked: item with id ").append(l).append(", on position ").append(j).toString());
                activity.removeVisibleDialog();
                if (serviceManager == null || !serviceManager.isReady())
                {
                    Log.w("MdxUtils", "Service not ready - bailing early");
                    return;
                }
                mdxTargetSelector.setTarget(j);
                adapterview = mdxTargetSelector.getSelectedTarget();
                if (adapterview != null) goto _L2; else goto _L1
_L1:
                Log.e("MdxUtils", "Target is NULL, this should NOT happen!");
_L4:
                activity.invalidateOptionsMenu();
                return;
_L2:
                if (adapterview.getUUID() != null && adapterview.getUUID().equals(serviceManager.getMdx().getCurrentTarget()))
                {
                    if (Log.isLoggable("MdxUtils", 3))
                    {
                        Log.d("MdxUtils", "Same MDX target selected. Do nothing and dismiss dialog");
                    }
                } else
                if (adapterview.isLocal())
                {
                    if (callbacks.isPlayingRemotely())
                    {
                        Log.d("MdxUtils", "We were playing remotely - switching to playback locally");
                        serviceManager.getMdx().switchPlaybackFromTarget(null, 0);
                        adapterview = Asset.create(callbacks.getVideoDetails(), callbacks.getPlayContext(), PlayerActivity.PIN_VERIFIED.booleanValue());
                        adapterview.setPlaybackBookmark((int)(callbacks.getCurrentPositionMs() / 1000L));
                        PlaybackLauncher.startPlaybackForceLocal(activity, adapterview);
                        callbacks.notifyPlayingBackLocal();
                    } else
                    {
                        Log.d("MdxUtils", "Target is local. Remove current target from MDX agent.");
                        serviceManager.getMdx().setCurrentTarget(null);
                    }
                } else
                if (MdxUtils.isMdxTargetAvailable(serviceManager, adapterview.getUUID()))
                {
                    if (callbacks.isPlayingLocally() || callbacks.isPlayingRemotely())
                    {
                        if (Log.isLoggable("MdxUtils", 3))
                        {
                            Log.d("MdxUtils", (new StringBuilder()).append("Remote target is available, switching playback to: ").append(adapterview.getUUID()).toString());
                        }
                        view = callbacks.getPlayer();
                        j = 0;
                        if (view != null)
                        {
                            int k = view.getPositionInSeconds();
                            j = k;
                            if (Log.isLoggable("MdxUtils", 3))
                            {
                                Log.d("MdxUtils", (new StringBuilder()).append("Start remote playback from position [sec] ").append(k).toString());
                                j = k;
                            }
                        } else
                        {
                            Log.e("MdxUtils", "Remote player is null. This should not happen!");
                        }
                        serviceManager.getMdx().switchPlaybackFromTarget(adapterview.getUUID(), j);
                        callbacks.notifyPlayingBackRemote();
                    } else
                    {
                        if (Log.isLoggable("MdxUtils", 3))
                        {
                            Log.d("MdxUtils", (new StringBuilder()).append("Target is remote. Setting new current target to: ").append(adapterview.getUUID()).toString());
                        }
                        serviceManager.getMdx().setCurrentTarget(adapterview.getUUID());
                    }
                } else
                {
                    Log.w("MdxUtils", "Remote target is NOT available, stay and dismiss dialog");
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                activity = netflixactivity;
                serviceManager = servicemanager;
                mdxTargetSelector = mdxtargetselection;
                callbacks = mdxtargetselectiondialoginterface;
                super();
            }
        });
        return builder.create();
    }

    public static com.netflix.mediaclient.ui.common.RatingDialogFrag.Rating getRating(VideoDetails videodetails, float f)
    {
        float f2 = 0.0F;
        float f1 = 0.0F;
        com.netflix.mediaclient.ui.common.RatingDialogFrag.Rating rating = new com.netflix.mediaclient.ui.common.RatingDialogFrag.Rating();
        if (videodetails.getUserRating() <= 0.0F && f <= 0.0F)
        {
            Log.d("MdxUtils", "User did not changed ratings before, use predicted rating");
            if (videodetails.getPredictedRating() < 0.0F)
            {
                f = f1;
            } else
            {
                f = videodetails.getPredictedRating();
            }
            rating.value = f;
            rating.user = false;
            return rating;
        }
        if (f > 0.0F && videodetails.getUserRating() != f)
        {
            Log.d("MdxUtils", "User changed ratings, but video object is not updated on callback from web api, use user set rating");
            rating.value = f;
            rating.user = true;
            return rating;
        }
        Log.d("MdxUtils", "User changed rating before, use user rating");
        if (videodetails.getUserRating() < 0.0F)
        {
            f = f2;
        } else
        {
            f = videodetails.getUserRating();
        }
        rating.value = f;
        rating.user = true;
        return rating;
    }

    public static String getVideoId(VideoDetails videodetails)
    {
        if (videodetails instanceof EpisodeDetails)
        {
            Log.d("MdxUtils", "Episode, use show ID as video ID");
            return ((EpisodeDetails)videodetails).getShowId();
        } else
        {
            Log.d("MdxUtils", "Movie, use movie ID as video ID");
            return videodetails.getPlayableId();
        }
    }

    public static boolean isCurrentMdxTargetAvailable(ServiceManager servicemanager)
    {
        if (servicemanager == null || !servicemanager.isReady() || servicemanager.getMdx() == null || !servicemanager.getMdx().isReady())
        {
            Log.d("MdxUtils", "MDX service is NOT ready");
            return false;
        } else
        {
            return isMdxTargetAvailable(servicemanager, servicemanager.getMdx().getCurrentTarget());
        }
    }

    public static boolean isMdxTargetAvailable(ServiceManager servicemanager, String s)
    {
        if (Log.isLoggable("MdxUtils", 3))
        {
            Log.d("MdxUtils", (new StringBuilder()).append("Check if MDX remote target exist in target list: ").append(s).toString());
        }
        if (StringUtils.isEmpty(s))
        {
            Log.d("MdxUtils", "uuid is empty");
            return false;
        }
        if (servicemanager == null || !servicemanager.isReady() || servicemanager.getMdx() == null || !servicemanager.getMdx().isReady())
        {
            Log.d("MdxUtils", "MDX service is NOT ready");
            return false;
        }
        servicemanager = servicemanager.getMdx().getTargetList();
        if (servicemanager == null || servicemanager.length < 1)
        {
            Log.w("MdxUtils", "No MDX remote targets found");
            return false;
        }
        for (int i = 0; i < servicemanager.length; i++)
        {
            if (s.equals(((Pair) (servicemanager[i])).first))
            {
                Log.d("MdxUtils", "Target found");
                return true;
            }
        }

        Log.w("MdxUtils", "Target NOT found!");
        return false;
    }

    public static boolean isSameVideoPlaying(IMdx imdx, String s)
    {
        imdx = imdx.getVideoDetail();
        if (Log.isLoggable("MdxUtils", 3))
        {
            if (StringUtils.isNotEmpty(s))
            {
                Log.d("MdxUtils", (new StringBuilder()).append("mCurrentPlayout.getPlayableId(): ").append(s).toString());
            } else
            {
                Log.d("MdxUtils", "mCurrentPlayout is empty");
            }
            if (imdx != null)
            {
                Log.d("MdxUtils", (new StringBuilder()).append("currentVideo.getPlayableId(): ").append(imdx.getPlayableId()).toString());
            } else
            {
                Log.d("MdxUtils", "currentVideo is null ");
            }
        }
        if (imdx != null && imdx.getPlayableId() != null && imdx.getPlayableId().equals(s))
        {
            Log.d("MdxUtils", "Same video is playing, just sync...");
            return true;
        } else
        {
            Log.d("MdxUtils", "Video is not currently playing or different video, start play if play is not already pending...");
            return false;
        }
    }

    public static void registerReceiver(Activity activity, BroadcastReceiver broadcastreceiver)
    {
        Log.d("MdxUtils", "Register receiver");
        IntentFilter intentfilter = new IntentFilter("ui_rating");
        intentfilter.addAction("nflx_button_selected");
        intentfilter.addAction("nflx_button_canceled");
        intentfilter.addCategory("LocalIntentNflxUi");
        intentfilter.setPriority(999);
        try
        {
            LocalBroadcastManager.getInstance(activity).registerReceiver(broadcastreceiver, intentfilter);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            Log.e("MdxUtils", "Failed to register ", activity);
        }
    }

    public static int setProgressByBif(SeekBar seekbar)
    {
        int k = seekbar.getProgress();
        int j = (k / 10) * 10;
        int l = seekbar.getMax();
        int i = j;
        if (j + 10 >= l)
        {
            i = j;
            if (l > 0)
            {
                Log.d("MdxUtils", "seek to close to EOS, defaulting to 10 seconss before EOS.");
                i = l - 10;
            }
        }
        if (i == k)
        {
            if (Log.isLoggable("MdxUtils", 3))
            {
                Log.d("MdxUtils", (new StringBuilder()).append("Right on target, no need to ajust seekbar position ").append(k).append(" [sec]").toString());
            }
            return i;
        }
        if (Log.isLoggable("MdxUtils", 3))
        {
            Log.d("MdxUtils", (new StringBuilder()).append("Progres : ").append(k).append(" [sec] vs. bif position ").append(i).append(" [sec]").toString());
        }
        seekbar.setProgress(i);
        return i;
    }

    public static void unregisterReceiver(Activity activity, BroadcastReceiver broadcastreceiver)
    {
        try
        {
            LocalBroadcastManager.getInstance(activity).unregisterReceiver(broadcastreceiver);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            Log.e("MdxUtils", "Failed to unregister ", activity);
        }
    }
}
