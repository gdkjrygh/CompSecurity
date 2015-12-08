// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.os.Handler;

// Referenced classes of package com.snapchat.android.ui:
//            CashSwiperView

final class a
    implements Runnable
{

    final CashSwiperView a;

    public final void run()
    {
        CashSwiperView.h(a);
        CashSwiperView.j(a).postDelayed(new Runnable() {

            private CashSwiperView._cls11 a;

            public final void run()
            {
                CashSwiperView.i(a.a);
            }

            
            {
                a = CashSwiperView._cls11.this;
                super();
            }
        }, 3000L);
    }

    _cls1.a(CashSwiperView cashswiperview)
    {
        a = cashswiperview;
        super();
    }
}
