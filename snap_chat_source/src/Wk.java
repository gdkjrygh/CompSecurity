// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.locks.ReentrantLock;

public final class Wk extends Wl
{

    private final VK e;
    private final VG f;
    private final Wf g;

    public Wk(VK vk, VG vg, Wf wf)
    {
        e = vk;
        f = vg;
        g = wf;
    }

    private boolean g()
    {
        g.a.lock();
        if (!g.a()) goto _L2; else goto _L1
_L1:
        boolean flag = g.c();
        if (!flag) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        g.i();
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        g.i();
        throw exception;
    }

    private boolean h()
    {
        g.a.lock();
        if (!g.g() || !g.a()) goto _L2; else goto _L1
_L1:
        boolean flag = g.c();
        if (flag) goto _L3; else goto _L2
_L2:
        flag = true;
_L5:
        g.i();
        return flag;
_L3:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        g.i();
        throw exception;
    }

    protected final String a()
    {
        return "AudioProcessingRunnable";
    }

    public final void run()
    {
_L2:
        if (!h())
        {
            break; /* Loop/switch isn't completed */
        }
        if (g())
        {
            return;
        }
        if (f != null)
        {
            f.processFrame();
        }
        if (e != null)
        {
            e.processFrame();
        }
        if (true) goto _L2; else goto _L1
        Object obj;
        obj;
        if (!b)
        {
            c = false;
        }
        d = (new StringBuilder("TranscodingException, ")).append(((Wy) (obj)).toString()).toString();
        (new StringBuilder("TranscodingException in Audio Extractor or Decoder: ")).append(((Wy) (obj)).toString());
        ((Wy) (obj)).printStackTrace();
        return;
        obj;
        c = false;
        d = (new StringBuilder("General Exception, ")).append(((Throwable) (obj)).toString()).toString();
        (new StringBuilder("Exception in Audio Extractor or Decoder: ")).append(((Throwable) (obj)).toString());
        ((Throwable) (obj)).printStackTrace();
_L1:
    }
}
