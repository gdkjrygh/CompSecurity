// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.by;

import com.pandora.radio.data.ag;
import p.df.a;

public class e
{

    ag a;

    public e(ag ag1)
    {
        a = ag1;
    }

    private static void c(String s)
    {
        p.df.a.c("EurekaConnectionData", (new StringBuilder()).append("PANDCAST CONNECTION DATA: ").append(s).toString());
    }

    public com.pandora.radio.data.e a()
    {
        if (a != null)
        {
            return a.H();
        } else
        {
            return null;
        }
    }

    public void a(long l)
    {
        com.pandora.radio.data.e e1 = a();
        if (e1 != null)
        {
            e1.a(l);
            a(e1);
        }
    }

    public void a(com.pandora.radio.data.e e1)
    {
        if (a != null)
        {
            a.a(e1);
        }
    }

    public void a(String s)
    {
        com.pandora.radio.data.e e1 = a();
        if (e1 == null)
        {
            s = new com.pandora.radio.data.e(s, null, null, 0L, false);
        } else
        {
            e1.c(s);
            s = e1;
        }
        a(((com.pandora.radio.data.e) (s)));
    }

    public void a(String s, String s1)
    {
        com.pandora.radio.data.e e1 = a();
        if (e1 == null)
        {
            s = new com.pandora.radio.data.e(null, s, s1, 0L, false);
        } else
        {
            e1.b(s);
            e1.a(s1);
            s = e1;
        }
        a(((com.pandora.radio.data.e) (s)));
    }

    public void a(boolean flag)
    {
        com.pandora.radio.data.e e1 = a();
        if (e1 != null)
        {
            e1.a(flag);
            a(e1);
        }
    }

    public void b()
    {
        c("clearing data");
        a.I();
    }

    public void b(String s)
    {
        com.pandora.radio.data.e e1 = a();
        if (e1 != null)
        {
            e1.c(s);
            a(e1);
        }
    }

    public String c()
    {
        com.pandora.radio.data.e e1 = a();
        if (e1 != null)
        {
            return e1.a();
        } else
        {
            return null;
        }
    }

    public String d()
    {
        com.pandora.radio.data.e e1 = a();
        if (e1 != null)
        {
            return e1.b();
        } else
        {
            return null;
        }
    }

    public String e()
    {
        com.pandora.radio.data.e e1 = a();
        if (e1 != null)
        {
            return e1.c();
        } else
        {
            return null;
        }
    }

    public boolean f()
    {
        com.pandora.radio.data.e e1 = a();
        if (e1 != null)
        {
            return e1.e();
        } else
        {
            return false;
        }
    }

    public long g()
    {
        com.pandora.radio.data.e e1 = a();
        if (e1 != null)
        {
            return e1.d();
        } else
        {
            return 0L;
        }
    }
}
