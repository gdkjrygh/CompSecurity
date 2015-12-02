// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.antivirus.update;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;

// Referenced classes of package com.qihoo.antivirus.update:
//            l, d, UpdateService, af

public abstract class ag extends l
    implements x.a
{

    protected final d c;
    private final int d;

    public ag(d d1, int i)
    {
        super(d1.e(), "updateurl");
        c = d1;
        d = i;
    }

    protected abstract int a(HttpClient httpclient, String s);

    public void a(int i, String s)
    {
        if (a < 2)
        {
            int j = i;
            if (i < 0)
            {
                j = -i;
            }
            b[a] = j;
        }
    }

    public void a(long l1, long l2)
        throws InterruptedException
    {
    }

    public void a(HttpResponse httpresponse)
    {
    }

    public boolean a(HttpClient httpclient)
    {
        String s;
        s = a();
        a = 0;
_L8:
        int i = a(httpclient, s);
          goto _L1
_L3:
        if (i < 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L5:
        return true;
_L1:
        if (i >= 0 || i == -4 || i == -99 || i == -98 || i == -97) goto _L3; else goto _L2
_L2:
        if (UpdateService.f) goto _L5; else goto _L4
_L4:
        a = a + 1;
        if (!af.b(b()) || a >= 2) goto _L3; else goto _L6
_L6:
        long l1 = a;
        try
        {
            Thread.sleep(10000L * l1);
        }
        catch (InterruptedException interruptedexception) { }
        if (true) goto _L8; else goto _L7
_L7:
        return false;
    }

    public int d()
    {
        return d;
    }
}
