// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Objects;

// Referenced classes of package com.google.common.a:
//            dy

public abstract class dx extends dy
    implements java.util.Map.Entry
{

    protected dx()
    {
    }

    protected abstract java.util.Map.Entry a();

    protected boolean a(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof java.util.Map.Entry)
        {
            obj = (java.util.Map.Entry)obj;
            flag = flag1;
            if (Objects.equal(getKey(), ((java.util.Map.Entry) (obj)).getKey()))
            {
                flag = flag1;
                if (Objects.equal(getValue(), ((java.util.Map.Entry) (obj)).getValue()))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    protected Object c()
    {
        return a();
    }

    public boolean equals(Object obj)
    {
        return a().equals(obj);
    }

    public Object getKey()
    {
        return a().getKey();
    }

    public Object getValue()
    {
        return a().getValue();
    }

    public int hashCode()
    {
        return a().hashCode();
    }

    public Object setValue(Object obj)
    {
        return a().setValue(obj);
    }
}
