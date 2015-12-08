// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.tiff.fieldtypes;

import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.formats.tiff.TiffField;
import org.apache.sanselan.util.Debug;

// Referenced classes of package org.apache.sanselan.formats.tiff.fieldtypes:
//            FieldType

public class FieldTypeUnknown extends FieldType
{

    public FieldTypeUnknown()
    {
        super(-1, 1, "Unknown");
    }

    public final byte[] a(Object obj, int i)
    {
        if (obj instanceof Byte)
        {
            return (new byte[] {
                ((Byte)obj).byteValue()
            });
        }
        if (obj instanceof byte[])
        {
            return (byte[])obj;
        } else
        {
            throw new ImageWriteException((new StringBuilder("Invalid data: ")).append(obj).append(" (").append(Debug.a(obj)).append(")").toString());
        }
    }

    public final Object c(TiffField tifffield)
    {
        if (tifffield.f == 1)
        {
            return new Byte(tifffield.h[0]);
        } else
        {
            return b(tifffield);
        }
    }
}
