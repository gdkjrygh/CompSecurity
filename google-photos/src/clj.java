// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;

public final class clj
    implements clb
{

    private static final String d = clj.getSimpleName();
    final MediaCodecInfo a;
    final String b;
    boolean c;
    private final MediaCodec e;
    private boolean f;

    public clj(MediaCodec mediacodec, String s)
    {
        e = (MediaCodec)b.a(mediacodec, "codec", null);
        b = (String)b.a(s, "mimeType", null);
        a = e.getCodecInfo();
    }

    private void a(RuntimeException runtimeexception)
    {
        f = true;
        Log.e(d, "Codec threw an exception", runtimeexception);
        throw c.a("Codec threw an exception", runtimeexception);
    }

    public final int a(android.media.MediaCodec.BufferInfo bufferinfo)
    {
        int i1;
        try
        {
            i1 = e.dequeueOutputBuffer(bufferinfo, 0L);
        }
        // Misplaced declaration of an exception variable
        catch (android.media.MediaCodec.BufferInfo bufferinfo)
        {
            a(((RuntimeException) (bufferinfo)));
            throw bufferinfo;
        }
        return i1;
    }

    public final void a()
    {
        try
        {
            e.release();
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            a(((RuntimeException) (illegalstateexception)));
            throw illegalstateexception;
        }
    }

    public final void a(int i1, int j1, int k1, long l1, int i2)
    {
        try
        {
            e.queueInputBuffer(i1, 0, k1, l1, i2);
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            a(((RuntimeException) (illegalstateexception)));
            throw illegalstateexception;
        }
    }

    public final void a(int i1, boolean flag)
    {
        try
        {
            e.releaseOutputBuffer(i1, flag);
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            a(((RuntimeException) (illegalstateexception)));
            throw illegalstateexception;
        }
    }

    public final void a(MediaFormat mediaformat)
    {
        try
        {
            e.configure(mediaformat, null, null, 0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediaFormat mediaformat)
        {
            a(((RuntimeException) (mediaformat)));
        }
        throw mediaformat;
    }

    public final void a(MediaFormat mediaformat, Surface surface)
    {
        try
        {
            e.configure(mediaformat, surface, null, 0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediaFormat mediaformat)
        {
            a(((RuntimeException) (mediaformat)));
        }
        throw mediaformat;
    }

    public final void b(MediaFormat mediaformat)
    {
        try
        {
            e.configure(mediaformat, null, null, 1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediaFormat mediaformat)
        {
            a(mediaformat);
        }
        throw mediaformat;
    }

    public final boolean b()
    {
        return c;
    }

    public final boolean c()
    {
        return f;
    }

    public final Surface d()
    {
        Surface surface;
        try
        {
            surface = e.createInputSurface();
        }
        catch (IllegalStateException illegalstateexception)
        {
            a(illegalstateexception);
            throw illegalstateexception;
        }
        return surface;
    }

    public final void e()
    {
        try
        {
            e.start();
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            a(illegalstateexception);
            throw illegalstateexception;
        }
    }

    public final int f()
    {
        int i1;
        try
        {
            i1 = e.dequeueInputBuffer(0L);
        }
        catch (IllegalStateException illegalstateexception)
        {
            a(illegalstateexception);
            throw illegalstateexception;
        }
        return i1;
    }

    public final ByteBuffer[] g()
    {
        ByteBuffer abytebuffer[];
        try
        {
            abytebuffer = e.getInputBuffers();
        }
        catch (IllegalStateException illegalstateexception)
        {
            a(illegalstateexception);
            throw illegalstateexception;
        }
        return abytebuffer;
    }

    public final ByteBuffer[] h()
    {
        ByteBuffer abytebuffer[];
        try
        {
            abytebuffer = e.getOutputBuffers();
        }
        catch (IllegalStateException illegalstateexception)
        {
            a(illegalstateexception);
            throw illegalstateexception;
        }
        return abytebuffer;
    }

    public final MediaFormat i()
    {
        MediaFormat mediaformat;
        try
        {
            mediaformat = e.getOutputFormat();
        }
        catch (IllegalStateException illegalstateexception)
        {
            a(illegalstateexception);
            throw illegalstateexception;
        }
        return mediaformat;
    }

    public final void j()
    {
        try
        {
            e.signalEndOfInputStream();
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            a(illegalstateexception);
            throw illegalstateexception;
        }
    }

    public final void k()
    {
        try
        {
            e.flush();
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            a(illegalstateexception);
            throw illegalstateexception;
        }
    }

    public final void l()
    {
        try
        {
            e.stop();
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            a(illegalstateexception);
            throw illegalstateexception;
        }
    }

}
