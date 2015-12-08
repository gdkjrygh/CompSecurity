// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.h;

import com.google.android.m4b.maps.g.a;
import com.google.android.m4b.maps.j.y;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.m4b.maps.h:
//            f

final class b
    implements Runnable
{

    private f a;
    private y b;
    private ck c;

    public final void run()
    {
        f f1;
        y y1;
        a a1;
        f1 = a;
        y1 = b;
        a1 = y1.c;
        f1.b.lock();
        boolean flag = f1.c(0);
        if (!flag)
        {
            f1.b.unlock();
            return;
        }
        if (!a1.b()) goto _L2; else goto _L1
_L1:
        f1.g = com.google.android.m4b.maps.j.ck(y1.b);
        f1.f = true;
        f1.h = y1.d;
        f1.i = y1.e;
        f1.e();
_L3:
        f1.b.unlock();
        return;
_L2:
        if (!f1.a(a1))
        {
            break MISSING_BLOCK_LABEL_137;
        }
        f1.h();
        if (f1.c == 0)
        {
            f1.g();
        }
          goto _L3
        Exception exception;
        exception;
        f1.b.unlock();
        throw exception;
        f1.b(a1);
          goto _L3
    }

    ( , f f1, y y1)
    {
        c = ;
        a = f1;
        b = y1;
        super();
    }
}
