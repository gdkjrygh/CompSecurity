// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;


// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            EffectThumbLayout

class a
    implements Runnable
{

    final boolean a;
    final EffectThumbLayout b;

    public void run()
    {
        b.setIsOpened(a);
    }

    (EffectThumbLayout effectthumblayout, boolean flag)
    {
        b = effectthumblayout;
        a = flag;
        super();
    }
}
