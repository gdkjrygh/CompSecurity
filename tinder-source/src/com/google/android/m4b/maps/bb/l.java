// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bb;

import android.view.animation.LinearInterpolator;

// Referenced classes of package com.google.android.m4b.maps.bb:
//            a

public final class l
{

    private static final Integer b[] = {
        Integer.valueOf(0), Integer.valueOf(164), Integer.valueOf(655), Integer.valueOf(1469), Integer.valueOf(2598), Integer.valueOf(4030), Integer.valueOf(5752), Integer.valueOf(7747), Integer.valueOf(9997), Integer.valueOf(12479), 
        Integer.valueOf(15169), Integer.valueOf(18042), Integer.valueOf(21071), Integer.valueOf(24224), Integer.valueOf(27474), Integer.valueOf(30787), Integer.valueOf(34133), Integer.valueOf(37478), Integer.valueOf(40792), Integer.valueOf(44041), 
        Integer.valueOf(47195), Integer.valueOf(50223), Integer.valueOf(53096), Integer.valueOf(55787), Integer.valueOf(58269), Integer.valueOf(60518), Integer.valueOf(62514), Integer.valueOf(64236), Integer.valueOf(0x10084), Integer.valueOf(0x104ec), 
        Integer.valueOf(0x1081a), Integer.valueOf(0x10a06), Integer.valueOf(0x10aaa), Integer.valueOf(0x10a06), Integer.valueOf(0x1081a), Integer.valueOf(0x104ec), Integer.valueOf(0x10084), Integer.valueOf(0x10000)
    };
    private static final int c = 296;
    public final a a;

    public l()
    {
        a = new a(new LinearInterpolator(), b);
        a.setDuration(c);
    }

}
