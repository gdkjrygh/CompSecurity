// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import com.aviary.android.feather.sdk.a.c;
import com.aviary.android.feather.sdk.utils.e;

public class AviaryHighlightImageButton extends ImageView
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
        boolean a;

        public String toString()
        {
            return (new StringBuilder()).append("CompoundButton.SavedState{").append(Integer.toHexString(System.identityHashCode(this))).append(" checked=").append(a).append("}").toString();
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            parcel.writeValue(Boolean.valueOf(a));
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            a = ((Boolean)parcel.readValue(null)).booleanValue();
        }


        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

    public static interface a
    {

        public abstract void a(AviaryHighlightImageButton aviaryhighlightimagebutton, boolean flag, boolean flag1);
    }


    private static final int p[] = {
        0x10100a0
    };
    private int a;
    private int b;
    private int c;
    private android.graphics.PorterDuff.Mode d;
    private ColorFilter e;
    private ColorFilter f;
    private ColorFilter g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private a o;

    public AviaryHighlightImageButton(Context context)
    {
        this(context, null);
    }

    public AviaryHighlightImageButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, com.aviary.android.feather.sdk.R.attr.aviaryHighlightImageButtonStyle);
    }

    public AviaryHighlightImageButton(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a = 0;
        b = 0;
        c = 0;
        context = context.getTheme().obtainStyledAttributes(attributeset, com.aviary.android.feather.sdk.R.styleable.AviaryHighlightImageButton, i1, 0);
        a = context.getColor(4, -1);
        b = context.getColor(5, -1);
        c = context.getColor(6, -1);
        k = context.getBoolean(7, false);
        l = context.getBoolean(10, true);
        attributeset = context.getString(3);
        h = context.getInt(1, 0);
        j = context.getInt(8, 7);
        i = context.getInteger(2, 2);
        boolean flag = context.getBoolean(9, false);
        if (!k)
        {
            flag = false;
        }
        if (com.aviary.android.feather.sdk.utils.e.a(h, 2))
        {
            e = new LightingColorFilter(a, a);
        }
        if (com.aviary.android.feather.sdk.utils.e.a(h, 4))
        {
            f = new LightingColorFilter(b, b);
        }
        if (com.aviary.android.feather.sdk.utils.e.a(h, 8))
        {
            g = new LightingColorFilter(c, c);
        }
        if (attributeset != null)
        {
            d = android.graphics.PorterDuff.Mode.valueOf(attributeset);
        } else
        {
            d = android.graphics.PorterDuff.Mode.MULTIPLY;
        }
        a(flag, false);
        flag = context.getBoolean(0, true);
        context.recycle();
        setFocusable(flag);
        if (getDrawable() instanceof c)
        {
            ((c)getDrawable()).a(a, b, c, j, i, h);
        }
    }

    protected void a(Drawable drawable, boolean flag, boolean flag1, boolean flag2)
    {
        if (drawable.isStateful())
        {
            invalidate();
        } else
        if (flag || flag1 || flag2)
        {
            if (flag && com.aviary.android.feather.sdk.utils.e.a(i, 2))
            {
                if (e != null)
                {
                    drawable.setColorFilter(e);
                    return;
                } else
                {
                    drawable.setColorFilter(a, d);
                    return;
                }
            }
            if (flag1 && com.aviary.android.feather.sdk.utils.e.a(i, 4))
            {
                if (f != null)
                {
                    drawable.setColorFilter(f);
                    return;
                } else
                {
                    drawable.setColorFilter(b, d);
                    return;
                }
            }
            if (flag2 && com.aviary.android.feather.sdk.utils.e.a(i, 8))
            {
                if (g != null)
                {
                    drawable.setColorFilter(g);
                    return;
                } else
                {
                    drawable.setColorFilter(b, d);
                    return;
                }
            }
        } else
        {
            drawable.clearColorFilter();
            return;
        }
    }

    protected void a(boolean flag, boolean flag1)
    {
        if (k && m != flag)
        {
            m = flag;
            refreshDrawableState();
            if (!n)
            {
                n = true;
                if (o != null)
                {
                    o.a(this, m, flag1);
                }
                n = false;
                return;
            }
        }
    }

    public boolean a()
    {
        return m;
    }

    public void b()
    {
        if (m && !l)
        {
            return;
        }
        boolean flag;
        if (!m)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag, true);
    }

    public int[] onCreateDrawableState(int i1)
    {
        Drawable drawable = getDrawable();
        int ai[] = super.onCreateDrawableState(i1 + 1);
        if (drawable != null && d != null)
        {
            boolean flag = isPressed();
            boolean flag1 = a();
            a(drawable, flag, flag1, isSelected());
            if (flag1)
            {
                mergeDrawableStates(ai, p);
            }
        }
        return ai;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        accessibilityevent.setClassName(com/aviary/android/feather/sdk/widget/AviaryHighlightImageButton.getName());
        accessibilityevent.setChecked(m);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            accessibilitynodeinfo.setClassName(com/aviary/android/feather/sdk/widget/AviaryHighlightImageButton.getName());
        }
        accessibilitynodeinfo.setCheckable(k);
        accessibilitynodeinfo.setChecked(m);
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        a(((SavedState) (parcelable)).a, false);
        requestLayout();
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = a();
        return savedstate;
    }

    protected boolean onSetAlpha(int i1)
    {
        return false;
    }

    public boolean performClick()
    {
        b();
        return super.performClick();
    }

    public void setChecked(boolean flag)
    {
        a(flag, false);
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        Drawable drawable = getDrawable();
        if (drawable instanceof c)
        {
            ((c)drawable).a(bitmap);
            setImageDrawable((c)drawable);
            return;
        } else
        {
            setImageDrawable(new c(getResources(), bitmap, a, b, c, j, i, h));
            return;
        }
    }

    public void setImageDrawable(Drawable drawable)
    {
        if (drawable instanceof BitmapDrawable)
        {
            Drawable drawable1 = getDrawable();
            if (drawable1 instanceof c)
            {
                ((c)drawable1).a(((BitmapDrawable)drawable).getBitmap());
                drawable = drawable1;
            } else
            {
                drawable = new c(getResources(), ((BitmapDrawable)drawable).getBitmap(), a, b, c, j, i, h);
            }
        } else
        if (!(drawable instanceof StateListDrawable));
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i1)
    {
        Resources resources = getResources();
        try
        {
            setImageDrawable(resources.getDrawable(i1));
            invalidate();
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        super.setImageResource(i1);
    }

    public void setOnCheckedChangeListener(a a1)
    {
        o = a1;
    }

    public void setPressed(boolean flag)
    {
        super.setPressed(flag);
        Drawable drawable = getDrawable();
        if (drawable != null && d != null)
        {
            a(drawable, flag, a(), isSelected());
        }
    }

    public void setSelected(boolean flag)
    {
        super.setSelected(flag);
        Drawable drawable = getDrawable();
        if (drawable != null && d != null)
        {
            a(drawable, isPressed(), a(), flag);
        }
    }

}
