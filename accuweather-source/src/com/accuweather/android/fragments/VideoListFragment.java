// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.fragments;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.accuweather.android.models.VideoModel;
import com.accuweather.android.models.WeatherDataModel;
import java.io.Serializable;
import java.util.List;

// Referenced classes of package com.accuweather.android.fragments:
//            TableFragment

public class VideoListFragment extends TableFragment
{
    public static interface IVideoListFragmentListener
        extends Serializable
    {

        public abstract void onVideoItemSelected(int i);
    }


    public VideoListFragment()
    {
    }

    public static VideoListFragment newInstance(WeatherDataModel weatherdatamodel)
    {
        VideoListFragment videolistfragment = new VideoListFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("content", weatherdatamodel);
        videolistfragment.setArguments(bundle);
        return videolistfragment;
    }

    private void setVideoFragmentListener(final IVideoListFragmentListener listener)
    {
        setOnItemSelectedListener(new TableFragment.OnItemSelectedListener() {

            final VideoListFragment this$0;
            final IVideoListFragmentListener val$listener;

            public void onItemSelected(int i)
            {
                listener.onVideoItemSelected(i);
            }

            
            {
                this$0 = VideoListFragment.this;
                listener = ivideolistfragmentlistener;
                super();
            }
        });
    }

    protected Bitmap getBitmap(int i)
    {
        return null;
    }

    protected String getImageUrl(int i)
    {
        return ((VideoModel)mWeatherDataModel.getVideos().get(i)).getThumbnailUrl();
    }

    protected int getNumberOfCells()
    {
        return mWeatherDataModel.getVideos().size();
    }

    protected String getTitleText(int i)
    {
        return ((VideoModel)mWeatherDataModel.getVideos().get(i)).getName();
    }

    protected boolean isInitialized()
    {
        return mWeatherDataModel != null && super.isInitialized();
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        if (getActivity() instanceof IVideoListFragmentListener)
        {
            setVideoFragmentListener((IVideoListFragmentListener)getActivity());
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (getArguments() != null)
        {
            bundle = (WeatherDataModel)getArguments().getSerializable("content");
        } else
        {
            bundle = null;
        }
        mWeatherDataModel = bundle;
        mTitle = getString(com.accuweather.android.R.string.Videos).toUpperCase(getResources().getConfiguration().locale);
    }
}
