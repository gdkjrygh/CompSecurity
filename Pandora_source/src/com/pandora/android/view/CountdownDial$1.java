// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.os.CountDownTimer;

// Referenced classes of package com.pandora.android.view:
//            CountdownDial

class a extends CountDownTimer
{

    final CountdownDial a;

    public void onFinish()
    {
        CountdownDial.a(a, null);
    }

    public void onTick(long l)
    {
        CountdownDial.a(a);
        CountdownDial.b(a);
        a.invalidate();
    }

    (CountdownDial countdowndial, long l, long l1)
    {
        a = countdowndial;
        super(l, l1);
    }
}
