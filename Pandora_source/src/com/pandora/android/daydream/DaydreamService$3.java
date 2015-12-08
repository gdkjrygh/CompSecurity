// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.daydream;

import android.os.CountDownTimer;

// Referenced classes of package com.pandora.android.daydream:
//            DaydreamService, b

class a extends CountDownTimer
{

    final DaydreamService a;

    public void onFinish()
    {
        if (DaydreamService.b(a))
        {
            a.b.a(a, a);
            return;
        } else
        {
            a.b.a(a, a);
            return;
        }
    }

    public void onTick(long l)
    {
    }

    (DaydreamService daydreamservice, long l, long l1)
    {
        a = daydreamservice;
        super(l, l1);
    }
}
