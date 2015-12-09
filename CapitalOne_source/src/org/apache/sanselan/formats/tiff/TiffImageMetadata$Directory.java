// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.tiff;

import org.apache.sanselan.common.ImageMetadata;

// Referenced classes of package org.apache.sanselan.formats.tiff:
//            TiffDirectory

public class  extends ImageMetadata
    implements org.apache.sanselan.common.aItem
{

    private final TiffDirectory b;

    public final String a(String s)
    {
        String s1;
        StringBuilder stringbuilder;
        if (s != null)
        {
            s1 = s;
        } else
        {
            s1 = "";
        }
        stringbuilder = (new StringBuilder(String.valueOf(s1))).append(b.a()).append(": ");
        if (b.e() != null)
        {
            s1 = " (jpegImageData)";
        } else
        {
            s1 = "";
        }
        return stringbuilder.append(s1).append("\n").append(super.a(s)).append("\n").toString();
    }
}
