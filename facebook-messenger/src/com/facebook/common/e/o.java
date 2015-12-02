// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.e;

import com.facebook.common.w.q;
import javax.inject.a;

// Referenced classes of package com.facebook.common.e:
//            a, p, m

public class o extends com.facebook.common.e.a
{

    private final a a;

    public o(a a1)
    {
        a = a1;
    }

    private void a(String s, String s1, String s2, Object obj, Object obj1)
    {
        (new Thread(new p(this, s1, s2, obj, obj1, s))).start();
    }

    private void a(String s, String s1, String s2, String s3)
    {
        a(s, s1, s2, s3, null);
    }

    private void a(String s, String s1, String s2, Throwable throwable, Throwable throwable1)
    {
        a(s, s1, s2, throwable, throwable1);
    }

    public void a(m m1)
    {
        String s = m1.a();
        String s1 = m1.b();
        Throwable throwable = m1.c();
        if (m1.d() && a.b() == q.YES)
        {
            throw new RuntimeException((new StringBuilder()).append("Soft Error FAILING HARDER: ").append(s).append("\nMessage:").append(s1).toString(), throwable);
        } else
        {
            a("SOFT_ERROR", s, s1, throwable, new Throwable());
            return;
        }
    }

    public void a(String s)
    {
    }

    public void a(String s, String s1, String s2)
    {
        a(s, s1, s2, 1);
    }

    public void a(String s, String s1, String s2, int i)
    {
        a("STRICT_MODE", s, s1, s2);
    }

    public void c(String s, String s1)
    {
    }
}
