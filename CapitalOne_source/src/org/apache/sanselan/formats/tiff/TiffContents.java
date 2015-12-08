// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.tiff;

import java.util.ArrayList;

// Referenced classes of package org.apache.sanselan.formats.tiff:
//            TiffHeader

public class TiffContents
{

    public final TiffHeader a;
    public final ArrayList b;

    public TiffContents(TiffHeader tiffheader, ArrayList arraylist)
    {
        a = tiffheader;
        b = arraylist;
    }
}
