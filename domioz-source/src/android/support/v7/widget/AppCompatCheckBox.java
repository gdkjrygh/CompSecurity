// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.a.b;
import android.support.v7.internal.widget.ax;
import android.support.v7.internal.widget.az;
import android.util.AttributeSet;
import android.widget.CheckBox;

public class AppCompatCheckBox extends CheckBox
{

    private static final int a[] = {
        0x1010107
    };
    private ax b;
    private Drawable c;

    public AppCompatCheckBox(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, b.r);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        if (ax.a)
        {
            context = az.a(getContext(), attributeset, a, i);
            setButtonDrawable(context.a(0));
            context.b();
            b = context.c();
        }
    }

    public int getCompoundPaddingLeft()
    {
        int j = super.getCompoundPaddingLeft();
        int i = j;
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            i = j;
            if (c != null)
            {
                i = j + c.getIntrinsicWidth();
            }
        }
        return i;
    }

    public void setButtonDrawable(int i)
    {
        if (b != null)
        {
            setButtonDrawable(b.a(i));
            return;
        } else
        {
            super.setButtonDrawable(i);
            return;
        }
    }

    public void setButtonDrawable(Drawable drawable)
    {
        super.setButtonDrawable(drawable);
        c = drawable;
    }

}
