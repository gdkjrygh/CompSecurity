// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.aetn.history.android.historyhere.MainNavigationActivity;
import com.aetn.history.android.historyhere.model.HttpRequestManager;
import com.aetn.history.android.historyhere.model.POIDetail;
import com.aetn.history.android.historyhere.utils.Utils;
import com.android.volley.toolbox.NetworkImageView;
import java.util.ArrayList;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            ListViewFragment

private class textViewResourceId extends ArrayAdapter
{

    private ArrayList poiArrayList;
    private int textViewResourceId;
    final ListViewFragment this$0;

    public View getView(int i, View view, final ViewGroup holder)
    {
        view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(textViewResourceId, holder, false);
        holder = new t>(ListViewFragment.this);
        holder. = (ViewGroup)view.findViewById(0x7f0a0097);
        holder.e = (TextView)view.findViewById(0x7f0a0041);
        holder.t_description = (TextView)view.findViewById(0x7f0a007a);
        holder. = (NetworkImageView)view.findViewById(0x7f0a0040);
        holder.Holder = (FrameLayout)view.findViewById(0x7f0a0067);
        holder.tion = i;
        holder.Mask = (ImageView)view.findViewById(0x7f0a0098);
        ((Mask) (holder)).Mask.setImageDrawable(getActivity().getResources().getDrawable(0x7f0200e9));
        view.setTag(holder);
        final POIDetail poi = (POIDetail)poiArrayList.get(i);
        if (poi != null)
        {
            holder.poiArrayList = poi.getId();
            if (((poiArrayList) (holder)).e != null)
            {
                ((e) (holder)).e.setText(poi.getTitle());
            }
            if (((e) (holder)).t_description != null)
            {
                if (!poi.getShortDescription().isEmpty())
                {
                    ((t_description) (holder)).t_description.setText(poi.getShortDescription());
                } else
                {
                    ((t_description) (holder)).t_description.setText(poi.getDescription());
                }
            }
            if (((t_description) (holder)). != null)
            {
                Utils.logger(ListViewFragment.access$000(ListViewFragment.this), (new StringBuilder()).append("POIListAdapter:o.getImage():").append(poi.getImage()).toString());
                if (((this._cls0) (holder))._fld0.isEmpty())
                {
                    ((this._cls0) (holder)).Holder.setVisibility(8);
                } else
                {
                    ((Holder) (holder)).Holder.setVisibility(0);
                }
                Utils.logger(ListViewFragment.access$000(ListViewFragment.this), (new StringBuilder()).append("IMAGE:make the request: ").append(poi.getImage()).toString());
                if (!poi.getImage().isEmpty())
                {
                    ((this._cls0) (holder))..setImageUrl(poi.getImage(), HttpRequestManager.getInstance(getActivity()).getImageLoader());
                } else
                {
                    (() (holder))..setBackgroundResource(0x7f0200e8);
                }
            }
        }
        view.setClickable(true);
        view.setOnClickListener(new android.view.View.OnClickListener() {

            final ListViewFragment.POIListAdapter this$1;
            final ListViewFragment.ViewHolder val$holder;
            final POIDetail val$poi;

            public void onClick(View view1)
            {
                Utils.logger(ListViewFragment.access$000(this$0), "setOnTouchListener: make dark");
                holder.root.setBackgroundColor(getActivity().getResources().getColor(0x7f090015));
                holder.iconMask.setImageDrawable(getActivity().getResources().getDrawable(0x7f020089));
                ((MainNavigationActivity)getActivity()).showListDetail(poi);
                int ai[] = new int[2];
                view1.getLocationOnScreen(ai);
                int j = ai[1];
                Utils.logger(ListViewFragment.access$000(this$0), (new StringBuilder()).append("position of item from top: ").append(ListViewFragment.access$200(this$0, view1)).toString());
                Utils.logger(ListViewFragment.access$000(this$0), (new StringBuilder()).append("height of item from top: ").append(view1.getHeight()).toString());
                (new Handler()).postDelayed(new Runnable() {

                    final _cls1 this$2;

                    public void run()
                    {
                        holder.root.setBackgroundColor(getActivity().getResources().getColor(0x7f090014));
                        holder.iconMask.setImageDrawable(getActivity().getResources().getDrawable(0x7f0200e9));
                    }

            
            {
                this$2 = _cls1.this;
                super();
            }
                }, 50L);
            }

            
            {
                this$1 = ListViewFragment.POIListAdapter.this;
                holder = viewholder;
                poi = poidetail;
                super();
            }
        });
        return view;
    }

    public _cls1.val.poi(Context context, int i, ArrayList arraylist)
    {
        this$0 = ListViewFragment.this;
        super(context, i, arraylist);
        poiArrayList = arraylist;
        textViewResourceId = i;
        Utils.logger(ListViewFragment.access$000(ListViewFragment.this), (new StringBuilder()).append("POIList.size():").append(arraylist.size()).toString());
    }
}
