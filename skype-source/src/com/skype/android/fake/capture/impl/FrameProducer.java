// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.fake.capture.impl;

import com.skype.android.platform.capture.FpsRange;
import com.skype.android.platform.capture.ImageFormat;
import com.skype.android.util.Log;
import com.skype.android.util.Systrace;
import com.skype.android.video.hw.format.Resolution;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.skype.android.fake.capture.impl:
//            CaptureSession

public class FrameProducer
    implements Closeable
{
    public static interface Callback
    {

        public abstract void a();

        public abstract void a(byte abyte0[]);

        public abstract byte[] a(int i, long l);
    }

    public static class StampRect
    {

        public final int a;
        public final int b;
        public final int c;

        public StampRect(CameraConfigOptions.Stamp stamp1, Resolution resolution)
        {
            int i = Math.max(resolution.getWidth(), resolution.getHeight());
            int j = Math.min(resolution.getWidth(), resolution.getHeight());
            c = Math.min((int)((stamp1.c() * (float)i) / 100F), j);
            a = Math.min(i - c, (int)(stamp1.a() * (float)i) / 100);
            b = Math.min(j - c, (int)(stamp1.b() * (float)i) / 100);
        }
    }

    private static final class a
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
        private final StampRect i;
        private final Callback j;
        private final long k;
        private final CaptureSession l;

        public final void run()
        {
            Systrace.begin(com.skype.android.util.Systrace.Section.h);
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
            Systrace.begin(com.skype.android.util.Systrace.Section.i);
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
            Systrace.begin(com.skype.android.util.Systrace.Section.j);
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

        public a(int i1, CaptureSession capturesession, FileChannel filechannel, ImageFormat imageformat, Resolution resolution, int j1, int k1, 
                StampRect stamprect, Callback callback)
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
            i = stamprect;
            j = callback;
            k = 0x3b9aca00L / (long)k1;
            l = capturesession;
            g.limit(e);
        }
    }


    private final ScheduledExecutorService a;
    private FileInputStream b;
    private ScheduledFuture c;

    public FrameProducer(int i, CaptureSession capturesession, String s, ImageFormat imageformat, Resolution resolution, int j, FpsRange fpsrange, 
            StampRect stamprect, Callback callback)
        throws IOException
    {
        a = Executors.newSingleThreadScheduledExecutor();
        b = new FileInputStream(s);
        FileChannel filechannel;
        filechannel = b.getChannel();
        if (j < fpsrange.a())
        {
            throw new IllegalArgumentException((new StringBuilder("Source video file framerate ")).append(j).append(" is less than output framerate range ").append(fpsrange).toString());
        }
        try
        {
            int k = Math.min(j, fpsrange.b());
            capturesession = new a(i, capturesession, filechannel, imageformat, resolution, j, k, stamprect, callback);
            c = a.scheduleAtFixedRate(capturesession, 0L, 0xe8d4a51000L / (long)k, TimeUnit.NANOSECONDS);
            if (Log.isLoggable("Capture", 4))
            {
                Log.i("Capture", (new StringBuilder("Reading file '")).append(s).append("' at ").append((float)k / 1000F).append(" fps").toString());
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CaptureSession capturesession)
        {
            b.close();
            throw capturesession;
        }
        // Misplaced declaration of an exception variable
        catch (CaptureSession capturesession)
        {
            b.close();
        }
        throw capturesession;
    }

    static void a(ByteBuffer bytebuffer)
    {
        fillBuffer(bytebuffer, (byte)0);
    }

    static void a(ByteBuffer bytebuffer, int i, int j, int k, int l, int i1, int j1, long l1)
    {
        stamp(bytebuffer, i, j, k, l, i1, j1, l1);
    }

    static void a(ByteBuffer bytebuffer, byte abyte0[])
    {
        copyBuffer(bytebuffer, abyte0);
    }

    private static native void copyBuffer(ByteBuffer bytebuffer, byte abyte0[]);

    private static native void fillBuffer(ByteBuffer bytebuffer, byte byte0);

    private static native void stamp(ByteBuffer bytebuffer, int i, int j, int k, int l, int i1, int j1, long l1);

    public void close()
    {
        a.shutdown();
        try
        {
            a.awaitTermination(0x7fffffffffffffffL, TimeUnit.MILLISECONDS);
        }
        catch (InterruptedException interruptedexception)
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", "Exception caught", interruptedexception);
            }
            if (c != null)
            {
                c.cancel(true);
                c = null;
            }
        }
        try
        {
            if (b != null)
            {
                b.close();
                b = null;
            }
        }
        catch (IOException ioexception)
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", "Exception caught", ioexception);
            }
        }
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", "Closed");
        }
    }
}
