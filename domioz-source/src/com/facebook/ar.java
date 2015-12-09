// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.facebook:
//            az, ba, GraphRequest

final class ar extends OutputStream
    implements az
{

    private final Map a = new HashMap();
    private final Handler b;
    private GraphRequest c;
    private ba d;
    private int e;

    ar(Handler handler)
    {
        b = handler;
    }

    final int a()
    {
        return e;
    }

    final void a(long l)
    {
        if (d == null)
        {
            d = new ba(b, c);
            a.put(c, d);
        }
        d.b(l);
        e = (int)((long)e + l);
    }

    public final void a(GraphRequest graphrequest)
    {
        c = graphrequest;
        if (graphrequest != null)
        {
            graphrequest = (ba)a.get(graphrequest);
        } else
        {
            graphrequest = null;
        }
        d = graphrequest;
    }

    final Map b()
    {
        return a;
    }

    public final void write(int i)
    {
        a(1L);
    }

    public final void write(byte abyte0[])
    {
        a(abyte0.length);
    }

    public final void write(byte abyte0[], int i, int j)
    {
        a(j);
    }
}
