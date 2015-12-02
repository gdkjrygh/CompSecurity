// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.reflex;

import com.facebook.abtest.qe.d.c;
import com.facebook.abtest.qe.data.QuickExperimentInfo;
import com.google.common.base.Optional;

// Referenced classes of package com.facebook.orca.reflex:
//            e

class f
    implements c
{

    final e a;

    f(e e)
    {
        a = e;
        super();
    }

    public Object a(QuickExperimentInfo quickexperimentinfo)
    {
        return b(quickexperimentinfo);
    }

    public Boolean b(QuickExperimentInfo quickexperimentinfo)
    {
        boolean flag1 = false;
        Optional optional = quickexperimentinfo.a("useReflex");
        boolean flag = flag1;
        if (quickexperimentinfo.c())
        {
            flag = flag1;
            if (optional.isPresent())
            {
                flag = Boolean.parseBoolean((String)optional.get());
            }
        }
        return Boolean.valueOf(flag);
    }
}
