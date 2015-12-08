// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Looper;

final class jtc
    implements Runnable
{

    private jtb a;

    jtc(jtb jtb1)
    {
        a = jtb1;
        super();
    }

    public final void run()
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            jtb.a(a).b().a(this);
        } else
        {
            boolean flag = a.b();
            jtb.a(a, 0L);
            if (flag && !jtb.b(a))
            {
                a.a();
                return;
            }
        }
    }
}
