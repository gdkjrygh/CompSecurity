// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.sdkutils.concurrent;

import com.kik.g.p;
import kik.a.e.r;

// Referenced classes of package kik.android.sdkutils.concurrent:
//            e

public final class c extends e
{

    private r d;

    public c(String s, r r1)
    {
        super(s);
        d = r1;
    }

    public final p a()
    {
        c = false;
        kik.a.d.k k = d.b((String)b);
        if (k != null)
        {
            a = new p();
            a.a(k);
        } else
        {
            a = d.d((String)b);
        }
        return a;
    }

    public final Object call()
    {
        return a();
    }
}
