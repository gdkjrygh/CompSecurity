// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.CountDownTimer;

final class bel extends CountDownTimer
{

    private bej a;

    bel(bej bej1, long l, long l1)
    {
        a = bej1;
        super(1500L, 1500L);
    }

    public final void onFinish()
    {
        if (bej.a(a).a("LoadPhotoTask"))
        {
            bej.a(a, "LoadPhotoTag", true);
        }
        bej.b(a, null);
    }

    public final void onTick(long l)
    {
    }
}
