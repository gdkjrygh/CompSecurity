// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.roidapp.photogrid.a.m;
import com.roidapp.photogrid.common.a;
import com.roidapp.photogrid.common.aj;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.release:
//            mm, ih, PhotoView, ao, 
//            PhotoGridActivity, az, ra, ml, 
//            qz, rf, ps, lc, 
//            hv, an, mr, ig

public final class mq extends mm
{

    private ArrayList L;

    public mq(boolean flag, Activity activity, ig aig[], ml ml1, PhotoView photoview, com.roidapp.photogrid.release.az az1)
    {
        float f1;
        f1 = 1.0F;
        super();
        L = new ArrayList();
        F = flag;
        h = activity;
        this.i = aig;
        l = ml1;
        D = photoview;
        E = az1;
        activity.getWindow().setFormat(-1);
        activity = ih.C();
        if (!flag) goto _L2; else goto _L1
_L1:
        float f2;
        activity.g(false);
        activity.d(true);
        activity.c(0);
        activity.b(1.0F);
        activity.e(false);
        activity.f(false);
        activity.i(0);
        x = h.getResources().getDisplayMetrics().heightPixels;
        w = h.getResources().getDisplayMetrics().widthPixels;
        if (x < w)
        {
            int i = x;
            x = w;
            w = i;
        }
        f2 = h.getResources().getDimension(0x7f0900dd);
        float f3 = x;
        float f4 = az.g;
        f2 = (float)w / (f3 - f2 - f4);
        if (0.75F >= f2 || f2 > 1.0F) goto _L4; else goto _L3
_L3:
        ih.C().b(f1);
_L2:
        if (activity.w() != null)
        {
            z = activity.w();
        }
        s = activity.x();
        t = activity.y();
        u = activity.z();
        A = activity.m();
        switch (this.i.length)
        {
        default:
            return;

        case 1: // '\001'
            B = aj.a().q;
            return;

        case 2: // '\002'
            B = aj.a().r;
            return;

        case 3: // '\003'
            B = aj.a().s;
            return;

        case 4: // '\004'
            B = aj.a().t;
            return;

        case 5: // '\005'
            B = aj.a().u;
            return;

        case 6: // '\006'
            B = aj.a().v;
            return;

        case 7: // '\007'
            B = aj.a().w;
            return;

        case 8: // '\b'
            B = aj.a().x;
            return;

        case 9: // '\t'
            B = aj.a().y;
            break;
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (0.7142857F < f2 && f2 <= 0.75F)
        {
            f1 = 0.75F;
        } else
        if (0.6666667F < f2 && f2 <= 0.7142857F)
        {
            f1 = 0.7142857F;
        } else
        if (0.6F < f2 && f2 <= 0.6666667F)
        {
            f1 = 0.6666667F;
        } else
        if (0.5625F < f2 && f2 <= 0.6F)
        {
            f1 = 0.6F;
        } else
        if (f2 <= 0.5625F)
        {
            f1 = 0.5625F;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    static ArrayList a(mq mq1)
    {
        return mq1.L;
    }

    private void m()
    {
        Iterator iterator1;
        int i;
        if (z != null && z.size() > 0)
        {
            if (D.e().size() == 0)
            {
                ao ao1;
                for (Iterator iterator = z.iterator(); iterator.hasNext(); D.a(ao1))
                {
                    ao1 = (ao)iterator.next();
                    ao1.f = false;
                }

                ((PhotoGridActivity)h).i();
            }
            z.clear();
        } else
        {
            ((PhotoGridActivity)h).i();
        }
        if (A != null && A.size() > 0)
        {
            if (E != null && E.a().size() == 0)
            {
                E.a().addAll(A);
            }
            A.clear();
        }
        iterator1 = D.e().iterator();
        i = 0;
        while (iterator1.hasNext()) 
        {
            Object obj = (ao)iterator1.next();
            if (obj instanceof ra)
            {
                ra ra1 = (ra)obj;
                float f1 = ra1.j;
                float f2 = ra1.k;
                float f3 = (float)j.getLayoutParams().width / (float)ra1.c;
                float f4 = (float)j.getLayoutParams().height / (float)ra1.d;
                ra1.c = j.getLayoutParams().width;
                ra1.d = j.getLayoutParams().height;
                ra1.i();
                ra1.b(-f1, -f2);
                ra1.b(ra1.h * f3, ra1.l, f1 * f3, f4 * f2);
                ((ra)obj).j();
                obj.f = false;
            } else
            if (obj instanceof qz)
            {
                obj = (qz)obj;
                if (((qz) (obj)).c > 0 && ((qz) (obj)).d > 0)
                {
                    obj.j = ((qz) (obj)).j * ((float)j.getLayoutParams().width / (float)((qz) (obj)).c);
                    obj.k = ((qz) (obj)).k * ((float)j.getLayoutParams().height / (float)((qz) (obj)).d);
                }
                obj.c = j.getLayoutParams().width;
                obj.d = j.getLayoutParams().height;
                ((qz) (obj)).g();
            }
            l.a(i + 21, 0);
            i++;
        }
    }

    private void n()
    {
        if (D.f().size() != this.i.length)
        {
            D.i();
            com.roidapp.photogrid.release.rf.a();
            lc alc[] = com.roidapp.photogrid.release.rf.a(h, B[m], this.i.length);
            boolean flag = ih.C().aD();
            for (int i = 0; i < this.i.length; i++)
            {
                ps ps1 = new ps(h);
                ps1.a(flag);
                ps1.c = this.j.getLayoutParams().width;
                ps1.d = this.j.getLayoutParams().height;
                lc lc1 = alc[i];
                ps1.I = lc1;
                ps1.H = this.i[i];
                int j = lc1.o;
                float f1 = ps1.l;
                ps1.l = (float)j + f1;
                f1 = ps1.m;
                ps1.m = (float)lc1.o + f1;
                ps1.u = -1F;
                D.a(ps1);
            }

        }
        ps ps2;
        for (Iterator iterator = D.f().iterator(); iterator.hasNext(); L.add(new hv(w, w, ps2.H)))
        {
            ps2 = (ps)(ao)iterator.next();
        }

    }

    public final void a()
    {
        float f1;
        float f2;
        float f3;
        float f4;
        float f5;
        Object obj;
        int l;
        this.l.a(10, 0);
        f2 = ih.C().t();
        x = h.getResources().getDisplayMetrics().heightPixels;
        w = h.getResources().getDisplayMetrics().widthPixels;
        if (x < w)
        {
            int i = x;
            x = w;
            w = i;
        }
        f3 = h.getResources().getDimension(0x7f0900dd);
        f4 = h.getResources().getDimension(0x7f090058);
        f1 = h.getResources().getDimension(0x7f090057);
        f5 = h.getResources().getDimension(0x7f0900cb);
        int j = az.g;
        l = (int)((float)x - f3 - (float)az.g - f5);
        obj = h.findViewById(0x7f0d0085);
        if (!ih.C().r()) goto _L2; else goto _L1
_L1:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        ((View) (obj)).setVisibility(8);
        int k = w;
_L13:
        this.j = (ViewGroup)LayoutInflater.from(h).inflate(0x7f03000b, null);
        obj = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        obj.width = k;
        obj.height = l;
        this.j.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        obj = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        obj.width = k;
        obj.height = l;
        if (D != null)
        {
            D.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        }
        if (E != null)
        {
            E.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        }
        this.k = (RelativeLayout)this.j.findViewById(0x7f0d0061);
        obj = this.k.getLayoutParams();
        obj.width = k;
        obj.height = l;
        az.p = ((android.view.ViewGroup.LayoutParams) (obj)).height;
        az.o = ((android.view.ViewGroup.LayoutParams) (obj)).width;
        this.k.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        this.k.removeAllViews();
        p = (LinearLayout)this.j.findViewById(0x7f0d0060);
        p.removeAllViews();
        this.l.a(12, 0);
        if (q != null) goto _L4; else goto _L3
_L3:
        n = this.j.getLayoutParams().width;
        o = this.j.getLayoutParams().height;
        obj = ih.C().aB();
        if (obj != null) goto _L6; else goto _L5
_L5:
        az.C = false;
        ih.C().v(false);
_L15:
        if (!az.C)
        {
            break MISSING_BLOCK_LABEL_891;
        }
        q = new an(h, n, o, ((String) (obj)));
        q.b();
        q.a(true);
        q.b(false);
_L4:
        this.l.a(20, 0);
        m();
        this.l.a(30, 0);
        n();
        this.l.a(35, 0);
        (new Thread(new mr(this))).start();
        return;
_L2:
        if (obj == null) goto _L8; else goto _L7
_L7:
        com.roidapp.photogrid.common.a.a();
        if (!com.roidapp.photogrid.common.a.a(h, "free", true) || com.roidapp.photogrid.a.m.a(h) == 1) goto _L10; else goto _L9
_L9:
        if (az.B) goto _L12; else goto _L11
_L11:
        ((View) (obj)).setVisibility(0);
        if (h instanceof PhotoGridActivity)
        {
            PhotoGridActivity photogridactivity = (PhotoGridActivity)h;
            if (photogridactivity.F)
            {
                photogridactivity.F = false;
                photogridactivity.C();
            }
        }
_L8:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_829;
        }
        if (((View) (obj)).getVisibility() != 0)
        {
            break MISSING_BLOCK_LABEL_829;
        }
        obj = ((View) (obj)).findViewById(0x7f0d0086);
        if (obj != null)
        {
            try
            {
                k = ((View) (obj)).getLayoutParams().height;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((OutOfMemoryError) (obj)).printStackTrace();
                d(142);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((Exception) (obj)).printStackTrace();
                d(142);
                com.roidapp.photogrid.common.c.a(K, ((Throwable) (obj)));
                return;
            }
            if (k > 0)
            {
                f1 = k;
            }
        }
_L14:
        l = (int)((float)x - f3 - f4 - f1 - f5 - (float)az.g);
        if (f2 >= (float)w / (float)l)
        {
            break MISSING_BLOCK_LABEL_834;
        }
        k = (int)((float)l * f2);
          goto _L13
_L12:
        ((View) (obj)).setVisibility(8);
          goto _L8
_L10:
        ((View) (obj)).setVisibility(8);
          goto _L8
        f1 = 0.0F;
          goto _L14
        k = w;
        l = (int)((float)k / f2);
          goto _L13
_L6:
        com.roidapp.photogrid.release.rf.a();
        if (!com.roidapp.photogrid.release.rf.a(((String) (obj))))
        {
            az.C = false;
            ih.C().v(false);
            ih.C().h(null);
            ih.C().i(null);
        }
          goto _L15
        q = new an(h, n, o);
        q.b();
        q.a(0, s, t, u);
        q.a(false);
        q.b(false);
          goto _L4
    }

    public final void a(RelativeLayout relativelayout, android.view.View.OnTouchListener ontouchlistener)
    {
        if (H)
        {
            return;
        }
        if (q != null && p != null && p.getChildCount() == 0)
        {
            p.removeAllViews();
            ontouchlistener = (ViewGroup)q.getParent();
            if (ontouchlistener != null)
            {
                ontouchlistener.removeAllViews();
            }
            p.addView(q);
        }
        this.l.a(80, 0);
        if (!ih.C().aM()) goto _L2; else goto _L1
_L1:
label0:
        {
            ih.C().r(false);
            ontouchlistener = D.f();
            int i = 0;
            do
            {
                if (i >= ontouchlistener.size())
                {
                    break label0;
                }
                ao ao1 = (ao)ontouchlistener.get(i);
                Object obj = (ps)ao1;
                Object obj2 = (NinePatchDrawable)h.getResources().getDrawable(0x7f0205c8);
                ig ig2 = ((ps) (obj)).H;
                ((ps) (obj)).a(((NinePatchDrawable) (obj2)));
                obj = ig2.d();
                obj2 = ((hv)L.get(i)).a;
                if (obj2 == null)
                {
                    break;
                }
                ao1.g = ((String) (obj));
                ((ps)ao1).a(((Bitmap) (obj2)), false);
                ao1.f = false;
                i++;
            } while (true);
            ontouchlistener = Message.obtain();
            ontouchlistener.what = 703;
            ontouchlistener.obj = this.i[i].n;
            K.sendMessage(ontouchlistener);
        }
_L4:
        ontouchlistener = (ViewGroup)D.getParent();
        if (ontouchlistener != null)
        {
            ontouchlistener.removeAllViews();
        }
        if (this.k == null)
        {
            com.roidapp.photogrid.common.c.a("191", h);
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        int j;
        ontouchlistener = D.f().iterator();
        j = 0;
_L5:
        while (ontouchlistener.hasNext()) 
        {
            Object obj1 = (ao)ontouchlistener.next();
            Bitmap bitmap = ((hv)L.get(j)).a;
            if (bitmap != null)
            {
                obj1 = (ps)obj1;
                ig ig1 = ((ps) (obj1)).H;
                obj1.g = ((hv)L.get(j)).d;
                if (((ps) (obj1)).h() == null)
                {
                    ((ps) (obj1)).a((NinePatchDrawable)h.getResources().getDrawable(0x7f0205c8));
                }
                if (ig1.z)
                {
                    ig1.z = false;
                    obj1.u = -1F;
                }
                int k = this.j.getLayoutParams().width;
                int l = this.j.getLayoutParams().height;
                if (((ps) (obj1)).u == -1F)
                {
                    float f1;
                    float f2;
                    float f3;
                    float f4;
                    if (bitmap.getHeight() > bitmap.getWidth())
                    {
                        f1 = ((((ps) (obj1)).I.n * (float)((ps) (obj1)).d) / ((float)bitmap.getHeight() + 16F * ((ps) (obj1)).i)) * (float)(bitmap.getHeight() / bitmap.getWidth() / 10 + 1);
                    } else
                    {
                        f1 = ((((ps) (obj1)).I.n * (float)((ps) (obj1)).c) / ((float)bitmap.getWidth() + 16F * ((ps) (obj1)).i)) * (float)(bitmap.getWidth() / bitmap.getHeight() / 10 + 1);
                    }
                    obj1.u = f1;
                    obj1.h = f1;
                } else
                if (((ps) (obj1)).c != k || ((ps) (obj1)).d != l)
                {
                    obj1.h = ((float)k / (float)w) * ((ps) (obj1)).u;
                }
                f1 = (float)k / (float)((ps) (obj1)).c;
                f2 = (float)l / (float)((ps) (obj1)).d;
                f3 = ((ps) (obj1)).j;
                f4 = ((ps) (obj1)).k;
                obj1.j = 0.0F;
                obj1.k = 0.0F;
                ((ps) (obj1)).b(f1 * f3, f2 * f4);
                obj1.c = k;
                obj1.d = l;
                ((ps) (obj1)).a(bitmap, false);
                obj1.f = false;
            }
            j++;
        }
        if (true) goto _L4; else goto _L3
_L3:
        this.k.addView(D);
        ontouchlistener = (ViewGroup)E.getParent();
        if (ontouchlistener != null)
        {
            ontouchlistener.removeView(E);
        }
        this.k.addView(E);
        ontouchlistener = (android.widget.RelativeLayout.LayoutParams)relativelayout.getLayoutParams();
        ontouchlistener.setMargins(0, 0, 0, (int)h.getResources().getDimension(0x7f09010a));
        relativelayout.setLayoutParams(ontouchlistener);
        relativelayout.removeAllViews();
        relativelayout.addView(this.j);
        return;
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public final int b(boolean flag)
    {
        return 0;
    }

    public final void b()
    {
        H = true;
        if (j != null)
        {
            j.removeAllViews();
        }
        if (L == null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist = L;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator = L.iterator();
_L4:
        hv hv1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_76;
            }
            hv1 = (hv)iterator.next();
        } while (hv1 == null);
        hv1.b();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
        L.clear();
        arraylist;
        JVM INSTR monitorexit ;
_L2:
    }

    public final void b(int i, int j)
    {
    }

    public final void b(int i, boolean flag)
    {
    }

    public final void c(int i)
    {
    }

    public final void c(int i, int j)
    {
    }

    public final void c(boolean flag)
    {
        if (D != null)
        {
            for (Iterator iterator = D.f().iterator(); iterator.hasNext(); ((ps)(ao)iterator.next()).b(flag)) { }
            D.invalidate();
        }
    }

    public final void f()
    {
        if (A == null)
        {
            A = new ArrayList();
        }
        if (D != null)
        {
            if (z == null)
            {
                z = new ArrayList();
            }
            z.addAll(D.e());
            ih.C().j(z);
        }
        if (E != null && E.a().size() > 0)
        {
            A.addAll(E.a());
            ih.C().e(A);
            E.a().clear();
        }
    }
}
