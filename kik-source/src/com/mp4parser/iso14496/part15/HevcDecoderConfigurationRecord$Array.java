// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mp4parser.iso14496.part15;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.mp4parser.iso14496.part15:
//            HevcDecoderConfigurationRecord

public static class 
{

    public boolean array_completeness;
    public List nalUnits;
    public int nal_unit_type;
    public boolean reserved;

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        Object obj1 = ()obj;
        if (array_completeness != ((array_completeness) (obj1)).array_completeness)
        {
            return false;
        }
        if (nal_unit_type != ((nal_unit_type) (obj1)).nal_unit_type)
        {
            return false;
        }
        if (reserved != ((reserved) (obj1)).reserved)
        {
            return false;
        }
        obj = nalUnits.listIterator();
        obj1 = ((nalUnits) (obj1)).nalUnits.listIterator();
        do
        {
            byte abyte0[];
            byte abyte1[];
            if (!((ListIterator) (obj)).hasNext() || !((ListIterator) (obj1)).hasNext())
            {
                return !((ListIterator) (obj)).hasNext() && !((ListIterator) (obj1)).hasNext();
            }
            abyte0 = (byte[])((ListIterator) (obj)).next();
            abyte1 = (byte[])((ListIterator) (obj1)).next();
        } while (abyte0 != null ? Arrays.equals(abyte0, abyte1) : abyte1 == null);
        return false;
    }

    public int hashCode()
    {
        int j = 1;
        int k = 0;
        int i;
        int l;
        if (array_completeness)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (!reserved)
        {
            j = 0;
        }
        l = nal_unit_type;
        if (nalUnits != null)
        {
            k = nalUnits.hashCode();
        }
        return ((i * 31 + j) * 31 + l) * 31 + k;
    }

    public String toString()
    {
        return (new StringBuilder("Array{nal_unit_type=")).append(nal_unit_type).append(", reserved=").append(reserved).append(", array_completeness=").append(array_completeness).append(", num_nals=").append(nalUnits.size()).append('}').toString();
    }

    public ()
    {
    }
}
