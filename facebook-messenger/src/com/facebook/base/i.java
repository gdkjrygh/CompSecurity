// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base;

import com.google.common.a.ik;
import com.google.common.base.Preconditions;
import java.util.Map;

// Referenced classes of package com.facebook.base:
//            h

public class i
    implements h
{

    private Map a;

    public i()
    {
    }

    public Object a(Object obj)
    {
        Preconditions.checkNotNull(obj);
        if (a != null)
        {
            return a.get(obj);
        } else
        {
            return null;
        }
    }

    public void a(Object obj, Object obj1)
    {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj1);
        if (a == null)
        {
            a = ik.a();
        }
        a.put(obj, obj1);
    }
}
