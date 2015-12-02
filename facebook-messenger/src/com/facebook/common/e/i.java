// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.e;

import com.facebook.common.w.q;
import com.facebook.debug.log.b;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import javax.inject.a;
import org.acra.ErrorReporter;

// Referenced classes of package com.facebook.common.e:
//            a, l, m, j, 
//            k

public class i extends com.facebook.common.e.a
{

    public static final a a = new l(null);
    private static final String b = com/facebook/common/e/i.getSimpleName();
    private final a c;
    private final a d;
    private final ExecutorService e;
    private final Random f;
    private final a g;
    private final boolean h;

    public i(a a1, a a2, ExecutorService executorservice, Random random, a a3)
    {
        this(a1, a2, executorservice, random, a3, false);
    }

    i(a a1, a a2, ExecutorService executorservice, Random random, a a3, boolean flag)
    {
        c = a1;
        d = a2;
        e = executorservice;
        f = random;
        g = a3;
        h = flag;
    }

    private String a(String s, int i1, boolean flag)
    {
        String s1;
        boolean flag1;
        if (((Boolean)d.b()).booleanValue() || c.b() == q.YES)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        s1 = s;
        if (!flag1)
        {
            if (flag)
            {
                s1 = null;
            } else
            {
                if (f.nextInt() % i1 != 0)
                {
                    return null;
                }
                s1 = s;
                if (i1 != 1)
                {
                    return (new StringBuilder()).append(s).append(" [freq=").append(i1).append("]").toString();
                }
            }
        }
        return s1;
    }

    static a a(i i1)
    {
        return i1.g;
    }

    static boolean b(i i1)
    {
        return i1.h;
    }

    public void a(m m1)
    {
        boolean flag;
        if (c.b() == q.YES || ((Boolean)d.b()).booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (m1.d() && flag)
        {
            ErrorReporter.getInstance().putCustomData("soft_error_message", m1.b().replace("\n", "\\n"));
            com.facebook.debug.log.b.e(b, (new StringBuilder()).append("category: ").append(m1.a()).append(" message:").append(m1.b()).toString());
            throw new RuntimeException((new StringBuilder()).append("Soft error FAILING HARDER: ").append(m1.a()).toString(), m1.c());
        }
        String s = a(m1.a(), m1.e(), m1.f());
        if (s == null)
        {
            return;
        }
        String s1 = m1.b();
        if (m1.c() != null)
        {
            m1 = m1.c();
        } else
        {
            m1 = new Exception("Soft error", m1.c());
        }
        e.execute(new j(this, s, s1, m1));
    }

    public void a(String s)
    {
        ErrorReporter.getInstance().removeCustomData(s);
    }

    public void a(String s, String s1, String s2)
    {
        a(s, s1, s2, 1);
    }

    public void a(String s, String s1, String s2, int i1)
    {
        s = a(s, i1, false);
        if (s == null)
        {
            return;
        } else
        {
            e.execute(new k(this, s, s1, s2));
            return;
        }
    }

    public void c(String s, String s1)
    {
        ErrorReporter.getInstance().putCustomData(s, s1);
    }

}
