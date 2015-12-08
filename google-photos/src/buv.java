// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaFormat;

public final class buv
    implements dei
{

    private final dfl a;
    private final clb b;
    private final but c;
    private final int d;
    private final MediaFormat e;
    private final long f;
    private final buy g;
    private final buz h;
    private final Runnable i = new buw(this);
    private Thread j;

    buv(but but1, clb clb1, buy buy1, dfl dfl1, int k, MediaFormat mediaformat, long l, buz buz1)
    {
        a = (dfl)b.a(dfl1, "threadFactory", null);
        b = (clb)b.a(clb1, "encoder", null);
        c = (but)b.a(but1, "mediaMuxer", null);
        g = (buy)b.a(buy1, "exceptionHandler", null);
        d = k;
        e = mediaformat;
        f = b.b(l, "firstPresentationTimeUs");
        h = buz1;
    }

    static void a(buv buv1)
    {
        MediaFormat mediaformat;
        java.nio.ByteBuffer abytebuffer[];
        android.media.MediaCodec.BufferInfo bufferinfo;
        int k;
        k = buv1.d;
        abytebuffer = buv1.b.h();
        bufferinfo = new android.media.MediaCodec.BufferInfo();
        mediaformat = null;
_L2:
        int j1;
        do
        {
            j1 = buv1.b.a(bufferinfo);
            if (Thread.currentThread().isInterrupted())
            {
                return;
            }
        } while (j1 == -1);
        if (j1 == -3)
        {
            try
            {
                abytebuffer = buv1.b.h();
            }
            // Misplaced declaration of an exception variable
            catch (buv buv1)
            {
                Thread.currentThread().interrupt();
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (j1 != -2)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        mediaformat = buv1.b.i();
        if (buv1.d == -1)
        {
            c.a(k, "outputTrack", -1, "format changed during encoding");
            continue; /* Loop/switch isn't completed */
        }
        c.a(mediaformat.getString("mime"), "format.getString(MediaFormat.KEY_MIME)", buv1.e.getString("mime"), "format does not match preselected track");
        continue; /* Loop/switch isn't completed */
        java.nio.ByteBuffer bytebuffer = abytebuffer[j1];
        int l = bufferinfo.flags;
        if ((l & 2) == 0)
        {
            break MISSING_BLOCK_LABEL_180;
        }
        buv1.b.a(j1, false);
        continue; /* Loop/switch isn't completed */
        int i1 = k;
        if (bufferinfo.size <= 0)
        {
            break MISSING_BLOCK_LABEL_274;
        }
        l = k;
        if (k != -1)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        c.a(mediaformat, "format", "should receive a format change before the first frame");
        l = buv1.c.a(mediaformat);
        i1 = l;
        if (bufferinfo.presentationTimeUs < buv1.f)
        {
            break MISSING_BLOCK_LABEL_274;
        }
        if (buv1.h != null)
        {
            buv1.h.a(l, bufferinfo.presentationTimeUs);
        }
        buv1.c.a(l, bytebuffer, bufferinfo);
        i1 = l;
        k = bufferinfo.flags;
        if ((k & 4) == 0)
        {
            break MISSING_BLOCK_LABEL_300;
        }
        buv1.b.a(j1, false);
        return;
        buv1.b.a(j1, false);
        k = i1;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        buv1.b.a(j1, false);
        throw exception;
    }

    static buy b(buv buv1)
    {
        return buv1.g;
    }

    public final void a()
    {
        c.b(j, "mFeederThread", "already started");
        j = a.a(i, "feeder");
        j.start();
    }

    public final void b()
    {
        c.a(j, "mFeederThread", "not started");
        j.interrupt();
        c();
        j = null;
    }

    void c()
    {
        try
        {
            j.join();
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            Thread.currentThread().interrupt();
        }
    }

    static 
    {
        buv.getSimpleName();
    }
}
