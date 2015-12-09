// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;


// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            EffectThumbLayout

class b
    implements Runnable
{

    final int a;
    final boolean b;
    final EffectThumbLayout c;

    public void run()
    {
        c.a(a, b);
    }

    (EffectThumbLayout effectthumblayout, int i, boolean flag)
    {
        c = effectthumblayout;
        a = i;
        b = flag;
        super();
    }
}
