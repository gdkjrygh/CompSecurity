// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.internal.a;
import android.support.design.internal.b;
import android.support.v7.internal.view.SupportMenuInflater;
import android.support.v7.internal.view.menu.f;
import android.view.Menu;
import android.view.MenuInflater;

public final class NavigationView extends b
{
    public static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return new SavedState[i];
            }

        };
        public Bundle a;

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(a);
        }


        public SavedState(Parcel parcel)
        {
            super(parcel);
            a = parcel.readBundle();
        }

        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

    public static interface a
    {
    }


    private static final int a[] = {
        0x10100a0
    };
    private static final int b[] = {
        0xfefeff62
    };
    private final f c;
    private final android.support.design.internal.a d;
    private a e;
    private int f;
    private MenuInflater g;

    private MenuInflater getMenuInflater()
    {
        if (g == null)
        {
            g = new SupportMenuInflater(getContext());
        }
        return g;
    }

    public final Drawable getItemBackground()
    {
        return d.c;
    }

    public final ColorStateList getItemIconTintList()
    {
        return d.b;
    }

    public final ColorStateList getItemTextColor()
    {
        return d.a;
    }

    public final Menu getMenu()
    {
        return c;
    }

    protected final void onMeasure(int i, int j)
    {
        int k = i;
        android.view.View.MeasureSpec.getMode(i);
        JVM INSTR lookupswitch 3: default 40
    //                   -2147483648: 49
    //                   0: 69
    //                   1073741824: 42;
           goto _L1 _L2 _L3 _L4
_L4:
        break; /* Loop/switch isn't completed */
_L1:
        k = i;
_L6:
        super.onMeasure(k, j);
        return;
_L2:
        k = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(android.view.View.MeasureSpec.getSize(i), f), 0x40000000);
        continue; /* Loop/switch isn't completed */
_L3:
        k = android.view.View.MeasureSpec.makeMeasureSpec(f, 0x40000000);
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected final void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        c.b(((SavedState) (parcelable)).a);
    }

    protected final Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = new Bundle();
        c.a(savedstate.a);
        return savedstate;
    }

    public final void setItemBackground(Drawable drawable)
    {
        d.c = drawable;
    }

    public final void setItemBackgroundResource(int i)
    {
        setItemBackground(android.support.v4.b.a.a(getContext(), i));
    }

    public final void setItemIconTintList(ColorStateList colorstatelist)
    {
        d.b = colorstatelist;
    }

    public final void setItemTextColor(ColorStateList colorstatelist)
    {
        d.a = colorstatelist;
    }

    public final void setNavigationItemSelectedListener(a a1)
    {
        e = a1;
    }

}
