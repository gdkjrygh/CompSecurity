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

    private a a;

    public final void run()
    {
        CashSwiperView.i(a.a);
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/snapchat/android/ui/CashSwiperView$11

/* anonymous class */
    final class CashSwiperView._cls11
        implements Runnable
    {

        final CashSwiperView a;

        public final void run()
        {
            CashSwiperView.h(a);
            CashSwiperView.j(a).postDelayed(new CashSwiperView._cls11._cls1(this), 3000L);
        }

            
            {
                a = cashswiperview;
                super();
            }
    }

}
