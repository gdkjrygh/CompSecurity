// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.jpeg.segments;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.formats.jpeg.JpegConstants;

// Referenced classes of package org.apache.sanselan.formats.jpeg.segments:
//            Segment

public class JFIFSegment extends Segment
    implements JpegConstants
{

    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;

    private JFIFSegment(int i, int j, InputStream inputstream)
    {
        super(i, j);
        j = a.length;
        byte abyte0[] = new byte[j];
        i = 0;
        do
        {
            if (i >= j)
            {
                if (!a(abyte0, a) && !a(abyte0, b))
                {
                    throw new ImageReadException("Not a Valid JPEG File: missing JFIF string");
                }
                break;
            }
            abyte0[i] = (byte)inputstream.read();
            i++;
        } while (true);
        k = a("JFIF_major_version", inputstream, "Not a Valid JPEG File");
        l = a("JFIF_minor_version", inputstream, "Not a Valid JPEG File");
        m = a("density_units", inputstream, "Not a Valid JPEG File");
        n = c("x_density", inputstream, "Not a Valid JPEG File");
        o = c("y_density", inputstream, "Not a Valid JPEG File");
        p = a("x_thumbnail", inputstream, "Not a Valid JPEG File");
        q = a("y_thumbnail", inputstream, "Not a Valid JPEG File");
        r = p * q;
        if (r > 0)
        {
            a(inputstream, r, "Not a Valid JPEG File: missing thumbnail");
        }
        if (a())
        {
            System.out.println("");
        }
    }

    public JFIFSegment(int i, byte abyte0[])
    {
        this(i, abyte0.length, ((InputStream) (new ByteArrayInputStream(abyte0))));
    }

    public final String d()
    {
        return (new StringBuilder("JFIF (")).append(e()).append(")").toString();
    }
}
