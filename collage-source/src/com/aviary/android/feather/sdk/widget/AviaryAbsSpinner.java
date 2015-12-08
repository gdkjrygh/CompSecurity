// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            AviaryAdapterView

public abstract class AviaryAbsSpinner extends AviaryAdapterView
{
    static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SavedState a(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public SavedState[] a(int i1)
            {
                return new SavedState[i1];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int i1)
            {
                return a(i1);
            }

        };
        long a;
        int b;

        public String toString()
        {
            return (new StringBuilder()).append("AviaryAbsSpinner.SavedState{").append(Integer.toHexString(System.identityHashCode(this))).append(" selectedId=").append(a).append(" position=").append(b).append("}").toString();
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            parcel.writeLong(a);
            parcel.writeInt(b);
        }


        private SavedState(Parcel parcel)
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


    private DataSetObserver K;
    private Rect L;
    Adapter a;
    int b;
    int c;
    boolean d;
    int e;
    int f;
    int g;
    int h;
    final Rect i;
    int j;
    int k;
    int l;
    int m;
    protected final List n;
    int o;

    public AviaryAbsSpinner(Context context)
    {
        this(context, null);
    }

    public AviaryAbsSpinner(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AviaryAbsSpinner(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        e = 0;
        f = 0;
        g = 0;
        h = 0;
        i = new Rect();
        n = new ArrayList(10);
        k();
    }

    private void k()
    {
        setFocusable(true);
        setWillNotDraw(false);
    }

    private void l()
    {
        a();
        if (n != null)
        {
            n.clear();
        }
    }

    public int a(int i1, int j1)
    {
        Rect rect1 = L;
        Rect rect = rect1;
        if (rect1 == null)
        {
            L = new Rect();
            rect = L;
        }
        for (int k1 = getChildCount() - 1; k1 >= 0; k1--)
        {
            View view = getChildAt(k1);
            if (view.getVisibility() != 0)
            {
                continue;
            }
            view.getHitRect(rect);
            if (rect.contains(i1, j1))
            {
                return p + k1;
            }
        }

        return -1;
    }

    int a(View view)
    {
        return view.getMeasuredHeight();
    }

    protected void a()
    {
        if (n != null)
        {
            for (int i1 = 0; i1 < n.size(); i1++)
            {
                ((Queue)n.get(i1)).clear();
            }

        }
    }

    public void a(int i1, boolean flag, boolean flag1)
    {
        if (flag && p <= i1 && i1 <= (p + getChildCount()) - 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b(i1, flag, flag1);
    }

    int b(View view)
    {
        return view.getMeasuredWidth();
    }

    void b()
    {
        Log.i("View", "emptyList");
        A = false;
        u = false;
        removeAllViewsInLayout();
        l();
        H = -1;
        I = 0x8000000000000000L;
        setSelectedPositionInt(-1);
        setNextSelectedPositionInt(-1);
        invalidate();
    }

    void b(int i1, boolean flag, boolean flag1)
    {
        if (i1 != H)
        {
            d = true;
            int j1 = D;
            setNextSelectedPositionInt(i1);
            c(i1 - j1, flag, flag1);
            d = false;
        }
    }

    void c()
    {
        int j1 = getChildCount();
        int k1 = p;
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            int l1 = a.getItemViewType(k1 + i1);
            ((Queue)n.get(l1)).offer(view);
        }

    }

    abstract void c(int i1, boolean flag, boolean flag1);

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new android.view.ViewGroup.LayoutParams(-1, -2);
    }

    public Adapter getAdapter()
    {
        return a;
    }

    public int getCount()
    {
        return F;
    }

