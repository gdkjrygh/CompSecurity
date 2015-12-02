// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.presence;

import com.facebook.abtest.qe.d.c;
import com.facebook.abtest.qe.data.QuickExperimentInfo;

// Referenced classes of package com.facebook.orca.presence:
//            d, f

class e
    implements c
{

    final d a;

    e(d d1)
    {
        a = d1;
        super();
    }

    public Object a(QuickExperimentInfo quickexperimentinfo)
    {
        return b(quickexperimentinfo);
    }

    public f b(QuickExperimentInfo quickexperimentinfo)
    {
        return d.a(a, quickexperimentinfo);
    }
}
