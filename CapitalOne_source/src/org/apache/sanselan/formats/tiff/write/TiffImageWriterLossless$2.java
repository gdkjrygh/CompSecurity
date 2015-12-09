// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.tiff.write;

import java.util.Comparator;

// Referenced classes of package org.apache.sanselan.formats.tiff.write:
//            TiffOutputItem

class 
    implements Comparator
{

    public int compare(Object obj, Object obj1)
    {
        obj = (TiffOutputItem)obj;
        obj1 = (TiffOutputItem)obj1;
        return ((TiffOutputItem) (obj)).c() - ((TiffOutputItem) (obj1)).c();
    }

    ()
    {
    }
}
