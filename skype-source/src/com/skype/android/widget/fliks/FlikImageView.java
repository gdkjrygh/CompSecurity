// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.fliks;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;

// Referenced classes of package com.skype.android.widget.fliks:
//            FlikMaskDecorator

public class FlikImageView extends ImageView
    implements FlikMaskDecorator.Callback
{

    private FlikMaskDecorator a;

    public FlikImageView(Context context)
    {
        super(context);
        a();
    }

    public FlikImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    public FlikImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a();
    }

    private void a()
    {
        a = new FlikMaskDecorator();
    }

    public final void a(Canvas canvas)
    {
        super.onDraw(canvas);
    }

    protected void onDraw(Canvas canvas)
    {
        a.a(canvas, this);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        a.a(getMeasuredWidth(), getMeasuredHeight());
    }
}
