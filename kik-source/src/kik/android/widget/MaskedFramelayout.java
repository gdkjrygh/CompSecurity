// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class MaskedFramelayout extends FrameLayout
{

    private Drawable a;

    public MaskedFramelayout(Context context)
    {
        super(context);
        setWillNotDraw(false);
    }

    public MaskedFramelayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setWillNotDraw(false);
    }

    public MaskedFramelayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        setWillNotDraw(false);
    }

    public final void a(int i)
    {
        a = getContext().getResources().getDrawable(i);
    }

    protected void dispatchDraw(Canvas canvas)
    {
        super.dispatchDraw(canvas);
        if (a != null)
        {
            a.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            a.draw(canvas);
        }
    }
}
