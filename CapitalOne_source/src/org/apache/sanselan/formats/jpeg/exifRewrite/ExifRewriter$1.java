// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.jpeg.exifRewrite;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package org.apache.sanselan.formats.jpeg.exifRewrite:
//            ExifRewriter

class c
    implements org.apache.sanselan.formats.jpeg.or
{

    final ExifRewriter a;
    private final ArrayList b;
    private final List c;

    public final boolean a()
    {
        return true;
    }

    public final boolean a(int i, byte abyte0[], byte abyte1[], byte abyte2[])
    {
        if (i != 65505)
        {
            b.add(new IFPieceSegment(i, abyte0, abyte1, abyte2));
        } else
        if (!ExifRewriter.b(abyte2, ExifRewriter.c))
        {
            b.add(new IFPieceSegment(i, abyte0, abyte1, abyte2));
        } else
        {
            abyte0 = new IFPieceSegmentExif(i, abyte0, abyte1, abyte2);
            b.add(abyte0);
            c.add(abyte0);
        }
        return true;
    }

    public final boolean a(byte abyte0[], InputStream inputstream)
    {
        b.add(new IFPieceImageData(abyte0, inputstream));
        return true;
    }

    IFPieceImageData(ExifRewriter exifrewriter, ArrayList arraylist, List list)
    {
        a = exifrewriter;
        b = arraylist;
        c = list;
        super();
    }
}
