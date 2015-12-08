// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.jpeg.segments;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.apache.sanselan.formats.jpeg.JpegImageParser;

// Referenced classes of package org.apache.sanselan.formats.jpeg.segments:
//            APPNSegment

public class App2Segment extends APPNSegment
    implements Comparable
{

    public final byte b[];
    public final int c;
    public final int d;

    private App2Segment(int i, int j, InputStream inputstream)
    {
        byte abyte0[];
        boolean flag;
        flag = false;
        super(i, j, inputstream);
        inputstream = e;
        abyte0 = JpegImageParser.h;
        if (abyte0 != null) goto _L2; else goto _L1
_L1:
        i = ((flag) ? 1 : 0);
_L4:
        int k;
        if (i != 0)
        {
            inputstream = new ByteArrayInputStream(e);
            a(inputstream, JpegImageParser.h, "Not a Valid App2 Segment: missing ICC Profile label");
            c = a("cur_marker", inputstream, "Not a valid App2 Marker");
            d = a("num_markers", inputstream, "Not a valid App2 Marker");
            b = a("App2 Data", j - JpegImageParser.h.length - 2, inputstream, "Invalid App2 Segment: insufficient data");
            return;
        } else
        {
            c = -1;
            d = -1;
            b = null;
            return;
        }
_L2:
        i = ((flag) ? 1 : 0);
        if (inputstream == null) goto _L4; else goto _L3
_L3:
        i = ((flag) ? 1 : 0);
        if (abyte0.length > inputstream.length) goto _L4; else goto _L5
_L5:
        k = 0;
_L7:
label0:
        {
            if (k < abyte0.length)
            {
                break label0;
            }
            i = 1;
        }
          goto _L4
        i = ((flag) ? 1 : 0);
        if (abyte0[k] != inputstream[k]) goto _L4; else goto _L6
_L6:
        k++;
          goto _L7
    }

    public App2Segment(int i, byte abyte0[])
    {
        this(i, abyte0.length, ((InputStream) (new ByteArrayInputStream(abyte0))));
    }

    public int compareTo(Object obj)
    {
        obj = (App2Segment)obj;
        return c - ((App2Segment) (obj)).c;
    }
}
