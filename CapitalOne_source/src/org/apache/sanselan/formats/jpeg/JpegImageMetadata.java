// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.jpeg;

import org.apache.sanselan.common.IImageMetadata;
import org.apache.sanselan.formats.tiff.TiffImageMetadata;

public class JpegImageMetadata
    implements IImageMetadata
{

    private static final String b = System.getProperty("line.separator");
    private final TiffImageMetadata a;

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("");
        if (a == null)
        {
            stringbuffer.append("No Exif metadata.");
        } else
        {
            stringbuffer.append("Exif metadata:");
            stringbuffer.append(b);
            stringbuffer.append(a.a("\t"));
        }
        stringbuffer.append(b);
        stringbuffer.append("");
        stringbuffer.append("No Photoshop (IPTC) metadata.");
        return stringbuffer.toString();
    }

}
