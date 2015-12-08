// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.h;

import com.google.android.m4b.maps.g.a;
import com.google.android.m4b.maps.v.c;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.m4b.maps.h:
//            f, h

static final class  extends c
{

    private final WeakReference a;

    public final void a(a a1, com.google.android.m4b.maps.v.a a2)
    {
        a2 = (f)a.get();
        if (a2 == null)
        {
            return;
        } else
        {
            ((f) (a2)).a.j.post(new Runnable(a2, a1) {

                private f a;
                private a b;
                private f.a c;

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

            
            {
                c = f.a.this;
                a = f1;
                b = a2;
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
