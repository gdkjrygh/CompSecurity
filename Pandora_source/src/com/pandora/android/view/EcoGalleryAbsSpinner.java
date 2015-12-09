// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;

// Referenced classes of package com.pandora.android.view:
//            EcoGalleryAdapterView

public abstract class EcoGalleryAbsSpinner extends EcoGalleryAdapterView
{
    static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SavedState a(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public SavedState[] a(int k)
            {
                return new SavedState[k];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int k)
            {
                return a(k);
            }

        };
        long a;
        int b;

        public String toString()
        {
            return (new StringBuilder()).append("AbsSpinner.SavedState{").append(Integer.toHexString(System.identityHashCode(this))).append(" selectedId=").append(a).append(" position=").append(b).append("}").toString();
        }

        public void writeToParcel(Parcel parcel, int k)
        {
            super.writeToParcel(parcel, k);
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

    class a
    {

        final EcoGalleryAbsSpinner a;
        private SparseArray b;

        public View a()
        {
            View view;
            if (b.size() < 1)
            {
                view = null;
            } else
            {
                View view1 = (View)b.valueAt(0);
                int k = b.keyAt(0);
                view = view1;
                if (view1 != null)
                {
                    b.delete(k);
                    return view1;
                }
            }
            return view;
        }

        public void a(int k, View view)
        {
            b.put(k, view);
        }

        public void b(int k, View view)
        {
            b.put(b.size(), view);
        }

        a()
        {
            a = EcoGalleryAbsSpinner.this;
            super();
            b = new SparseArray();
        }
    }


    private DataSetObserver F;
    private Rect G;
    SpinnerAdapter a;
    int b;
    int c;
    boolean d;
    int e;
    int f;
    int g;
    int h;
    Rect i;
    a j;

    public EcoGalleryAbsSpinner(Context context)
    {
        super(context);
        e = 0;
        f = 0;
        g = 0;
        h = 0;
        i = new Rect();
        j = new a();
        b();
    }

    public EcoGalleryAbsSpinner(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public EcoGalleryAbsSpinner(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
        e = 0;
        f = 0;
        g = 0;
        h = 0;
        i = new Rect();
        j = new a();
        b();
        attributeset = context.obtainStyledAttributes(attributeset, com.pandora.android.R.styleable.EcoGalleryAbsSpinner, k, 0);
        CharSequence acharsequence[] = attributeset.getTextArray(0);
        if (acharsequence != null)
        {
            context = new ArrayAdapter(context, 0x1090008, acharsequence);
            context.setDropDownViewResource(0x1090009);
            setAdapter(context);
        }
        attributeset.recycle();
    }

    private void b()
    {
        setFocusable(true);
        setWillNotDraw(false);
    }

    public int a(int k, int l)
    {
        Rect rect1 = G;
        Rect rect = rect1;
        if (rect1 == null)
        {
            G = new Rect();
            rect = G;
        }
        for (int i1 = getChildCount() - 1; i1 >= 0; i1--)
        {
            View view = getChildAt(i1);
            if (view.getVisibility() != 0)
            {
                continue;
            }
            view.getHitRect(rect);
            if (rect.contains(k, l))
            {
                return this.k + i1;
            }
        }

        return -1;
    }

    int a(View view)
    {
        return view.getMeasuredHeight();
    }

    abstract void a(int k, boolean flag);

    int b(View view)
    {
        return view.getMeasuredWidth();
    }

    public void b(int k, boolean flag)
    {
        if (flag && this.k <= k && k <= (this.k + getChildCount()) - 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c(k, flag);
    }

    void c(int k, boolean flag)
    {
        if (k != C)
        {
            d = true;
            int l = y;
            setNextSelectedPositionInt(k);
            a(k - l, flag);
            d = false;
        }
    }

    void f()
    {
        v = false;
        p = false;
        removeAllViewsInLayout();
        C = -1;
        D = 0x8000000000000000L;
        setSelectedPositionInt(-1);
        setNextSelectedPositionInt(-1);
        invalidate();
    }

    void g()
    {
        int l = getChildCount();
        a a1 = j;
        for (int k = 0; k < l; k++)
        {
            View view = getChildAt(k);
            a1.a(this.k + k, view);
        }

    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new android.view.ViewGroup.LayoutParams(-1, -2);
    }

    public volatile Adapter getAdapter()
    {
        return getAdapter();
    }

    public SpinnerAdapter getAdapter()
    {
        return a;
    }

    public int getCount()
    {
        return A;
    }

    public View getSelectedView()
    {
        if (A > 0 && y >= 0)
        {
            return getChildAt(y - k);
        } else
        {
            return null;
        }
    }

    void h()
    {
        super.h();
    }

    protected void onMeasure(int k, int l)
    {
        int i1;
        int j1;
        int k1;
        int i2 = android.view.View.MeasureSpec.getMode(k);
        i1 = getPaddingLeft();
        k1 = getPaddingRight();
        int l1 = getPaddingTop();
        j1 = getPaddingBottom();
        Object obj = i;
        View view;
        if (i1 <= e)
        {
            i1 = e;
        }
        obj.left = i1;
        obj = i;
        if (l1 > f)
        {
            i1 = l1;
        } else
        {
            i1 = f;
        }
        obj.top = i1;
        obj = i;
        if (k1 > g)
        {
            i1 = k1;
        } else
        {
            i1 = g;
        }
        obj.right = i1;
        obj = i;
        if (j1 > h)
        {
            i1 = j1;
        } else
        {
            i1 = h;
        }
        obj.bottom = i1;
        if (v)
        {
            h();
        }
        i1 = getSelectedItemPosition();
        if (i1 < 0 || a == null) goto _L2; else goto _L1
_L1:
        view = j.a();
        obj = view;
        if (view == null)
        {
            obj = a.getView(i1, null, this);
        }
        if (obj != null)
        {
            j.b(i1, ((View) (obj)));
        }
        if (obj == null) goto _L2; else goto _L3
_L3:
        if (((View) (obj)).getLayoutParams() == null)
        {
            d = true;
            ((View) (obj)).setLayoutParams(generateDefaultLayoutParams());
            d = false;
        }
        measureChild(((View) (obj)), k, l);
        j1 = a(((View) (obj))) + i.top + i.bottom;
        i1 = b(((View) (obj))) + i.left + i.right;
        k1 = 0;
_L5:
        l1 = i1;
        if (k1 != 0)
        {
            k1 = i.top + i.bottom;
            l1 = i1;
            j1 = k1;
            if (i2 == 0)
            {
                l1 = i.left + i.right;
                j1 = k1;
            }
        }
        i1 = Math.max(j1, getSuggestedMinimumHeight());
        j1 = Math.max(l1, getSuggestedMinimumWidth());
        i1 = resolveSize(i1, l);
        setMeasuredDimension(resolveSize(j1, k), i1);
        b = l;
        c = k;
        return;
_L2:
        k1 = 1;
        i1 = 0;
        j1 = 0;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (((SavedState) (parcelable)).a >= 0L)
        {
            v = true;
            p = true;
            n = ((SavedState) (parcelable)).a;
            m = ((SavedState) (parcelable)).b;
            q = 0;
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

    public volatile void setAdapter(Adapter adapter)
    {
        setAdapter((SpinnerAdapter)adapter);
    }

    public void setAdapter(SpinnerAdapter spinneradapter)
    {
        byte byte0 = -1;
        if (a != null)
        {
            a.unregisterDataSetObserver(F);
            f();
        }
        a = spinneradapter;
        C = -1;
        D = 0x8000000000000000L;
        if (a != null)
        {
            B = A;
            A = a.getCount();
            j();
            F = new EcoGalleryAdapterView.b(this);
            a.registerDataSetObserver(F);
            if (A > 0)
            {
                byte0 = 0;
            }
            setSelectedPositionInt(byte0);
            setNextSelectedPositionInt(byte0);
            if (A == 0)
            {
                k();
            }
        } else
        {
            j();
            f();
            k();
        }
        requestLayout();
    }

    public void setSelection(int k)
    {
        setNextSelectedPositionInt(k);
        requestLayout();
        invalidate();
    }
}
