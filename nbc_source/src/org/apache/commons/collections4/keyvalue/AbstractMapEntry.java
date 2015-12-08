// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.collections4.keyvalue;


// Referenced classes of package org.apache.commons.collections4.keyvalue:
//            AbstractKeyValue

public abstract class AbstractMapEntry extends AbstractKeyValue
    implements java.util.Map.Entry
{

    protected AbstractMapEntry(Object obj, Object obj1)
    {
        super(obj, obj1);
    }

    public boolean equals(Object obj)
    {
        if (obj != this) goto _L2; else goto _L1
_L1:
        return true;
_L2:
label0:
        {
            if (!(obj instanceof java.util.Map.Entry))
            {
                return false;
            }
            obj = (java.util.Map.Entry)obj;
            if (getKey() != null ? getKey().equals(((java.util.Map.Entry) (obj)).getKey()) : ((java.util.Map.Entry) (obj)).getKey() == null)
            {
                break label0;
            } else
            {
                break; /* Loop/switch isn't completed */
            }
        }
        if (getValue() != null) goto _L4; else goto _L3
_L3:
        if (((java.util.Map.Entry) (obj)).getValue() == null) goto _L1; else goto _L5
_L5:
        return false;
_L4:
        if (getValue().equals(((java.util.Map.Entry) (obj)).getValue()))
        {
            return true;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (getKey() == null)
        {
            i = 0;
        } else
        {
            i = getKey().hashCode();
        }
        if (getValue() != null)
        {
            j = getValue().hashCode();
        }
        return i ^ j;
    }

    public Object setValue(Object obj)
    {
        return super.setValue(obj);
    }
}
