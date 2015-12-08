// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.material.butterfly;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import mkp;
import mkq;
import mkr;
import mkz;
import mlc;
import mle;
import mlf;
import mlg;
import mlh;
import mli;
import mll;
import mlm;

public class ButterflyView extends ViewGroup
{

    public mlc a;
    public AnimatorSet b;
    public HashMap c;
    private final android.animation.Animator.AnimatorListener d;
    private HashMap e;
    private int f;
    private int g;

    public ButterflyView(Context context)
    {
        this(context, null);
    }

    public ButterflyView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ButterflyView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        d = new mle(this);
    }

    public static int a(ButterflyView butterflyview)
    {
        return butterflyview.f;
    }

    private Animator a(mlg mlg1, mkq mkq1)
    {
        HashSet hashset;
        Iterator iterator;
        hashset = new HashSet(mkq1.g.size());
        iterator = mkq1.g.iterator();
_L10:
        mkp mkp1;
        ArrayList arraylist;
        Iterator iterator1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        mkp1 = (mkp)iterator.next();
        arraylist = new ArrayList();
        iterator1 = mkp1.d.iterator();
_L7:
        mkz mkz1;
        if (!iterator1.hasNext())
        {
            break MISSING_BLOCK_LABEL_431;
        }
        mkz1 = (mkz)iterator1.next();
        mkp1.a;
        JVM INSTR tableswitch 0 3: default 128
    //                   0 390
    //                   1 169
    //                   2 258
    //                   3 347;
           goto _L1 _L2 _L3 _L4 _L5
_L2:
        break MISSING_BLOCK_LABEL_390;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        mkq1 = null;
_L8:
        mkq1.setDuration(Math.round((double)mkp1.c * mkz1.a));
        mkq1.setInterpolator(mkz1.b);
        arraylist.add(mkq1);
        if (true) goto _L7; else goto _L6
_L6:
        mll mll1 = (mll)mkz1.c;
        mll mll3 = (mll)mkz1.d;
        mkq1 = new AnimatorSet();
        mkq1.play(ObjectAnimator.ofFloat(mlg1, "x", new float[] {
            mll1.a, mll3.a
        })).with(ObjectAnimator.ofFloat(mlg1, "y", new float[] {
            mll1.b, mll3.b
        }));
          goto _L8
_L4:
        mll mll2 = (mll)mkz1.c;
        mll mll4 = (mll)mkz1.d;
        mkq1 = new AnimatorSet();
        mkq1.play(ObjectAnimator.ofFloat(mlg1, "scaleX", new float[] {
            mll2.a, mll4.a
        })).with(ObjectAnimator.ofFloat(mlg1, "scaleY", new float[] {
            mll2.b, mll4.b
        }));
          goto _L8
_L5:
        mkq1 = ObjectAnimator.ofFloat(mlg1, "rotation", new float[] {
            (float)((Integer)mkz1.c).intValue(), (float)((Integer)mkz1.d).intValue()
        });
          goto _L8
        mkq1 = ObjectAnimator.ofFloat(mlg1, "alpha", new float[] {
            ((Float)mkz1.c).floatValue(), ((Float)mkz1.d).floatValue()
        });
          goto _L8
        mkq1 = new AnimatorSet();
        mkq1.setStartDelay(mkp1.b);
        mkq1.playSequentially(arraylist);
        hashset.add(mkq1);
        if (true) goto _L10; else goto _L9
_L9:
        mlg1 = new AnimatorSet();
        mlg1.playTogether(hashset);
        return mlg1;
    }

    public static int b(ButterflyView butterflyview)
    {
        return butterflyview.g;
    }

    public final void a(mlc mlc1, mli mli1)
    {
        removeAllViews();
        a = mlc1;
        e = new HashMap();
        b = new AnimatorSet();
        c = new HashMap();
        ArrayList arraylist = new ArrayList(mlc1.b.size());
        Iterator iterator = mlc1.b.iterator();
        while (iterator.hasNext()) 
        {
            mkq mkq1 = (mkq)iterator.next();
            Object obj;
            Object obj2;
            if (mkq1.e != null)
            {
                obj = new TextView(getContext());
                ((TextView)obj).setText(mkq1.e);
            } else
            {
                boolean flag;
                if (mkq1.f != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    obj = new ImageView(getContext());
                    mli1.a(mkq1.f, (ImageView)obj);
                    ((ImageView)obj).setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                } else
                if (mkq1.d == 1)
                {
                    obj = new mlh(getContext());
                } else
                {
                    obj = new mlf(this, getContext());
                }
            }
            obj2 = new mlg(this, ((View) (obj)), mkq1);
            ((View) (obj)).setTag(b.DA, obj2);
            obj2 = a(((mlg) (obj2)), mkq1);
            arraylist.add(obj2);
            addView(((View) (obj)));
            e.put(mkq1.a, obj);
            c.put(mkq1.a, obj2);
        }
        mlc1 = mlc1.b.iterator();
        do
        {
            if (!mlc1.hasNext())
            {
                break;
            }
            Object obj1 = (mkq)mlc1.next();
            if (((mkq) (obj1)).b != null)
            {
                mli1 = (mlg)((View)e.get(((mkq) (obj1)).a)).getTag(b.DA);
                obj1 = (mlg)((View)e.get(((mkq) (obj1)).b)).getTag(b.DA);
                mli1.d = ((mlg) (obj1));
                if (obj1 != null)
                {
                    ((mlg) (obj1)).c.add(mli1);
                }
                mli1.a();
            }
        } while (true);
        b.playTogether(arraylist);
        b.setStartDelay(300L);
        b.addListener(d);
        requestLayout();
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        for (i = 0; i < getChildCount(); i++)
        {
            View view = getChildAt(i);
            mlg mlg1 = (mlg)view.getTag(b.DA);
            j = view.getMeasuredWidth();
            k = view.getMeasuredHeight();
            l = -Math.round((float)k * mlg1.h);
            float f1 = j;
            int i1 = -Math.round(mlg1.g * f1);
            view.layout(i1, l, j + i1, k + l);
        }

    }

    protected void onMeasure(int i, int j)
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i), android.view.View.MeasureSpec.getSize(j));
_L8:
        return;
