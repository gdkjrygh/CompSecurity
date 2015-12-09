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

public class FieldTypeLong extends FieldType
{

    public FieldTypeLong(int i, String s)
    {
        super(i, 4, s);
    }

    public final byte[] a(Object obj, int i)
    {
        int j = 0;
        if (obj instanceof Integer)
        {
            return a(new int[] {
                ((Integer)obj).intValue()
            }, i);
        }
        if (obj instanceof int[])
        {
            return a((int[])obj, i);
        }
        if (obj instanceof Integer[])
        {
            obj = (Integer[])obj;
            int ai[] = new int[obj.length];
            do
            {
                if (j >= ai.length)
                {
                    return a(ai, i);
                }
                ai[j] = obj[j].intValue();
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
            return new Integer(b((new StringBuilder(String.valueOf(d))).append(" (").append(tifffield.a.a).append(")").toString(), tifffield.h, tifffield.j));
        } else
        {
            return b((new StringBuilder(String.valueOf(d))).append(" (").append(tifffield.a.a).append(")").toString(), b(tifffield), tifffield.f, tifffield.j);
        }
    }
}
