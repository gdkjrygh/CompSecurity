// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.b;

import com.facebook.abtest.qe.data.QuickExperimentInfo;
import com.google.common.a.ev;
import com.google.common.a.fi;
import com.google.common.a.ik;
import com.google.common.base.Optional;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.facebook.orca.photos.b:
//            a, e, b

class c
    implements com.facebook.abtest.qe.d.c
{

    private c()
    {
    }

    c(b b1)
    {
        this();
    }

    public Object a(QuickExperimentInfo quickexperimentinfo)
    {
        return b(quickexperimentinfo);
    }

    public e b(QuickExperimentInfo quickexperimentinfo)
    {
        if (quickexperimentinfo == null || !quickexperimentinfo.c())
        {
            return com.facebook.orca.photos.b.a.b();
        }
        java.util.HashMap hashmap = ik.a(a.a);
        Iterator iterator = a.a.i_().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if (quickexperimentinfo.a(s).isPresent())
            {
                int i = Integer.valueOf((String)quickexperimentinfo.a(s).get()).intValue();
                if (i >= 0)
                {
                    hashmap.put(s, Integer.valueOf(i));
                }
            }
        } while (true);
        return new e(((Integer)hashmap.get("width")).intValue(), ((Integer)hashmap.get("height")).intValue(), ((Integer)hashmap.get("quality")).intValue());
    }
}
