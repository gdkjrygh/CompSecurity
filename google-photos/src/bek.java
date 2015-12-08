// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.CountDownTimer;

final class bek extends CountDownTimer
{

    private bej a;

    bek(bej bej1, long l, long l1)
    {
        a = bej1;
        super(l, l1);
    }

    public final void onFinish()
    {
        if (bej.a(a).a("LoadFullSizePhotoTask"))
        {
            if (bej.b(a).a())
            {
                bej.b(a);
            }
            bej.a(a, false);
            bej.a(a, "SavePhotoTag");
            bej.c(a);
        }
        bej.a(a, null);
    }

    public final void onTick(long l)
    {
    }
}
