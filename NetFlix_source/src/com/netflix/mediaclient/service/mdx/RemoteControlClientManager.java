// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.EpisodeDetails;
import com.netflix.mediaclient.servicemgr.VideoDetails;
import com.netflix.mediaclient.util.StringUtils;

// Referenced classes of package com.netflix.mediaclient.service.mdx:
//            MediaButtonIntentReceiver, PostPlayMediaButtonIntentReceiver

public final class RemoteControlClientManager
    implements android.media.AudioManager.OnAudioFocusChangeListener
{

    private static final String TAG = "nf_mdx_RemoteClient";
    private String mAlbumTitle;
    private final AudioManager mAudioManager;
    private Bitmap mBoxart;
    private final Context mContext;
    private boolean mInTransition;
    private final ComponentName mIntentReceiverComponent;
    private final ComponentName mIntentReceiverComponentPostPlay;
    private boolean mIsInPostPlay;
    private boolean mPaused;
    private RemoteControlClient mRemoteControlClient;
    private String mTitle;

    public RemoteControlClientManager(Context context)
    {
        Log.d("nf_mdx_RemoteClient", "RemoteControlClientManager");
        mContext = context;
        mIntentReceiverComponent = new ComponentName(mContext, com/netflix/mediaclient/service/mdx/MediaButtonIntentReceiver);
        mIntentReceiverComponentPostPlay = new ComponentName(mContext, com/netflix/mediaclient/service/mdx/PostPlayMediaButtonIntentReceiver);
        mAudioManager = (AudioManager)mContext.getSystemService("audio");
    }

    private void setupButtonIntent(boolean flag, VideoDetails videodetails, String s)
    {
        if (flag && videodetails != null)
        {
            mAudioManager.registerMediaButtonEventReceiver(mIntentReceiverComponentPostPlay);
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(mIntentReceiverComponentPostPlay);
            if (videodetails instanceof EpisodeDetails)
            {
                intent.putExtra("catalogId", Integer.parseInt(videodetails.getParentId()));
                intent.putExtra("episodeId", Integer.parseInt(((EpisodeDetails)videodetails).getNextEpisodeId()));
            }
            intent.putExtra("uuid", s);
            mRemoteControlClient = new RemoteControlClient(PendingIntent.getBroadcast(mContext, 0, intent, 0x8000000));
            return;
        } else
        {
            mAudioManager.registerMediaButtonEventReceiver(mIntentReceiverComponent);
            videodetails = new Intent("android.intent.action.MEDIA_BUTTON");
            videodetails.setComponent(mIntentReceiverComponent);
            mRemoteControlClient = new RemoteControlClient(PendingIntent.getBroadcast(mContext, 0, videodetails, 0));
            return;
        }
    }

    private void setupButtons(boolean flag)
    {
        if (flag)
        {
            mRemoteControlClient.setTransportControlFlags(308);
            mRemoteControlClient.setPlaybackState(2);
            return;
        } else
        {
            mRemoteControlClient.setTransportControlFlags(308);
            mRemoteControlClient.setPlaybackState(3);
            return;
        }
    }

    private void updateMatadata()
    {
        if (mRemoteControlClient != null)
        {
            android.media.RemoteControlClient.MetadataEditor metadataeditor = mRemoteControlClient.editMetadata(true);
            if (mBoxart != null)
            {
                metadataeditor.putBitmap(100, mBoxart);
            }
            if (StringUtils.isNotEmpty(mTitle))
            {
                metadataeditor.putString(7, mTitle);
            }
            if (StringUtils.isNotEmpty(mAlbumTitle))
            {
                metadataeditor.putString(1, mAlbumTitle);
            }
            metadataeditor.apply();
        }
    }

    public boolean isInTransition()
    {
        return mInTransition;
    }

    public boolean isPaused()
    {
        return mPaused;
    }

    public void onAudioFocusChange(int i)
    {
        if (i == 1 || i == 2 || i == 3)
        {
            if (Log.isLoggable("nf_mdx_RemoteClient", 3))
            {
                Log.d("nf_mdx_RemoteClient", (new StringBuilder()).append("onAudioFocusChange gained ").append(i).toString());
            }
        } else
        if (Log.isLoggable("nf_mdx_RemoteClient", 3))
        {
            Log.d("nf_mdx_RemoteClient", (new StringBuilder()).append("onAudioFocusChange lost ").append(i).toString());
            return;
        }
    }

    public void setBoxart(Bitmap bitmap)
    {
        Log.d("nf_mdx_RemoteClient", "RemoteControlClientManager setBoxart ");
        if (bitmap != null)
        {
            mBoxart = bitmap.copy(bitmap.getConfig(), true);
        }
        updateMatadata();
    }

    public void setState(boolean flag, boolean flag1, boolean flag2)
    {
label0:
        {
            Log.d("nf_mdx_RemoteClient", (new StringBuilder()).append("RemoteControlClientManager setState ").append(flag).append(", ").append(flag1).toString());
            mPaused = flag;
            mInTransition = flag1;
            mIsInPostPlay = flag2;
            if (mRemoteControlClient != null)
            {
                if (!mPaused && !mIsInPostPlay)
                {
                    break label0;
                }
                mRemoteControlClient.setPlaybackState(2);
            }
            return;
        }
        mRemoteControlClient.setPlaybackState(3);
    }

    public void setTitles(String s, String s1)
    {
        mTitle = s;
        mAlbumTitle = s1;
        updateMatadata();
    }

    public void start(boolean flag, VideoDetails videodetails, String s)
    {
        Log.d("nf_mdx_RemoteClient", "RemoteControlClientManager start");
        if (1 != mAudioManager.requestAudioFocus(this, 3, 1))
        {
            Log.e("nf_mdx_RemoteClient", "can't gain audio focus");
        }
        setupButtonIntent(flag, videodetails, s);
        mAudioManager.registerRemoteControlClient(mRemoteControlClient);
        setupButtons(flag);
    }

    public void stop()
    {
        Log.d("nf_mdx_RemoteClient", "RemoteControlClientManager stop");
        mAudioManager.abandonAudioFocus(this);
        if (mRemoteControlClient != null)
        {
            mAudioManager.unregisterMediaButtonEventReceiver(mIntentReceiverComponent);
            mAudioManager.unregisterRemoteControlClient(mRemoteControlClient);
            mRemoteControlClient = null;
            mTitle = null;
            mAlbumTitle = null;
        }
    }
}
