// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar;

import android.os.Handler;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.cleanmaster.sdk.cmloginsdkjar:
//            ab, Settings, RequestBatch, d, 
//            ac, Request

final class c extends FilterOutputStream
    implements ab
{

    private final Map a;
    private final RequestBatch b;
    private final long c = Settings.getOnProgressThreshold();
    private long d;
    private long e;
    private long f;
    private ac g;
    private Request h;

    c(OutputStream outputstream, RequestBatch requestbatch, Map map, long l)
    {
        super(outputstream);
        b = requestbatch;
        a = map;
        f = l;
    }

    static RequestBatch a(c c1)
    {
        return c1.b;
    }

    private void a()
    {
        if (d > e)
        {
            Iterator iterator = b.getCallbacks().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = (RequestBatch.Callback)iterator.next();
                if (obj instanceof RequestBatch.OnProgressCallback)
                {
                    Handler handler = b.getCallbackHandler();
                    obj = (RequestBatch.OnProgressCallback)obj;
                    if (handler == null)
                    {
                        ((RequestBatch.OnProgressCallback) (obj)).onBatchProgress(b, d, f);
                    } else
                    {
                        handler.post(new d(this, ((RequestBatch.OnProgressCallback) (obj))));
                    }
                }
            } while (true);
            e = d;
        }
    }

    private void a(long l)
    {
        if (g != null)
        {
            g.a(l);
        }
        d = d + l;
        if (d >= e + c || d >= f)
        {
            a();
        }
    }

    static long b(c c1)
    {
        return c1.d;
    }

    private boolean b()
    {
        if (h != null && h.isCanceled())
        {
            out.close();
            return true;
        } else
        {
            return false;
        }
    }

    static long c(c c1)
    {
        return c1.f;
    }

    public final void a(Request request)
    {
        ac ac1;
        if (request != null)
        {
            ac1 = (ac)a.get(request);
        } else
        {
            ac1 = null;
        }
        g = ac1;
        h = request;
    }

    public final void close()
    {
        super.close();
        for (Iterator iterator = a.values().iterator(); iterator.hasNext(); ((ac)iterator.next()).a()) { }
        a();
    }

    public final void write(int i)
    {
        if (b())
        {
            return;
        } else
        {
            out.write(i);
            a(1L);
            return;
        }
    }

    public final void write(byte abyte0[])
    {
        if (b())
        {
            return;
        } else
        {
            out.write(abyte0);
            a(abyte0.length);
            return;
        }
    }

    public final void write(byte abyte0[], int i, int j)
    {
        if (b())
        {
            return;
        } else
        {
            out.write(abyte0, i, j);
            a(j);
            return;
        }
    }
}
