// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

// Referenced classes of package com.netflix.mediaclient.android.widget:
//            PressedStateHandler

public class TextViewWithPressHandler extends TextView
{

    private PressedStateHandler pressedHandler;

    public TextViewWithPressHandler(Context context)
    {
        super(context);
        init();
    }

    public TextViewWithPressHandler(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public TextViewWithPressHandler(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        pressedHandler = new PressedStateHandler(this);
    }

    protected void dispatchSetPressed(boolean flag)
    {
        pressedHandler.handleSetPressed(flag);
        super.dispatchSetPressed(flag);
    }
}
