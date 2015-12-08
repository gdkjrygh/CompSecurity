// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public final class cjz
    implements cjt, cjv
{

    private static final String a = cjz.getSimpleName();
    private static final ekk b = (new ekm()).b(fzu).a();
    private static final Set c;
    private static final Set d;
    private final okf e;
    private final okj f;
    private final noj g;
    private final int h;
    private final Context i;
    private final nny j;
    private final ckd k = new ckd(8);
    private final ckd l = new ckd(8);
    private final Stack m = new Stack();
    private final Stack n = new Stack();
    private final List o = new ArrayList();
    private int p;
    private long q;
    private long r;
    private boolean s;
    private cka t;
    private ckb u;
    private int v;
    private boolean w;

    public cjz(okf okf1, okj okj1, noj noj1, int i1, Context context, nny nny1)
    {
        q = -1L;
        r = -1L;
        e = (okf)b.a(okf1, "byteRangeFetcher", null);
        f = (okj)b.a(okj1, "store", null);
        g = (noj)b.a(noj1, "moviemakerProvider", null);
        h = i1;
        i = context;
        j = (nny)b.a(nny1, "mediaIdentifier", null);
    }

    private static transient Set a(int ai[])
    {
        HashSet hashset = new HashSet();
        int j1 = ai.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            hashset.add(Integer.valueOf(ai[i1]));
        }

        return Collections.unmodifiableSet(hashset);
    }

    private void a(cjx cjx1)
    {
        b.a(cjx1.a, "moov.type", cjw.a, null);
        c.a(o, "tracks");
        int i1 = cjw.c;
        ArrayList arraylist = new ArrayList();
        Iterator iterator = cjx1.c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            cjx cjx2 = (cjx)iterator.next();
            if (cjx2.a == i1)
            {
                arraylist.add(cjx2);
            }
        } while (true);
        iterator = arraylist.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj1 = (cjx)iterator.next();
            b.a(obj1, "trakAtom", null);
            Object obj = ((cjx) (obj1)).b(cjw.e);
            ckd ckd1 = ((cjx) (obj)).a(cjw.g).b;
            ckd1.a(8);
            int j1 = ckd1.c();
            if (j1 != 0x736f756e && j1 != 0x76696465)
            {
                obj = null;
            } else
            {
                MediaFormat mediaformat;
                if (j1 == 0x76696465)
                {
                    obj1 = ((cjx) (obj1)).a(cjw.d).b;
                    j1 = ckc.a(((ckd) (obj1)));
                    if (j1 == 0)
                    {
                        ((ckd) (obj1)).b(36);
                        j1 = cka.b(((ckd) (obj1)));
                    } else
                    if (j1 == 1)
                    {
                        ((ckd) (obj1)).b(48);
                        j1 = cka.b(((ckd) (obj1)));
                    } else
                    {
                        j1 = -1;
                    }
                } else
                {
                    j1 = -1;
                }
                obj1 = ((cjx) (obj)).b(cjw.h).b(cjw.k);
                mediaformat = cka.a(((cjx) (obj1)).a(cjw.l).b);
                if (mediaformat == null)
                {
                    obj = null;
                } else
                {
                    obj = ((cjx) (obj)).a(cjw.f).b;
                    int l1 = ckc.a(((ckd) (obj)));
                    if (l1 == 0)
                    {
                        ((ckd) (obj)).b(8);
                        l1 = ((ckd) (obj)).c();
                    } else
                    if (l1 == 1)
                    {
                        ((ckd) (obj)).b(16);
                        l1 = ((ckd) (obj)).c();
                    } else
                    {
                        throw b.a("Unexpected version for mdhd box");
                    }
                    obj = new cka(l1, ((cjx) (obj1)), mediaformat, j1);
                }
            }
            if (obj != null)
            {
                o.add(obj);
            }
        } while (true);
        cjx1 = cjx1.a(cjw.b);
        if (cjx1 != null)
        {
            cjx1 = ((cjy) (cjx1)).b;
            int k1 = ckc.a(cjx1);
            long l2;
            long l3;
            long l4;
            if (k1 == 0)
            {
                l2 = cjx1.c();
                cjx1.c();
                l4 = cjx1.c();
                l3 = cjx1.c();
            } else
            if (k1 == 1)
            {
                l2 = cjx1.d();
                cjx1.d();
                l4 = cjx1.d();
                l3 = cjx1.d();
            } else
            {
                throw c.a("Unexpected version for mvhd box");
            }
            q = (l3 * 0xf4240L) / l4;
            l3 = l2;
            if (l2 >= 0x7c25b080L)
            {
                l3 = l2 - 0x7c25b080L;
            }
            if (l3 > 0L)
            {
                l2 = 1000L * l3 * 1000L;
            } else
            {
                l2 = -1L;
            }
            r = l2;
        }
    }

    private boolean a(ckd ckd1)
    {
        int i1 = ckd1.a.length;
        ByteBuffer bytebuffer = ByteBuffer.wrap(ckd1.a);
        bytebuffer.limit(i1);
        if (e.a(p, bytebuffer) != i1)
        {
            return false;
        } else
        {
            d(i1);
            ckd1.a(0);
            return true;
        }
    }

    private void d(int i1)
    {
        p = p + i1;
    }

    private long k()
    {
        Object obj;
        try
        {
            obj = (ekq)g.a(h, Collections.singletonList(j.a.a));
            obj = (fzu)((ekp)((List)b.a(i, ((ekq) (obj))).a(((ekq) (obj)), ekw.a, b).a()).get(0)).a(fzu);
        }
        catch (Exception exception)
        {
            obj = a;
            String s1 = String.valueOf(exception);
            Log.w(((String) (obj)), (new StringBuilder(String.valueOf(s1).length() + 72)).append("exception when trying to reterieve media and ExifFeature for the video: ").append(s1).toString());
            return 0L;
        }
        if (obj == null)
        {
            return 0L;
        }
        obj = ((fzu) (obj)).a.c;
        if (obj == null)
        {
            return 0L;
        } else
        {
            return ((Long) (obj)).longValue();
        }
    }

    private void l()
    {
_L2:
        int i1;
        if (s)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!a(k))
        {
            i1 = 0;
        } else
        {
label0:
            {
                j1 = k.c();
                l1 = k.c();
                if (j1 != 1)
                {
                    break MISSING_BLOCK_LABEL_429;
                }
                if (a(l))
                {
                    break label0;
                }
                i1 = 0;
            }
        }
