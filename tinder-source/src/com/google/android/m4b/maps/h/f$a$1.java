// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.h;

import com.google.android.m4b.maps.g.a;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.m4b.maps.h:
//            f

final class b
    implements Runnable
{

    private f a;
    private a b;
    private ck c;

    public final void run()
    {
        f f1;
        Object obj;
        f1 = a;
        obj = b;
        f1.b.lock();
        boolean flag = f1.c(2);
        if (!flag)
        {
            f1.b.unlock();
            return;
        }
        if (!((a) (obj)).b()) goto _L2; else goto _L1
_L1:
        f1.g();
_L3:
        f1.b.unlock();
        return;
_L2:
        if (!f1.a(((a) (obj))))
        {
            break MISSING_BLOCK_LABEL_91;
        }
        f1.h();
        f1.g();
          goto _L3
        obj;
        f1.b.unlock();
        throw obj;
        f1.b(((a) (obj)));
          goto _L3
    }

    ( , f f1, a a1)
    {
        c = ;
        a = f1;
        b = a1;
        super();
    }
}
