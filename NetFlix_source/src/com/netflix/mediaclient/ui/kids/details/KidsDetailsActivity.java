// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.details;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.FragmentHostActivity;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.service.logging.client.model.DataContext;
import com.netflix.mediaclient.servicemgr.ManagerStatusListener;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.VideoType;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.ui.common.PlayContextImp;
import com.netflix.mediaclient.ui.common.PlayContextProvider;

// Referenced classes of package com.netflix.mediaclient.ui.kids.details:
//            KidsMovieDetailsFrag, KidsShowDetailsFrag, KidsCharacterDetailsFrag

public class KidsDetailsActivity extends FragmentHostActivity
    implements PlayContextProvider
{

    private static final String TAG = "KidsShowDetailsActivity";
    private PlayContext playContext;
    private String videoId;
    private VideoType videoType;

    public KidsDetailsActivity()
    {
    }

    protected ManagerStatusListener createManagerStatusListener()
    {
        return new ManagerStatusListener() {

            final KidsDetailsActivity this$0;

            public void onManagerReady(ServiceManager servicemanager, int i)
            {
                ((ManagerStatusListener)getPrimaryFrag()).onManagerReady(servicemanager, i);
            }

            public void onManagerUnavailable(ServiceManager servicemanager, int i)
            {
                ((ManagerStatusListener)getPrimaryFrag()).onManagerUnavailable(servicemanager, i);
            }

            
            {
                this$0 = KidsDetailsActivity.this;
                super();
            }
        };
    }

    protected Fragment createPrimaryFrag()
    {
        static class _cls2
        {

            static final int $SwitchMap$com$netflix$mediaclient$servicemgr$VideoType[];

            static 
            {
                $SwitchMap$com$netflix$mediaclient$servicemgr$VideoType = new int[VideoType.values().length];
                try
                {
                    $SwitchMap$com$netflix$mediaclient$servicemgr$VideoType[VideoType.MOVIE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$servicemgr$VideoType[VideoType.SHOW.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$servicemgr$VideoType[VideoType.CHARACTERS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2..SwitchMap.com.netflix.mediaclient.servicemgr.VideoType[videoType.ordinal()])
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Don't know how to handle type: ").append(videoType).toString());

        case 1: // '\001'
            return KidsMovieDetailsFrag.create(videoId);

        case 2: // '\002'
            return KidsShowDetailsFrag.create(videoId);

        case 3: // '\003'
            return KidsCharacterDetailsFrag.create(videoId);
        }
    }

    protected DataContext getDataContext()
    {
        return new DataContext(playContext, videoId);
    }

    public PlayContext getPlayContext()
    {
        return playContext;
    }

    public com.netflix.mediaclient.servicemgr.IClientLogging.ModalView getUiScreen()
    {
        if (videoType == VideoType.CHARACTERS)
        {
            return com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.characterDetails;
        } else
        {
            return com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.movieDetails;
        }
    }

    public boolean isForKids()
    {
        return true;
    }

    protected void onCreate(Bundle bundle)
    {
        if (!getIntent().hasExtra("extra_video_type"))
        {
            throw new IllegalStateException("Start intent must provide extra value: extra_video_type");
        }
        videoId = getIntent().getStringExtra("extra_video_id");
        videoType = (VideoType)getIntent().getSerializableExtra("extra_video_type");
        playContext = (PlayContextImp)getIntent().getParcelableExtra("extra_playcontext");
        if (Log.isLoggable("KidsShowDetailsActivity", 2))
        {
            Log.v("KidsShowDetailsActivity", (new StringBuilder()).append("TRACK_ID: ").append(playContext.getTrackId()).toString());
        }
        super.onCreate(bundle);
        getNetflixActionBar().setLogoType(com.netflix.mediaclient.android.widget.NetflixActionBar.LogoType.GONE);
        getNetflixActionBar().setTitle(getIntent().getStringExtra("extra_video_title"));
    }
}
