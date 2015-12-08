// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.views;

import android.app.Activity;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.accuweather.android.views:
//            SlidingMenuLayout

class this._cls1
    implements Runnable
{

    final estLayout this$1;

    public void run()
    {
        requestLayout();
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/accuweather/android/views/SlidingMenuLayout$2

/* anonymous class */
    class SlidingMenuLayout._cls2 extends TimerTask
    {

        final SlidingMenuLayout this$0;

        public void run()
        {
            SlidingMenuLayout.access$020(SlidingMenuLayout.this, SlidingMenuLayout.access$100(SlidingMenuLayout.this) / 10);
            if (SlidingMenuLayout.access$000(SlidingMenuLayout.this) <= 0)
            {
                SlidingMenuLayout.access$002(SlidingMenuLayout.this, 0);
                SlidingMenuLayout.access$200(SlidingMenuLayout.this).cancel();
            }
            ((Activity)getContext()).runOnUiThread(new SlidingMenuLayout._cls2._cls1());
        }

            
            {
                this$0 = SlidingMenuLayout.this;
                super();
            }
    }

}
