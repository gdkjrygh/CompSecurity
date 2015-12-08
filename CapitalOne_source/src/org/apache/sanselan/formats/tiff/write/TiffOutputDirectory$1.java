// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.tiff.write;

import java.util.Comparator;

// Referenced classes of package org.apache.sanselan.formats.tiff.write:
//            TiffOutputField, TiffOutputDirectory

class a
    implements Comparator
{

    final TiffOutputDirectory a;

    public int compare(Object obj, Object obj1)
    {
        obj = (TiffOutputField)obj;
        obj1 = (TiffOutputField)obj1;
        if (((TiffOutputField) (obj)).a != ((TiffOutputField) (obj1)).a)
        {
            return ((TiffOutputField) (obj)).a - ((TiffOutputField) (obj1)).a;
        } else
        {
            return ((TiffOutputField) (obj)).c() - ((TiffOutputField) (obj1)).c();
        }
    }

    (TiffOutputDirectory tiffoutputdirectory)
    {
        a = tiffoutputdirectory;
        super();
    }
}
