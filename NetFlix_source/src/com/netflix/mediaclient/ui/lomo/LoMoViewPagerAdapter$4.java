// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.ui.lomo:
//            LoMoViewPagerAdapter, LoMoViewPager

class this._cls0 extends BroadcastReceiver
{

    final LoMoViewPagerAdapter this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (intent == null)
        {
            Log.w("LoMoViewPagerAdapter", "Received null intent");
        } else
        {
            context = intent.getAction();
            if (Log.isLoggable("LoMoViewPagerAdapter", 2))
            {
                Log.v("LoMoViewPagerAdapter", (new StringBuilder()).append("browseReceiver inovoked with Action: ").append(context).toString());
            }
            if ("com.netflix.mediaclient.intent.action.BA_CW_REFRESH".equals(context))
            {
                if (pe.CW.equals(LoMoViewPagerAdapter.access$000(LoMoViewPagerAdapter.this)))
                {
                    Log.v("LoMoViewPagerAdapter", "Reloading cw row ");
                    refresh(LoMoViewPagerAdapter.access$600(LoMoViewPagerAdapter.this), LoMoViewPagerAdapter.access$700(LoMoViewPagerAdapter.this));
                }
                LoMoViewPagerAdapter.access$400(LoMoViewPagerAdapter.this).invalidateCwCache();
                return;
            }
            if ("com.netflix.mediaclient.intent.action.BA_IQ_REFRESH".equals(context))
            {
                if (pe.IQ.equals(LoMoViewPagerAdapter.access$000(LoMoViewPagerAdapter.this)))
                {
                    Log.v("LoMoViewPagerAdapter", "Reloading iq row ");
                    refresh(LoMoViewPagerAdapter.access$600(LoMoViewPagerAdapter.this), LoMoViewPagerAdapter.access$700(LoMoViewPagerAdapter.this));
                }
                LoMoViewPagerAdapter.access$400(LoMoViewPagerAdapter.this).invalidateIqCache();
                return;
            }
        }
    }

    pe()
    {
        this$0 = LoMoViewPagerAdapter.this;
        super();
    }
}
