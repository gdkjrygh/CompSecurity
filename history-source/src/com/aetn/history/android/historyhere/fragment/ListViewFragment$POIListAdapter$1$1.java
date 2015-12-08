// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.content.res.Resources;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.aetn.history.android.historyhere.MainNavigationActivity;
import com.aetn.history.android.historyhere.model.POIDetail;
import com.aetn.history.android.historyhere.utils.Utils;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            ListViewFragment

class this._cls2
    implements Runnable
{

    final  this$2;

    public void run()
    {
        holder.holder.setBackgroundColor(getActivity().getResources().getColor(0x7f090014));
        holder..setImageDrawable(getActivity().getResources().getDrawable(0x7f0200e9));
    }

    l.poi()
    {
        this$2 = this._cls2.this;
        super();
    }

    // Unreferenced inner class com/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1

/* anonymous class */
    class ListViewFragment.POIListAdapter._cls1
        implements android.view.View.OnClickListener
    {

        final ListViewFragment.POIListAdapter this$1;
        final ListViewFragment.ViewHolder val$holder;
        final POIDetail val$poi;

        public void onClick(View view)
        {
            Utils.logger(ListViewFragment.access$000(this$0), "setOnTouchListener: make dark");
            holder.root.setBackgroundColor(getActivity().getResources().getColor(0x7f090015));
            holder.iconMask.setImageDrawable(getActivity().getResources().getDrawable(0x7f020089));
            ((MainNavigationActivity)getActivity()).showListDetail(poi);
            int ai[] = new int[2];
            view.getLocationOnScreen(ai);
            int i = ai[1];
            Utils.logger(ListViewFragment.access$000(this$0), (new StringBuilder()).append("position of item from top: ").append(ListViewFragment.access$200(this$0, view)).toString());
            Utils.logger(ListViewFragment.access$000(this$0), (new StringBuilder()).append("height of item from top: ").append(view.getHeight()).toString());
            (new Handler()).postDelayed(new ListViewFragment.POIListAdapter._cls1._cls1(), 50L);
        }

            
            {
                this$1 = final_poilistadapter;
                holder = viewholder;
                poi = POIDetail.this;
                super();
            }
    }

}
