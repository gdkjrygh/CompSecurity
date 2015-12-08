// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk;

import com.aviary.android.feather.sdk.panels.c;
import com.aviary.android.feather.sdk.widget.AviaryBottomBarViewFlipper;

// Referenced classes of package com.aviary.android.feather.sdk:
//            AviaryMainController

class a
    implements com.aviary.android.feather.sdk.widget.per.b
{

    final boolean a;
    final AviaryMainController b;

    public void a()
    {
    }

    public void b()
    {
    }

    public void c()
    {
        AviaryMainController.a(b).s();
    }

    public void d()
    {
        AviaryMainController aviarymaincontroller = b;
        iewFlipper.b b1;
        if (a)
        {
            b1 = b;
        } else
        {
            b1 = a;
        }
        AviaryMainController.a(aviarymaincontroller, b1);
        AviaryMainController.b(b).b().setOnViewChangingStatusListener(null);
    }

    iewFlipper(AviaryMainController aviarymaincontroller, boolean flag)
    {
        b = aviarymaincontroller;
        a = flag;
        super();
    }
}
