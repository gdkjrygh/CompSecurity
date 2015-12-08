// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.mutable;

import java.io.Serializable;

// Referenced classes of package org.apache.commons.lang3.mutable:
//            Mutable

public class MutableObject
    implements Mutable, Serializable
{

    private static final long serialVersionUID = 0x14146a94f5L;
    private Object value;

    public MutableObject()
    {
    }

    public MutableObject(Object obj)
    {
        value = obj;
    }

    public boolean equals(Object obj)
    {
        if (obj != null)
        {
            if (this == obj)
            {
                return true;
            }
            if (getClass() == obj.getClass())
            {
                obj = (MutableObject)obj;
                return value.equals(((MutableObject) (obj)).value);
            }
        }
        return false;
    }

    public Object getValue()
    {
        return value;
    }

    public int hashCode()
    {
        if (value == null)
        {
            return 0;
        } else
        {
            return value.hashCode();
        }
    }

    public void setValue(Object obj)
    {
        value = obj;
    }

    public String toString()
    {
        if (value == null)
        {
            return "null";
        } else
        {
            return value.toString();
        }
    }
}
