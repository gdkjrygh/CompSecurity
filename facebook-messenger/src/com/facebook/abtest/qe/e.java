// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe;

import com.facebook.abtest.qe.data.QuickExperimentInfo;
import com.facebook.abtest.qe.data.d;
import java.util.concurrent.Callable;

// Referenced classes of package com.facebook.abtest.qe:
//            d

class e
    implements Callable
{

    final String a;
    final d b;
    final com.facebook.abtest.qe.d c;

    e(com.facebook.abtest.qe.d d1, String s, d d2)
    {
        c = d1;
        a = s;
        b = d2;
        super();
    }

    public QuickExperimentInfo a()
    {
        return d.a(c, a, b);
    }

    public Object call()
    {
        return a();
    }
}
