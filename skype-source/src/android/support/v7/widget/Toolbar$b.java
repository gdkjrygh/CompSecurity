// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package android.support.v7.widget:
//            Toolbar

public static final class omMargin extends android.support.v7.app.a
{

    int b;

    public arams()
    {
        b = 0;
        a = 0x800013;
    }

    public a(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = 0;
    }

    public b(android.support.v7.app.a a)
    {
        super(a);
        b = 0;
    }

    public b(b b1)
    {
        super(b1);
        b = 0;
        b = b1.b;
    }

    public b(android.view.LayoutParams layoutparams)
    {
        super(layoutparams);
        b = 0;
    }

    public arams(android.view.MarginLayoutParams marginlayoutparams)
    {
        super(marginlayoutparams);
        b = 0;
        leftMargin = marginlayoutparams.leftMargin;
        topMargin = marginlayoutparams.topMargin;
        rightMargin = marginlayoutparams.rightMargin;
        bottomMargin = marginlayoutparams.bottomMargin;
    }
}
