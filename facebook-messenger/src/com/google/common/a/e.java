// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

// Referenced classes of package com.google.common.a:
//            dx, d, c, a

class e extends dx
{

    final java.util.Map.Entry a;
    final d b;

    e(d d1, java.util.Map.Entry entry)
    {
        b = d1;
        a = entry;
        super();
    }

    protected java.util.Map.Entry a()
    {
        return a;
    }

    protected Object c()
    {
        return a();
    }

    public Object setValue(Object obj)
    {
        Preconditions.checkState(b.c.contains(this), "entry no longer in map");
        if (Objects.equal(obj, getValue()))
        {
            return obj;
        }
        Object obj1;
        boolean flag;
        if (!b.c.b.containsValue(obj))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "value already present: %s", new Object[] {
            obj
        });
        obj1 = a.setValue(obj);
        Preconditions.checkState(Objects.equal(obj, b.c.b.get(getKey())), "entry no longer in map");
        com.google.common.a.a.a(b.c.b, getKey(), true, obj1, obj);
        return obj1;
    }
}
