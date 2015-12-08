// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.k;
import android.util.AttributeSet;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package com.skype.android.widget:
//            ActionButton

public class DropdownActionButton extends ActionButton
{
    public static interface OnItemClickListener
    {
    }


    private k a;
    private f b;
    private OnItemClickListener c;
    private android.view.View.OnClickListener d = new android.view.View.OnClickListener() {

        final DropdownActionButton a;

        public final void onClick(View view)
        {
            DropdownActionButton.a(a).a(a);
            DropdownActionButton.a(a).e();
        }

            
            {
                a = DropdownActionButton.this;
                super();
            }
    };

    public DropdownActionButton(Context context)
    {
        super(context);
        a();
    }

    public DropdownActionButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    static k a(DropdownActionButton dropdownactionbutton)
    {
        return dropdownactionbutton.a;
    }

    private void a()
    {
        setOnClickListener(d);
        setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        b = new f(getContext());
        a = new k(getContext(), b);
        b.a(new android.support.v7.internal.view.menu.f.a() {

            final DropdownActionButton a;

            public final boolean onMenuItemSelected(f f1, MenuItem menuitem)
            {
                if (DropdownActionButton.b(a) != null)
                {
                    DropdownActionButton.b(a);
                    return true;
                } else
                {
                    return false;
                }
            }

            public final void onMenuModeChange(f f1)
            {
            }

            
            {
                a = DropdownActionButton.this;
                super();
            }
        });
        setContentDescription(getContext().getString(0x7f080052));
    }

    static OnItemClickListener b(DropdownActionButton dropdownactionbutton)
    {
        return dropdownactionbutton.c;
    }

    protected void onDetachedFromWindow()
    {
        if (a != null)
        {
            a.h();
        }
        super.onDetachedFromWindow();
    }

    public void setImageDrawable(Drawable drawable)
    {
        BitmapDrawable bitmapdrawable = (BitmapDrawable)getResources().getDrawable(0x7f020206);
        bitmapdrawable.setGravity(85);
        drawable = new LayerDrawable(new Drawable[] {
            drawable, bitmapdrawable
        });
        drawable.setLayerInset(1, 0, 0, -5, -5);
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i, boolean flag)
    {
        if (flag)
        {
            setImageDrawable(getContext().getResources().getDrawable(i));
            return;
        } else
        {
            super.setImageResource(i);
            return;
        }
    }

    public void setMenuItemSelectedListener(OnItemClickListener onitemclicklistener)
    {
        c = onitemclicklistener;
    }

    public void setMenuResourceId(int i)
    {
        ActionBarActivity actionbaractivity = (ActionBarActivity)getContext();
        b.clear();
        actionbaractivity.getMenuInflater().inflate(i, b);
    }
}
