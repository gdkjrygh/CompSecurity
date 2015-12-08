// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;

final class daa
    implements Runnable
{

    private czz a;

    daa(czz czz1)
    {
        a = czz1;
        super();
    }

    public final void run()
    {
        if (a.b)
        {
            a.a = false;
            return;
        }
        dab dab1 = a.d;
        float f = a.c;
        if (f < 0.35F)
        {
            f = ((0.35F - f) * -30F) / 0.35F;
        } else
        if (f < 0.65F)
        {
            f = 0.0F;
        } else
        {
            f = ((f - 0.65F) * 30F) / 0.35F;
        }
        dab1.a(Math.round(f));
        a.e.postDelayed(a.f, 30L);
    }
}
