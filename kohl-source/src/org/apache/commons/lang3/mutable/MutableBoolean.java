// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.mutable;

import java.io.Serializable;

// Referenced classes of package org.apache.commons.lang3.mutable:
//            Mutable

public class MutableBoolean
    implements Mutable, Serializable, Comparable
{

    private static final long serialVersionUID = 0xbcf5ce5a3a90e379L;
    private boolean value;

    public MutableBoolean()
    {
    }

    public MutableBoolean(Boolean boolean1)
    {
        value = boolean1.booleanValue();
    }

    public MutableBoolean(boolean flag)
    {
        value = flag;
    }

    public boolean booleanValue()
    {
        return value;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((MutableBoolean)obj);
    }

    public int compareTo(MutableBoolean mutableboolean)
    {
        boolean flag = mutableboolean.value;
        if (value == flag)
        {
            return 0;
        }
        return !value ? -1 : 1;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof MutableBoolean)
        {
            flag = flag1;
            if (value == ((MutableBoolean)obj).booleanValue())
            {
                flag = true;
            }
        }
        return flag;
    }

    public Boolean getValue()
    {
        return Boolean.valueOf(value);
    }

    public volatile Object getValue()
    {
        return getValue();
    }

    public int hashCode()
    {
        if (value)
        {
            return Boolean.TRUE.hashCode();
        } else
        {
            return Boolean.FALSE.hashCode();
        }
    }

    public boolean isFalse()
    {
        return !value;
    }

    public boolean isTrue()
    {
        return value;
    }

    public void setValue(Boolean boolean1)
    {
        value = boolean1.booleanValue();
    }

    public volatile void setValue(Object obj)
    {
        setValue((Boolean)obj);
    }

    public void setValue(boolean flag)
    {
        value = flag;
    }

    public Boolean toBoolean()
    {
        return Boolean.valueOf(booleanValue());
    }

    public String toString()
    {
        return String.valueOf(value);
    }
}
