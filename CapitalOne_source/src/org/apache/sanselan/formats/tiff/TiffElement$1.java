// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.tiff;

import java.util.Comparator;

// Referenced classes of package org.apache.sanselan.formats.tiff:
//            TiffElement

class 
    implements Comparator
{

    public int compare(Object obj, Object obj1)
    {
        obj = (TiffElement)obj;
        obj1 = (TiffElement)obj1;
        return ((TiffElement) (obj)).d - ((TiffElement) (obj1)).d;
    }

    ()
    {
    }
}
