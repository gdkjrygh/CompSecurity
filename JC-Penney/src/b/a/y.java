// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.File;
import java.net.URL;

// Referenced classes of package b.a:
//            q, ab, gt, jh, 
//            ew, kl, fg, da, 
//            ne, eu

public final class y
    implements Runnable
{

    private y()
    {
    }

    public y(byte byte0)
    {
        this();
    }

    public final void run()
    {
        q.a.A.a(q.a.z.j());
        q.a.A.b(q.a.z.b());
        URL url = new URL((new StringBuilder()).append(q.a.z.l()).append("/api/apm/network").toString());
        q.a.s = new jh(q.a, url);
        q.a.A.a(q.a.s);
        q.a.A.a(q.a);
        (new ew(q.a.s, "OPTMZ")).start();
        if (kl.a(q.a.c).exists())
        {
            break MISSING_BLOCK_LABEL_265;
        }
        if (!q.a.z.h())
        {
            return;
        }
        try
        {
            Object obj = new fg(q.a.c);
            da da1 = new da(q.a.c);
            obj = new ne(q.a.A, ((fg) (obj)), da1);
            q.a.w = ((ne) (obj)).a();
            (new StringBuilder("installedApm = ")).append(q.a.w);
            eu.b();
            return;
        }
        catch (Exception exception)
        {
            (new StringBuilder("Exception in installApm: ")).append(exception.getClass().getName());
        }
        eu.b();
        eu.c();
    }
}
