// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.tiff.fieldtypes;

import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.common.RationalNumber;
import org.apache.sanselan.common.RationalNumberUtilities;
import org.apache.sanselan.formats.tiff.TiffField;
import org.apache.sanselan.formats.tiff.constants.TagInfo;
import org.apache.sanselan.util.Debug;

// Referenced classes of package org.apache.sanselan.formats.tiff.fieldtypes:
//            FieldType

public class FieldTypeRational extends FieldType
{

    public FieldTypeRational(int i, String s)
    {
        super(i, 8, s);
    }

    public final byte[] a(Object obj, int i)
    {
        boolean flag = false;
        int j = 0;
        if (obj instanceof RationalNumber)
        {
            return a((RationalNumber)obj, i);
        }
        if (obj instanceof RationalNumber[])
        {
            return a((RationalNumber[])obj, i);
        }
        if (obj instanceof Number)
        {
            return a(RationalNumberUtilities.a(((Number)obj).doubleValue()), i);
        }
        if (obj instanceof Number[])
        {
            obj = (Number[])obj;
            RationalNumber arationalnumber[] = new RationalNumber[obj.length];
            do
            {
                if (j >= obj.length)
                {
                    return a(arationalnumber, i);
                }
                arationalnumber[j] = RationalNumberUtilities.a(obj[j].doubleValue());
                j++;
            } while (true);
        }
        if (obj instanceof double[])
        {
            obj = (double[])obj;
            RationalNumber arationalnumber1[] = new RationalNumber[obj.length];
            int k = ((flag) ? 1 : 0);
            do
            {
                if (k >= obj.length)
                {
                    return a(arationalnumber1, i);
                }
                arationalnumber1[k] = RationalNumberUtilities.a(obj[k]);
                k++;
            } while (true);
        } else
        {
            throw new ImageWriteException((new StringBuilder("Invalid data: ")).append(obj).append(" (").append(Debug.a(obj)).append(")").toString());
        }
    }

    public final Object c(TiffField tifffield)
    {
        if (tifffield.f == 1)
        {
            return a((new StringBuilder(String.valueOf(d))).append(" (").append(tifffield.a.a).append(")").toString(), tifffield.i, tifffield.j);
        } else
        {
            return a((new StringBuilder(String.valueOf(d))).append(" (").append(tifffield.a.a).append(")").toString(), b(tifffield), tifffield.f, tifffield.j);
        }
    }
}
