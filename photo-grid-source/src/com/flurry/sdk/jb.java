// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;
import java.util.Map;

// Referenced classes of package com.flurry.sdk:
//            kf, jo, jn, lb, 
//            ld, jy, lk, lg, 
//            jq, ji, jc, jj, 
//            jg, jl, jf, jm

public class jb
    implements kf
{

    private static final String a = com/flurry/sdk/jb.getSimpleName();

    public jb()
    {
    }

    public static jb a()
    {
        com/flurry/sdk/jb;
        JVM INSTR monitorenter ;
        jb jb1 = (jb)jo.a().a(com/flurry/sdk/jb);
        com/flurry/sdk/jb;
        JVM INSTR monitorexit ;
        return jb1;
        Exception exception;
        exception;
        throw exception;
    }

    private jn a(lb lb1)
    {
        if (lb1 == null)
        {
            return null;
        } else
        {
            return (jn)lb1.c(com/flurry/sdk/jn);
        }
    }

    private jn m()
    {
        return a(ld.a().e());
    }

    public void a(Context context)
    {
        lb.a(com/flurry/sdk/jn);
        jy.a();
        lk.a();
        lg.a();
        jq.a();
        ji.a();
        jc.a();
        jj.a();
        jg.a();
        jc.a();
        jl.a();
        jf.a();
        jm.a();
    }

    public void a(String s)
    {
        jn jn1 = m();
        if (jn1 != null)
        {
            jn1.a(s);
        }
    }

    public void a(String s, String s1)
    {
        jn jn1 = m();
        if (jn1 != null)
        {
            jn1.a(s, s1);
        }
    }

    public void b()
    {
        jm.b();
        jf.b();
        jl.b();
        jc.b();
        jg.b();
        jj.b();
        jc.b();
        ji.b();
        jq.b();
        lg.b();
        lk.b();
        jy.b();
        lb.b(com/flurry/sdk/jn);
    }

    public void b(String s)
    {
        jn jn1 = m();
        if (jn1 != null)
        {
            jn1.b(s);
        }
    }

    public String c()
    {
        String s = null;
        jn jn1 = m();
        if (jn1 != null)
        {
            s = jn1.b();
        }
        return s;
    }

    public long d()
    {
        long l1 = 0L;
        jn jn1 = m();
        if (jn1 != null)
        {
            l1 = jn1.c();
        }
        return l1;
    }

    public long e()
    {
        long l1 = 0L;
        jn jn1 = m();
        if (jn1 != null)
        {
            l1 = jn1.d();
        }
        return l1;
    }

    public long f()
    {
        long l1 = -1L;
        jn jn1 = m();
        if (jn1 != null)
        {
            l1 = jn1.e();
        }
        return l1;
    }

    public long g()
    {
        long l1 = 0L;
        jn jn1 = m();
        if (jn1 != null)
        {
            l1 = jn1.g();
        }
        return l1;
    }

    public long h()
    {
        long l1 = 0L;
        jn jn1 = m();
        if (jn1 != null)
        {
            l1 = jn1.f();
        }
        return l1;
    }

    public String i()
    {
        jn jn1 = m();
        if (jn1 != null)
        {
            return jn1.h();
        } else
        {
            return null;
        }
    }

    public String j()
    {
        jn jn1 = m();
        if (jn1 != null)
        {
            return jn1.i();
        } else
        {
            return null;
        }
    }

    public Map k()
    {
        jn jn1 = m();
        if (jn1 != null)
        {
            return jn1.j();
        } else
        {
            return null;
        }
    }

    public ji.a l()
    {
        return ji.a().d();
    }

}
