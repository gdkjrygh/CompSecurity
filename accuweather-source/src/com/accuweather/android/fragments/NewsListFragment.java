// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.fragments;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.news.NewsModel;
import java.io.Serializable;
import java.util.List;

// Referenced classes of package com.accuweather.android.fragments:
//            TableFragment

public class NewsListFragment extends TableFragment
{
    public static interface INewsListFragmentListener
        extends Serializable
    {

        public abstract void onNewsItemSelected(int i);
    }


    public NewsListFragment()
    {
    }

    public static NewsListFragment newInstance(WeatherDataModel weatherdatamodel)
    {
        NewsListFragment newslistfragment = new NewsListFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("content", weatherdatamodel);
        newslistfragment.setArguments(bundle);
        return newslistfragment;
    }

    private void setNewsFragmentListener(final INewsListFragmentListener listener)
    {
        setOnItemSelectedListener(new TableFragment.OnItemSelectedListener() {

            final NewsListFragment this$0;
            final INewsListFragmentListener val$listener;

            public void onItemSelected(int i)
            {
                listener.onNewsItemSelected(i);
            }

            
            {
                this$0 = NewsListFragment.this;
                listener = inewslistfragmentlistener;
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
        return ((NewsModel)mWeatherDataModel.getNews().get(i)).getImageUrl();
    }

    protected int getNumberOfCells()
    {
        return mWeatherDataModel.getNews().size();
    }

    protected String getTitleText(int i)
    {
        return ((NewsModel)mWeatherDataModel.getNews().get(i)).getTitle();
    }

    protected boolean isInitialized()
    {
        return mWeatherDataModel != null && super.isInitialized();
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        if (getActivity() instanceof INewsListFragmentListener)
        {
            setNewsFragmentListener((INewsListFragmentListener)getActivity());
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
        mTitle = getString(com.accuweather.android.R.string.News).toUpperCase(getResources().getConfiguration().locale);
    }

    protected boolean showPlayOverlay(int i)
    {
        return false;
    }
}
