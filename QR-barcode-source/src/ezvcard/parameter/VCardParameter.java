// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.parameter;


public class VCardParameter
{

    protected final String value;

    public VCardParameter(String s)
    {
        if (s == null)
        {
            s = null;
        } else
        {
            s = s.toLowerCase();
        }
        value = s;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (VCardParameter)obj;
        if (value != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((VCardParameter) (obj)).value == null) goto _L1; else goto _L3
_L3:
        return false;
        if (value.equals(((VCardParameter) (obj)).value)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public String getValue()
    {
        return value;
    }

    public int hashCode()
    {
        int i;
        if (value == null)
        {
            i = 0;
        } else
        {
            i = value.hashCode();
        }
        return i + 31;
    }

    public String toString()
    {
        return value;
    }
}
