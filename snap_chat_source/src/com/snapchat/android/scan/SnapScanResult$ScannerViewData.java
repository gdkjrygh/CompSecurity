// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.scan;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

// Referenced classes of package com.snapchat.android.scan:
//            SnapScanResult

public static class d
{

    private final boolean a;
    private final byte b[];
    private final int c;
    private final int d;

    public Bitmap getScannerViewBitmapImage()
    {
        if (a && b != null && d > 0 && c > 0)
        {
            IntBuffer intbuffer = ByteBuffer.wrap(b).asIntBuffer();
            int ai[] = new int[intbuffer.remaining()];
            intbuffer.get(ai);
            return Bitmap.createBitmap(ai, c, d, android.graphics.ViewData.d);
        } else
        {
            return null;
        }
    }

    public byte[] getScannerViewImage()
    {
        return b;
    }

    public boolean hasScannerViewImage()
    {
        return a;
    }

    public (boolean flag, byte abyte0[], int i, int j)
    {
        a = flag;
        b = abyte0;
        c = i;
        d = j;
    }
}
