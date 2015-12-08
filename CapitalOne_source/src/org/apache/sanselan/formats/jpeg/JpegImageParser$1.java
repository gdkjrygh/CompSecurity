// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.jpeg;

import java.io.InputStream;
import java.util.ArrayList;
import org.apache.sanselan.formats.jpeg.segments.App2Segment;
import org.apache.sanselan.formats.jpeg.segments.JFIFSegment;
import org.apache.sanselan.formats.jpeg.segments.SOFNSegment;
import org.apache.sanselan.formats.jpeg.segments.UnknownSegment;

// Referenced classes of package org.apache.sanselan.formats.jpeg:
//            JpegImageParser

class gment
    implements gment
{

    final JpegImageParser a;
    private final int b[];
    private final ArrayList c;
    private final boolean d;

    public final boolean a()
    {
        return false;
    }

    public final boolean a(int i, byte abyte0[], byte abyte1[], byte abyte2[])
    {
        if (i != 65497) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        abyte0 = a;
        if (!JpegImageParser.a(i, b))
        {
            return true;
        }
        if (i != 65517)
        {
            if (i != 65506)
            {
                break; /* Loop/switch isn't completed */
            }
            c.add(new App2Segment(i, abyte2));
        }
_L4:
        if (!d)
        {
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (i == 65504)
        {
            c.add(new JFIFSegment(i, abyte2));
        } else
        if (i >= 65472 && i <= 65487)
        {
            c.add(new SOFNSegment(i, abyte2));
        } else
        if (i >= 65505 && i <= 65519)
        {
            c.add(new UnknownSegment(i, abyte2));
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final boolean a(byte abyte0[], InputStream inputstream)
    {
        return false;
    }
}
