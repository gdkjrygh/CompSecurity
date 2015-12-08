// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.facebook:
//            bd, be, GraphRequest

class av extends OutputStream
    implements bd
{

    private final Map a = new HashMap();
    private final Handler b;
    private GraphRequest c;
    private be d;
    private int e;

    av(Handler handler)
    {
        b = handler;
    }

    int a()
    {
        return e;
    }

    void a(long l)
    {
        if (d == null)
        {
            d = new be(b, c);
            a.put(c, d);
        }
        d.b(l);
        e = (int)((long)e + l);
    }

    public void a(GraphRequest graphrequest)
    {
        c = graphrequest;
        if (graphrequest != null)
        {
            graphrequest = (be)a.get(graphrequest);
        } else
        {
            graphrequest = null;
        }
        d = graphrequest;
    }

    Map b()
    {
        return a;
    }

    public void write(int i)
    {
        a(1L);
    }

    public void write(byte abyte0[])
    {
        a(abyte0.length);
    }

    public void write(byte abyte0[], int i, int j)
    {
        a(j);
    }
}
