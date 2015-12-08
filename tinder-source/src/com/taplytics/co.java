// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;


// Referenced classes of package com.taplytics:
//            hu, cv, ci, turkey, 
//            bo

final class co extends hu
{

    final String a;
    final String b;
    final ci c;

    co(ci ci1, String s, String s1)
    {
        c = ci1;
        a = s;
        b = s1;
        super();
    }

    public final void c()
    {
        cv cv1 = cv.a();
        String s = a;
        String s1 = b;
        if (ci.b().g)
        {
            if (!s.equals(cv1.f) || !s1.equals(cv1.e))
            {
                cv1.e = s1;
                cv1.f = s;
                cv1.l = true;
                cv1.d = turkey.a;
                cv1.c();
            }
            cv1.d();
        }
        bo.a().a(b);
        cv.a().b();
        super.c();
    }
}