_L2:
        mlm mlm1;
        int i1;
        int j1;
        mlm1 = a.a;
        i1 = resolveSize(mlm1.a, i);
        j1 = resolveSize(mlm1.b, j);
        if (i1 != mlm1.a) goto _L4; else goto _L3
_L3:
        int k;
        int l;
        k = j1;
        l = i1;
        if (j1 == mlm1.b) goto _L5; else goto _L4
_L4:
        float f1;
        float f2;
        f1 = (float)mlm1.a / (float)mlm1.b;
        f2 = (float)i1 / (float)j1;
        if (f2 <= f1) goto _L7; else goto _L6
_L6:
        l = Math.round((float)j1 * f1);
        k = j1;
_L5:
        if (l < android.view.View.MeasureSpec.getSize(i) || k < android.view.View.MeasureSpec.getSize(j))
        {
            f1 = Math.min(android.view.View.MeasureSpec.getSize(i) / l, android.view.View.MeasureSpec.getSize(j) / k);
            j = (int)((float)l * f1);
            i = (int)((float)k * f1);
        } else
        {
            j = l;
            i = k;
        }
        setMeasuredDimension(j, i);
        k = 0;
        while (k < getChildCount()) 
        {
            View view = getChildAt(k);
            mlg mlg1 = (mlg)view.getTag(b.DA);
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(Math.round(mlg1.e * (float)j), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(Math.round(mlg1.f * (float)i), 0x40000000));
            k++;
        }
        if (true) goto _L8; else goto _L7
_L7:
        k = j1;
        l = i1;
        if (f2 < f1)
        {
            k = Math.round((float)i1 / f1);
            l = i1;
        }
          goto _L5
    }

    public void onSizeChanged(int i, int j, int k, int l)
    {
        f = i;
        g = j;
        for (i = 0; i < getChildCount(); i++)
        {
            mlg mlg1 = (mlg)getChildAt(i).getTag(b.DA);
            mlg1.b();
            mlg1.c();
            mlg1.a(mlg1.g);
            mlg1.b(mlg1.h);
            if (mlg1.a instanceof TextView)
            {
                TextView textview = (TextView)mlg1.a;
                float f1 = f;
                textview.setTextSize(0, mlg1.b.h.h * f1);
            }
        }

    }
}
