// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.tiff.fieldtypes;

import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.formats.tiff.TiffField;
import org.apache.sanselan.util.Debug;

// Referenced classes of package org.apache.sanselan.formats.tiff.fieldtypes:
//            FieldType

public class FieldTypeDouble extends FieldType
{

    public FieldTypeDouble()
    {
        super(12, 8, "Double");
    }

    public final byte[] a(Object obj, int i)
    {
        int j = 0;
        if (obj instanceof Double)
        {
            double d = ((Double)obj).doubleValue();
            obj = new byte[8];
            long l = Double.doubleToRawLongBits(d);
            if (i == 77)
            {
                obj[0] = (byte)(int)(l >> 0 & 255L);
                obj[1] = (byte)(int)(l >> 8 & 255L);
                obj[2] = (byte)(int)(l >> 16 & 255L);
                obj[3] = (byte)(int)(l >> 24 & 255L);
                obj[4] = (byte)(int)(l >> 32 & 255L);
                obj[5] = (byte)(int)(l >> 40 & 255L);
                obj[6] = (byte)(int)(l >> 48 & 255L);
                obj[7] = (byte)(int)(l >> 56 & 255L);
            } else
            {
                obj[7] = (byte)(int)(l >> 0 & 255L);
                obj[6] = (byte)(int)(l >> 8 & 255L);
                obj[5] = (byte)(int)(l >> 16 & 255L);
                obj[4] = (byte)(int)(l >> 24 & 255L);
                obj[3] = (byte)(int)(l >> 32 & 255L);
                obj[2] = (byte)(int)(l >> 40 & 255L);
                obj[1] = (byte)(int)(l >> 48 & 255L);
                obj[0] = (byte)(int)(l >> 56 & 255L);
            }
            return ((byte []) (obj));
        }
        if (obj instanceof double[])
        {
            return a((double[])obj, i);
        }
        if (obj instanceof Double[])
        {
            obj = (Double[])obj;
            double ad[] = new double[obj.length];
            do
            {
                if (j >= ad.length)
                {
                    return a(ad, i);
                }
                ad[j] = obj[j].doubleValue();
                j++;
            } while (true);
        } else
        {
            throw new ImageWriteException((new StringBuilder("Invalid data: ")).append(obj).append(" (").append(Debug.a(obj)).append(")").toString());
        }
    }

    public final Object c(TiffField tifffield)
    {
        return "?";
    }
}
