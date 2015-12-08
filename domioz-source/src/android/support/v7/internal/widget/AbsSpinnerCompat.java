// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.view.bp;
import android.view.View;
import android.widget.Adapter;
import android.widget.SpinnerAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            u, c, v

abstract class AbsSpinnerCompat extends u
{

    private DataSetObserver D;
    SpinnerAdapter a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    final Rect h = new Rect();
    final c i = new c(this);

    AbsSpinnerCompat(Context context, int j)
    {
        super(context, j);
        d = 0;
        e = 0;
        f = 0;
        g = 0;
        setFocusable(true);
        setWillNotDraw(false);
    }

    static void a(AbsSpinnerCompat absspinnercompat, View view)
    {
        absspinnercompat.removeDetachedView(view, true);
    }

    final void a()
    {
        t = false;
        o = false;
        removeAllViewsInLayout();
        A = -1;
        B = 0x8000000000000000L;
        b(-1);
        c(-1);
        invalidate();
    }

    public final void a(int j)
    {
        c(j);
        requestLayout();
        invalidate();
    }

    public void a(SpinnerAdapter spinneradapter)
    {
        byte byte0 = -1;
        if (a != null)
        {
            a.unregisterDataSetObserver(D);
            a();
        }
        a = spinneradapter;
        A = -1;
        B = 0x8000000000000000L;
        if (a != null)
        {
            z = y;
            y = a.getCount();
            d();
            D = new v(this);
            a.registerDataSetObserver(D);
            if (y > 0)
            {
                byte0 = 0;
            }
            b(byte0);
            c(byte0);
            if (y == 0)
            {
                f();
            }
        } else
        {
            d();
            a();
            f();
        }
        requestLayout();
    }

    public final View b()
    {
        if (y > 0 && w >= 0)
        {
            return getChildAt(w - j);
        } else
        {
            return null;
        }
    }

    public final volatile Adapter c()
    {
        return a;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new android.view.ViewGroup.LayoutParams(-1, -2);
    }

    protected void onMeasure(int j, int k)
    {
        int l;
        int j1;
        int i2 = android.view.View.MeasureSpec.getMode(j);
        int i1 = getPaddingLeft();
        int l1 = getPaddingTop();
        int k1 = getPaddingRight();
        j1 = getPaddingBottom();
        Object obj = h;
        View view;
        if (i1 > d)
        {
            l = i1;
        } else
        {
            l = d;
        }
        obj.left = l;
        obj = h;
        if (l1 > e)
        {
            l = l1;
        } else
        {
            l = e;
        }
        obj.top = l;
        obj = h;
        if (k1 > f)
        {
            l = k1;
        } else
        {
            l = f;
        }
        obj.right = l;
        obj = h;
        if (j1 > g)
        {
            l = j1;
        } else
        {
            l = g;
        }
        obj.bottom = l;
        if (t)
        {
            e();
        }
        l = super.u;
        if (l < 0 || a == null || l >= a.getCount()) goto _L2; else goto _L1
_L1:
        view = i.a(l);
        obj = view;
        if (view == null)
        {
            obj = a.getView(l, null, this);
        }
        if (obj == null) goto _L2; else goto _L3
_L3:
        i.a(l, ((View) (obj)));
        if (((View) (obj)).getLayoutParams() == null)
        {
            C = true;
            ((View) (obj)).setLayoutParams(generateDefaultLayoutParams());
            C = false;
        }
        measureChild(((View) (obj)), j, k);
        i1 = ((View) (obj)).getMeasuredHeight() + h.top + h.bottom;
        l = ((View) (obj)).getMeasuredWidth() + h.left + h.right;
        j1 = 0;
_L5:
        k1 = l;
        if (j1 != 0)
        {
            j1 = h.top + h.bottom;
            k1 = l;
            i1 = j1;
            if (i2 == 0)
            {
                k1 = h.left + h.right;
                i1 = j1;
            }
        }
        l = Math.max(i1, getSuggestedMinimumHeight());
        i1 = Math.max(k1, getSuggestedMinimumWidth());
        l = bp.a(l, k, 0);
        setMeasuredDimension(bp.a(i1, j, 0), l);
        b = k;
        c = j;
        return;
_L2:
        j1 = 1;
        l = 0;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (((SavedState) (parcelable)).a >= 0L)
        {
            t = true;
            o = true;
            m = ((SavedState) (parcelable)).a;
            l = ((SavedState) (parcelable)).b;
            p = 0;
            requestLayout();
        }
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = super.v;
        if (savedstate.a >= 0L)
        {
            savedstate.b = super.u;
            return savedstate;
        } else
        {
            savedstate.b = -1;
            return savedstate;
        }
    }

    public void requestLayout()
    {
        if (!C)
        {
            super.requestLayout();
        }
    }

    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new d();
        long a;
        int b;

        public String toString()
        {
            return (new StringBuilder("AbsSpinner.SavedState{")).append(Integer.toHexString(System.identityHashCode(this))).append(" selectedId=").append(a).append(" position=").append(b).append("}").toString();
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            super.writeToParcel(parcel, j);
            parcel.writeLong(a);
            parcel.writeInt(b);
        }


        SavedState(Parcel parcel)
        {
            super(parcel);
            a = parcel.readLong();
            b = parcel.readInt();
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
