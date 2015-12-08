// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.daydream;


// Referenced classes of package com.pandora.android.daydream:
//            DaydreamService, b

class a
    implements Runnable
{

    final DaydreamService a;

    public void run()
    {
        a.b.b(true);
        DaydreamService.a(a);
    }

    (DaydreamService daydreamservice)
    {
        a = daydreamservice;
        super();
    }
}
