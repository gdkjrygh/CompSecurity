// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.bubbles;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.skype.android.widget.SymbolView;

// Referenced classes of package com.skype.android.widget.bubbles:
//            Bubblable, BubbleDecorator

public class BubbleSymbolView extends SymbolView
    implements Bubblable
{

    private BubbleDecorator a;

    public BubbleSymbolView(Context context)
    {
        super(context);
        c();
    }

    public BubbleSymbolView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c();
    }

    public BubbleSymbolView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c();
    }

    private void c()
    {
        d().a();
        setMaxWidth(getResources().getDimensionPixelSize(0x7f0c006f));
    }

    private BubbleDecorator d()
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
        d().a(canvas);
    }

    public void setDirectionState(Bubblable.Direction direction, boolean flag)
    {
        d().a(direction, flag);
        invalidate();
    }
}
