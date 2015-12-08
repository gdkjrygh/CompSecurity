// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.tiff.fieldtypes;

import org.apache.sanselan.common.BinaryFileFunctions;
import org.apache.sanselan.formats.tiff.TiffField;
import org.apache.sanselan.formats.tiff.constants.TiffConstants;

public abstract class FieldType extends BinaryFileFunctions
    implements TiffConstants
{

    public final int b;
    public final int c;
    public final String d;

    public FieldType(int i, int j, String s)
    {
        b = i;
        c = j;
        d = s;
    }

    public static final byte[] b()
    {
        return new byte[4];
    }

    public final boolean a(TiffField tifffield)
    {
        return c > 0 && c * tifffield.f <= 4;
    }

    public abstract byte[] a(Object obj, int i);

    public final byte[] b(TiffField tifffield)
    {
        if (a(tifffield))
        {
            int i = c;
            i = tifffield.f * i;
            byte abyte0[] = new byte[i];
            System.arraycopy(tifffield.h, 0, abyte0, 0, i);
            return abyte0;
        } else
        {
            return tifffield.i;
        }
    }

    public abstract Object c(TiffField tifffield);

    public String toString()
    {
        return (new StringBuilder("[")).append(getClass().getName()).append(". type: ").append(b).append(", name: ").append(d).append(", length: ").append(c).append("]").toString();
    }
}
