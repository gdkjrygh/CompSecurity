// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.skin;

import android.content.Context;
import android.graphics.LightingColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

// Referenced classes of package com.arist.model.skin:
//            m, b

public class ColorLinearLayout extends LinearLayout
    implements m
{

    public ColorLinearLayout(Context context)
    {
        super(context);
    }

    public ColorLinearLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ColorLinearLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public final void a(int i)
    {
        if (getBackground() != null && !(getBackground() instanceof ColorDrawable))
        {
            getBackground().setColorFilter(new LightingColorFilter(i, 1));
            return;
        } else
        {
            setBackgroundColor(i);
            return;
        }
    }

    protected void onAttachedToWindow()
    {
        b.a().a(this);
        super.onAttachedToWindow();
    }

    protected void onDetachedFromWindow()
    {
        b.a().b(this);
        super.onDetachedFromWindow();
    }
}
