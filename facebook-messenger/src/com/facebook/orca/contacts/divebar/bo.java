// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import com.facebook.abtest.qe.d.c;
import com.facebook.abtest.qe.data.QuickExperimentInfo;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            bn, bp

class bo
    implements c
{

    final bn a;

    bo(bn bn1)
    {
        a = bn1;
        super();
    }

    public Object a(QuickExperimentInfo quickexperimentinfo)
    {
        return b(quickexperimentinfo);
    }

    public bp b(QuickExperimentInfo quickexperimentinfo)
    {
        return bn.a(a, quickexperimentinfo);
    }
}
