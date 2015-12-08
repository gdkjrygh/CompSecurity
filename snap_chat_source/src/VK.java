// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaFormat;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

public final class VK extends VE
{
    public final class a
    {

        public byte a[];
        public long b;

        public a(byte abyte0[], long l)
        {
            a = abyte0;
            b = l;
        }
    }


    private static final ReentrantLock d = new ReentrantLock(true);
    public volatile boolean b;
    public volatile boolean c;
    private ArrayList e;

    public VK(MediaFormat mediaformat, Wc wc)
    {
        super(mediaformat, 1.0D, wc);
        c = false;
        e = new ArrayList();
        b = false;
    }

    private void b()
    {
        b = true;
        stageComplete();
    }

    public final void a(VW vw)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean a(int i)
    {
        d.lock();
        int j = e.size();
        boolean flag;
        if (i < j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d.unlock();
        return flag;
        Exception exception;
        exception;
        d.unlock();
        throw exception;
    }

    public final a b(int i)
    {
        d.lock();
        a a1 = (a)e.get(i);
        d.unlock();
        return a1;
        Exception exception;
        exception;
        d.unlock();
        throw exception;
    }

    public final void outputFrame()
    {
        (new StringBuilder("audio track decoder: attempting to process pending buffer: ")).append(mDecodedBufferIndex);
        if (VU.a(mCodec.c))
        {
            break MISSING_BLOCK_LABEL_101;
        }
        int i = mCodec.c.size;
        a(mCodec.c.presentationTimeUs);
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        d.lock();
        e.add(new a(a, mCodec.c.presentationTimeUs));
        d.unlock();
        a();
        if (VU.a(mCodec.c) || c)
        {
            (new StringBuilder("Audio Frames buffered: ")).append(e.size());
            b();
        }
        return;
        Exception exception;
        exception;
        d.unlock();
        throw exception;
    }

    public final void processFrame()
    {
        super.processFrame();
        if (c)
        {
            b();
        }
    }

}
