// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaFormat;
import android.os.SystemClock;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

public abstract class ckq
    implements cje, ded
{

    private static final String e = ckq.getSimpleName();
    public final clb a;
    public MediaFormat b;
    public MediaFormat c;
    int d;
    private final Executor f;
    private final FutureTask g = new FutureTask(new ckr(this), null);
    private final android.media.MediaCodec.BufferInfo h = new android.media.MediaCodec.BufferInfo();
    private int i;
    private civ j;
    private ByteBuffer k[];
    private int l;
    private ByteBuffer m[];
    private long n;
    private boolean o;

    public ckq(clb clb1, Executor executor)
    {
        i = 0;
        l = -1;
        d = -255;
        n = -1L;
        a = (clb)b.a(clb1, "codec", null);
        f = (Executor)b.a(executor, "backgroundExecutor", null);
    }

    private boolean e()
    {
        i;
        JVM INSTR tableswitch 0 4: default 40
    //                   0 70
    //                   1 90
    //                   2 158
    //                   3 158
    //                   4 177;
           goto _L1 _L2 _L3 _L4 _L4 _L5
_L1:
        int i1 = i;
        throw c.a((new StringBuilder(39)).append("Unhandled MediaCodec state: ").append(i1).toString());
_L2:
        i = 1;
        f.execute(g);
_L7:
        return false;
_L3:
        if (!g.isDone()) goto _L7; else goto _L6
_L6:
        try
        {
            g.get();
            k = a.g();
            m = a.h();
            d = -255;
            n = -1L;
            o = true;
            i = 2;
        }
        catch (InterruptedException interruptedexception)
        {
            Thread.currentThread().interrupt();
            return false;
        }
        catch (ExecutionException executionexception)
        {
            throw c.a("Exception while starting MediaCodec", executionexception);
        }
_L4:
        return true;
_L5:
        throw c.a("Tried to use a MediaCodec that was released.");
    }

    private ciw f()
    {
_L5:
        if (i == 3) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        int i1;
        int k1 = d;
        i1 = k1;
        if (k1 == -255)
        {
            i1 = a.a(h);
        }
        if (i1 == -3)
        {
            m = a.h();
            continue; /* Loop/switch isn't completed */
        }
        if (i1 == -2)
        {
            c = a.i();
            continue; /* Loop/switch isn't completed */
        }
        if (i1 >= 0)
        {
            if ((h.flags & 4) != 0)
            {
                h.presentationTimeUs = n;
            }
            d = i1;
            ByteBuffer bytebuffer = m[d];
            android.media.MediaCodec.BufferInfo bufferinfo = h;
            boolean flag;
            if (h.presentationTimeUs == n)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return a(bytebuffer, bufferinfo, flag);
        }
        if (i1 == -1) goto _L1; else goto _L3
_L3:
        String s = e;
        int j1 = d;
        Log.w(s, (new StringBuilder(59)).append("unexpected output buffer index from MediaCodec: ").append(j1).toString());
        return null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected abstract ciw a(ByteBuffer bytebuffer, android.media.MediaCodec.BufferInfo bufferinfo, boolean flag);

    public void a()
    {
        c.b(i, "mMediaCodecState", 4, null);
        if (i == 2 || i == 3 || i == 1)
        {
            g.get();
            if (!a.c())
            {
                a.l();
            }
        }
        dee.a(a);
        i = 4;
        return;
        Object obj;
        obj;
        dee.a(a);
        i = 4;
        return;
        obj;
        Thread.currentThread().interrupt();
        dee.a(a);
        i = 4;
        return;
        obj;
        dee.a(a);
        i = 4;
        throw obj;
    }

    public void a(civ civ1)
    {
        if (i == 3)
        {
            d();
        }
        j = (civ)b.a(civ1, "source", null);
        b = civ1.b();
    }

    protected final void a(boolean flag)
    {
        a.a(d, flag);
    }

    public final boolean a(MediaFormat mediaformat)
    {
        b.a(mediaformat, "newFormat", null);
        c.a(b, "mInputFormat", null);
        while (c.a(mediaformat, b) || a.b() && mediaformat.getString("mime").equals(b.getString("mime"))) 
        {
            return true;
        }
        return false;
    }

    public Object b()
    {
        return c();
    }

    public ciw c()
    {
        c.a(j, "mSource", "set data source before polling");
        if (l == -1 && e() && n == -1L)
        {
            l = a.f();
        }
        if (l != -1)
        {
            i = 3;
            cki cki1 = (cki)j.a(k[l]);
            if (cki1 != null)
            {
                c.b(l, "mCurrentInputBufferIndex", -1, null);
                b.a(cki1.c, "encodedMedia.size", null);
                b.a(cki1.b, "encodedMedia.buffer", k[l], "encodedMedia input buffer did not match last returned input buffer");
                int i1;
                if (cki1.e)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (cki1.f)
                {
                    i1 |= 4;
                    n = cki1.d;
                }
                if (o)
                {
                    o = false;
                    if (!cki1.e)
                    {
                        throw c.a("Sample synchronization flag not set when required.");
                    }
                }
                a.a(l, 0, cki1.c, cki1.d, i1);
                l = -1;
            }
        }
        return f();
    }

    public void d()
    {
        if (!e())
        {
            return;
        }
        if (i == 3)
        {
            long l1 = SystemClock.elapsedRealtime();
            do
            {
                if (SystemClock.elapsedRealtime() - l1 >= 500L || c != null)
                {
                    break;
                }
                ciw ciw = c();
                if (ciw != null)
                {
                    a(ciw);
                }
            } while (true);
            if (c == null)
            {
                Log.w(e, "reached pre-flush poll time limit; codec may be left in a bad state");
            }
            a.k();
            d = -255;
            n = -1L;
            o = true;
            i = 2;
            return;
        } else
        {
            c.a(d, "mPendingOutputBufferIndex", -255, null);
            return;
        }
    }

}
