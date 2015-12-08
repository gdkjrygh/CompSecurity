// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.tiff.fieldtypes;

import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.formats.tiff.TiffField;
import org.apache.sanselan.formats.tiff.constants.TagInfo;
import org.apache.sanselan.util.Debug;

// Referenced classes of package org.apache.sanselan.formats.tiff.fieldtypes:
//            FieldType

public class FieldTypeFloat extends FieldType
{

    public FieldTypeFloat()
    {
        super(11, 4, "Float");
    }

    public final byte[] a(Object obj, int i)
    {
        int j = 0;
        if (obj instanceof Float)
        {
            float f = ((Float)obj).floatValue();
            obj = new byte[4];
            j = Float.floatToRawIntBits(f);
            if (i == 77)
            {
                obj[0] = (byte)(j >> 0 & 0xff);
                obj[1] = (byte)(j >> 8 & 0xff);
                obj[2] = (byte)(j >> 16 & 0xff);
                obj[3] = (byte)(j >> 24 & 0xff);
            } else
            {
                obj[3] = (byte)(j >> 0 & 0xff);
                obj[2] = (byte)(j >> 8 & 0xff);
                obj[1] = (byte)(j >> 16 & 0xff);
                obj[0] = (byte)(j >> 24 & 0xff);
            }
            return ((byte []) (obj));
        }
        if (obj instanceof float[])
        {
            return a((float[])obj, i);
        }
        if (obj instanceof Float[])
        {
            obj = (Float[])obj;
            float af[] = new float[obj.length];
            do
            {
                if (j >= af.length)
                {
                    return a(af, i);
                }
                af[j] = obj[j].floatValue();
                j++;
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
            (new StringBuilder(String.valueOf(d))).append(" (").append(tifffield.a.a).append(")").toString();
            return new Float(a(tifffield.h, tifffield.j));
        } else
        {
            return d((new StringBuilder(String.valueOf(d))).append(" (").append(tifffield.a.a).append(")").toString(), b(tifffield), tifffield.f, tifffield.j);
        }
    }
}
