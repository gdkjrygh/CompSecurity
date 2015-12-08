// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.jpeg;

import java.io.InputStream;

// Referenced classes of package org.apache.sanselan.formats.jpeg:
//            JpegImageParser

class 
    implements 
{

    private final boolean a[];

    public final boolean a()
    {
        return false;
    }

    public final boolean a(int i, byte abyte0[], byte abyte1[], byte abyte2[])
    {
        if (i == 65497)
        {
            return false;
        }
        if (i == 65505 && JpegImageParser.b(abyte2, JpegImageParser.c))
        {
            a[0] = true;
            return false;
        } else
        {
            return true;
        }
    }

    public final boolean a(byte abyte0[], InputStream inputstream)
    {
        return false;
    }
}
