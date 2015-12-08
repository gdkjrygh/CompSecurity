// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.h;

import com.google.android.m4b.maps.g.a;
import com.google.android.m4b.maps.j.y;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.m4b.maps.h:
//            f, h

static final class  extends com.google.android.m4b.maps.j.
{

    private final WeakReference a;

    public final void a(y y)
    {
        f f1 = (f)a.get();
        if (f1 == null)
        {
            return;
        } else
        {
            f1.a.j.post(new Runnable(f1, y) {

                private f a;
                private y b;
                private f.b c;

                public final void run()
                {
                    f f2;
                    y y1;
                    a a1;
                    f2 = a;
                    y1 = b;
                    a1 = y1.c;
                    f2.b.lock();
                    boolean flag = f2.c(0);
                    if (!flag)
                    {
                        f2.b.unlock();
                        return;
                    }
                    if (!a1.b()) goto _L2; else goto _L1
_L1:
                    f2.g = com.google.android.m4b.maps.j.q.a.a(y1.b);
                    f2.f = true;
                    f2.h = y1.d;
                    f2.i = y1.e;
                    f2.e();
_L3:
                    f2.b.unlock();
                    return;
_L2:
                    if (!f2.a(a1))
                    {
                        break MISSING_BLOCK_LABEL_137;
                    }
                    f2.h();
                    if (f2.c == 0)
                    {
                        f2.g();
                    }
                      goto _L3
                    Exception exception;
                    exception;
                    f2.b.unlock();
                    throw exception;
                    f2.b(a1);
                      goto _L3
                }

            
            {
                c = f.b.this;
                a = f1;
                b = y1;
                super();
            }
            });
            return;
        }
    }

    _cls1.b(f f1)
    {
        a = new WeakReference(f1);
    }
}
