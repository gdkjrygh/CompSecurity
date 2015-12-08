// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public final class akj
    implements akb, akl, ds, Runnable
{

    public final HashSet a = new HashSet();
    public final LinkedBlockingQueue b;
    public final Thread c;
    public MediaExtractor d;
    public int e;
    public int f;
    public ake g;
    public boolean h;
    public boolean i;
    private final HashSet j = new HashSet();
    private int k;
    private int l;
    private final Uri m;
    private final Context n;
    private ajv o;
    private int p;
    private akn q;
    private long r;
    private boolean s;
    private boolean t;
    private boolean u;

    public akj(Context context, Uri uri, long l1)
    {
        i = true;
        if (context == null)
        {
            throw new NullPointerException("context cannot be null");
        }
        n = context;
        if (uri == null)
        {
            throw new NullPointerException("uri cannot be null");
        }
        m = uri;
        if (l1 < 0L)
        {
            throw new IllegalArgumentException("startMicros cannot be negative");
        } else
        {
            r = l1;
            b = new LinkedBlockingQueue(32);
            c = new Thread(this);
            return;
        }
    }

    private boolean a(ahv ahv, aig aig, int i1, int j1)
    {
        if (q == null || ahv == null)
        {
            return false;
        }
        HashSet hashset = j;
        hashset;
        JVM INSTR monitorenter ;
        if (i && k > 1)
        {
            throw new UnsupportedOperationException("Currently, GPU decoders cannot have more than 1 video consumer.");
        }
        break MISSING_BLOCK_LABEL_53;
        ahv;
        hashset;
        JVM INSTR monitorexit ;
        throw ahv;
        k();
        q.b(ahv, aig, i1, j1);
        if (k == 0)
        {
            q.g();
        }
        hashset;
        JVM INSTR monitorexit ;
        return true;
    }

    private void b(boolean flag)
    {
        d.release();
        d = null;
        if (q != null)
        {
            q.c();
            q = null;
        }
        if (g != null)
        {
            g.c();
            g = null;
        }
        if (i)
        {
            if (o != null)
            {
                j().f();
            }
            ajv.c();
        }
        e = -1;
        f = -1;
        b.clear();
        h = false;
        if (!flag) goto _L2; else goto _L1
_L1:
        HashSet hashset = j;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = j.iterator(); iterator.hasNext(); ((aka)iterator.next()).i()) { }
        break MISSING_BLOCK_LABEL_146;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
_L2:
    }

    private ajv j()
    {
        if (o == null)
        {
            o = ajv.a(1, 1);
        }
        return o;
    }

    private void k()
    {
        k = k - 1;
        if (k < 0)
        {
            throw new IllegalStateException("A consumer is grabbing a video frame more than once!");
        } else
        {
            return;
        }
    }

    public final void a()
    {
        k();
        if (k == 0)
        {
            q.g();
        }
    }

    public final void a(aka aka1)
    {
        synchronized (j)
        {
            j.add(aka1);
        }
        return;
        aka1;
        hashset;
        JVM INSTR monitorexit ;
        throw aka1;
    }

    public final void a(akk akk)
    {
        if (akk != q) goto _L2; else goto _L1
_L1:
        akk = j;
        akk;
        JVM INSTR monitorenter ;
        k = j.size();
        for (Iterator iterator = j.iterator(); iterator.hasNext(); ((aka)iterator.next()).a(this, q.a())) { }
        break MISSING_BLOCK_LABEL_73;
        Exception exception;
        exception;
        akk;
        JVM INSTR monitorexit ;
        throw exception;
        akk;
        JVM INSTR monitorexit ;
_L4:
        return;
_L2:
        if (akk != g) goto _L4; else goto _L3
_L3:
        akk = a;
        akk;
        JVM INSTR monitorenter ;
        l = a.size();
        for (Iterator iterator1 = a.iterator(); iterator1.hasNext(); ((agt)iterator1.next()).a()) { }
        break MISSING_BLOCK_LABEL_141;
        iterator1;
        akk;
        JVM INSTR monitorexit ;
        throw iterator1;
        akk;
        JVM INSTR monitorexit ;
    }

    public final boolean a(ahv ahv, aig aig, int i1)
    {
        return a(ahv, aig, i1, p);
    }

    public final boolean a(aig aig)
    {
        if (g == null)
        {
            return false;
        }
        HashSet hashset = a;
        hashset;
        JVM INSTR monitorenter ;
        l = l - 1;
        if (l < 0)
        {
            throw new IllegalStateException("A consumer is grabbing an audio frame more than once!");
        }
        break MISSING_BLOCK_LABEL_48;
        aig;
        hashset;
        JVM INSTR monitorexit ;
        throw aig;
        g.a(aig);
        if (l == 0)
        {
            g.a.pop();
        }
        hashset;
        JVM INSTR monitorexit ;
        return true;
    }

    public void a_(boolean flag)
    {
        if (flag)
        {
            b.offer(Integer.valueOf(1));
            c.interrupt();
            return;
        } else
        {
            b.offer(Integer.valueOf(2));
            return;
        }
    }

    public final void b(aka aka1)
    {
        synchronized (j)
        {
            j.remove(aka1);
        }
        return;
        aka1;
        hashset;
        JVM INSTR monitorexit ;
        throw aka1;
    }

    public final void b(akk akk)
    {
        if (akk != g) goto _L2; else goto _L1
_L1:
        t = true;
_L4:
        if ((g == null || t) && (q == null || u))
        {
            a_(false);
        }
        return;
_L2:
        if (akk == q)
        {
            u = true;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void run()
    {
_L37:
        Object obj = (Integer)b.poll();
        if (obj == null) goto _L2; else goto _L1
_L1:
        ((Integer) (obj)).intValue();
        JVM INSTR tableswitch 0 2: default 765
    //                   0 44
    //                   1 604
    //                   2 589;
           goto _L3 _L4 _L5 _L6
_L4:
        if (i)
        {
            j().b();
        }
        d = new MediaExtractor();
        d.setDataSource(n, m, null);
        e = -1;
        f = -1;
        int i1 = 0;
_L38:
        if (i1 >= d.getTrackCount()) goto _L8; else goto _L7
_L7:
        obj = d.getTrackFormat(i1);
        if (!b.b(((android.media.MediaFormat) (obj))) || e != -1) goto _L10; else goto _L9
_L9:
        e = i1;
          goto _L11
_L10:
        if (b.a(((android.media.MediaFormat) (obj))) && f == -1)
        {
            f = i1;
        }
          goto _L11
        Object obj1;
        obj1;
        obj = j;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = j.iterator(); iterator.hasNext(); ((aka)iterator.next()).a(((Exception) (obj1)))) { }
          goto _L12
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
_L8:
        if (e == -1 && f == -1)
        {
            throw new IllegalArgumentException("Couldn't find a video or audio track in the provided file");
        }
        if (e == -1) goto _L14; else goto _L13
_L13:
        obj = d.getTrackFormat(e);
        if (!i) goto _L16; else goto _L15
_L15:
        obj = new akh(e, ((android.media.MediaFormat) (obj)), this);
_L23:
        q = ((akn) (obj));
        q.e();
        d.selectTrack(e);
        if (android.os.Build.VERSION.SDK_INT < 17) goto _L14; else goto _L17
_L17:
        Object obj2;
        obj = new MediaMetadataRetriever();
        obj2 = m.getScheme();
        if (!"content".equals(obj2) && !"android.resource".equals(obj2)) goto _L19; else goto _L18
_L18:
        ((MediaMetadataRetriever) (obj)).setDataSource(n, m);
_L26:
        obj = ((MediaMetadataRetriever) (obj)).extractMetadata(24);
        if (obj != null) goto _L21; else goto _L20
_L20:
        i1 = 0;
_L27:
        p = i1;
_L14:
        if (f != -1)
        {
            obj = d.getTrackFormat(f);
            g = new ake(f, ((android.media.MediaFormat) (obj)), this);
            g.e();
            d.selectTrack(f);
        }
        if (r > 0L)
        {
            d.seekTo(r, 2);
        }
        h = true;
        obj = j;
        obj;
        JVM INSTR monitorenter ;
        for (obj2 = j.iterator(); ((Iterator) (obj2)).hasNext(); ((aka)((Iterator) (obj2)).next()).o_()) { }
          goto _L22
        obj2;
        obj;
        JVM INSTR monitorexit ;
        throw obj2;
_L16:
        obj = new akf(e, ((android.media.MediaFormat) (obj)), this);
          goto _L23
_L19:
        if (!"file".equals(obj2)) goto _L25; else goto _L24
_L24:
        ((MediaMetadataRetriever) (obj)).setDataSource(m.getPath());
          goto _L26
_L25:
        ((MediaMetadataRetriever) (obj)).setDataSource(m.toString(), new HashMap());
          goto _L26
_L21:
        i1 = Integer.parseInt(((String) (obj)));
          goto _L27
_L22:
        obj;
        JVM INSTR monitorexit ;
        i1 = 0;
        continue; /* Loop/switch isn't completed */
_L6:
        if (q != null)
        {
            q.h();
        }
_L5:
        b(true);
        i1 = 1;
        continue; /* Loop/switch isn't completed */
_L2:
        if (!h) goto _L3; else goto _L28
_L28:
        i1 = d.getSampleTrackIndex();
        if (i1 < 0) goto _L30; else goto _L29
_L29:
        if (i1 != e) goto _L32; else goto _L31
_L31:
        q.a(d);
_L34:
        if (q != null)
        {
            q.b();
        }
        if (g != null)
        {
            g.b();
        }
          goto _L3
_L32:
        if (i1 != f) goto _L34; else goto _L33
_L33:
        g.a(d);
          goto _L34
_L30:
        if (s) goto _L34; else goto _L35
_L35:
        if (q != null)
        {
            q.d();
        }
        if (g != null)
        {
            g.d();
        }
        s = true;
          goto _L34
_L12:
        obj;
        JVM INSTR monitorexit ;
        b(false);
        return;
_L3:
        i1 = 0;
        if (i1 == 0) goto _L37; else goto _L36
_L36:
        return;
_L11:
        i1++;
          goto _L38
    }
}