_L3:
        if (i1 == 0)
        {
            s = true;
            e.a();
        }
        while (!n.isEmpty() && ((Integer)n.peek()).intValue() == p) 
        {
            n.pop();
            Object obj = (cjx)m.pop();
            Object obj1;
            int j1;
            int k1;
            int l1;
            if (((cjx) (obj)).a == cjw.a)
            {
                a(((cjx) (obj)));
            } else
            if (!m.isEmpty())
            {
                ((cjx)m.peek()).c.add(obj);
            }
        }
        if (true) goto _L2; else goto _L1
        j1 = l.e();
        i1 = 1;
_L4:
        k1 = j1 - 8;
        j1 = k1;
        if (i1 != 0)
        {
            j1 = k1 - 8;
        }
        if (d.contains(Integer.valueOf(l1)))
        {
            m.add(new cjx(l1));
            n.add(Integer.valueOf(j1 + p));
        } else
        if (c.contains(Integer.valueOf(l1)))
        {
            obj1 = new ckd(j1);
            if (!a(((ckd) (obj1))))
            {
                i1 = p;
                obj = String.valueOf(e);
                throw new IOException((new StringBuilder(String.valueOf(obj).length() + 89)).append("Unable to read requested payload of bytes ").append(j1).append(" at offset ").append(i1).append(" with fetcher ").append(((String) (obj))).toString());
            }
            if (!m.isEmpty())
            {
                obj = (cjx)m.peek();
                obj1 = new cjy(l1, ((ckd) (obj1)));
                ((cjx) (obj)).b.add(obj1);
            }
        } else
        {
            d(j1);
        }
        i1 = 1;
          goto _L3
