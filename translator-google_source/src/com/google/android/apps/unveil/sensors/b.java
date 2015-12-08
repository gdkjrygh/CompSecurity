// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors;

import android.graphics.Bitmap;
import com.google.android.apps.unveil.env.ImageUtils;
import com.google.android.apps.unveil.env.af;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.apps.unveil.sensors:
//            a

final class b
    implements Runnable
{

    final int a;
    final int b;
    final a c;

    b(a a1, int i, int j)
    {
        c = a1;
        a = i;
        b = j;
        super();
    }

    public final void run()
    {
        a a1 = c;
        a1;
        JVM INSTR monitorenter ;
        byte abyte0[] = new byte[a * b << 1];
        if (com.google.android.apps.unveil.sensors.a.a(c) != null)
        {
            ImageUtils.convertYUV420SPToRGB565(com.google.android.apps.unveil.sensors.a.a(c), abyte0, a, b);
            ByteBuffer bytebuffer = ByteBuffer.wrap(abyte0);
            com.google.android.apps.unveil.sensors.a.a(c, Bitmap.createBitmap(a, b, android.graphics.Bitmap.Config.RGB_565));
            com.google.android.apps.unveil.sensors.a.b(c).copyPixelsFromBuffer(bytebuffer);
        }
        com.google.android.apps.unveil.sensors.a.c(c);
        c.notify();
_L1:
        a1;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        com.google.android.apps.unveil.sensors.a.g().e("Out of memory when creating bitmap picture.", new Object[0]);
        com.google.android.apps.unveil.sensors.a.c(c);
        c.notify();
          goto _L1
        obj;
        a1;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        com.google.android.apps.unveil.sensors.a.c(c);
        c.notify();
        throw obj;
    }
}