    public View getSelectedView()
    {
        if (F > 0 && D >= 0)
        {
            return getChildAt(D - p);
        } else
        {
            return null;
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1;
        int i2 = 1;
        int l1 = 0;
        int k2 = android.view.View.MeasureSpec.getMode(i1);
        Object obj = i;
        int j2;
        if (j > e)
        {
            k1 = j;
        } else
        {
            k1 = e;
        }
        obj.left = k1;
        obj = i;
        if (l > f)
        {
            k1 = l;
        } else
        {
            k1 = f;
        }
        obj.top = k1;
        obj = i;
        if (k > g)
        {
            k1 = k;
        } else
        {
            k1 = g;
        }
        obj.right = k1;
        obj = i;
        if (m > h)
        {
            k1 = m;
        } else
        {
            k1 = h;
        }
        obj.bottom = k1;
        if (A)
        {
            g();
        }
        k1 = getSelectedItemPosition();
        if (k1 < 0 || a == null || k1 >= a.getCount()) goto _L2; else goto _L1
_L1:
        j2 = a.getItemViewType(k1);
        obj = (View)((Queue)n.get(j2)).poll();
        if (obj == null)
        {
            obj = a.getView(k1, null, this);
        }
        if (obj != null)
        {
            ((Queue)n.get(j2)).offer(obj);
        }
        if (obj == null) goto _L2; else goto _L3
_L3:
        if (((View) (obj)).getLayoutParams() == null)
        {
            d = true;
            ((View) (obj)).setLayoutParams(generateDefaultLayoutParams());
            d = false;
        }
        measureChild(((View) (obj)), i1, j1);
        l1 = a(((View) (obj)));
        i2 = i.top;
        j2 = i.bottom;
        k1 = b(((View) (obj))) + i.left + i.right;
        l1 = j2 + (l1 + i2);
        i2 = 0;
_L5:
        j2 = k1;
        if (i2 != 0)
        {
            i2 = i.top + i.bottom;
            j2 = k1;
            l1 = i2;
            if (k2 == 0)
            {
                j2 = i.left + i.right;
                l1 = i2;
            }
        }
        k1 = Math.max(l1, getSuggestedMinimumHeight());
        l1 = Math.max(j2, getSuggestedMinimumWidth());
        k1 = resolveSize(k1, j1);
        setMeasuredDimension(resolveSize(l1, i1), k1);
        b = j1;
        c = i1;
        return;
_L2:
        k1 = 0;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (((SavedState) (parcelable)).a >= 0L)
        {
            A = true;
            u = true;
            s = ((SavedState) (parcelable)).a;
            r = ((SavedState) (parcelable)).b;
            v = 0;
            requestLayout();
        }
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = getSelectedItemId();
        if (savedstate.a >= 0L)
        {
            savedstate.b = getSelectedItemPosition();
            return savedstate;
        } else
        {
            savedstate.b = -1;
            return savedstate;
        }
    }

    public void requestLayout()
    {
        if (!d)
        {
            super.requestLayout();
        }
    }

    public void setAdapter(Adapter adapter)
    {
        int i1;
        int j1;
        j1 = 0;
        i1 = -1;
        if (a != null)
        {
            a.unregisterDataSetObserver(K);
            l();
            b();
        }
        a = adapter;
        H = -1;
        I = 0x8000000000000000L;
        if (a == null) goto _L2; else goto _L1
_L1:
        G = F;
        F = a.getCount();
        e();
        K = new AviaryAdapterView.b(this);
        a.registerDataSetObserver(K);
        if (o < 0 || o >= F) goto _L4; else goto _L3
_L3:
        i1 = o;
_L6:
        for (int k1 = a.getViewTypeCount(); j1 < k1; j1++)
        {
            n.add(new LinkedList());
        }

        break; /* Loop/switch isn't completed */
_L4:
        if (F > 0)
        {
            i1 = 0;
        }
        if (true) goto _L6; else goto _L5
_L5:
        setSelectedPositionInt(i1);
        setNextSelectedPositionInt(i1);
        if (F == 0)
        {
            h();
        }
_L8:
        requestLayout();
        return;
_L2:
        e();
        b();
        h();
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void setDefaultPosition(int i1)
    {
        o = i1;
    }

    public void setPadding(int i1, int j1, int k1, int l1)
    {
        super.setPadding(i1, j1, k1, l1);
        j = i1;
        m = l1;
        l = j1;
        k = k1;
    }

    public void setSelection(int i1)
    {
        if (F > 0 && i1 >= 0 && i1 < F)
        {
            setNextSelectedPositionInt(i1);
            requestLayout();
            postInvalidate();
        }
    }
}
