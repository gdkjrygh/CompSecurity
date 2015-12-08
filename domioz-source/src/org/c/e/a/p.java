// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.e.a;

import android.util.Log;
import java.util.Iterator;
import java.util.List;
import org.c.c.e;
import org.c.c.f;

// Referenced classes of package org.c.e.a:
//            m, l, k

final class p extends m
{

    final l b;
    private final e c;

    private p(l l1, Object obj)
    {
        this(l1, obj, ((Class) (null)));
    }

    p(l l1, Object obj, byte byte0)
    {
        this(l1, obj);
    }

    private p(l l1, Object obj, Class class1)
    {
        b = l1;
        super(l1, class1, (byte)0);
        if (obj instanceof e)
        {
            c = (e)obj;
            return;
        }
        if (obj != null)
        {
            c = new e(obj);
            return;
        } else
        {
            c = e.EMPTY;
            return;
        }
    }

    p(l l1, Object obj, Class class1, byte byte0)
    {
        this(l1, obj, class1);
    }

    public final void doWithRequest(org.c.c.a.e e1)
    {
        super.doWithRequest(e1);
        if (!c.hasBody())
        {
            e1 = e1.getHeaders();
            f f1 = c.getHeaders();
            if (!f1.isEmpty())
            {
                e1.putAll(f1);
            }
            if (e1.getContentLength() == -1L)
            {
                e1.setContentLength(0L);
            }
            return;
        }
        Object obj = c.getBody();
        Class class1 = obj.getClass();
        f f2 = c.getHeaders();
        org.c.c.n n = f2.getContentType();
        for (Iterator iterator = b.getMessageConverters().iterator(); iterator.hasNext();)
        {
            org.c.c.b.f f3 = (org.c.c.b.f)iterator.next();
            if (f3.canWrite(class1, n))
            {
                if (!f2.isEmpty())
                {
                    e1.getHeaders().putAll(f2);
                }
                if (Log.isLoggable("RestTemplate", 3))
                {
                    if (n != null)
                    {
                        Log.d("RestTemplate", (new StringBuilder("Writing [")).append(obj).append("] as \"").append(n).append("\" using [").append(f3).append("]").toString());
                    } else
                    {
                        Log.d("RestTemplate", (new StringBuilder("Writing [")).append(obj).append("] using [").append(f3).append("]").toString());
                    }
                }
                f3.write(obj, n, e1);
                return;
            }
        }

        obj = (new StringBuilder("Could not write request: no suitable HttpMessageConverter found for request type [")).append(class1.getName()).append("]").toString();
        e1 = ((org.c.c.a.e) (obj));
        if (n != null)
        {
            e1 = (new StringBuilder()).append(((String) (obj))).append(" and content type [").append(n).append("]").toString();
        }
        throw new k(e1);
    }
}
