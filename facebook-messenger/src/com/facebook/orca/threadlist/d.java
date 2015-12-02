// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import com.facebook.abtest.qe.d.c;
import com.facebook.abtest.qe.data.QuickExperimentInfo;

// Referenced classes of package com.facebook.orca.threadlist:
//            c, e

class d
    implements c
{

    final com.facebook.orca.threadlist.c a;

    d(com.facebook.orca.threadlist.c c1)
    {
        a = c1;
        super();
    }

    public Object a(QuickExperimentInfo quickexperimentinfo)
    {
        return b(quickexperimentinfo);
    }

    public e b(QuickExperimentInfo quickexperimentinfo)
    {
        return c.a(a, quickexperimentinfo);
    }
}
