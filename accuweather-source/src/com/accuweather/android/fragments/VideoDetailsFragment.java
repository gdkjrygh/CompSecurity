// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.fragments;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;
import com.accuweather.android.models.FragmentPayload;
import com.accuweather.android.models.VideoModel;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.Utilities;
import com.tremorvideo.sdk.android.videoad.Settings;
import com.tremorvideo.sdk.android.videoad.TremorVideo;

// Referenced classes of package com.accuweather.android.fragments:
//            WeatherFragment

public class VideoDetailsFragment extends WeatherFragment
{
    public static interface IVideoDetailsFragmentListener
    {

        public abstract void onVideoCompleted();
    }


    public static final String ARG_ITEM_ID = "item_id";
    private static final String CONTENT = "content";
    private static final String TREMOR_ADSPACE_PRODUCTION = "372891";
    private int mCurrentVideoTime;
    private boolean mIsVideoAdPlaying;
    private IVideoDetailsFragmentListener mListener;
    private MediaController mMediaController;
    private String mUrl;
    private VideoModel mVideo;
    private VideoView mVideoView;

    public VideoDetailsFragment()
    {
        mIsVideoAdPlaying = false;
        mCurrentVideoTime = 0;
    }

    public static VideoDetailsFragment newInstance(VideoModel videomodel)
    {
        VideoDetailsFragment videodetailsfragment = new VideoDetailsFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("content", videomodel);
        videodetailsfragment.setArguments(bundle);
        return videodetailsfragment;
    }

    public void init()
    {
        if (mVideo == null)
        {
            return;
        } else
        {
            updateView();
            return;
        }
    }

    protected boolean isInitialized()
    {
        return mUrl != null && super.isInitialized();
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        init();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (getActivity() instanceof IVideoDetailsFragmentListener)
        {
            mListener = (IVideoDetailsFragmentListener)getActivity();
        }
        if (getArguments() != null)
        {
            bundle = (VideoModel)getArguments().getSerializable("content");
        } else
        {
            bundle = null;
        }
        mVideo = bundle;
        updateView();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(com.accuweather.android.R.layout.video_player, null);
        viewgroup = Data.getInstance(getActivity()).getCurrentlyViewedWeatherDataModel();
        TremorVideo.initialize(getActivity(), "372891");
        bundle = new Settings();
        bundle.userLatitude = viewgroup.getLatitude().doubleValue();
        bundle.userLongitude = viewgroup.getLongitude().doubleValue();
        bundle.userZip = viewgroup.getPostalCode();
        TremorVideo.updateSettings(bundle);
        TremorVideo.start();
        boolean flag;
        try
        {
            mIsVideoAdPlaying = TremorVideo.showAd(getActivity(), 1);
            flag = mIsVideoAdPlaying;
        }
        // Misplaced declaration of an exception variable
        catch (ViewGroup viewgroup)
        {
            return layoutinflater;
        }
        if (flag);
        return layoutinflater;
    }

    public void onDestroy()
    {
        super.onDestroy();
    }

    public void onPause()
    {
        super.onPause();
        Logger.i(this);
        if (mVideoView != null)
        {
            mVideoView.pause();
            mCurrentVideoTime = mVideoView.getCurrentPosition();
        }
    }

    public void onReceive(Intent intent)
    {
        if (intent.getAction().equals("accuwx.intent.action.UPDATE_FRAGMENT"))
        {
            intent = ((Intent) (intent.getExtras().get("fragment_payload")));
            if (intent instanceof FragmentPayload)
            {
                intent = ((FragmentPayload)intent).getLocationKey();
                if (intent != null)
                {
                    intent = getData().getWeatherDataModelFromCode(intent);
                    if (intent != null)
                    {
                        mWeatherDataModel = intent;
                        updateView();
                    }
                }
            }
        }
    }

    public void onResume()
    {
        super.onResume();
        Logger.i(this);
        if (mIsVideoAdPlaying)
        {
            mIsVideoAdPlaying = false;
        } else
        if (mVideoView != null)
        {
            mVideoView.start();
            mVideoView.seekTo(mCurrentVideoTime);
            return;
        }
    }

    public void onStart()
    {
        super.onStart();
        if (!mIsVideoAdPlaying);
    }

    public void setUrl(String s)
    {
        mUrl = s;
        updateView();
    }

    public void setVideoDetailsFragmentListener(IVideoDetailsFragmentListener ivideodetailsfragmentlistener)
    {
        mListener = ivideodetailsfragmentlistener;
    }

    public void updateView()
    {
        if (isInitialized())
        {
            Utilities.setTextColor(getView(), -1);
            Utilities.setTypeFace(getView(), Data.getDefaultTypeface());
            mVideoView = (VideoView)getView().findViewById(com.accuweather.android.R.id.videoView);
            mVideoView.setVideoURI(Uri.parse(mUrl));
            if (mMediaController == null)
            {
                mMediaController = new MediaController(getActivity());
            }
            mVideoView.setMediaController(mMediaController);
            mVideoView.setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() {

                final VideoDetailsFragment this$0;

                public void onCompletion(MediaPlayer mediaplayer)
                {
                    if (mListener != null)
                    {
                        mCurrentVideoTime = 0;
                        mListener.onVideoCompleted();
                    }
                }

            
            {
                this$0 = VideoDetailsFragment.this;
                super();
            }
            });
            mVideoView.requestFocus();
            if (!mVideoView.isPlaying())
            {
                mVideoView.start();
                return;
            }
        }
    }



/*
    static int access$102(VideoDetailsFragment videodetailsfragment, int i)
    {
        videodetailsfragment.mCurrentVideoTime = i;
        return i;
    }

*/
}
