// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.google.common.base.Optional;
import ctz;
import dmz;
import gbk;
import gcf;
import geg;
import ggb;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import km;

public class SnackBar extends ViewGroup
{

    public int a;
    private List b;
    private BitSet c;
    private boolean d;
    private TimeInterpolator e;
    private long f;
    private Optional g;

    public SnackBar(Context context)
    {
        super(context);
        b = new ArrayList();
        c = new BitSet();
        dmz.a(ggb);
        ggb.a();
        e = new AccelerateDecelerateInterpolator();
        g = Optional.e();
    }

    public SnackBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = new ArrayList();
        c = new BitSet();
        dmz.a(ggb);
        ggb.a();
        e = new AccelerateDecelerateInterpolator();
        g = Optional.e();
    }

    public SnackBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = new ArrayList();
        c = new BitSet();
        dmz.a(ggb);
        ggb.a();
        e = new AccelerateDecelerateInterpolator();
        g = Optional.e();
    }

    private ViewGroup a(int i)
    {
        return (ViewGroup)getChildAt(i);
    }

    private boolean b(int i)
    {
        return g.b() && i == ((Integer)g.c()).intValue();
    }

    public final void a()
    {
        if (!d)
        {
            requestLayout();
            d = true;
        }
    }

    public final void a(gbk gbk1)
    {
        b.add(gbk1);
        int i = gbk1.a();
        FrameLayout framelayout = new FrameLayout(getContext());
        framelayout.setId(i);
        addView(framelayout);
        setBackgroundColor(0);
        framelayout.setVisibility(8);
        framelayout.setTag(Integer.valueOf(b.size() - 1));
        i = b.size() - 1;
        gbk1.a(a(i));
        if (gbk1.b())
        {
            c.set(i);
            return;
        } else
        {
            c.clear(i);
            return;
        }
    }

    protected void dispatchDraw(Canvas canvas)
    {
        if (g.b())
        {
            int l = ((Integer)g.c()).intValue();
            boolean flag2 = ((gbk)b.get(l)).b();
            if (f == 0L)
            {
                f = gcf.c();
            }
            float f1 = (float)(gcf.c() - f) / 400F;
            boolean flag;
            int i;
            if (f1 > 1.0F)
            {
                flag = true;
                f1 = 1.0F;
            } else
            {
                km.d(this);
                flag = false;
            }
            i = l;
            while (i >= 0) 
            {
                View view = getChildAt(i);
                ctz.b(g.b());
                int j = ((Integer)g.c()).intValue();
                boolean flag3 = ((gbk)b.get(j)).b();
                j = getChildAt(j).getMeasuredHeight();
                float f2 = e.getInterpolation(f1);
                float f3;
                int k;
                if (flag3)
                {
                    boolean flag1 = false;
                    k = j;
                    j = ((flag1) ? 1 : 0);
                } else
                {
                    k = 0;
                }
                f3 = k;
                view.setTranslationY((float)(j - k) * f2 + f3);
                i--;
            }
            if (flag)
            {
                f = 0L;
                g = Optional.e();
                ((gbk)b.get(l)).c();
                if (flag2)
                {
                    c.set(l);
                } else
                {
                    c.clear(l);
                }
                a();
            }
        }
        super.dispatchDraw(canvas);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        j = 0;
        i = 0;
        while (j < b.size()) 
        {
            ViewGroup viewgroup = a(j);
            if (c.get(j) || b(j))
            {
                k = 1;
            } else
            {
                k = 0;
            }
            if (k != 0)
            {
                k = viewgroup.getMeasuredHeight();
                viewgroup.layout(0, i, getMeasuredWidth(), i + k);
                ((gbk)b.get(j)).c();
                viewgroup.setTranslationY(0.0F);
                i += k;
            }
            j++;
        }
        d = false;
    }

    protected void onMeasure(int i, int j)
    {
        Object obj;
        int k;
        boolean flag1;
        if (getChildCount() == b.size())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ctz.b(flag1);
        a = 0;
        if (!g.b()) goto _L2; else goto _L1
_L1:
        obj = g;
_L3:
        g = ((Optional) (obj));
        obj = g;
        j = 0;
        k = 0;
        while (j < b.size()) 
        {
            obj = a(j);
            ((ViewGroup) (obj)).measure(i, geg.a());
            ((ViewGroup) (obj)).setLayerType(0, null);
            ((gbk)b.get(j)).c();
            ((ViewGroup) (obj)).getMeasuredHeight();
            boolean flag;
            if (c.get(j) || b(j))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ((gbk)b.get(j)).b();
            b(j);
            if (flag)
            {
                ((ViewGroup) (obj)).setVisibility(0);
                k += ((ViewGroup) (obj)).getMeasuredHeight();
            } else
            {
                ((ViewGroup) (obj)).setVisibility(8);
            }
            if (c.get(j) && !b(j))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                a = a + ((ViewGroup) (obj)).getMeasuredHeight();
            }
            j++;
        }
        break MISSING_BLOCK_LABEL_344;
_L2:
        j = 0;
_L4:
label0:
        {
            if (j >= b.size())
            {
                break MISSING_BLOCK_LABEL_316;
            }
            if (c.get(j) == ((gbk)b.get(j)).b())
            {
                break label0;
            }
            ((gbk)b.get(j)).c();
            obj = Optional.b(Integer.valueOf(j));
        }
          goto _L3
        j++;
          goto _L4
        obj = Optional.e();
          goto _L3
        j = a;
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i), geg.a(k));
        return;
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        if (!(parcelable instanceof SavedState))
        {
            super.onRestoreInstanceState(parcelable);
        } else
        {
            parcelable = (SavedState)parcelable;
            super.onRestoreInstanceState(parcelable.getSuperState());
            parcelable = ((SavedState) (parcelable)).a;
            int i = 0;
            while (i < b.size()) 
            {
                gbk gbk1 = (gbk)b.get(i);
                boolean flag = parcelable[i];
                gbk1.a(flag);
                if (flag)
                {
                    c.set(i);
                } else
                {
                    c.clear(i);
                }
                i++;
            }
        }
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        boolean aflag[] = new boolean[b.size()];
        for (int i = 0; i < b.size(); i++)
        {
            aflag[i] = ((gbk)b.get(i)).b();
        }

        savedstate.a = aflag;
        return savedstate;
    }

    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel, (byte)0);
            }

            public final volatile Object[] newArray(int i)
            {
                return new SavedState[i];
            }

        };
        boolean a[];

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeInt(a.length);
            parcel.writeBooleanArray(a);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            a = new boolean[parcel.readInt()];
            parcel.readBooleanArray(a);
        }

        SavedState(Parcel parcel, byte byte0)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
