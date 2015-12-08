// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;


// Referenced classes of package com.snapchat.android.ui:
//            CashSwiperView

final class a
    implements Runnable
{

    private CashSwiperView a;

    public final void run()
    {
        CashSwiperView.f(a);
    }

    (CashSwiperView cashswiperview)
    {
        a = cashswiperview;
        super();
    }
}
