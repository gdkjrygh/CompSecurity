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

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            TourHomeListViewFragment

class this._cls2
    implements Runnable
{

    final l.holder this$2;

    public void run()
    {
        holder.holder.setBackgroundColor(getActivity().getResources().getColor(0x7f090039));
        holder.holder.setImageDrawable(getActivity().getResources().getDrawable(0x7f02013d));
    }

    l.holder()
    {
        this$2 = this._cls2.this;
        super();
    }

    // Unreferenced inner class com/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$1

/* anonymous class */
    class TourHomeListViewFragment.TourHomeListAdapter._cls1
        implements android.view.View.OnClickListener
    {

        final TourHomeListViewFragment.TourHomeListAdapter this$1;
        final TourHomeListViewFragment.ViewHolder val$holder;
        final POIDetail val$o;

        public void onClick(View view)
        {
            ((MainNavigationActivity)getActivity()).showTourDetail(o);
            holder.iconMask.setImageDrawable(getActivity().getResources().getDrawable(0x7f02013b));
            holder.bg.setBackgroundColor(getActivity().getResources().getColor(0x7f09003a));
            (new Handler()).postDelayed(new TourHomeListViewFragment.TourHomeListAdapter._cls1._cls1(), 50L);
        }

            
            {
                this$1 = final_tourhomelistadapter;
                o = poidetail;
                holder = TourHomeListViewFragment.ViewHolder.this;
                super();
            }
    }

}
