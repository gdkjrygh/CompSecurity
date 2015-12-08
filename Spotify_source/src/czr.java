// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Base64OutputStream;
import java.io.OutputStream;

final class czr
{

    private Bitmap a;
    private final Paint b = new Paint(2);

    public czr()
    {
        a = null;
    }

    public final void a(int i, int j, Bitmap bitmap)
    {
        this;
        JVM INSTR monitorenter ;
        if (a == null || a.getWidth() != i) goto _L2; else goto _L1
_L1:
        int k = a.getHeight();
        if (k == j) goto _L3; else goto _L2
_L2:
        a = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.RGB_565);
_L4:
        if (a != null)
        {
            a.setDensity(160);
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

    public final void a(OutputStream outputstream)
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
        Base64OutputStream base64outputstream = new Base64OutputStream(outputstream, 2);
        a.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, base64outputstream);
        base64outputstream.flush();
        outputstream.write(34);
        if (true) goto _L4; else goto _L3
_L3:
        outputstream;
        throw outputstream;
    }
}
