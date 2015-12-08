// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.details;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.FragmentHostActivity;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.logging.client.model.DataContext;
import com.netflix.mediaclient.servicemgr.ErrorLogging;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.ManagerStatusListener;
import com.netflix.mediaclient.servicemgr.Playable;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.Video;
import com.netflix.mediaclient.servicemgr.VideoDetails;
import com.netflix.mediaclient.servicemgr.VideoType;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.ui.common.PlayContextImp;
import com.netflix.mediaclient.ui.common.VideoDetailsProvider;
import com.netflix.mediaclient.ui.kids.details.KidsDetailsActivity;
import com.netflix.mediaclient.ui.mdx.MdxMenu;

// Referenced classes of package com.netflix.mediaclient.ui.details:
//            MovieDetailsActivity, ShowDetailsActivity, DetailsMenu

public abstract class DetailsActivity extends FragmentHostActivity
    implements com.netflix.mediaclient.android.widget.ErrorWrapper.Callback, ManagerStatusListener, VideoDetailsProvider
{

    public static final String EXTRA_EPISODE_ID = "extra_episode_id";
    public static final String EXTRA_PLAY_CONTEXT = "extra_playcontext";
    public static final String EXTRA_VIDEO_ID = "extra_video_id";
    public static final String EXTRA_VIDEO_TITLE = "extra_video_title";
    public static final String EXTRA_VIDEO_TYPE = "extra_video_type";
    private static final String TAG = "DetailsActivity";
    static final boolean USE_DUMMY_DATA = false;
    private DetailsMenu detailsMenu;
    private String episodeId;
    private PlayContext mPlayContext;
    private ServiceManager serviceMan;
    private String videoId;

    public DetailsActivity()
    {
    }

    private void sendRetryRequest(Fragment fragment)
    {
        if (fragment == null || !(fragment instanceof com.netflix.mediaclient.android.widget.ErrorWrapper.Callback))
        {
            return;
        } else
        {
            Log.v("DetailsActivity", "Found frag to execute retry request...");
            ((com.netflix.mediaclient.android.widget.ErrorWrapper.Callback)fragment).onRetryRequested();
            return;
        }
    }

    public static void show(NetflixActivity netflixactivity, Playable playable, PlayContext playcontext)
    {
        if (playable.getType() == VideoType.EPISODE)
        {
            show(netflixactivity, VideoType.SHOW, playable.getParentId(), playable.getParentTitle(), playcontext);
            return;
        } else
        {
            show(netflixactivity, playable.getType(), playable.getId(), playable.getTitle(), playcontext);
            return;
        }
    }

    public static void show(NetflixActivity netflixactivity, Video video, PlayContext playcontext)
    {
        show(netflixactivity, video.getType(), video.getId(), video.getTitle(), playcontext);
    }

    public static void show(NetflixActivity netflixactivity, VideoType videotype, String s, String s1, PlayContext playcontext)
    {
        Object obj = null;
        boolean flag = netflixactivity.isForKids();
        boolean flag1 = VideoType.MOVIE.equals(videotype);
        if (flag)
        {
            obj = com/netflix/mediaclient/ui/kids/details/KidsDetailsActivity;
        } else
        if (flag1)
        {
            obj = com/netflix/mediaclient/ui/details/MovieDetailsActivity;
        } else
        if (VideoType.SHOW.equals(videotype))
        {
            obj = com/netflix/mediaclient/ui/details/ShowDetailsActivity;
        } else
        if (com.netflix.mediaclient.service.webclient.model.branches.Video.isSocialVideoType(videotype))
        {
            Log.w("DetailsActivity", "Asked to show details for a social video type - shouldn't happen");
        } else
        {
            netflixactivity.getServiceManager().getClientLogging().getErrorLogging().logHandledException(new IllegalStateException(String.format("Don't know how to handle %s type: %s, playContext:%s", new Object[] {
                s, videotype, playcontext
            })));
        }
        if (obj != null)
        {
            netflixactivity.startActivity((new Intent(netflixactivity, ((Class) (obj)))).putExtra("extra_video_id", s).putExtra("extra_video_title", s1).putExtra("extra_video_type", videotype).putExtra("extra_playcontext", playcontext));
        }
    }

    public static void showEpisodeDetails(Activity activity, String s, String s1, PlayContext playcontext)
    {
        activity.startActivity((new Intent(activity, com/netflix/mediaclient/ui/details/ShowDetailsActivity)).putExtra("extra_video_id", s).putExtra("extra_episode_id", s1).putExtra("extra_playcontext", playcontext));
    }

    protected ManagerStatusListener createManagerStatusListener()
    {
        return this;
    }

    protected DataContext getDataContext()
    {
        return new DataContext(mPlayContext, videoId);
    }

    public String getEpisodeId()
    {
        return episodeId;
    }

    public PlayContext getPlayContext()
    {
        return mPlayContext;
    }

    public com.netflix.mediaclient.servicemgr.IClientLogging.ModalView getUiScreen()
    {
        return com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.movieDetails;
    }

    public VideoDetails getVideoDetails()
    {
        return null;
    }

    public String getVideoId()
    {
        return videoId;
    }

    public void onActionExecuted()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        videoId = getIntent().getStringExtra("extra_video_id");
        episodeId = getIntent().getStringExtra("extra_episode_id");
        PlayContextImp playcontextimp = (PlayContextImp)getIntent().getParcelableExtra("extra_playcontext");
        setPlayContext(playcontextimp);
        if (Log.isLoggable("DetailsActivity", 2))
        {
            Log.v("DetailsActivity", (new StringBuilder()).append("TRACK_ID: ").append(playcontextimp.getTrackId()).toString());
        }
        super.onCreate(bundle);
    }

    protected void onCreateOptionsMenu(Menu menu, Menu menu1)
    {
        MdxMenu.addSelectPlayTarget(getMdxMiniPlayerFrag(), menu);
        detailsMenu = new DetailsMenu(this, menu, videoId);
        super.onCreateOptionsMenu(menu, menu1);
    }

    public void onManagerReady(ServiceManager servicemanager, int i)
    {
        Log.v("DetailsActivity", "ServiceManager ready");
        serviceMan = servicemanager;
        if (detailsMenu != null)
        {
            invalidateOptionsMenu();
        }
        ((ManagerStatusListener)getPrimaryFrag()).onManagerReady(servicemanager, i);
        Fragment fragment = getSecondaryFrag();
        if (fragment != null)
        {
            ((ManagerStatusListener)fragment).onManagerReady(servicemanager, i);
        }
    }

    public void onManagerUnavailable(ServiceManager servicemanager, int i)
    {
        Log.w("DetailsActivity", "ServiceManager unavailable");
        ((ManagerStatusListener)getPrimaryFrag()).onManagerUnavailable(servicemanager, i);
        Fragment fragment = getSecondaryFrag();
        if (fragment != null)
        {
            ((ManagerStatusListener)fragment).onManagerUnavailable(servicemanager, i);
        }
    }

    public void onRetryRequested()
    {
        sendRetryRequest(getPrimaryFrag());
        sendRetryRequest(getSecondaryFrag());
    }

    protected void setPlayContext(PlayContext playcontext)
    {
        mPlayContext = playcontext;
    }

    protected void setVideoId(String s)
    {
        videoId = s;
    }

    public boolean shouldApplyPaddingToSlidingPanel()
    {
        return false;
    }

    public void updateMenus(VideoDetails videodetails)
    {
        if (detailsMenu != null)
        {
            detailsMenu.updateShareItem(serviceMan, videodetails);
        }
    }
}
