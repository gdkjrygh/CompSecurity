// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v7;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;

// Referenced classes of package com.qihoo.security.v7:
//            MaterialMenuDrawable

public class MaterialMenuView extends View
{
    private static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SavedState a(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public SavedState[] a(int i)
            {
                return new SavedState[i];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int i)
            {
                return a(i);
            }

        };
        protected MaterialMenuDrawable.IconState a;

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeString(a.name());
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            a = MaterialMenuDrawable.IconState.valueOf(parcel.readString());
        }


        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }


    private MaterialMenuDrawable a;
    private MaterialMenuDrawable.IconState b;

    public MaterialMenuView(Context context)
    {
        this(context, null);
    }

    public MaterialMenuView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public MaterialMenuView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = MaterialMenuDrawable.IconState.BURGER;
        a(context, attributeset);
    }

    private TypedArray a(Context context, AttributeSet attributeset, int ai[])
    {
        return context.obtainStyledAttributes(attributeset, ai, 0, 0);
    }

    private void a()
    {
        if (a != null)
        {
            a.setBounds(0, 0, a.getIntrinsicWidth() + getPaddingLeft() + getPaddingRight(), a.getIntrinsicHeight() + getPaddingTop() + getPaddingBottom());
        }
    }

    private void a(Context context, AttributeSet attributeset)
    {
        attributeset = a(context, attributeset, com.qihoo.security.lite.a.a.MaterialMenuView);
        int i = attributeset.getColor(0, -1);
        int j = attributeset.getInt(1, 1);
        int k = attributeset.getInteger(2, 200);
        int l = attributeset.getInteger(3, 100);
        MaterialMenuDrawable.Stroke stroke = MaterialMenuDrawable.Stroke.a(attributeset.getInteger(4, 0));
        boolean flag = attributeset.getBoolean(5, false);
        a = new MaterialMenuDrawable(context, i, stroke, j, k, l);
        a.a(flag);
        attributeset.recycle();
        a.setCallback(this);
        return;
        context;
        attributeset.recycle();
        throw context;
    }

    public void a(MaterialMenuDrawable.IconState iconstate)
    {
        b = iconstate;
        a.a(iconstate, false);
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        if (getPaddingLeft() != 0 || getPaddingTop() != 0)
        {
            int i = canvas.getSaveCount();
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            a.draw(canvas);
            canvas.restoreToCount(i);
            return;
        } else
        {
            a.draw(canvas);
            return;
        }
    }

    public MaterialMenuDrawable getDrawable()
    {
        return a;
    }

    public MaterialMenuDrawable.IconState getState()
    {
        return a.a();
    }

    protected void onMeasure(int i, int j)
    {
        i = getPaddingLeft() + getPaddingRight();
        j = getPaddingTop() + getPaddingBottom();
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            setMeasuredDimension(android.view.View.MeasureSpec.makeMeasureSpec(i + a.getIntrinsicWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j + a.getIntrinsicHeight(), 0x40000000));
            return;
        } else
        {
            setMeasuredDimension(i + a.getIntrinsicWidth(), j + a.getIntrinsicHeight());
            return;
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        setState(((SavedState) (parcelable)).a);
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = b;
        return savedstate;
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        a();
    }

    public void setColor(int i)
    {
        a.a(i);
    }

    public void setInterpolator(Interpolator interpolator)
    {
        a.a(interpolator);
    }

    public void setPadding(int i, int j, int k, int l)
    {
        super.setPadding(i, j, k, l);
        a();
    }

    public void setPressedDuration(int i)
    {
        a.c(i);
    }

    public void setRTLEnabled(boolean flag)
    {
        a.a(flag);
    }

    public void setState(MaterialMenuDrawable.IconState iconstate)
    {
        b = iconstate;
        a.a(iconstate);
    }

    public void setTransformationDuration(int i)
    {
        a.b(i);
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return drawable == a || super.verifyDrawable(drawable);
    }
}
