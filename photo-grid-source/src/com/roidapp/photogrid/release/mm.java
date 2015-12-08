// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.roidapp.baselib.c.an;
import com.roidapp.baselib.c.p;
import com.roidapp.imagelib.d.b;
import com.roidapp.imagelib.filter.aa;
import com.roidapp.photogrid.common.az;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

// Referenced classes of package com.roidapp.photogrid.release:
//            mn, ih, an, ng, 
//            ml, ln, mp, ic, 
//            ig, mo, PhotoView, az

public abstract class mm
{

    protected List A;
    protected int B[];
    protected float C;
    protected PhotoView D;
    protected com.roidapp.photogrid.release.az E;
    protected boolean F;
    protected boolean G;
    protected boolean H;
    protected boolean I;
    protected int J;
    protected Handler K;
    private b L;
    protected final int a = 1;
    protected final int b = 2;
    protected final int c = 3;
    protected final int d = 4;
    protected final int e = 5;
    protected final int f = 6;
    protected final int g = 7;
    protected Activity h;
    public ig i[];
    protected ViewGroup j;
    protected RelativeLayout k;
    protected ml l;
    protected int m;
    protected int n;
    protected int o;
    protected LinearLayout p;
    protected com.roidapp.photogrid.release.an q;
    protected int r;
    protected int s;
    protected int t;
    protected int u;
    protected mp v;
    protected int w;
    protected int x;
    protected ArrayList y;
    protected List z;

    public mm()
    {
        y = new ArrayList();
        z = new ArrayList();
        A = new ArrayList();
        C = 1.0F;
        G = true;
        L = new b();
        K = new mn(this);
    }

    public static void a(Bitmap bitmap)
    {
        if (bitmap != null && !bitmap.isRecycled())
        {
            bitmap.recycle();
        }
    }

    private void a(String s1, float f1)
    {
        while (ih.C().t() == 1.0F && i != null && i.length == 1 && m == 0 || az.q == 9 || az.q == 10) 
        {
            return;
        }
        h.getPreferences(0).edit().putFloat(s1, f1).apply();
    }

