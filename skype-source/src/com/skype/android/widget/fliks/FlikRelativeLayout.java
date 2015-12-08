// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.fliks;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

// Referenced classes of package com.skype.android.widget.fliks:
//            FlikMaskDecorator

public class FlikRelativeLayout extends RelativeLayout
    implements FlikMaskDecorator.Callback
{

    private FlikMaskDecorator a;

    public FlikRelativeLayout(Context context)
    {
        super(context);
        a();
    }

    public FlikRelativeLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    public FlikRelativeLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a();
    }

    private void a()
    {
        a = new FlikMaskDecorator();
    }

    public final void a(int i)
    {
        a.a(i);
    }

    public final void a(Canvas canvas)
    {
        super.dispatchDraw(canvas);
    }

    protected void dispatchDraw(Canvas canvas)
    {
        a.a(canvas, this);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        a.a(getMeasuredWidth(), getMeasuredHeight());
    }
}
