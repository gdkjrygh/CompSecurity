// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;

final class cuh
    implements Runnable
{

    private cuk a;
    private Bitmap b;
    private long c;
    private cue d;

    cuh(cue cue1, cuk cuk1, Bitmap bitmap, long l)
    {
        d = cue1;
        a = cuk1;
        b = bitmap;
        c = l;
        super();
    }

    public final void run()
    {
        switch (cui.a[a.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            cue.d(d).a(b);
            return;

        case 2: // '\002'
            cue.d(d).b();
            return;

        case 4: // '\004'
            cue.d(d).a(c);
            return;

        case 3: // '\003'
            int i;
            boolean flag;
            synchronized (cue.e(d))
            {
                i = cue.f(d);
                flag = cue.g(d);
            }
            cue.d(d).a(i, flag);
            return;

        case 5: // '\005'
            cue.d(d).c();
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