    private void m()
    {
        if (ih.C().R() <= 0.0F && ih.C().S() <= 0.0F) goto _L2; else goto _L1
_L1:
        return;
_L2:
        az.q;
        JVM INSTR tableswitch 4 9: default 64
    //                   4 22
    //                   5 119
    //                   6 187
    //                   7 64
    //                   8 64
    //                   9 157;
           goto _L3 _L1 _L4 _L5 _L3 _L3 _L6
_L3:
        if (ih.C().W() == 4)
        {
            break; /* Loop/switch isn't completed */
        }
        if (r != 0)
        {
            ih.C().e(1.45F);
            a("OUTER_SPACE", 1.45F);
        } else
        {
            ih.C().e(0.64F);
            a("OUTER_SPACE", 0.64F);
        }
        ih.C().d(0.64F);
        a("INNER_SPACE", 0.64F);
_L8:
        c(2);
        return;
_L4:
        if (ih.C().W() == 2 || r != 0)
        {
            ih.C().e(1.45F);
        } else
        {
            ih.C().e(0.0F);
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (ih.C().ax())
        {
            ih.C().e(1.45F);
        } else
        {
            ih.C().e(0.0F);
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (ih.C().ax())
        {
            ih.C().e(1.45F);
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public abstract void a();

    public void a(int i1)
    {
        a(false);
        s = i1;
        ih.C().d(i1);
        if (q != null)
        {
            az.v = false;
            q.a(r, i1, t, u);
            if (az.q != 6)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            if (this instanceof ng)
            {
                ((ng)this).m();
            }
            c(2);
        }
_L1:
        m();
        return;
        try
        {
            q.a(false);
            q.b(false);
            q.invalidate();
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            outofmemoryerror.printStackTrace();
            d(181);
            return;
        }
          goto _L1
    }

    public void a(int i1, int j1)
    {
        a(false);
        t = i1;
        u = j1;
        s = -20;
        ih.C().d(s);
        ih.C().e(i1);
        ih.C().f(j1);
        if (q != null)
        {
            az.v = false;
            q.a(r, s, i1, j1);
            if (az.q != 6)
            {
                break MISSING_BLOCK_LABEL_105;
            }
            if (this instanceof ng)
            {
                ((ng)this).m();
            }
            c(2);
        }
_L1:
        m();
        return;
        try
        {
            q.a(false);
            q.b(false);
            q.invalidate();
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            outofmemoryerror.printStackTrace();
            d(182);
            return;
        }
          goto _L1
    }

    public void a(int i1, String s1)
    {
        l.sendEmptyMessage(15);
        Message message = Message.obtain();
        message.what = 21;
        message.arg1 = i1;
        message.obj = s1;
        l.sendMessage(message);
    }

    public final void a(int i1, boolean flag)
    {
        G = false;
        ih ih1 = ih.C();
        if (az.q == 5 && ih1.W() == 2)
        {
            ih1.b(1.0F);
            ih1.c(0);
        }
        ln.a().a(null);
        ih1.n(null);
        ih1.m(null);
        ih1.o(false);
        ih1.ai();
        ih1.k(0);
        ih1.g(0.0F);
        ih1.i(0.0F);
        ih1.h(0.0F);
        if (az.q == 4)
        {
            ih1.e(0.0F);
            ih1.d(0.0F);
            ih1.f(0.0F);
        }
        ih1.i(i1);
        ih1.m(flag);
        if (!flag)
        {
            ih1.r(i1);
        }
        m = i1;
    }

    public abstract void a(RelativeLayout relativelayout, android.view.View.OnTouchListener ontouchlistener);

    public final void a(mp mp1)
    {
        v = mp1;
    }

    public final void a(boolean flag)
    {
        ih.C().g(flag);
        if (az.q == 6)
        {
            if (flag)
            {
                a(4, 4);
                c(2);
            }
        } else
        {
            if (q != null)
            {
                q.c(flag);
                q.invalidate();
            }
            if (flag)
            {
                an.a(h, 0x7f07037d);
                return;
            }
        }
    }

    public void a(boolean flag, boolean flag1)
    {
    }

    public abstract int b(boolean flag);

    public abstract void b();

    public final void b(int i1)
    {
        boolean flag;
        boolean flag1 = false;
        try
        {
            a(false);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            outofmemoryerror.printStackTrace();
            d(183);
            return;
        }
        flag = flag1;
        if (r == i1) goto _L2; else goto _L1
_L1:
        if (r == 0) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (i1 != 0) goto _L2; else goto _L4
_L2:
        r = i1;
        if (q == null) goto _L6; else goto _L5
_L5:
        q.a(i1, s, t, u);
        q.a(false);
        if (!ih.C().be()) goto _L8; else goto _L7
_L7:
        q.b(true);
_L6:
        ih.C().g(i1);
        m();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        if (i == null || i.length != 1 || ih.C().S() > 0.0F) goto _L10; else goto _L9
_L9:
        if (i1 != 0) goto _L12; else goto _L11
_L11:
        ih.C().e(0.0F);
_L13:
        v.M();
        return;
_L8:
        q.b(false);
          goto _L6
_L12:
        ih.C().e(1.45F);
          goto _L13
_L10:
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        ih.C().e(0.64F);
        a("OUTER_SPACE", 0.64F);
          goto _L13
        ih.C().e(1.45F);
        a("OUTER_SPACE", 1.45F);
          goto _L13
        if (q != null)
        {
            q.invalidate();
            return;
        }
        break; /* Loop/switch isn't completed */
_L4:
        flag = true;
        if (true) goto _L2; else goto _L14
_L14:
    }

    public abstract void b(int i1, int j1);

    public abstract void b(int i1, boolean flag);

    public final void c()
    {
        int i1;
        int k1;
        i1 = -20;
        k1 = 2;
        Object obj;
        a(false);
        obj = new Random();
        if (((Random) (obj)).nextInt(2) != 0) goto _L2; else goto _L1
_L1:
        int j1;
        j1 = com.roidapp.baselib.c.p.a().i.length;
        j1 = com.roidapp.baselib.c.p.a().i[((Random) (obj)).nextInt(j1)];
          goto _L3
_L2:
        k1 = ((Random) (obj)).nextInt(com.roidapp.baselib.c.p.a().j.length - 1) % (com.roidapp.baselib.c.p.a().j.length - 2) + 2;
        i1 = ((Random) (obj)).nextInt(5);
        j1 = -20;
        continue; /* Loop/switch isn't completed */
_L5:
        try
        {
            obj = ih.C();
            ((ih) (obj)).u(q.c());
            ((ih) (obj)).u(s);
            ((ih) (obj)).v(t);
            ((ih) (obj)).w(u);
            s = j1;
            t = k1;
            u = i1;
            ((ih) (obj)).d(s);
            ((ih) (obj)).e(t);
            ((ih) (obj)).f(u);
            q.a(0, s, t, u);
            q.a(false);
            q.invalidate();
            return;
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            outofmemoryerror.printStackTrace();
        }
        d(184);
        return;
_L3:
        if (j1 != -1)
        {
            i1 = j1;
        }
        j1 = i1;
        i1 = 2;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public abstract void c(int i1);

    public abstract void c(int i1, int j1);

    protected final void d()
    {
        if (y != null && y.size() != 0)
        {
            Object obj = ih.C();
            ((ih) (obj)).s(m);
            ((ih) (obj)).t(((ih) (obj)).ay());
            ((ih) (obj)).l(((ih) (obj)).S());
            obj = new ArrayList();
            Iterator iterator = y.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ic ic1 = (ic)iterator.next();
                if (ic1 != null)
                {
                    ((List) (obj)).add(ic1.b);
                }
            } while (true);
            if (((List) (obj)).size() > 0)
            {
                ih.C().o(((List) (obj)));
                return;
            }
        }
    }

    public void d(int i1)
    {
        l.sendEmptyMessage(15);
        Message message = Message.obtain();
        message.what = 7;
        message.arg1 = i1;
        l.sendMessage(message);
    }

    protected final void e()
    {
        ih ih1 = ih.C();
        boolean flag = ih1.bb();
        az.C = flag;
        if (flag)
        {
            l.sendEmptyMessage(18);
            q.b();
            q.a(true);
            q.a(ih1.aB());
            q.invalidate();
            l.sendEmptyMessage(15);
            return;
        } else
        {
            s = ih1.aW();
            t = ih1.aX();
            u = ih1.aY();
            ih1.d(s);
            ih1.e(t);
            ih1.f(u);
            q.a(0, s, t, u);
            q.a(false);
            q.invalidate();
            return;
        }
    }

    public void e(int i1)
    {
    }

    public abstract void f();

    public void g()
    {
    }

    public void h()
    {
    }

    public void i()
    {
    }

    public void j()
    {
    }

    public final void k()
    {
        if (L != null)
        {
            L.a();
        }
    }

    public void l()
    {
label0:
        {
label1:
            {
                if (!ih.C().be())
                {
                    break label0;
                }
                int i1 = ih.C().bd() / 5;
                String s1;
                Bitmap bitmap;
                Object obj;
                if (i[0].b != null)
                {
                    s1 = i[0].b;
                } else
                {
                    s1 = i[0].n;
                }
                obj = null;
                bitmap = obj;
                if (!aa.a().g())
                {
                    break label1;
                }
                if (az.q != 5 && az.q != 10)
                {
                    bitmap = obj;
                    if (az.q != 9)
                    {
                        break label1;
                    }
                }
                bitmap = obj;
                if (y.size() > 0)
                {
                    bitmap = ((ic)y.get(0)).a;
                }
            }
            L.a(s1, bitmap, i1 + 1, new mo(this));
            return;
        }
        q.b(false);
        q.a(r, s, t, u);
        q.invalidate();
    }
}
