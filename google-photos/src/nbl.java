// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.chromium.net.HttpUrlRequest;

public final class nbl extends nxh
    implements mvx, nbj
{

    private nbt b;
    private final ncm c;
    private final int d;
    private final HashMap e;
    private final HashSet f;
    private final jp g;
    private final nbz h;
    private long i;
    private final myy j;
    private final myy k;
    private final int l;
    private final nba m[];
    private final nqg n;
    private float o;
    private int p;
    private int q;
    private int r;
    private int s;

    protected nbl(Context context, nck nck1)
    {
        super(context);
        e = new HashMap();
        f = new HashSet();
        l = b.z(context);
        nci nci1 = nck1.b;
        j = new myy(context, nci1.a, nci1.b, nci1.c, nci1.d, nci1.e);
        nci1 = nck1.c;
        k = new myy(context, nci1.a, nci1.b, nci1.c, nci1.d, nci1.e);
        c = nck1.a;
        d = (int)((double)c.a * 0.75D);
        g = new nbn(this, c.a);
        nck1 = b.x(context);
        o = Math.min(240F / ((DisplayMetrics) (nck1)).xdpi, 1.0F);
        p = Math.max(((DisplayMetrics) (nck1)).heightPixels, ((DisplayMetrics) (nck1)).widthPixels);
        if (p == 0)
        {
            p = 640;
        }
        q = (int)((float)p * 0.2F * o);
        r = (int)((float)p * 0.5F);
        if (android.os.Build.VERSION.SDK_INT >= 11) goto _L2; else goto _L1
_L1:
        nck1 = null;
_L4:
        h = nck1;
        nck1 = olm.c(context, nba);
        m = (nba[])nck1.toArray(new nba[nck1.size()]);
        Arrays.sort(m, new nbm(this));
        int i1 = context.getApplicationContext().getResources().getInteger(b.Fd);
        if (l >= 256)
        {
            i1 = 0x1000000;
        }
        s = i1;
        n = (nqg)olm.b(context, nqg);
        if (Log.isLoggable("ImageResourceManager", 3))
        {
            nck1 = new nbp(this, new StringWriter());
            a(nck1);
            b.a(4, "ImageResourceManager", nck1.toString());
        }
        nck1 = olm.b(context);
        nck1.b(mvx, this);
        if (h != null)
        {
            nck1.b(mvx, h);
        }
        nck1 = new IntentFilter();
        nck1.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        nay nay1 = new nay();
        context.getApplicationContext().registerReceiver(nay1, nck1);
        context.registerComponentCallbacks(new nbk(context));
        return;
_L2:
        nbz nbz1 = new nbz(c.c);
        nck1 = nbz1;
        if (c.f)
        {
            b = new nbt(c, nbz1, r, q);
            b.a(new nbo(this));
            nck1 = nbz1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static nbt a(nbl nbl1)
    {
        return nbl1.b;
    }

    public final Bitmap a(int i1, int j1)
    {
        Bitmap bitmap = null;
        if (h != null)
        {
            bitmap = h.a(i1, j1, nby.a);
        }
        Bitmap bitmap1 = bitmap;
        if (bitmap == null)
        {
            bitmap1 = Bitmap.createBitmap(i1, j1, android.graphics.Bitmap.Config.ARGB_8888);
        }
        return bitmap1;
    }

    public final Object a(nbc nbc1, ByteBuffer bytebuffer, boolean flag)
    {
        for (int i1 = 0; i1 < m.length; i1++)
        {
            Object obj = m[i1].a(nbc1, bytebuffer);
            if (obj != null)
            {
                return obj;
            }
        }

        return null;
    }

    public final String a()
    {
        return "ImageResourceManager";
    }

    public final nxb a(nxd nxd1)
    {
        nbc nbc1 = (nbc)e.get(nxd1);
        if (nbc1 != null)
        {
            return nbc1;
        } else
        {
            return (nxb)g.a(nxd1);
        }
    }

    public final void a(int i1, String s1, String s2, long l1, long l2, 
            long l3, long l4, int j1, String s3)
    {
        if (n != null)
        {
            n.a(i1, s1, s2, l1, l2, l3, l4, j1, s3);
        }
    }

    public final void a(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            return;
        }
        if (h != null)
        {
            if (b != null)
            {
                nbt nbt1 = b;
                if (nbt1.b && nbt1.a.d() > 0.85F)
                {
                    nbt1.b = false;
                }
            }
            h.a(bitmap);
            return;
        } else
        {
            bitmap.recycle();
            return;
        }
    }

    public final void a(PrintWriter printwriter)
    {
        Object obj;
        obj = g.g();
        int i1 = c.a;
        int k1 = g.b();
        int l1 = ((Map) (obj)).size();
        int i2 = g.e();
        int j2 = g.c();
        int k2 = g.d();
        int l2 = g.f();
        printwriter.println((new StringBuilder(186)).append("Image cache size: ").append(i1).append("; cached size: ").append(k1).append("; cached bitmaps: ").append(l1).append("; put count: ").append(i2).append("; hit count: ").append(j2).append("; miss count: ").append(k2).append("; eviction count: ").append(l2).toString());
        Iterator iterator1;
        String s1;
        if (((Map) (obj)).isEmpty())
        {
            printwriter.println("Image cache is empty");
        } else
        {
            Iterator iterator2 = ((Map) (obj)).keySet().iterator();
            while (iterator2.hasNext()) 
            {
                Object obj1 = (nxd)iterator2.next();
                int j1 = ((nbc)((Map) (obj)).get(obj1)).m();
                obj1 = String.valueOf(obj1);
                printwriter.println((new StringBuilder(String.valueOf(obj1).length() + 27)).append("Cached: ").append(j1).append(" bytes, ").append(((String) (obj1))).toString());
            }
        }
        obj = f;
        obj;
        JVM INSTR monitorenter ;
        if (!f.isEmpty())
        {
            for (iterator1 = f.iterator(); iterator1.hasNext(); printwriter.println((new StringBuilder(String.valueOf(s1).length() + 13)).append("Downloading: ").append(s1).toString()))
            {
                s1 = String.valueOf((nbc)iterator1.next());
            }

        }
        break MISSING_BLOCK_LABEL_377;
        printwriter;
        obj;
        JVM INSTR monitorexit ;
        throw printwriter;
        obj;
        JVM INSTR monitorexit ;
        if (e.isEmpty())
        {
            printwriter.println("No active resources");
        } else
        {
            printwriter.println("Active resources");
            Iterator iterator = e.values().iterator();
            while (iterator.hasNext()) 
            {
                b.a(4, "ImageResourceManager", ((nxb)iterator.next()).toString());
            }
        }
        if (b.t())
        {
            (new nbq(this)).execute(new Void[0]);
            return;
        } else
        {
            b(printwriter);
            return;
        }
    }

    public final void a(nbc nbc1)
    {
        synchronized (f)
        {
            f.add(nbc1);
        }
        return;
        nbc1;
        hashset;
        JVM INSTR monitorexit ;
        throw nbc1;
    }

    public final void a(nxb nxb1)
    {
        nbc nbc1;
        if (!e.containsKey(nxb1.g))
        {
            nxb1 = String.valueOf(nxb1.g);
            throw new IllegalStateException((new StringBuilder(String.valueOf(nxb1).length() + 24)).append("Resource is not active: ").append(nxb1).toString());
        }
        nbc1 = (nbc)nxb1;
        ((nxb) (nbc1)).i;
        JVM INSTR tableswitch 0 8: default 120
    //                   0 296
    //                   1 174
    //                   2 120
    //                   3 174
    //                   4 296
    //                   5 174
    //                   6 174
    //                   7 296
    //                   8 155;
           goto _L1 _L2 _L3 _L1 _L3 _L2 _L3 _L3 _L2 _L4
_L1:
        nxb1 = String.valueOf(nxb.c(nxb1.i));
        Object obj;
        if (nxb1.length() != 0)
        {
            nxb1 = "Illegal resource state: ".concat(nxb1);
        } else
        {
            nxb1 = new String("Illegal resource state: ");
        }
        throw new IllegalStateException(nxb1);
_L4:
        if (nbc1.i == 8 && (nbc1.h instanceof nbh)) goto _L5; else goto _L3
_L3:
        return;
_L5:
        if (!nbc.n())
        {
            nbc1.i = 1;
            return;
        }
        nxb1 = (nbh)nbc1.h;
        obj = Bitmap.createBitmap(((nbh) (nxb1)).d, ((nbh) (nxb1)).e, ((nbh) (nxb1)).a);
        ((nbh) (nxb1)).g.rewind();
        ((Bitmap) (obj)).copyPixelsFromBuffer(((nbh) (nxb1)).g);
        if (((nbh) (nxb1)).b == ((nbh) (nxb1)).d && ((nbh) (nxb1)).c == ((nbh) (nxb1)).e) goto _L7; else goto _L6
_L6:
        nbc1.h = new naw(((Bitmap) (obj)), ((nbh) (nxb1)).b, ((nbh) (nxb1)).c);
_L8:
        nbc1.i = 1;
        return;
_L7:
        try
        {
            nbc1.h = obj;
        }
        // Misplaced declaration of an exception variable
        catch (nxb nxb1)
        {
            nbc1.h = null;
            nbc1.i = 6;
            return;
        }
          goto _L8
_L2:
        if (((nxb) (nbc1)).m)
        {
            obj = String.valueOf(((nxb) (nbc1)).g);
            (new StringBuilder(String.valueOf(obj).length() + 23)).append("Requesting image load: ").append(((String) (obj)));
        }
        nbc1.i = 2;
        c(nxb1);
        return;
    }

    public final void a(nxb nxb1, int i1, int j1)
    {
        if (!(nxb1 instanceof nbc) || i1 != 4)
        {
            super.a(nxb1, i1, j1);
            return;
        }
        if (((nbc)nxb1).e <= 3)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            if (nxb1.m)
            {
                String s1 = String.valueOf(nxb1.g);
                (new StringBuilder(String.valueOf(s1).length() + 21)).append("Retrying image load: ").append(s1);
            }
            nxb1.i = 2;
            c(nxb1);
            return;
        } else
        {
            nxb1.i = 5;
            super.a(nxb1, 5, j1);
            return;
        }
    }

    public final void a(nxb nxb1, nxe nxe1)
    {
        Object obj;
        nxb nxb2;
        boolean flag;
        boolean flag3;
        flag3 = false;
        flag = false;
        b.u();
        obj = nxb1.g;
        nxb2 = (nxb)e.get(obj);
        if (nxb2 == null) goto _L2; else goto _L1
_L1:
        if (nxb2 != nxb1)
        {
            nxb1 = String.valueOf(obj);
            throw new IllegalStateException((new StringBuilder(String.valueOf(nxb1).length() + 80)).append("Duplicate resource: ").append(nxb1).append(". Check getManagedResource() prior to calling loadResource. ").toString());
        }
        if (nxb1.m)
        {
            obj = String.valueOf(obj);
            (new StringBuilder(String.valueOf(obj).length() + 25)).append("Adding another consumer: ").append(((String) (obj)));
        }
        b.u();
        nxb1.r();
        if (!nxb1.a(nxe1, null))
        {
            if (nxb1.p != null)
            {
                flag = nxb1.p.isEmpty();
                nxb1.p.add(new nxc(nxe1, null));
            } else
            if (nxb1.n != null)
            {
                nxb1.p = new ArrayList();
                nxb1.p.add(new nxc(nxb1.n, nxb1.o));
                nxb1.n = null;
                nxb1.o = null;
                nxb1.p.add(new nxc(nxe1, null));
            } else
            {
                nxb1.n = nxe1;
                nxb1.o = null;
                flag = true;
            }
            if (flag)
            {
                nxb1.f.a(nxb1);
            }
            nxe1.a(nxb1);
        }
_L4:
        return;
_L2:
        nxb nxb3 = (nxb)g.a(obj);
        if (nxb3 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (nxb3 != nxb1)
        {
            nxb1 = String.valueOf(obj);
            throw new IllegalStateException((new StringBuilder(String.valueOf(nxb1).length() + 80)).append("Duplicate resource: ").append(nxb1).append(". Check getManagedResource() prior to calling loadResource. ").toString());
        }
        if (nxb1.m)
        {
            String s1 = String.valueOf(obj);
            (new StringBuilder(String.valueOf(s1).length() + 12)).append("Activating: ").append(s1);
        }
        g.b(obj);
        e.put(obj, nxb1);
        b.u();
        nxb1.r();
        if (!nxb1.a(nxe1, null))
        {
            boolean flag1;
            if (nxb1.p != null)
            {
                flag1 = nxb1.p.isEmpty();
                nxb1.p.add(new nxc(nxe1, null));
            } else
            if (nxb1.n != null)
            {
                nxb1.p = new ArrayList();
                nxb1.p.add(new nxc(nxb1.n, nxb1.o));
                nxb1.n = null;
                nxb1.o = null;
                nxb1.p.add(new nxc(nxe1, null));
                flag1 = flag3;
            } else
            {
                nxb1.n = nxe1;
                nxb1.o = null;
                flag1 = true;
            }
            if (flag1)
            {
                nxb1.f.a(nxb1);
            }
            nxe1.a(nxb1);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        e.put(obj, nxb1);
        if (nxb1.m)
        {
            obj = String.valueOf(obj);
            (new StringBuilder(String.valueOf(obj).length() + 14)).append("loadResource: ").append(((String) (obj)));
        }
        b.u();
        nxb1.r();
        if (!nxb1.a(nxe1, null))
        {
            boolean flag2;
            if (nxb1.p != null)
            {
                flag2 = nxb1.p.isEmpty();
                nxb1.p.add(new nxc(nxe1, null));
            } else
            if (nxb1.n != null)
            {
                nxb1.p = new ArrayList();
                nxb1.p.add(new nxc(nxb1.n, nxb1.o));
                nxb1.n = null;
                nxb1.o = null;
                nxb1.p.add(new nxc(nxe1, null));
                flag2 = false;
            } else
            {
                nxb1.n = nxe1;
                nxb1.o = null;
                flag2 = true;
            }
            if (flag2)
            {
                nxb1.f.a(nxb1);
            }
            nxe1.a(nxb1);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final String b()
    {
        return "Prints the entire contents of the resource manager to a String.";
    }

    final void b(PrintWriter printwriter)
    {
        long l1 = j.a();
        long l2 = j.c();
        long l3 = Math.max(0L, l1 - l2);
        String s1 = String.valueOf(oqs.a(l1));
        String s2 = String.valueOf(oqs.a(l2));
        String s3 = String.valueOf(oqs.a(l3));
        printwriter.println((new StringBuilder(String.valueOf(s1).length() + 39 + String.valueOf(s2).length() + String.valueOf(s3).length())).append("Disk cache total size: ").append(s1).append("; used: ").append(s2).append("; free: ").append(s3).toString());
        l1 = k.b();
        l2 = k.c();
        l3 = Math.max(0L, l1 - l2);
        s1 = String.valueOf(oqs.a(l1));
        s2 = String.valueOf(oqs.a(l2));
        s3 = String.valueOf(oqs.a(l3));
        printwriter.println((new StringBuilder(String.valueOf(s1).length() + 44 + String.valueOf(s2).length() + String.valueOf(s3).length())).append("Long-term cache total size: ").append(s1).append("; used: ").append(s2).append("; free: ").append(s3).toString());
    }

    public final void b(nbc nbc1)
    {
        synchronized (f)
        {
            f.remove(nbc1);
        }
        return;
        nbc1;
        hashset;
        JVM INSTR monitorexit ;
        throw nbc1;
    }

    public final void b(nxb nxb1)
    {
        nbc nbc1;
        nbg nbg1;
        nbc1 = (nbc)nxb1;
        nbg1 = (nbg)((nxb) (nbc1)).g;
        if (((nxb) (nbc1)).m)
        {
            nxb1 = String.valueOf(nbg1);
            (new StringBuilder(String.valueOf(nxb1).length() + 29)).append("Deactivating image resource: ").append(nxb1);
        }
        if (((nxb) (nbc1)).i != 2)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        nbc1.i = 7;
        if (!nbc1.j)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        nbc1;
        JVM INSTR monitorenter ;
        nxb1 = nbc1.c;
        nbc1;
        JVM INSTR monitorexit ;
        if (nxb1 != null)
        {
            nxb1.h();
        }
        e.remove(nbg1);
        b(nbc1);
        boolean flag;
        if (nbc1.i == 5)
        {
            flag = false;
        } else
        if ((((nbg)nbc1.g).b & 0xa) != 0)
        {
            flag = false;
        } else
        if (nbc1.h instanceof Bitmap)
        {
            if (!nbc.n() || ((Bitmap)nbc1.h).getConfig() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        if (nbc1.h instanceof naw)
        {
            if (!nbc.n() || ((naw)nbc1.h).a.getConfig() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = true;
        }
_L6:
        if (!flag || nbc1.m() >= d) goto _L2; else goto _L1
_L1:
        if (nbc1.i == 1 && (((nbg)nbc1.g).b & 0x10) == 0 && ((nbc1.h instanceof Bitmap) || (nbc1.h instanceof naw)) && nbc.n()) goto _L4; else goto _L3
_L3:
        if (i == 0L || i < System.currentTimeMillis())
        {
            i = 0L;
            g.a(nbg1, nbc1);
        }
        return;
        nxb1;
        nbc1;
        JVM INSTR monitorexit ;
        throw nxb1;
_L4:
        android.graphics.Bitmap.Config config;
        int i1;
        int j1;
        if (nbc1.h instanceof Bitmap)
        {
            nxb1 = (Bitmap)nbc1.h;
            i1 = nxb1.getWidth();
            j1 = nxb1.getHeight();
        } else
        {
            naw naw1 = (naw)nbc1.h;
            nxb1 = naw1.a;
            i1 = naw1.b;
            j1 = naw1.c;
        }
        config = nxb1.getConfig();
        if (config != null)
        {
            try
            {
                nbh nbh1 = new nbh();
                nbh1.a = config;
                nbh1.d = nxb1.getWidth();
                nbh1.e = nxb1.getHeight();
                nbh1.b = i1;
                nbh1.c = j1;
                nbh1.f = nxb1.getRowBytes() * nxb1.getHeight();
                nbh1.g = ByteBuffer.allocate(nbh1.f);
                nxb1.copyPixelsToBuffer(nbh1.g);
                nbc1.a.a(nxb1);
                nbc1.h = nbh1;
                nbc1.i = 8;
            }
            // Misplaced declaration of an exception variable
            catch (nxb nxb1)
            {
                nbc1.i = 6;
            }
        }
        if (true) goto _L3; else goto _L2
_L2:
        nbc1.h();
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final int c()
    {
        return s;
    }

    public final myy d()
    {
        return j;
    }

    public final myy e()
    {
        return k;
    }

    public final int f()
    {
        return p;
    }

    public final int g()
    {
        return q;
    }

    public final int h()
    {
        return r;
    }

    public final android.graphics.Bitmap.Config i()
    {
        if (l < 64)
        {
            return android.graphics.Bitmap.Config.ARGB_4444;
        } else
        {
            return android.graphics.Bitmap.Config.ARGB_8888;
        }
    }

    public final long j()
    {
        return c.d;
    }

    public final long k()
    {
        return c.e;
    }

    public final void l()
    {
        if (!e.isEmpty() && b.w(super.b_))
        {
            Iterator iterator = e.values().iterator();
            while (iterator.hasNext()) 
            {
                nxb nxb1 = (nxb)iterator.next();
                if (nxb1.i == 4)
                {
                    a(nxb1, 2);
                    c(nxb1);
                }
            }
        }
    }

    public final float m()
    {
        return o;
    }

    public final void n()
    {
        g.a();
        i = System.currentTimeMillis() + 2000L;
        if (h != null)
        {
            h.c();
        }
    }
}
