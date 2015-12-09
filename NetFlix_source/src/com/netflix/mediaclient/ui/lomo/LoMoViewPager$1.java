// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;

import android.os.Handler;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;

// Referenced classes of package com.netflix.mediaclient.ui.lomo:
//            LoMoViewPager, LoMoViewPagerAdapter

class this._cls0
    implements Runnable
{

    final LoMoViewPager this$0;

    public void run()
    {
        if (LoMoViewPager.access$000(LoMoViewPager.this).destroyed())
        {
            return;
        }
        int j = getCurrentItem() + 1;
        int i = j;
        if (j >= LoMoViewPager.access$100(LoMoViewPager.this).getCount())
        {
            i = 0;
        }
        if (Log.isLoggable("LoMoViewPager", 2))
        {
            Log.v("LoMoViewPager", (new StringBuilder()).append("Auto-rotating to next view, id: ").append(i).toString());
        }
        setCurrentItem(i, true, true);
        LoMoViewPager.access$300(LoMoViewPager.this).postDelayed(this, LoMoViewPager.access$200());
    }

    pter()
    {
        this$0 = LoMoViewPager.this;
        super();
    }
}
