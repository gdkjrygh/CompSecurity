// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.assistant.cardui;

import ame;
import amh;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import ayt;
import azh;
import c;
import ds;
import dvs;
import dvt;
import dvu;
import dvv;
import dvw;
import ekp;
import elt;
import euv;
import fli;
import flk;
import gaf;
import hrc;
import hrd;
import mjw;
import nud;
import nug;
import nwm;
import nwn;
import olm;

public final class CardPhotoView extends ImageView
{

    public int a;
    public int b;
    public int c;
    public ekp d;
    public mjw e;
    private hrd f;
    private Drawable g;
    private nwn h;
    private ame i;
    private ame j;
    private amh k;
    private nwm l;
    private ds m;
    private boolean n;
    private int o;
    private hrc p;
    private int q;
    private final azh r;
    private final nug s;

    public CardPhotoView(Context context)
    {
        super(context);
        l = (nwm)olm.a(getContext(), nwm);
        m = new dvs(this);
        r = new dvt(this, this);
        s = new dvu(this);
        a(context);
    }

    public CardPhotoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        l = (nwm)olm.a(getContext(), nwm);
        m = new dvs(this);
        r = new dvt(this, this);
        s = new dvu(this);
        a(context);
    }

    public CardPhotoView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        l = (nwm)olm.a(getContext(), nwm);
        m = new dvs(this);
        r = new dvt(this, this);
        s = new dvu(this);
        a(context);
    }

    public static Drawable a(CardPhotoView cardphotoview, Drawable drawable)
    {
        cardphotoview.g = drawable;
        return drawable;
    }

    public static hrc a(CardPhotoView cardphotoview, hrc hrc1)
    {
        cardphotoview.p = hrc1;
        return hrc1;
    }

    private void a(Context context)
    {
        k = (amh)olm.a(context, amh);
        h = (nwn)olm.a(getContext(), nwn);
        f = (hrd)olm.a(context, hrd);
        o = ((flk)olm.a(getContext(), flk)).c();
        a();
        setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
    }

    public static void a(CardPhotoView cardphotoview)
    {
label0:
        {
            if (cardphotoview.l != null && cardphotoview.g != null && (cardphotoview.g instanceof Animatable))
            {
                if (cardphotoview.h == null || cardphotoview.l.b() != cardphotoview.h.u())
                {
                    break label0;
                }
                ((Animatable)cardphotoview.g).start();
            }
            return;
        }
        ((Animatable)cardphotoview.g).stop();
    }

    public static void a(CardPhotoView cardphotoview, ekp ekp1)
    {
        cardphotoview.a(ekp1);
    }

    public static boolean a(CardPhotoView cardphotoview, boolean flag)
    {
        cardphotoview.n = true;
        return true;
    }

    public static ekp b(CardPhotoView cardphotoview)
    {
        return cardphotoview.d;
    }

    public static boolean b(CardPhotoView cardphotoview, ekp ekp1)
    {
        if (cardphotoview.q == dvv.a)
        {
            ekp1 = (gaf)ekp1.b(gaf);
            if (ekp1 == null || cardphotoview.g == null)
            {
                return true;
            }
            if ((float)cardphotoview.g.getIntrinsicWidth() * 2.0F <= (float)ekp1.k() || (float)cardphotoview.g.getIntrinsicHeight() * 2.0F <= (float)ekp1.l())
            {
                return true;
            }
        }
        return false;
    }

    private boolean b(ekp ekp1)
    {
label0:
        {
            ekp1 = (gaf)ekp1.b(gaf);
            if (ekp1 != null)
            {
                int i1 = ekp1.k();
                int j1 = ekp1.l();
                if (i1 > o || j1 > o)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (!i1)
                {
                    break label0;
                }
            }
            return true;
        }
        return false;
    }

    public static int c(CardPhotoView cardphotoview)
    {
        return cardphotoview.q;
    }

    public static boolean c(CardPhotoView cardphotoview, ekp ekp1)
    {
        return ekp1.c() == euv.e;
    }

    public static hrc d(CardPhotoView cardphotoview)
    {
        return cardphotoview.p;
    }

    public static boolean e(CardPhotoView cardphotoview)
    {
        return cardphotoview.n;
    }

    public void a()
    {
        Object obj = getResources().getDrawable(c.ck);
        fli fli1 = (fli)olm.a(getContext(), fli);
        ayt ayt2 = (ayt)ayt.c(((Drawable) (obj))).b(((Drawable) (obj)));
        ayt ayt1 = fli1.c();
        obj = ayt1;
        if (e != null)
        {
            obj = (ayt)ayt1.a(fli1.a(), e);
        }
        i = k.g().a(((aym) (obj))).a(ayt2);
        obj = fli1.d();
        if (e != null)
        {
            obj = (ayt)((ayt) (obj)).a(fli1.a(), e);
        }
        j = k.g().a(((aym) (obj))).a(ayt2);
    }

    public void a(ekp ekp1)
    {
        gap gap = ((elt)ekp1.a(elt)).e();
        n = false;
        if (p != hrc.c)
        {
            int i1;
            if (b(ekp1))
            {
                i1 = dvv.a;
            } else
            {
                i1 = dvv.c;
            }
            q = i1;
            j.a(gap).a(r);
            return;
        }
        int j1;
        if (b(ekp1))
        {
            j1 = dvv.b;
        } else
        {
            j1 = dvv.c;
        }
        q = j1;
        ekp1 = i.a(gap);
        ekp1.b = j;
        ekp1.a(r);
    }

    public final void b()
    {
        d = null;
        setImageDrawable(null);
        k.a(r);
    }

    protected final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        f.a.a(s, false);
        p = f.b;
        if (d != null)
        {
            a(d);
            l.a().a(m, true);
        }
    }

    protected final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        k.a(r);
        l.a().a(m);
        f.a.a(s);
    }

    protected final void onMeasure(int i1, int j1)
    {
        if (a == dvw.b)
        {
            i1 = android.view.View.MeasureSpec.getSize(i1);
            j1 = Math.min(i1, (int)(((float)i1 / (float)b) * (float)c));
            setMeasuredDimension(android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000));
            return;
        }
        if (a == dvw.a)
        {
            super.onMeasure(i1, i1);
            return;
        } else
        {
            super.onMeasure(i1, j1);
            return;
        }
    }
}
