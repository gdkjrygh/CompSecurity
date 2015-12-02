// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.backgroundtasks;

import com.facebook.debug.log.b;
import com.google.common.a.ik;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.facebook.backgroundtasks:
//            c

public class d
{

    private static final Class a = com/facebook/backgroundtasks/d;
    private final ConcurrentMap b = ik.c();

    public d()
    {
    }

    public void a(Class class1, boolean flag)
    {
        com.facebook.debug.log.b.b(a, "setTagDisabled(%s, %s)", new Object[] {
            class1, Boolean.valueOf(flag)
        });
        if (flag)
        {
            b.put(class1, Boolean.valueOf(true));
            return;
        } else
        {
            b.remove(class1);
            return;
        }
    }

    public boolean a(c c1)
    {
        for (c1 = c1.g().iterator(); c1.hasNext();)
        {
            Class class1 = (Class)c1.next();
            if (b.containsKey(class1))
            {
                return true;
            }
        }

        return false;
    }

}
