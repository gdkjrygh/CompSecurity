// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.eureka.dialog;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.v7.app.n;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;

public class a extends n
{

    private Context a;

    public a(Context context)
    {
        super(context);
        a = context;
    }

    static Context a(a a1)
    {
        return a1.a;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getWindow().setFeatureDrawableResource(3, 0);
        bundle = (ListView)findViewById(0x7f1001b4);
        bundle.setAdapter(new ListAdapter(bundle.getAdapter()) {

            final ListAdapter a;
            final a b;

            public boolean areAllItemsEnabled()
            {
                return a.areAllItemsEnabled();
            }

            public int getCount()
            {
                return a.getCount();
            }

            public Object getItem(int i)
            {
                return a.getItem(i);
            }

            public long getItemId(int i)
            {
                return a.getItemId(i);
            }

            public int getItemViewType(int i)
            {
                return a.getItemViewType(i);
            }

            public View getView(int i, View view, ViewGroup viewgroup)
            {
                view = (LinearLayout)a.getView(i, view, viewgroup);
                if ((ImageView)view.findViewById(0x2040029) == null)
                {
                    viewgroup = new ImageView(a.a(b));
                    viewgroup.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
                    viewgroup.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                    viewgroup.setId(0x2040029);
                    viewgroup.setImageResource(0x7f020206);
                    viewgroup.setPadding(15, 0, 0, 0);
                    view.addView(viewgroup, 0);
                }
                return view;
            }

            public int getViewTypeCount()
            {
                return a.getViewTypeCount();
            }

            public boolean hasStableIds()
            {
                return a.hasStableIds();
            }

            public boolean isEmpty()
            {
                return a.isEmpty();
            }

            public boolean isEnabled(int i)
            {
                return a.isEnabled(i);
            }

            public void registerDataSetObserver(DataSetObserver datasetobserver)
            {
                a.registerDataSetObserver(datasetobserver);
            }

            public void unregisterDataSetObserver(DataSetObserver datasetobserver)
            {
                a.unregisterDataSetObserver(datasetobserver);
            }

            
            {
                b = a.this;
                a = listadapter;
                super();
            }
        });
        bundle.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener(bundle.getOnItemClickListener()) {

            final android.widget.AdapterView.OnItemClickListener a;
            final a b;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                a.onItemClick(adapterview, view, i, l);
            }

            
            {
                b = a.this;
                a = onitemclicklistener;
                super();
            }
        });
    }
}
