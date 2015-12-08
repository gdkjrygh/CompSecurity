// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.AttributeSet;

public final class ade extends aez
{

    int a;
    int b;

    public ade(int i, int j)
    {
        super(-2, -2);
        a = -1;
        b = 0;
    }

    public ade(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = -1;
        b = 0;
    }

    public ade(android.view.ViewGroup.LayoutParams layoutparams)
    {
        super(layoutparams);
        a = -1;
        b = 0;
    }

    public ade(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
    {
        super(marginlayoutparams);
        a = -1;
        b = 0;
    }

    static int a(ade ade1)
    {
        return ade1.a;
    }

    static int a(ade ade1, int i)
    {
        ade1.b = i;
        return i;
    }

    static int b(ade ade1)
    {
        return ade1.b;
    }

    static int b(ade ade1, int i)
    {
        ade1.a = i;
        return i;
    }
}
