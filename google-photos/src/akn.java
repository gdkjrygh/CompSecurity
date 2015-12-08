// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.util.Log;

public abstract class akn extends akk
{

    public final Object a = new Object();
    public volatile boolean c;

    protected akn(int j, MediaFormat mediaformat, akl akl)
    {
        super(j, mediaformat, akl);
        if (!b.b(mediaformat))
        {
            throw new IllegalArgumentException("VideoTrackDecoder can only be used with supported video formats");
        } else
        {
            return;
        }
    }

    protected static boolean a(int j)
    {
        switch (j)
        {
        default:
            throw new IllegalArgumentException("Unsupported rotation angle.");

        case 90: // 'Z'
        case 270: 
            return true;

        case 0: // '\0'
        case 180: 
            return false;
        }
    }

    protected abstract void a(ahv ahv, aig aig, int j, int k);

    public final volatile boolean a(MediaExtractor mediaextractor)
    {
        return super.a(mediaextractor);
    }

    public final void b(ahv ahv, aig aig, int j, int k)
    {
label0:
        {
            synchronized (a)
            {
                if (c)
                {
                    break label0;
                }
                Log.w("VideoTrackDecoder", "frame is not ready - the caller has to wait for a corresponding onDecodedFrameAvailable() call");
            }
            return;
        }
        a(ahv, aig, j, k);
        obj;
        JVM INSTR monitorexit ;
        return;
        ahv;
        obj;
        JVM INSTR monitorexit ;
        throw ahv;
    }

    public final volatile boolean b()
    {
        return super.b();
    }

    public volatile void c()
    {
        super.c();
    }

    public final volatile void d()
    {
        super.d();
    }

    public final volatile void e()
    {
        super.e();
    }

    public final void g()
    {
        synchronized (a)
        {
            c = false;
            a.notifyAll();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean h()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        try
        {
            while (c) 
            {
                a.wait();
            }
            break MISSING_BLOCK_LABEL_29;
        }
        catch (InterruptedException interruptedexception) { }
        finally { }
        obj;
        JVM INSTR monitorexit ;
        return false;
        obj;
        JVM INSTR monitorexit ;
        return true;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final void i()
    {
        synchronized (a)
        {
            c = true;
            a.notifyAll();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
