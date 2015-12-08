// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.jpeg.segments;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;

// Referenced classes of package org.apache.sanselan.formats.jpeg.segments:
//            Segment

public class SOFNSegment extends Segment
{

    public final int b;
    public final int c;
    public final int d;
    public final int e;

    private SOFNSegment(int i, int j, InputStream inputstream)
    {
        super(i, j);
        if (a())
        {
            System.out.println((new StringBuilder("SOF0Segment marker_length: ")).append(j).toString());
        }
        e = a("Data_precision", inputstream, "Not a Valid JPEG File");
        c = c("Image_height", inputstream, "Not a Valid JPEG File");
        b = c("Image_Width", inputstream, "Not a Valid JPEG File");
        d = a("Number_of_components", inputstream, "Not a Valid JPEG File");
        a(inputstream, j - 6, "Not a Valid JPEG File: SOF0 Segment");
        if (a())
        {
            System.out.println("");
        }
    }

    public SOFNSegment(int i, byte abyte0[])
    {
        this(i, abyte0.length, ((InputStream) (new ByteArrayInputStream(abyte0))));
    }

    public final String d()
    {
        return (new StringBuilder("SOFN (SOF")).append(t_ - 65472).append(") (").append(e()).append(")").toString();
    }
}
