// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.time;

import java.util.Arrays;

// Referenced classes of package org.apache.commons.lang3.time:
//            FormatCache

private static class keys
{

    private int hashCode;
    private final Object keys[];

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof keys))
        {
            return false;
        } else
        {
            return Arrays.equals(keys, ((keys)obj).keys);
        }
    }

    public int hashCode()
    {
        if (hashCode == 0)
        {
            int j = 0;
            Object aobj[] = keys;
            int l = aobj.length;
            for (int i = 0; i < l;)
            {
                Object obj = aobj[i];
                int k = j;
                if (obj != null)
                {
                    k = j * 7 + obj.hashCode();
                }
                i++;
                j = k;
            }

            hashCode = j;
        }
        return hashCode;
    }

    public transient (Object aobj[])
    {
        keys = aobj;
    }
}
