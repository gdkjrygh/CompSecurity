// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model;

import android.widget.GridView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.jcp.adapters.ah;
import com.jcp.adapters.ak;

public class ProductFilterModal
{

    private TextView clearTxv;
    private ak customFilterAdapter;
    private ah customFilterGridAdapter;
    private GridView gridView;
    private int id;
    private RatingBar ratingBar;
    private int type;

    public ProductFilterModal()
    {
    }

    public TextView getClearTxv()
    {
        return clearTxv;
    }

    public ak getCustomFilterAdapter()
    {
        return customFilterAdapter;
    }

    public ah getCustomFilterGridAdapter()
    {
        return customFilterGridAdapter;
    }

    public GridView getGridView()
    {
        return gridView;
    }

    public int getId()
    {
        return id;
    }

    public RatingBar getRatingBar()
    {
        return ratingBar;
    }

    public int getType()
    {
        return type;
    }

    public void setClearTxv(TextView textview)
    {
        clearTxv = textview;
    }

    public void setCustomFilterAdapter(ak ak)
    {
        customFilterAdapter = ak;
    }

    public void setCustomFilterGridAdapter(ah ah)
    {
        customFilterGridAdapter = ah;
    }

    public void setGridView(GridView gridview)
    {
        gridView = gridview;
    }

    public void setId(int i)
    {
        id = i;
    }

    public void setRatingBar(RatingBar ratingbar)
    {
        ratingBar = ratingbar;
    }

    public void setType(int i)
    {
        type = i;
    }
}
