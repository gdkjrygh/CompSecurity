// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Objects;

// Referenced classes of package com.google.common.collect:
//            ForwardingObject

public abstract class ForwardingMapEntry extends ForwardingObject
    implements java.util.Map.Entry
{

    protected ForwardingMapEntry()
    {
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected abstract java.util.Map.Entry _mthdelegate();

    public boolean equals(Object obj)
    {
        return _mthdelegate().equals(obj);
    }

    public Object getKey()
    {
        return _mthdelegate().getKey();
    }

    public Object getValue()
    {
        return _mthdelegate().getValue();
    }

    public int hashCode()
    {
        return _mthdelegate().hashCode();
    }

    public Object setValue(Object obj)
    {
        return _mthdelegate().setValue(obj);
    }

    protected boolean standardEquals(Object obj)
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

    protected int standardHashCode()
    {
        int j = 0;
        Object obj = getKey();
        Object obj1 = getValue();
        int i;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = obj.hashCode();
        }
        if (obj1 != null)
        {
            j = obj1.hashCode();
        }
        return j ^ i;
    }

    protected String standardToString()
    {
        return (new StringBuilder()).append(getKey()).append("=").append(getValue()).toString();
    }
}
