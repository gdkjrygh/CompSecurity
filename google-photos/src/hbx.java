// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.List;

public final class hbx extends agj
    implements hqp, iwe, opp, opr, opv
{

    public final eno a;
    private final nug b = new hby(this);
    private final hgz c;
    private final hce d;
    private final enu e;
    private final hcb f;
    private final TimeInterpolator g;
    private final Drawable h = null;
    private final int i;
    private final int j;
    private final int k[] = new int[2];
    private final RecyclerView l;
    private afn m;
    private View n;
    private View o;
    private boolean p;
    private int q;
    private float r;
    private hqv s;
    private int t;
    private int u;

    public hbx(Context context, opd opd1, RecyclerView recyclerview, hgz hgz1, hce hce1, eno eno1, enu enu1)
    {
        c = hgz1;
        d = hce1;
        a = eno1;
        e = enu1;
        l = recyclerview;
        t = 0x80000000;
        f = new hcb(recyclerview, null);
        f.a(b.vi);
        g = b.d(context);
        i = context.getResources().getDimensionPixelSize(b.vj);
        j = context.getResources().getDimensionPixelSize(b.vk);
        ((enu)olm.a(context, enu)).a.a(b, true);
        s = (hqv)olm.a(context, hqv);
        opd1.a(this);
    }

    static hcb a(hbx hbx1)
    {
        return hbx1.f;
    }

    static eno b(hbx hbx1)
    {
        return hbx1.a;
    }

    static hce c(hbx hbx1)
    {
        return hbx1.d;
    }

    public final int a()
    {
        return 0xf000f;
    }

    public final int a(RecyclerView recyclerview, int i1, int j1, long l1)
    {
        return 0;
    }

    public final afn a(afn afn1, List list, int i1, int j1)
    {
        if (list.isEmpty())
        {
            return null;
        } else
        {
            return (afn)list.get(0);
        }
    }

    public final void a(float f1, float f2)
    {
        u = (int)f2;
    }

    public final void a(afn afn1, int i1)
    {
        int j1;
        j1 = 1;
        super.a(afn1, i1);
        i1;
        JVM INSTR tableswitch 0 2: default 36
    //                   0 585
    //                   1 36
    //                   2 37;
           goto _L1 _L2 _L1 _L3
_L1:
        return;
_L3:
        m = afn1;
        n = afn1.a;
        Object obj1 = n;
        float f1 = (float)j / (float)Math.max(((View) (obj1)).getHeight(), ((View) (obj1)).getWidth());
        mk.d(((View) (obj1)), 1.0F);
        r = ((View) (obj1)).getScaleX();
        Object obj = (fqw)obj1;
        if (f1 < ((View) (obj1)).getScaleX() && ((fqw) (obj)).d())
        {
            ((View) (obj1)).animate().scaleX(f1).scaleY(f1).setDuration(250L).setInterpolator(g).setListener(null).start();
        }
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            obj1 = ((fqw) (obj)).c();
            if (((fqw) (obj)).e())
            {
                ((View) (obj1)).setBackgroundDrawable(null);
            }
            ((View) (obj1)).animate().translationZ(i).setDuration(250L).setInterpolator(g).setListener(null).start();
        }
        obj = a;
        Object obj2 = n;
        obj1 = (fqw)obj2;
        Object obj3 = ((fqw) (obj1)).c();
        j1 = Math.round((float)((View) (obj3)).getWidth() * ((View) (obj3)).getScaleX());
        i1 = Math.round((float)((View) (obj3)).getHeight() * ((View) (obj3)).getScaleY());
        f1 = ((View) (obj2)).getX();
        j1 = Math.round((float)((((View) (obj3)).getWidth() - j1) / 2) + f1);
        i1 = Math.round(((View) (obj2)).getY() + (float)((((View) (obj3)).getHeight() - i1) / 2));
        obj3 = ((fqw) (obj1)).a();
        obj2 = new Rect();
        obj2.left = j1 + Math.round(((RectF) (obj3)).left + ((fqw) (obj1)).b().x);
        f1 = ((RectF) (obj3)).top;
        obj2.top = Math.round(((fqw) (obj1)).b().y + f1) + i1;
        obj2.right = ((Rect) (obj2)).left + Math.round(((RectF) (obj3)).right - ((RectF) (obj3)).left);
        obj2.bottom = ((Rect) (obj2)).top + Math.round(((RectF) (obj3)).bottom - ((RectF) (obj3)).top);
        obj = ((eno) (obj)).c;
        if (((enp) (obj)).e == null)
        {
            obj.e = (GradientDrawable)((enp) (obj)).a.getResources().getDrawable(b.mg);
        }
        if (!((enp) (obj)).e.isVisible())
        {
            ((enp) (obj)).e.setVisible(true, false);
            ((enp) (obj)).e.setAlpha(255);
        }
        ((enp) (obj)).e.setBounds(((Rect) (obj2)));
        d.d = afn1;
        q = afn1.e();
        afn1 = e;
        obj = n;
        if (!((enu) (afn1)).c || ((enu) (afn1)).b != obj)
        {
            afn1.c = true;
            afn1.b = ((View) (obj));
            afn1.b();
            return;
        }
          goto _L1
_L2:
        a.a();
        d.d = null;
        View view;
        if (t == 0x80000001)
        {
            p = false;
            a.b();
        } else
        if (t != 0x80000000)
        {
            if (q < t)
            {
                t = t - 1;
            }
            d.e = m;
            c.a(q, t);
            l.a(t);
            p = true;
            a.b();
        }
        view = n;
        if (!p)
        {
            i1 = j1;
        } else
        {
            i1 = 0;
        }
        mk.d(view, 0.0F);
        afn1 = (fqw)view;
        if (i1 != 0 && Math.abs(view.getScaleX() - 1.0F) > 1E-04F && afn1.d())
        {
            view.animate().scaleX(r).scaleY(r).setDuration(250L).setInterpolator(g).setListener(null).start();
        }
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            View view1 = afn1.c();
            view1.animate().translationZ(0.0F).setDuration(250L).setInterpolator(g).setListener(new hca(this, afn1, view1)).start();
        }
        d.c = new hbz(this);
        afn1 = e;
        if (((enu) (afn1)).c)
        {
            afn1.c = false;
            afn1.b = null;
            afn1.b();
        }
        o = n;
        n = null;
        m = null;
        q = -1;
        t = 0x80000000;
        return;
    }

    public final void a(Canvas canvas, RecyclerView recyclerview, afn afn1, float f1, float f2, int i1, boolean flag)
    {
        if (!p || afn1.a != o || flag)
        {
            super.a(canvas, recyclerview, afn1, f1, f2, i1, flag);
            afn1.a.getLocationOnScreen(k);
            if (afn1.a == n && k[1] < u)
            {
                afn1.a.setTranslationY(afn1.a.getTranslationY() + (float)(u - k[1]));
                return;
            }
        }
    }

    public final boolean a(MotionEvent motionevent)
    {
        boolean flag1 = true;
        motionevent.getAction();
        JVM INSTR tableswitch 2 2: default 24
    //                   2 34;
           goto _L1 _L2
_L1:
        f.a(motionevent);
_L4:
        return false;
_L2:
        if (n == null) goto _L4; else goto _L3
_L3:
        Object obj;
        int i1;
        float f1;
        float f2;
        PointF pointf;
        boolean flag;
        if (t != 0x80000001)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        pointf = ((fqw)n).f();
        obj = a;
        i1 = q;
        f1 = pointf.x;
        f2 = pointf.y;
        i1 = ((eno) (obj)).b.a(i1, f1, f2, ((eno) (obj)).e);
        if (i1 != 0x80000001) goto _L6; else goto _L5
_L5:
        obj = ((eno) (obj)).c;
        if (((enp) (obj)).d != null)
        {
            ((enp) (obj)).d.setVisible(false, false);
        }
_L7:
        t = i1;
        if (t == 0x80000001)
        {
            flag1 = false;
        }
        if (flag1 != flag)
        {
            obj = a;
            enp enp1;
            if (flag1)
            {
                obj = ((eno) (obj)).c;
                ((enp) (obj)).e.setColor(((enp) (obj)).b);
                ((enp) (obj)).e.invalidateSelf();
            } else
            {
                obj = ((eno) (obj)).c;
                ((enp) (obj)).e.setColor(((enp) (obj)).c);
                ((enp) (obj)).e.invalidateSelf();
            }
        }
        if (true) goto _L1; else goto _L6
_L6:
        if (i1 != 0x80000000)
        {
            enp1 = ((eno) (obj)).c;
            obj = ((eno) (obj)).e;
            if (enp1.d == null)
            {
                enp1.d = enp1.a.getResources().getDrawable(b.mf);
            }
            if (!enp1.d.isVisible())
            {
                enp1.d.setVisible(true, false);
            }
            enp1.d.setBounds(((Rect) (obj)));
        }
          goto _L7
    }

    public final void al_()
    {
        s.a(this);
    }

    public final void am_()
    {
        s.b(this);
    }

    public final void b(RecyclerView recyclerview, afn afn1)
    {
        if (p && afn1.a == o)
        {
            return;
        } else
        {
            super.b(recyclerview, afn1);
            return;
        }
    }

    public final boolean c()
    {
        return false;
    }

    public final boolean d()
    {
        eno eno1 = a;
        return eno1.a.b && !eno1.d.a;
    }

    public final boolean e()
    {
        return false;
    }

    public final void i()
    {
    }
}
