// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.MediaFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

public final class ovf extends Thread
{

    private final Context a;
    private final ote b;
    private final int c;
    private final int d;
    private final osy e;
    private final osq f;
    private final ouz g;
    private final PriorityBlockingQueue h;
    private final osu i;
    private final oti j;
    private volatile boolean k;
    private oux l;
    private ota m;
    private ost n;
    private final android.media.MediaCodec.BufferInfo o = new android.media.MediaCodec.BufferInfo();
    private ByteBuffer p[];
    private CountDownLatch q;
    private volatile Exception r;
    private boolean s;

    public ovf(Context context, ote ote1, int i1, int j1, PriorityBlockingQueue priorityblockingqueue, osy osy1, osq osq1, 
            ouz ouz1, osu osu1)
    {
        q = new CountDownLatch(1);
        a = context;
        b = ote1;
        c = i1;
        d = j1;
        h = priorityblockingqueue;
        e = osy1;
        f = osq1;
        g = ouz1;
        i = osu1;
        j = new oti(osu1);
        setName("Extractor Thread");
    }

    private boolean a(ovd ovd1)
    {
        int i1 = ovd1.b();
        if (i1 == -1)
        {
            return true;
        }
        int k1;
        k1 = b.c(i1);
        m.a(b.b(k1), 2);
        boolean flag = false;
_L31:
        if (flag) goto _L2; else goto _L1
_L1:
        int i2 = n.a(10000L);
        if (i2 < 0) goto _L2; else goto _L3
_L3:
        Object obj = (ovd)h.peek();
        if (obj == null) goto _L5; else goto _L4
_L4:
        if (((ovd) (obj)).a <= ovd1.a) goto _L5; else goto _L6
_L6:
        int j1 = 1;
_L25:
        long l2 = 0L;
        if (j1 != 0) goto _L8; else goto _L7
_L7:
        j1 = m.a(p[i2], 0);
          goto _L9
_L23:
        int l1;
        n.a(i2, 0, j1, l2, l1);
_L2:
        j1 = n.a(o, 10000L);
        if (j1 < 0) goto _L11; else goto _L10
_L10:
        boolean flag1;
        l1 = o.flags;
        l2 = o.presentationTimeUs;
        flag1 = ovd1.a(k1);
        n.a(j1, flag1);
        if (!flag1) goto _L13; else goto _L12
_L12:
        obj = l.b();
        if (obj == null) goto _L15; else goto _L14
_L14:
        ovd1.a(k1, ((android.graphics.Bitmap) (obj)));
_L13:
        j1 = ovd1.c();
        if (j1 == -1) goto _L17; else goto _L16
_L16:
        if (k || j.a) goto _L17; else goto _L18
_L18:
        l1 = k1 + 1;
        if (j1 == l1) goto _L20; else goto _L19
_L19:
        i2 = b.c(j1);
        InterruptedException interruptedexception;
        if (j1 < l1)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
          goto _L21
_L24:
        if ((k1 | (j1 | 0)) == 0) goto _L20; else goto _L22
_L22:
        m.a(b.b(i2), 2);
        n.d();
        j1 = i2;
        break MISSING_BLOCK_LABEL_530;
_L27:
        l2 = m.c();
        m.b();
        l1 = 0;
          goto _L23
        interruptedexception;
        try
        {
            Thread.currentThread().interrupt();
        }
        catch (Exception exception)
        {
            ovd1.a(exception);
        }
_L17:
        if (ovd1.b() == -1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            ovd1.d();
            return flag1;
        } else
        {
            return flag1;
        }
_L15:
        orw.a("Failed to render thumbnail");
          goto _L13
_L29:
        k1 = 0;
          goto _L24
_L11:
label0:
        {
            if (j1 != -1)
            {
                break label0;
            }
            if (!flag)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
          goto _L17
        if (j1 == -2 || j1 == -3)
        {
            continue; /* Loop/switch isn't completed */
        }
        throw new Exception(String.format("Decoder failed with status %d", new Object[] {
            Integer.valueOf(j1)
        }));
_L20:
        j1 = l1;
        break MISSING_BLOCK_LABEL_530;
_L8:
        j1 = -1;
        continue; /* Loop/switch isn't completed */
_L5:
        j1 = 0;
          goto _L25
_L9:
        if (j1 >= 0) goto _L27; else goto _L26
_L26:
        l1 = 4;
        j1 = 0;
        flag = true;
          goto _L23
_L21:
        if (i2 <= l1) goto _L29; else goto _L28
_L28:
        k1 = 1;
          goto _L24
        k1 = j1;
        if (true) goto _L31; else goto _L30
_L30:
    }

    private void b()
    {
        if (n != null)
        {
            if (s)
            {
                n.c();
                s = false;
            }
            n.a();
            n = null;
        }
    }

    private void c()
    {
        if (l != null)
        {
            l.c();
            l = null;
        }
        if (m != null)
        {
            m.a();
            m = null;
        }
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (!k)
        {
            k = true;
            interrupt();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void run()
    {
        boolean flag1 = false;
        if (android.os.Build.VERSION.SDK_INT >= 21) goto _L2; else goto _L1
_L1:
        int i1 = 360 - b.e;
_L11:
        l = g.a(c, d, i1);
        m = e.a();
        m.a(a, b.a, null);
        m.b(b.b);
        q.countDown();
_L8:
        boolean flag = k;
        if (flag) goto _L4; else goto _L3
_L3:
        ovd ovd1 = (ovd)h.poll(1L, TimeUnit.MILLISECONDS);
        ovd ovd2 = ovd1;
        if (ovd1 != null) goto _L6; else goto _L5
_L5:
        i.c(j);
        ovd2 = (ovd)h.take();
_L6:
        if (ovd2.b) goto _L8; else goto _L7
_L7:
        i.a(j, ovd2.a);
        j.a(-1L);
        MediaFormat mediaformat = m.a(b.b);
        n = f.a(mediaformat.getString("mime"), false);
        n.a(mediaformat, l.a(), null, 0);
        n.b();
        s = true;
        p = n.e();
        flag = a(ovd2);
        b();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_293;
        }
        h.add(ovd2);
        j.d();
          goto _L8
        Object obj;
        obj;
        c();
        i.c(j);
        throw obj;
        obj;
        r = ((Exception) (obj));
        orw.a("Unable to read video file - terminating ExtractorThread", ((Throwable) (obj)));
        q.countDown();
        c();
        i.c(j);
        return;
        obj;
        r = ((Exception) (obj));
        orw.a("Unable to initialize ExtractorSurface - terminating ExtractorThread", ((Throwable) (obj)));
        q.countDown();
        c();
        i.c(j);
        return;
        obj;
        q.countDown();
        throw obj;
        obj;
        h.add(ovd2);
        j.d();
          goto _L8
        obj;
        b();
        throw obj;
        obj;
        flag = false;
_L10:
        orw.a("Failed to execute ExtractorTask", ((Throwable) (obj)));
        if (flag)
        {
            break MISSING_BLOCK_LABEL_455;
        }
        h.add(ovd2);
        j.d();
          goto _L8
_L9:
        if (flag)
        {
            break MISSING_BLOCK_LABEL_479;
        }
        h.add(ovd2);
        j.d();
        throw obj;
_L4:
        c();
        i.c(j);
        return;
        obj;
        flag = flag1;
          goto _L9
        obj;
          goto _L9
        obj;
          goto _L10
        obj;
          goto _L8
_L2:
        i1 = 0;
          goto _L11
        obj;
          goto _L9
    }
}
