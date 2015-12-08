// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.views;

import android.app.Activity;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.accuweather.android.views:
//            SlidingMenuLayout

class this._cls0 extends TimerTask
{

    final SlidingMenuLayout this$0;

    public void run()
    {
        SlidingMenuLayout.access$012(SlidingMenuLayout.this, SlidingMenuLayout.access$100(SlidingMenuLayout.this) / 10);
        if (SlidingMenuLayout.access$000(SlidingMenuLayout.this) >= SlidingMenuLayout.access$100(SlidingMenuLayout.this))
        {
            SlidingMenuLayout.access$002(SlidingMenuLayout.this, SlidingMenuLayout.access$100(SlidingMenuLayout.this));
            SlidingMenuLayout.access$200(SlidingMenuLayout.this).cancel();
        }
        ((Activity)getContext()).runOnUiThread(new Runnable() {

            final SlidingMenuLayout._cls1 this$1;

            public void run()
            {
                requestLayout();
            }

            
            {
                this$1 = SlidingMenuLayout._cls1.this;
                super();
            }
        });
    }

    _cls1.this._cls1()
    {
        this$0 = SlidingMenuLayout.this;
        super();
    }
}
