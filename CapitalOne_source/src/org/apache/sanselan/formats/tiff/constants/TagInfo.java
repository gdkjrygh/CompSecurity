// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.tiff.constants;

import org.apache.sanselan.formats.tiff.TiffField;
import org.apache.sanselan.formats.tiff.fieldtypes.FieldType;

// Referenced classes of package org.apache.sanselan.formats.tiff.constants:
//            TiffDirectoryConstants, TiffFieldTypeConstants

public class TagInfo
    implements TiffDirectoryConstants, TiffFieldTypeConstants
{

    public final String a;
    public final int b;
    public final FieldType c[];
    public final int d;
    public final TiffDirectoryConstants.ExifDirectoryType e;

    public TagInfo(String s, int i, FieldType fieldtype, int j, TiffDirectoryConstants.ExifDirectoryType exifdirectorytype)
    {
        this(s, i, new FieldType[] {
            fieldtype
        }, j, exifdirectorytype);
    }

    public TagInfo(String s, int i, FieldType afieldtype[], int j, TiffDirectoryConstants.ExifDirectoryType exifdirectorytype)
    {
        a = s;
        b = i;
        c = afieldtype;
        d = j;
        e = exifdirectorytype;
    }

    public Object a(TiffField tifffield)
    {
        return tifffield.b.c(tifffield);
    }

    public final String a()
    {
        return (new StringBuilder(String.valueOf(b))).append(" (0x").append(Integer.toHexString(b)).append(": ").append(a).append("): ").toString();
    }

    public byte[] a(FieldType fieldtype, Object obj, int i)
    {
        return fieldtype.a(obj, i);
    }

    public String toString()
    {
        return (new StringBuilder("[TagInfo. tag: ")).append(b).append(" (0x").append(Integer.toHexString(b)).append(", name: ").append(a).append("]").toString();
    }
}
