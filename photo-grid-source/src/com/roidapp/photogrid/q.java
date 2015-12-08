// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.a.f;
import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid:
//            k

final class q extends aa
{

    private WeakReference a;

    private q(k k1)
    {
        a = new WeakReference(k1);
    }

    q(k k1, byte byte0)
    {
        this(k1);
    }

    public final void b(int i, Exception exception)
    {
        exception = (k)a.get();
        if (exception != null)
        {
            k.h(exception);
            if (k.k(exception) == null || k.k(exception).isEmpty())
            {
                k.i(exception);
                return;
            }
        }
    }

    public final void b(Object obj)
    {
        obj = (f)obj;
        k k1 = (k)a.get();
        if (k1 == null || !k.j(k1))
        {
            return;
        }
        if (obj == null || ((f) (obj)).isEmpty())
        {
            k.i(k1);
            return;
        } else
        {
            k.a(k1, ((List) (obj)));
            k.b(k1, ((List) (obj)));
            return;
        }
    }

    public final void c(Object obj)
    {
        obj = (f)obj;
        k k1 = (k)a.get();
        if (k1 == null || !k.g(k1))
        {
            return;
        }
        k.h(k1);
        if (obj == null || ((f) (obj)).isEmpty())
        {
            k.i(k1);
            return;
        } else
        {
            k.a(k1, ((List) (obj)));
            k.b(k1, ((List) (obj)));
            return;
        }
    }
}
