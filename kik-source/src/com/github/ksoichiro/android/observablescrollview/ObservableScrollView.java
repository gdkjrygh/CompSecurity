// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.ksoichiro.android.observablescrollview;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;

// Referenced classes of package com.github.ksoichiro.android.observablescrollview:
//            k, n, i, j

public class ObservableScrollView extends ScrollView
{
    static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new j();
        int a;
        int b;

        public void writeToParcel(Parcel parcel, int l)
        {
            super.writeToParcel(parcel, l);
            parcel.writeInt(a);
            parcel.writeInt(b);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            a = parcel.readInt();
            b = parcel.readInt();
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


    private int a;
    private int b;
    private k c;
    private int d;
    private boolean e;
    private boolean f;
    private boolean g;
    private MotionEvent h;
    private ViewGroup i;

    public ObservableScrollView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ObservableScrollView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (c == null) goto _L2; else goto _L1
_L1:
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 0: default 28
    //                   0 34;
           goto _L2 _L3
_L2:
        return super.onInterceptTouchEvent(motionevent);
_L3:
        f = true;
        e = true;
        if (true) goto _L2; else goto _L4
_L4:
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        a = ((SavedState) (parcelable)).a;
        b = ((SavedState) (parcelable)).b;
        super.onRestoreInstanceState(parcelable.getSuperState());
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = a;
        savedstate.b = b;
        return savedstate;
    }

    protected void onScrollChanged(int j, int l, int i1, int j1)
    {
        super.onScrollChanged(j, l, i1, j1);
        if (c == null) goto _L2; else goto _L1
_L1:
        b = l;
        c.j_();
        if (e)
        {
            e = false;
        }
        if (a >= l) goto _L4; else goto _L3
_L3:
        d = n.b;
_L6:
        a = l;
_L2:
        return;
_L4:
        if (l < a)
        {
            d = n.c;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        float f1 = 0.0F;
        if (c == null) goto _L2; else goto _L1
_L1:
        motionevent.getActionMasked();
        JVM INSTR tableswitch 1 3: default 40
    //                   1 46
    //                   2 59
    //                   3 46;
           goto _L2 _L3 _L4 _L3
_L2:
        return super.onTouchEvent(motionevent);
_L3:
        g = false;
        f = false;
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        if (h == null)
        {
            h = motionevent;
        }
        float f2 = motionevent.getY();
        float f4 = h.getY();
        h = MotionEvent.obtainNoHistory(motionevent);
        if ((float)b - (f2 - f4) <= 0.0F)
        {
            if (g)
            {
                return false;
            }
            float f3;
            ViewGroup viewgroup;
            Object obj;
            if (i == null)
            {
                viewgroup = (ViewGroup)getParent();
            } else
            {
                viewgroup = i;
            }
            obj = this;
            f3 = 0.0F;
            for (; obj != null && obj != viewgroup; obj = (View)((View) (obj)).getParent())
            {
                f3 += ((View) (obj)).getLeft() - ((View) (obj)).getScrollX();
                f1 += ((View) (obj)).getTop() - ((View) (obj)).getScrollY();
            }

            obj = MotionEvent.obtainNoHistory(motionevent);
            ((MotionEvent) (obj)).offsetLocation(f3, f1);
            if (viewgroup.onInterceptTouchEvent(((MotionEvent) (obj))))
            {
                g = true;
                ((MotionEvent) (obj)).setAction(0);
                post(new i(this, viewgroup, ((MotionEvent) (obj))));
                return false;
            } else
            {
                return super.onTouchEvent(motionevent);
            }
        }
        if (true) goto _L2; else goto _L5
_L5:
    }
}
