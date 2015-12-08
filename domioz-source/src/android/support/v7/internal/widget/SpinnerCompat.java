// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.view.bp;
import android.support.v4.view.v;
import android.support.v7.a.l;
import android.support.v7.widget.ak;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.SpinnerAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            AbsSpinnerCompat, az, as, an, 
//            ap, al, c, ao, 
//            u, am, ax, w

final class SpinnerCompat extends AbsSpinnerCompat
    implements android.content.DialogInterface.OnClickListener
{

    int D;
    private ak E;
    private as F;
    private ao G;
    private int H;
    private boolean I;
    private Rect J;
    private final ax K;

    SpinnerCompat(Context context, int i)
    {
        this(context, i, (byte)0);
    }

    private SpinnerCompat(Context context, int i, byte byte0)
    {
        az az1;
        super(context, i);
        J = new Rect();
        az1 = az.a(context, null, l.aP, i);
        if (az1.f(l.aQ))
        {
            setBackgroundDrawable(az1.a(l.aQ));
        }
        az1.a(l.aW, 0);
        JVM INSTR tableswitch 0 1: default 84
    //                   0 168
    //                   1 184;
           goto _L1 _L2 _L3
_L1:
        H = az1.a(l.aS, 17);
        F.a(az1.d(l.aV));
        I = az1.a(l.aU, false);
        az1.b();
        if (G != null)
        {
            F.a(G);
            G = null;
        }
        K = az1.c();
        return;
_L2:
        F = new an(this, (byte)0);
        continue; /* Loop/switch isn't completed */
_L3:
        context = new ap(this, context, i);
        D = az1.e(l.aR, -2);
        context.a(az1.a(l.aT));
        F = context;
        E = new al(this, this, context);
        if (true) goto _L1; else goto _L4
_L4:
    }

    static as a(SpinnerCompat spinnercompat)
    {
        return spinnercompat.F;
    }

    private View a(int i, boolean flag)
    {
        if (!t)
        {
            View view = this.i.a(i);
            if (view != null)
            {
                a(view, flag);
                return view;
            }
        }
        View view1 = a.getView(i, null, this);
        a(view1, flag);
        return view1;
    }

    private void a(View view, boolean flag)
    {
        android.view.ViewGroup.LayoutParams layoutparams1 = view.getLayoutParams();
        android.view.ViewGroup.LayoutParams layoutparams = layoutparams1;
        if (layoutparams1 == null)
        {
            layoutparams = generateDefaultLayoutParams();
        }
        if (flag)
        {
            addViewInLayout(view, 0, layoutparams);
        }
        view.setSelected(hasFocus());
        if (I)
        {
            view.setEnabled(isEnabled());
        }
        int i = ViewGroup.getChildMeasureSpec(b, h.top + h.bottom, layoutparams.height);
        view.measure(ViewGroup.getChildMeasureSpec(c, h.left + h.right, layoutparams.width), i);
        i = h.top + (getMeasuredHeight() - h.bottom - h.top - view.getMeasuredHeight()) / 2;
        int j = view.getMeasuredHeight();
        view.layout(0, i, view.getMeasuredWidth() + 0, j + i);
    }

    public final void a(w w)
    {
        throw new RuntimeException("setOnItemClickListener cannot be used with a spinner.");
    }

    public final void a(SpinnerAdapter spinneradapter)
    {
        super.a(spinneradapter);
        i.a();
        if (getContext().getApplicationInfo().targetSdkVersion >= 21 && spinneradapter != null && spinneradapter.getViewTypeCount() != 1)
        {
            throw new IllegalArgumentException("Spinner adapter view type count must be 1");
        }
        if (F != null)
        {
            F.a(new ao(spinneradapter));
            return;
        } else
        {
            G = new ao(spinneradapter);
            return;
        }
    }

    final void b(w w)
    {
        super.a(w);
    }

    public final int getBaseline()
    {
        Object obj;
        byte byte0;
        byte0 = -1;
        obj = null;
        if (getChildCount() <= 0) goto _L2; else goto _L1
_L1:
        View view = getChildAt(0);
_L4:
        int i = byte0;
        if (view != null)
        {
            int j = view.getBaseline();
            i = byte0;
            if (j >= 0)
            {
                i = view.getTop() + j;
            }
        }
        return i;
_L2:
        view = obj;
        if (a != null)
        {
            view = obj;
            if (a.getCount() > 0)
            {
                view = a(0, false);
                this.i.a(0, view);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a(i);
        dialoginterface.dismiss();
    }

    protected final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (F != null && F.b())
        {
            F.a();
        }
    }

    protected final void onLayout(boolean flag, int i, int j, int k, int i1)
    {
        super.onLayout(flag, i, j, k, i1);
        q = true;
        j = h.left;
        k = getRight() - getLeft() - h.left - h.right;
        if (t)
        {
            e();
        }
        if (y != 0) goto _L2; else goto _L1
_L1:
        a();
_L8:
        q = false;
        return;
_L2:
        if (u >= 0)
        {
            b(u);
        }
        i1 = getChildCount();
        c c1 = super.i;
        int j1 = super.j;
        for (i = 0; i < i1; i++)
        {
            c1.a(j1 + i, getChildAt(i));
        }

        removeAllViewsInLayout();
        this.j = w;
        if (a == null) goto _L4; else goto _L3
_L3:
        View view;
        view = a(w, true);
        i = view.getMeasuredWidth();
        i1 = bp.h(this);
        v.a(H, i1) & 7;
        JVM INSTR lookupswitch 2: default 220
    //                   1: 264
    //                   5: 278;
           goto _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_278;
_L5:
        i = j;
_L9:
        view.offsetLeftAndRight(i);
_L4:
        this.i.a();
        invalidate();
        f();
        t = false;
        o = false;
        c(w);
          goto _L8
_L6:
        i = (j + k / 2) - i / 2;
          goto _L9
        i = (j + k) - i;
          goto _L9
    }

    protected final void onMeasure(int i, int j)
    {
        boolean flag;
        flag = false;
        super.onMeasure(i, j);
        if (F == null || android.view.View.MeasureSpec.getMode(i) != 0x80000000) goto _L2; else goto _L1
_L1:
        SpinnerAdapter spinneradapter;
        Drawable drawable;
        int k1;
        k1 = getMeasuredWidth();
        spinneradapter = super.a;
        drawable = getBackground();
        if (spinneradapter != null) goto _L4; else goto _L3
_L3:
        j = ((flag) ? 1 : 0);
_L6:
        setMeasuredDimension(Math.min(Math.max(k1, j), android.view.View.MeasureSpec.getSize(i)), getMeasuredHeight());
_L2:
        return;
_L4:
        int l1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int i2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        j = Math.max(0, super.u);
        int j2 = Math.min(spinneradapter.getCount(), j + 15);
        int i1 = Math.max(0, j - (15 - (j2 - j)));
        View view = null;
        j = 0;
        int k = 0;
        for (; i1 < j2; i1++)
        {
            int j1 = spinneradapter.getItemViewType(i1);
            if (j1 != k)
            {
                view = null;
                k = j1;
            }
            view = spinneradapter.getView(i1, view, this);
            if (view.getLayoutParams() == null)
            {
                view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(l1, i2);
            j = Math.max(j, view.getMeasuredWidth());
        }

        if (drawable != null)
        {
            drawable.getPadding(J);
            j = J.left + J.right + j;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (((SavedState) (parcelable)).c)
        {
            parcelable = getViewTreeObserver();
            if (parcelable != null)
            {
                parcelable.addOnGlobalLayoutListener(new am(this));
            }
        }
    }

    public final Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        boolean flag;
        if (F != null && F.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        savedstate.c = flag;
        return savedstate;
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        if (E != null && E.onTouch(this, motionevent))
        {
            return true;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }

    public final boolean performClick()
    {
        boolean flag1 = super.performClick();
        boolean flag = flag1;
        if (!flag1)
        {
            boolean flag2 = true;
            flag = flag2;
            if (!F.b())
            {
                F.c();
                flag = flag2;
            }
        }
        return flag;
    }

    public final void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        if (I)
        {
            int j = getChildCount();
            for (int i = 0; i < j; i++)
            {
                getChildAt(i).setEnabled(flag);
            }

        }
    }

    private class SavedState extends AbsSpinnerCompat.SavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new ar();
        boolean c;

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            if (c)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeByte((byte)i);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            boolean flag;
            if (parcel.readByte() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            c = flag;
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