_L1:
        return;
        i1 = 0;
          goto _L4
    }

    private int m()
    {
        for (Iterator iterator = o.iterator(); iterator.hasNext();)
        {
            cka cka1 = (cka)iterator.next();
            if (cka1.d != -1)
            {
                return cka1.d;
            }
        }

        return -1;
    }

    public final int a(ByteBuffer bytebuffer, int i1)
    {
        c.a(t, "selectedTrack", null);
        c.b(v, "sampleIndex", -1, null);
        ckb ckb1 = u;
        i1 = v;
        long l1 = ckb1.a[i1];
        ckb1 = u;
        i1 = v;
        i1 = ckb1.b[i1];
        bytebuffer.limit(i1 + 0);
        bytebuffer.position(0);
        int j1 = e.a(l1, bytebuffer);
        if (j1 != i1)
        {
            throw new IOException((new StringBuilder(83)).append("Unable to read ").append(i1).append(" bytes at ").append(l1).append(": actually read ").append(j1).toString());
        }
        if (w)
        {
            ckc.a(bytebuffer, i1);
        }
        bytebuffer.flip();
        bytebuffer.position(0);
        return i1;
    }

    public final MediaFormat a(int i1)
    {
        l();
        b.a(i1, "index", o);
        return ((cka)o.get(i1)).c;
    }

    public final void a()
    {
        try
        {
            e.close();
            return;
        }
        catch (IOException ioexception)
        {
            throw c.a("Error releasing MP4 extractor.", ioexception);
        }
    }

    public final void a(long l1)
    {
        c.a(t, "selectedTrack", null);
        c.b(v, "sampleIndex", -1, null);
        b.b(l1 - d(), "timestampUs - getSampleTime()");
        int j1 = v;
        ByteBuffer bytebuffer;
        int i1;
        if (t.c.containsKey("max-input-size"))
        {
            i1 = t.c.getInteger("max-input-size");
        } else
        {
            i1 = 8192;
        }
        bytebuffer = ByteBuffer.allocate(i1);
        SystemClock.elapsedRealtimeNanos();
        for (; v != -1 && d() < l1; b())
        {
            bytebuffer.clear();
            Object obj = u;
            i1 = v;
            bytebuffer.limit(((ckb) (obj)).b[i1]);
            obj = e;
            ckb ckb1 = u;
            i1 = v;
            ((okf) (obj)).a(ckb1.a[i1], bytebuffer);
        }

        v = j1;
        e.a();
    }

    public final void a(long l1, int i1)
    {
        c.a(t, "selectedTrack", null);
        ckb ckb1;
        int j1;
        int k1;
        if (i1 == 2)
        {
            ckb1 = u;
            k1 = ckb1.a(l1);
            i1 = 0;
        } else
        {
            if (i1 == 0)
            {
                v = u.a(l1);
                return;
            }
            throw new UnsupportedOperationException();
        }
        if (i1 >= ckb1.c.length) goto _L2; else goto _L1
_L1:
        if (ckb1.c[i1] < l1 || !ckb1.d[i1]) goto _L4; else goto _L3
_L3:
        if (k1 != -1) goto _L6; else goto _L5
_L5:
        j1 = i1;
_L9:
        v = j1;
        return;
_L4:
        i1++;
        break MISSING_BLOCK_LABEL_33;
_L2:
        i1 = -1;
          goto _L3
_L6:
        if (i1 == -1) goto _L8; else goto _L7
_L7:
        j1 = i1;
        if (l1 - ckb1.c[k1] > ckb1.c[i1] - l1) goto _L9; else goto _L8
_L8:
        j1 = k1;
          goto _L9
    }

    public final void b(int i1)
    {
        c.b(t, "selectedTrack", "This implementation allows only one track to be selected");
        l();
        b.a(i1, "index", o);
        t = (cka)o.get(i1);
        u = ckb.a(t);
        if (u.b.length > 0)
        {
            v = 0;
        } else
        {
            v = -1;
        }
        w = t.c.getString("mime").equalsIgnoreCase("video/avc");
    }

    public final boolean b()
    {
        c.a(t, "selectedTrack", null);
        c.b(v, "sampleIndex", -1, "advance() requires a valid current sample.");
        if (v == u.b.length - 1)
        {
            v = -1;
            return false;
        } else
        {
            v = v + 1;
            return true;
        }
    }

    public final int c()
    {
        c.a(t, "selectedTrack", null);
        c.b(v, "sampleIndex", -1, null);
        ckb ckb1 = u;
        int i1 = v;
        return !ckb1.d[i1] ? 0 : 1;
    }

    public final void c(int i1)
    {
        b.a(i1, "index", o.indexOf(t), null);
        t = null;
        u = null;
        v = -1;
    }

    public final long d()
    {
        c.a(t, "selectedTrack", null);
        if (v != -1)
        {
            ckb ckb1 = u;
            int i1 = v;
            return ckb1.c[i1];
        } else
        {
            return -1L;
        }
    }

    public final int e()
    {
        c.a(t, "selectedTrack", null);
        if (v == -1)
        {
            return -1;
        } else
        {
            return o.indexOf(t);
        }
    }

    public final int f()
    {
        l();
        return o.size();
    }

    public final boolean g()
    {
        c.a(t, "selectedTrack", null);
        c.b(v, "sampleIndex", -1, null);
        ckb ckb1 = u;
        int i1 = v;
        long l1 = ckb1.a[i1];
        ckb1 = u;
        i1 = v;
        i1 = ckb1.b[i1];
        return e.a(l1, i1);
    }

    public final void h()
    {
        e.a();
    }

    public final coi i()
    {
        int i1 = 0;
        l();
        int j1 = -1;
        MediaFormat mediaformat = null;
        boolean flag = false;
        while (i1 < o.size()) 
        {
            cka cka1 = (cka)o.get(i1);
            MediaFormat mediaformat1 = cka1.c;
            if (c.b(cka1.c))
            {
                if (j1 == -1)
                {
                    j1 = i1;
                    mediaformat = mediaformat1;
                } else
                {
                    mediaformat = mediaformat1;
                }
            } else
            if (c.a(cka1.c))
            {
                flag = true;
            }
            i1++;
        }
        c.a(mediaformat, "videoFormat", null);
        u = ckb.a((cka)o.get(j1));
        if (r == -1L || r == 0L)
        {
            r = k();
        }
        return new cql(r, m(), mediaformat.getInteger("width"), mediaformat.getInteger("height"), flag, q, u.c, u.a(), j1);
    }

    public final void j()
    {
        f.b(j.a.a);
    }

    static 
    {
        c = a(new int[] {
            cjw.b, cjw.f, cjw.g, cjw.i, cjw.j, cjw.l, cjw.m, cjw.n, cjw.p, cjw.q, 
            cjw.r, cjw.s, cjw.t, cjw.u, cjw.v, cjw.w, cjw.d
        });
        d = a(new int[] {
            cjw.a, cjw.c, cjw.e, cjw.h, cjw.k
        });
    }
}
