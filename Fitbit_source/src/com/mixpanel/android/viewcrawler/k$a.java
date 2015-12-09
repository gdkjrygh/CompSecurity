// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Base64OutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            k

private static class a
{

    private Bitmap a;
    private final Paint b = new Paint(2);

    public void a(int i, int j, int l, Bitmap bitmap)
    {
        this;
        JVM INSTR monitorenter ;
        if (a == null || a.getWidth() != i) goto _L2; else goto _L1
_L1:
        int i1 = a.getHeight();
        if (i1 == j) goto _L3; else goto _L2
_L2:
        a = Bitmap.createBitmap(i, j, android.graphics.ap.Config.RGB_565);
_L4:
        if (a != null)
        {
            a.setDensity(l);
        }
_L3:
        if (a != null)
        {
            (new Canvas(a)).drawBitmap(bitmap, 0.0F, 0.0F, b);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        a = null;
          goto _L4
        bitmap;
        throw bitmap;
    }

    public void a(android.graphics.ap.CompressFormat compressformat, int i, OutputStream outputstream)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (a != null && a.getWidth() != 0 && a.getHeight() != 0) goto _L2; else goto _L1
_L1:
        outputstream.write("null".getBytes());
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        outputstream.write(34);
        compressformat = new Base64OutputStream(outputstream, 2);
        a.compress(android.graphics.ap.CompressFormat.PNG, 100, compressformat);
        compressformat.flush();
        outputstream.write(34);
        if (true) goto _L4; else goto _L3
_L3:
        compressformat;
        throw compressformat;
    }

    public t()
    {
        a = null;
    }
}
