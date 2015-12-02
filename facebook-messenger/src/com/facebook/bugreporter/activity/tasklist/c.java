// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter.activity.tasklist;

import android.util.Log;
import com.facebook.bugreporter.l;
import com.facebook.http.protocol.aq;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.d.a.s;
import com.google.common.d.a.u;

// Referenced classes of package com.facebook.bugreporter.activity.tasklist:
//            f, d, e

public class c
{

    private static final String a = com/facebook/bugreporter/activity/tasklist/c.getSimpleName();
    private final aq b;
    private final e c;
    private final u d;

    public c(aq aq1, e e, u u1)
    {
        b = aq1;
        c = e;
        d = u1;
    }

    static es a(c c1, String s, l l1)
    {
        return c1.b(s, l1);
    }

    private es b(String s, l l1)
    {
        et et1 = es.e();
        et1.b(l1.b());
        s = new f(et1.b(), s);
        s = (es)b.a(c, s);
        if (s != null)
        {
            return s;
        }
        break MISSING_BLOCK_LABEL_79;
        s;
        Log.e(a, (new StringBuilder()).append("Exception caught running SingleMethodRunner: ").append(s).toString());
        return es.d();
    }

    public s a(String s, l l1)
    {
        return d.c(new d(this, s, l1));
    }

}
