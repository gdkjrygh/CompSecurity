// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Base64OutputStream;
import java.io.OutputStream;

class aj
{

    private Bitmap a;
    private final Paint b = new Paint(2);

    public aj()
    {
        a = null;
    }

    public void a(int i, int j, int k, Bitmap bitmap)
    {
        this;
        JVM INSTR monitorenter ;
        if (a == null || a.getWidth() != i) goto _L2; else goto _L1
_L1:
        int l = a.getHeight();
        if (l == j) goto _L3; else goto _L2
_L2:
        a = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.RGB_565);
_L4:
        if (a != null)
        {
            a.setDensity(k);
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

    public void a(android.graphics.Bitmap.CompressFormat compressformat, int i, OutputStream outputstream)
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
        a.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, compressformat);
        compressformat.flush();
        outputstream.write(34);
        if (true) goto _L4; else goto _L3
_L3:
        compressformat;
        throw compressformat;
    }
}
