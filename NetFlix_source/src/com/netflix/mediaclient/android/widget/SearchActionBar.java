// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SearchView;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;

// Referenced classes of package com.netflix.mediaclient.android.widget:
//            NetflixActionBar

public class SearchActionBar extends NetflixActionBar
{

    private static final String TAG = "SearchActionBar";
    private final ProgressBar progressSpinner = (ProgressBar)getContentView().findViewById(0x7f070064);
    protected final SearchView searchView = (SearchView)getContentView().findViewById(0x7f070063);

    public SearchActionBar(NetflixActivity netflixactivity)
    {
        super(netflixactivity, true);
        searchView.setIconified(false);
        searchView.setIconifiedByDefault(false);
        searchView.setImeOptions(0x2000003);
        searchView.setInputType(8192);
        searchView.setQueryRefinementEnabled(true);
        searchView.setSubmitButtonEnabled(false);
        netflixactivity = ((SearchManager)netflixactivity.getSystemService("search")).getSearchableInfo(netflixactivity.getComponentName());
        searchView.setSearchableInfo(netflixactivity);
        configureSearchViewTextView();
        configureSearchViewIcon();
        replaceBackgroundDrawables();
    }

    private void configureSearchViewIcon()
    {
        int i = getActivity().getResources().getIdentifier("android:id/search_mag_icon", null, null);
        ImageView imageview = (ImageView)searchView.findViewById(i);
        if (imageview != null)
        {
            imageview.setImageResource(0x7f0200d7);
        }
    }

    private void configureSearchViewTextView()
    {
        int i = getActivity().getResources().getIdentifier("android:id/search_src_text", null, null);
        TextView textview = (TextView)searchView.findViewById(i);
        if (textview != null)
        {
            textview.setHintTextColor(searchView.getResources().getColor(0x7f09003a));
            textview.setImeOptions(0x2000000);
        }
    }

    private void replaceBackgroundDrawable(String s, int i)
    {
        int j = searchView.getContext().getResources().getIdentifier(s, null, null);
        View view = searchView.findViewById(j);
        if (view == null)
        {
            Log.w("SearchActionBar", (new StringBuilder()).append("Couldn't find view for: ").append(s).toString());
            return;
        } else
        {
            view.setBackgroundResource(i);
            return;
        }
    }

    private void replaceBackgroundDrawables()
    {
        replaceBackgroundDrawable("android:id/search_plate", 0x7f020158);
        replaceBackgroundDrawable("android:id/submit_area", 0x7f020159);
    }

    public void clearFocus()
    {
        searchView.clearFocus();
        View view = searchView.findFocus();
        if (view != null)
        {
            view.clearFocus();
        }
    }

    protected int getLayoutId()
    {
        return 0x7f030018;
    }

    public void hideProgressSpinner()
    {
        progressSpinner.setVisibility(4);
    }

    public void setOnQueryTextListener(android.widget.SearchView.OnQueryTextListener onquerytextlistener)
    {
        searchView.setOnQueryTextListener(onquerytextlistener);
    }

    public void setQuery(String s, boolean flag)
    {
        searchView.setQuery(s, flag);
    }

    public void showProgressSpinner()
    {
        progressSpinner.setVisibility(0);
    }
}
