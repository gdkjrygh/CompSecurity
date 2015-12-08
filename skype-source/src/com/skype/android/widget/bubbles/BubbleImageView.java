// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.bubbles;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;

// Referenced classes of package com.skype.android.widget.bubbles:
//            Bubblable, BubbleDecorator

public class BubbleImageView extends ImageView
    implements Bubblable
{

    private BubbleDecorator a;

    public BubbleImageView(Context context)
    {
        super(context);
        a();
    }

    public BubbleImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    public BubbleImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a();
    }

    private void a()
    {
        b().a();
        setAdjustViewBounds(true);
        setMaxWidth(getResources().getDimensionPixelSize(0x7f0c006f));
    }

    private BubbleDecorator b()
    {
        if (a == null)
        {
            a = new BubbleDecorator(getResources());
        }
        return a;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        b().a(canvas);
    }

    public void setDirectionState(Bubblable.Direction direction, boolean flag)
    {
        b().a(direction, flag);
        invalidate();
    }
}
