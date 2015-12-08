// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.jpeg;

import java.io.InputStream;
import org.apache.sanselan.util.Debug;

// Referenced classes of package org.apache.sanselan.formats.jpeg:
//            JpegUtils

class sitor
    implements sitor
{

    public final boolean a()
    {
        return true;
    }

    public final boolean a(int i, byte abyte0[], byte abyte1[], byte abyte2[])
    {
        Debug.a((new StringBuilder("Segment marker: ")).append(Integer.toHexString(i)).append(" (").append(JpegUtils.a(i)).append("), ").append(abyte2.length).append(" bytes of segment data.").toString());
        return true;
    }

    public final boolean a(byte abyte0[], InputStream inputstream)
    {
        return false;
    }
}
