// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.os.Handler;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.facebook:
//            bd, s, ak, al, 
//            am, ax, be, GraphRequest

class aw extends FilterOutputStream
    implements bd
{

    private final Map a;
    private final ak b;
    private final long c = s.g();
    private long d;
    private long e;
    private long f;
    private be g;

    aw(OutputStream outputstream, ak ak1, Map map, long l)
    {
        super(outputstream);
        b = ak1;
        a = map;
        f = l;
    }

    static ak a(aw aw1)
    {
        return aw1.b;
    }

    private void a()
    {
        if (d > e)
        {
            Iterator iterator = b.e().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = (al)iterator.next();
                if (obj instanceof am)
                {
                    Handler handler = b.c();
                    obj = (am)obj;
                    if (handler == null)
                    {
                        ((am) (obj)).a(b, d, f);
                    } else
                    {
                        handler.post(new ax(this, ((am) (obj))));
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

    static long b(aw aw1)
    {
        return aw1.d;
    }

    static long c(aw aw1)
    {
        return aw1.f;
    }

    public void a(GraphRequest graphrequest)
    {
        if (graphrequest != null)
        {
            graphrequest = (be)a.get(graphrequest);
        } else
        {
            graphrequest = null;
        }
        g = graphrequest;
    }

    public void close()
    {
        super.close();
        for (Iterator iterator = a.values().iterator(); iterator.hasNext(); ((be)iterator.next()).a()) { }
        a();
    }

    public void write(int i)
    {
        out.write(i);
        a(1L);
    }

    public void write(byte abyte0[])
    {
        out.write(abyte0);
        a(abyte0.length);
    }

    public void write(byte abyte0[], int i, int j)
    {
        out.write(abyte0, i, j);
        a(j);
    }
}
