// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.app.Activity;
import android.view.View;
import android.widget.Toast;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.Video;
import com.netflix.mediaclient.servicemgr.VideoType;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.ui.common.PlayContextProvider;
import com.netflix.mediaclient.ui.details.DetailsActivity;
import com.netflix.mediaclient.ui.social.FacebookLoginActivity;

public class VideoDetailsClickListener
    implements android.view.View.OnClickListener, android.view.View.OnLongClickListener
{

    private static final String TAG = "VideoDetailsClickListener";
    private final NetflixActivity activity;
    private final PlayContextProvider playContextProvider;

    public VideoDetailsClickListener(NetflixActivity netflixactivity, PlayContextProvider playcontextprovider)
    {
        activity = netflixactivity;
        playContextProvider = playcontextprovider;
    }

    public void onClick(View view)
    {
        Object obj = view.getTag(0x7f070035);
        if (obj == null)
        {
            Log.w("VideoDetailsClickListener", "No video details for click listener to use");
            return;
        }
        obj = (Video)obj;
        if (VideoType.SOCIAL_POPULAR.equals(((Video) (obj)).getType()))
        {
            Log.v("VideoDetailsClickListener", "Launching connect with facebook activity...");
            FacebookLoginActivity.show((Activity)view.getContext());
            return;
        } else
        {
            view = playContextProvider.getPlayContext();
            DetailsActivity.show(activity, ((Video) (obj)), view);
            return;
        }
    }

    public boolean onLongClick(View view)
    {
        view = ((View) (view.getTag(0x7f070035)));
        if (view == null)
        {
            return false;
        } else
        {
            view = (Video)view;
            Toast.makeText(activity, view.getTitle(), 0).show();
            return true;
        }
    }

    public void remove(View view)
    {
        Log.v("VideoDetailsClickListener", "Removing click listeners");
        view.setOnClickListener(null);
        view.setOnLongClickListener(null);
        view.setTag(0x7f070035, null);
    }

    public void update(View view, Video video)
    {
        if (Log.isLoggable("VideoDetailsClickListener", 2))
        {
            Log.v("VideoDetailsClickListener", (new StringBuilder()).append("Adding click listeners for: ").append(video.getTitle()).append(", trackId: ").append(playContextProvider.getPlayContext().getTrackId()).toString());
        }
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        view.setTag(0x7f070035, video);
    }
}
