// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.jpeg.segments;

import java.io.InputStream;

// Referenced classes of package org.apache.sanselan.formats.jpeg.segments:
//            Segment

public abstract class GenericSegment extends Segment
{

    public final byte e[];

    public GenericSegment(int i, int j, InputStream inputstream)
    {
        super(i, j);
        e = a("Segment Data", j, inputstream, "Invalid Segment: insufficient data");
    }

    public GenericSegment(int i, byte abyte0[])
    {
        super(i, abyte0.length);
        e = abyte0;
    }
}
