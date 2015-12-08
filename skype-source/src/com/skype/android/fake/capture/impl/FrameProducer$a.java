// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.fake.capture.impl;

import com.skype.android.platform.capture.ImageFormat;
import com.skype.android.util.Log;
import com.skype.android.util.Systrace;
import com.skype.android.video.hw.format.Resolution;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

// Referenced classes of package com.skype.android.fake.capture.impl:
//            FrameProducer, CaptureSession

private static final class e
    implements Runnable
{

    private final int a;
    private final FileChannel b;
    private final ImageFormat c;
    private final Resolution d;
    private final int e;
    private final int f;
    private final ByteBuffer g;
    private final long h;
    private final ampRect i;
    private final llback j;
    private final long k;
    private final CaptureSession l;

    public final void run()
    {
        Systrace.begin(com.skype.android.util..h);
        byte abyte0[] = j.a(e, k);
        if (abyte0 != null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", "Got no buffer");
        }
        int i1;
        long l1;
        long l2;
        l1 = CaptureSession.getPlatformTime();
        i1 = (int)(((l.a(l1) * h) / 0xf4240L) % (long)f);
        l2 = l.a();
        Systrace.begin(com.skype.android.util..i);
        g.rewind();
        b.position(e * i1);
        b.read(g);
_L1:
        if (Log.isLoggable("Capture", 3))
        {
            Log.d("Capture", (new StringBuilder("Got frame ")).append(l2).append(" (").append(i1).append(")").toString());
        }
        Systrace.end();
        l.a(a, l1, l2, i1);
        FrameProducer.a(g, c.a(), d.getWidth(), d.getHeight(), i.a, i.b, i.c, l2);
        j.a();
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_284;
        }
        Systrace.begin(com.skype.android.util..j);
        FrameProducer.a(g, abyte0);
        Systrace.end();
        j.a(abyte0);
        Systrace.end();
        return;
        IOException ioexception;
        ioexception;
        FrameProducer.a(g);
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", "Could not read a frame from the file", ioexception);
        }
          goto _L1
        Object obj;
        obj;
        Systrace.end();
        throw obj;
        obj;
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", "Exception caught", ((Throwable) (obj)));
        }
        Systrace.end();
        return;
        obj;
        Systrace.end();
        throw obj;
        obj;
        Systrace.end();
        throw obj;
    }

    public llback(int i1, CaptureSession capturesession, FileChannel filechannel, ImageFormat imageformat, Resolution resolution, int j1, int k1, 
            ampRect amprect, llback llback)
        throws IOException
    {
        a = i1;
        b = filechannel;
        c = imageformat;
        d = resolution;
        e = (resolution.getWidth() * resolution.getHeight() * imageformat.b()) / 8;
        f = (int)(filechannel.size() / (long)e);
        g = ByteBuffer.allocateDirect(e);
        h = j1;
        i = amprect;
        j = llback;
        k = 0x3b9aca00L / (long)k1;
        l = capturesession;
        g.limit(e);
    }
}
