// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe;

import com.facebook.abtest.qe.b.a;
import com.facebook.abtest.qe.c.e;
import com.facebook.abtest.qe.c.f;
import com.facebook.abtest.qe.data.QuickExperimentInfo;
import com.facebook.common.e.h;
import com.facebook.debug.log.b;
import com.google.common.base.Preconditions;
import com.google.common.d.a.s;
import com.google.common.d.a.u;

// Referenced classes of package com.facebook.abtest.qe:
//            c, e

public class d
    implements c
{

    private static final Class a = com/facebook/abtest/qe/d;
    private final a b;
    private final e c;
    private final com.facebook.abtest.qe.e.a d;
    private final u e;
    private final com.facebook.common.executors.a f;
    private final com.facebook.abtest.qe.g.a g;
    private final h h;

    public d(a a1, e e1, com.facebook.abtest.qe.e.a a2, u u1, com.facebook.common.executors.a a3, com.facebook.abtest.qe.g.a a4, h h1)
    {
        b = (a)Preconditions.checkNotNull(a1);
        c = (e)Preconditions.checkNotNull(e1);
        d = (com.facebook.abtest.qe.e.a)Preconditions.checkNotNull(a2);
        e = (u)Preconditions.checkNotNull(u1);
        f = (com.facebook.common.executors.a)Preconditions.checkNotNull(a3);
        g = (com.facebook.abtest.qe.g.a)Preconditions.checkNotNull(a4);
        h = (h)Preconditions.checkNotNull(h1);
    }

    static QuickExperimentInfo a(d d1, String s, com.facebook.abtest.qe.data.d d2)
    {
        return d1.b(s, d2);
    }

    private QuickExperimentInfo a(String s)
    {
        f.b();
        return c.a(s, f.FROM_SERVER);
    }

    private void a(String s, String s1)
    {
        com.facebook.debug.log.b.b(a, "%s - %s", new Object[] {
            s, s1
        });
        h.a(s, s1);
    }

    private QuickExperimentInfo b(String s, com.facebook.abtest.qe.data.d d1)
    {
        QuickExperimentInfo quickexperimentinfo = a(s);
        if (a(s, quickexperimentinfo, d1))
        {
            return quickexperimentinfo;
        } else
        {
            return b.b(s);
        }
    }

    public s a(String s, com.facebook.abtest.qe.data.d d1)
    {
        return e.c(new com.facebook.abtest.qe.e(this, s, d1));
    }

    boolean a(String s, QuickExperimentInfo quickexperimentinfo, com.facebook.abtest.qe.data.d d1)
    {
        String s1;
        boolean flag;
        boolean flag1;
        if (quickexperimentinfo != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag = flag1;
        if (flag1)
        {
            flag = flag1;
            if (!quickexperimentinfo.a().equals(s))
            {
                a((new StringBuilder()).append("QuickExperiment Name failure: ").append(s).toString(), (new StringBuilder()).append("Storage returned value of ").append(quickexperimentinfo).toString());
                flag = false;
            }
        }
        s1 = g.a();
        flag1 = flag;
        if (flag)
        {
            flag1 = flag;
            if (!quickexperimentinfo.e().equals(s1))
            {
                a((new StringBuilder()).append("QuickExperiment Locale failure: ").append(s).toString(), (new StringBuilder()).append("Expected ").append(s1).append(" , got ").append(quickexperimentinfo.e()).toString());
                flag1 = false;
            }
        }
        if (flag1 && !d1.a(quickexperimentinfo))
        {
            a((new StringBuilder()).append("QuickExperiment Invalid: ").append(s).toString(), (new StringBuilder()).append("Failed to validate object ").append(quickexperimentinfo).toString());
            return false;
        } else
        {
            return flag1;
        }
    }

}
