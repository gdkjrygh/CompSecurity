// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.cleanmaster.sdk.cmloginsdkjar:
//            ab, ac, Request

final class b extends OutputStream
    implements ab
{

    private final Map a = new HashMap();
    private final Handler b;
    private Request c;
    private ac d;
    private int e;

    b(Handler handler)
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
            d = new ac(b, c);
            a.put(c, d);
        }
        d.b(l);
        e = (int)((long)e + l);
    }

    public final void a(Request request)
    {
        c = request;
        if (request != null)
        {
            request = (ac)a.get(request);
        } else
        {
            request = null;
        }
        d = request;
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
