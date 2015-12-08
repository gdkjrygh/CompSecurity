// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.bubbles;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

// Referenced classes of package com.skype.android.widget.bubbles:
//            Bubblable, BubbleDecorator

public class BubbleRelativeLayout extends RelativeLayout
    implements Bubblable
{

    private BubbleDecorator a;

    public BubbleRelativeLayout(Context context)
    {
        super(context);
        a().a();
    }

    public BubbleRelativeLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a().a();
    }

    public BubbleRelativeLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a().a();
    }

    private BubbleDecorator a()
    {
        if (a == null)
        {
            a = new BubbleDecorator(getResources());
        }
        return a;
    }

    protected void dispatchDraw(Canvas canvas)
    {
        super.dispatchDraw(canvas);
        a().a(canvas);
    }

    public void setDirectionState(Bubblable.Direction direction, boolean flag)
    {
        a().a(direction, flag);
        invalidate();
    }
}
