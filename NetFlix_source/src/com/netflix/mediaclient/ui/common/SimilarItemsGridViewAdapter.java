// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.common;

import android.app.Activity;
import android.content.res.Resources;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.BaseAdapter;
import android.widget.GridView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.widget.VideoView;
import com.netflix.mediaclient.servicemgr.Trackable;
import com.netflix.mediaclient.servicemgr.Video;
import com.netflix.mediaclient.ui.lomo.PaginatedLoMoAdapter;
import com.netflix.mediaclient.util.DeviceUtils;
import com.netflix.mediaclient.util.ViewUtils;
import java.util.ArrayList;
import java.util.List;

public class SimilarItemsGridViewAdapter extends BaseAdapter
{

    private static final int MIN_NUMBER_SIMS_TO_FETCH = 10;
    private static final String TAG = "SimilarItemsGridViewAdapter";
    private final Activity activity;
    private final boolean clipToCompleteRows;
    private final GridView gridView;
    private int imgHeight;
    private final int numGridCols = getNumGridCols();
    private List similarMovies;
    private Trackable trackable;

    public SimilarItemsGridViewAdapter(Activity activity1, GridView gridview, boolean flag)
    {
        similarMovies = new ArrayList();
        activity = activity1;
        gridView = gridview;
        clipToCompleteRows = flag;
        gridview.setNumColumns(numGridCols);
        gridview.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            final SimilarItemsGridViewAdapter this$0;

            public void onGlobalLayout()
            {
                GridView gridview1 = gridView;
                int i = gridview1.getWidth() - gridview1.getPaddingLeft() - gridview1.getPaddingRight();
                Log.v("SimilarItemsGridViewAdapter", (new StringBuilder()).append("View dimens: ").append(i).append(", ").append(gridview1.getHeight()).toString());
                imgHeight = (int)((float)(i / numGridCols) * 1.43F + 0.5F);
                Log.v("SimilarItemsGridViewAdapter", (new StringBuilder()).append("imgHeight: ").append(imgHeight).toString());
                ViewUtils.removeGlobalLayoutListener(gridview1, this);
            }

            
            {
                this$0 = SimilarItemsGridViewAdapter.this;
                super();
            }
        });
    }

    private int clipCountToCompleteRows(int i)
    {
        return (i / numGridCols) * numGridCols;
    }

    private int getNumGridCols()
    {
        int i = DeviceUtils.getBasicScreenOrientation(activity);
        int j = DeviceUtils.getScreenSizeCategory(activity);
        return ((SparseIntArray)PaginatedLoMoAdapter.numVideosPerPageTable.get(i)).get(j);
    }

    public int computeNumSimsToFetch()
    {
        int i = DeviceUtils.getScreenSizeCategory(activity);
        for (i = ((SparseIntArray)PaginatedLoMoAdapter.numVideosPerPageTable.get(1)).get(i) * ((SparseIntArray)PaginatedLoMoAdapter.numVideosPerPageTable.get(2)).get(i); i < 10; i *= 2) { }
        i--;
        Log.v("SimilarItemsGridViewAdapter", (new StringBuilder()).append("Computed num sims to fetch as: ").append(i).toString());
        return i;
    }

    public int getCount()
    {
        if (clipToCompleteRows)
        {
            return clipCountToCompleteRows(similarMovies.size());
        } else
        {
            return similarMovies.size();
        }
    }

    public Video getItem(int i)
    {
        return (Video)similarMovies.get(i);
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        if (view == null)
        {
            viewgroup = new VideoView(activity);
            int j = activity.getResources().getDimensionPixelOffset(0x7f0a0051);
            viewgroup.setPadding(j, j, j, j);
            viewgroup.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, imgHeight));
            viewgroup.setAdjustViewBounds(true);
            viewgroup.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        }
        ((VideoView)viewgroup).update(getItem(i), trackable, i, false);
        return viewgroup;
    }

    public void refreshImagesIfNecessary()
    {
        for (int i = 0; i < gridView.getChildCount(); i++)
        {
            ((VideoView)gridView.getChildAt(i)).refreshImageIfNecessary();
        }

    }

    public void setData(List list, Trackable trackable1)
    {
        similarMovies = list;
        trackable = trackable1;
        notifyDataSetChanged();
    }




/*
    static int access$102(SimilarItemsGridViewAdapter similaritemsgridviewadapter, int i)
    {
        similaritemsgridviewadapter.imgHeight = i;
        return i;
    }

*/

}
