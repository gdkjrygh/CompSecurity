// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

// Referenced classes of package com.skype.android.widget:
//            RoundCornerDecorator

public class RoundCornerRelativeLayout extends RelativeLayout
{

    private RoundCornerDecorator a;

    public RoundCornerRelativeLayout(Context context)
    {
        super(context);
        a().a();
    }

    public RoundCornerRelativeLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a().a();
    }

    public RoundCornerRelativeLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a().a();
    }

    private RoundCornerDecorator a()
    {
        if (a == null)
        {
            a = new RoundCornerDecorator(getResources());
        }
        return a;
    }

    protected void dispatchDraw(Canvas canvas)
    {
        super.dispatchDraw(canvas);
        a().a(canvas);
    }

    public void setColor(int i)
    {
        a().a(i);
        invalidate();
    }
}
