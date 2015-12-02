// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.text;

import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package com.facebook.widget.text:
//            m, h, l

public class SimpleVariableTextLayoutView extends m
{

    private final h a;

    public SimpleVariableTextLayoutView(Context context)
    {
        this(context, null, 0);
    }

    public SimpleVariableTextLayoutView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SimpleVariableTextLayoutView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new h(null);
    }

    protected l getVariableTextLayoutComputer()
    {
        return a;
    }

    public void setText(String s)
    {
        setData(s);
    }
}
