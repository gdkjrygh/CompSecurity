// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.tiff.fieldtypes;

import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.formats.tiff.TiffField;

// Referenced classes of package org.apache.sanselan.formats.tiff.fieldtypes:
//            FieldType

public class FieldTypeASCII extends FieldType
{

    public FieldTypeASCII(String s)
    {
        super(2, 1, s);
    }

    public final byte[] a(Object obj, int i)
    {
        byte abyte0[];
        if (obj instanceof byte[])
        {
            obj = (byte[])obj;
        } else
        if (obj instanceof String)
        {
            obj = ((String)obj).getBytes();
        } else
        {
            throw new ImageWriteException((new StringBuilder("Unknown data type: ")).append(obj).toString());
        }
        abyte0 = new byte[obj.length + 1];
        System.arraycopy(obj, 0, abyte0, 0, obj.length);
        return abyte0;
    }

    public final Object c(TiffField tifffield)
    {
        tifffield = b(tifffield);
        return new String(tifffield, 0, tifffield.length - 1);
    }
}
