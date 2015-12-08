// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl.virtual.impl;

import com.microsoft.dl.utils.Clock;
import com.microsoft.dl.utils.Log;
import com.microsoft.dl.utils.Systrace;
import com.microsoft.dl.video.capture.api.FpsRange;
import com.microsoft.dl.video.capture.api.ImageFormat;
import com.microsoft.dl.video.capture.api.Resolution;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.microsoft.dl.video.capture.impl.virtual.impl:
//            CaptureSession

public class FrameProducer
    implements Closeable
{
    public static interface Callback
    {

        public abstract byte[] getBuffer(int i, long l);

        public abstract void onFrameCaptured(ByteBuffer bytebuffer, ImageFormat imageformat, Resolution resolution);

        public abstract void onFrameReady(byte abyte0[]);
    }

    private static class Command
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

        public void run()
        {
            Systrace.begin(com.microsoft.dl.utils.Systrace.Section.IssueFakeVideoFrame);
            byte abyte0[] = j.getBuffer(e, k);
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
            l1 = Clock.getPlatformTime();
            i1 = (int)(((l.getElapsedTime(l1) * h) / 0xf4240L) % (long)f);
            l2 = l.countFrame();
            Systrace.begin(com.microsoft.dl.utils.Systrace.Section.ReadFakeVideoFrame);
            g.rewind();
            b.position(e * i1);
            b.read(g);
_L1:
            if (Log.isLoggable("Capture", 3))
            {
                Log.d("Capture", (new StringBuilder("Got frame ")).append(l2).append(" (").append(i1).append(")").toString());
            }
            Systrace.end();
            l.logFrame(a, l1, l2, i1);
            FrameProducer.a(g, c.getFourCC(), d.getWidth(), d.getHeight(), StampRect.a(i), StampRect.b(i), StampRect.c(i), l2);
            j.onFrameCaptured(g, c, d);
            if (abyte0 == null)
            {
                break MISSING_BLOCK_LABEL_296;
            }
            Systrace.begin(com.microsoft.dl.utils.Systrace.Section.CopyFakeVideoFrame);
            FrameProducer.a(g, abyte0);
            Systrace.end();
            j.onFrameReady(abyte0);
_L3:
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
            if (!Log.isLoggable("Capture", 6)) goto _L3; else goto _L2
_L2:
            Log.e("Capture", "Exception caught", ((Throwable) (obj)));
              goto _L3
            obj;
            Systrace.end();
            throw obj;
            obj;
            Systrace.end();
            throw obj;
              goto _L1
        }

        public Command(int i1, CaptureSession capturesession, FileChannel filechannel, ImageFormat imageformat, Resolution resolution, int j1, int k1, 
                StampRect stamprect, Callback callback)
            throws IOException
        {
            a = i1;
            b = filechannel;
            c = imageformat;
            d = resolution;
            e = (resolution.getWidth() * resolution.getHeight() * imageformat.getBitsPerPixel()) / 8;
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

    public static class StampRect
    {

        private final int a;
        private final int b;
        private final int c;

        static int a(StampRect stamprect)
        {
            return stamprect.a;
        }

        static int b(StampRect stamprect)
        {
            return stamprect.b;
        }

        static int c(StampRect stamprect)
        {
            return stamprect.c;
        }

        public final int getLeft()
        {
            return a;
        }

        public final int getSize()
        {
            return c;
        }

        public final int getTop()
        {
            return b;
        }

        public final String toString()
        {
            return (new StringBuilder()).append(getClass().getSimpleName()).append(" [left=").append(a).append(", top=").append(b).append(", size=").append(c).append("]").toString();
        }

        public StampRect(CameraConfigOptions.Stamp stamp1, Resolution resolution)
        {
            int i = Math.max(resolution.getWidth(), resolution.getHeight());
            int j = Math.min(resolution.getWidth(), resolution.getHeight());
            c = Math.min((int)((stamp1.getSize() * (float)i) / 100F), j);
            a = Math.min(i - c, (int)(stamp1.getHOffset() * (float)i) / 100);
            b = Math.min(j - c, (int)(stamp1.getVOffset() * (float)i) / 100);
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
        if (j < fpsrange.getMin())
        {
            throw new IllegalArgumentException((new StringBuilder("Source video file framerate ")).append(j).append(" is less than output framerate range ").append(fpsrange).toString());
        }
        try
        {
            int k = Math.min(j, fpsrange.getMax());
            capturesession = new Command(i, capturesession, filechannel, imageformat, resolution, j, k, stamprect, callback);
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

    public final void close()
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
