// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.internal.ScrimInsetsFrameLayout;
import android.support.design.internal.a;
import android.support.design.internal.b;
import android.support.v4.view.x;
import android.support.v7.internal.view.e;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.h;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class NavigationView extends ScrimInsetsFrameLayout
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

        public abstract boolean a();
    }


    private static final int a[] = {
        0x10100a0
    };
    private static final int b[] = {
        0xfefeff62
    };
    private final android.support.design.internal.a c;
    private final b d;
    private a e;
    private int f;
    private MenuInflater g;

    public NavigationView(Context context)
    {
        this(context, null);
    }

    public NavigationView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public NavigationView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        d = new b();
        c = new android.support.design.internal.a(context);
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, android.support.design.a.i.NavigationView, i, android.support.design.a.h.Widget_Design_NavigationView);
        setBackgroundDrawable(typedarray.getDrawable(android.support.design.a.i.NavigationView_android_background));
        if (typedarray.hasValue(android.support.design.a.i.NavigationView_elevation))
        {
            x.f(this, typedarray.getDimensionPixelSize(android.support.design.a.i.NavigationView_elevation, 0));
        }
        x.a(this, typedarray.getBoolean(android.support.design.a.i.NavigationView_android_fitsSystemWindows, false));
        f = typedarray.getDimensionPixelSize(android.support.design.a.i.NavigationView_android_maxWidth, 0);
        ColorStateList colorstatelist;
        Object obj;
        boolean flag;
        if (typedarray.hasValue(android.support.design.a.i.NavigationView_itemIconTint))
        {
            colorstatelist = typedarray.getColorStateList(android.support.design.a.i.NavigationView_itemIconTint);
        } else
        {
            colorstatelist = a(0x1010038);
        }
        flag = false;
        i = 0;
        if (typedarray.hasValue(android.support.design.a.i.NavigationView_itemTextAppearance))
        {
            i = typedarray.getResourceId(android.support.design.a.i.NavigationView_itemTextAppearance, 0);
            flag = true;
        }
        attributeset = null;
        if (typedarray.hasValue(android.support.design.a.i.NavigationView_itemTextColor))
        {
            attributeset = typedarray.getColorStateList(android.support.design.a.i.NavigationView_itemTextColor);
        }
        obj = attributeset;
        if (!flag)
        {
            obj = attributeset;
            if (attributeset == null)
            {
                obj = a(0x1010036);
            }
        }
        attributeset = typedarray.getDrawable(android.support.design.a.i.NavigationView_itemBackground);
        c.a(new android.support.v7.internal.view.menu.f.a() {

            final NavigationView a;

            public final boolean onMenuItemSelected(f f1, MenuItem menuitem)
            {
                return android.support.design.widget.NavigationView.a(a) != null && android.support.design.widget.NavigationView.a(a).a();
            }

            public final void onMenuModeChange(f f1)
            {
            }

            
            {
                a = NavigationView.this;
                super();
            }
        });
        d.c();
        d.a(context, c);
        d.a(colorstatelist);
        if (flag)
        {
            d.b(i);
        }
        d.b(((ColorStateList) (obj)));
        d.a(attributeset);
        c.a(d);
        addView((View)d.a(this));
        if (typedarray.hasValue(android.support.design.a.i.NavigationView_menu))
        {
            i = typedarray.getResourceId(android.support.design.a.i.NavigationView_menu, 0);
            d.b(true);
            if (g == null)
            {
                g = new e(getContext());
            }
            g.inflate(i, c);
            d.b(false);
            d.a(false);
        }
        if (typedarray.hasValue(android.support.design.a.i.NavigationView_headerLayout))
        {
            i = typedarray.getResourceId(android.support.design.a.i.NavigationView_headerLayout, 0);
            d.a(i);
        }
        typedarray.recycle();
    }

    private ColorStateList a(int i)
    {
        TypedValue typedvalue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(i, typedvalue, true))
        {
            ColorStateList colorstatelist = getResources().getColorStateList(typedvalue.resourceId);
            if (getContext().getTheme().resolveAttribute(android.support.design.a.b.colorPrimary, typedvalue, true))
            {
                i = typedvalue.data;
                int j = colorstatelist.getDefaultColor();
                int ai[] = b;
                int ai1[] = a;
                int ai2[] = EMPTY_STATE_SET;
                int k = colorstatelist.getColorForState(b, j);
                return new ColorStateList(new int[][] {
                    ai, ai1, ai2
                }, new int[] {
                    k, i, j
                });
            }
        }
        return null;
    }

    static a a(NavigationView navigationview)
    {
        return navigationview.e;
    }

    protected void onMeasure(int i, int j)
    {
        int k = i;
        android.view.View.MeasureSpec.getMode(i);
        JVM INSTR lookupswitch 3: default 40
    //                   -2147483648: 49
    //                   0: 70
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

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        c.b(((SavedState) (parcelable)).a);
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = new Bundle();
        c.a(savedstate.a);
        return savedstate;
    }

    public void setCheckedItem(int i)
    {
        MenuItem menuitem = c.findItem(i);
        if (menuitem != null)
        {
            d.c((h)menuitem);
        }
    }

    public void setItemBackground(Drawable drawable)
    {
        d.a(drawable);
    }

    public void setItemBackgroundResource(int i)
    {
        setItemBackground(android.support.v4.content.a.a(getContext(), i));
    }

    public void setItemIconTintList(ColorStateList colorstatelist)
    {
        d.a(colorstatelist);
    }

    public void setItemTextAppearance(int i)
    {
        d.b(i);
    }

    public void setItemTextColor(ColorStateList colorstatelist)
    {
        d.b(colorstatelist);
    }

    public void setNavigationItemSelectedListener(a a1)
    {
        e = a1;
    }

}
