// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

// Referenced classes of package android.support.v4.widget:
//            DrawerLayout

public final class x extends android.view.ViewGroup.MarginLayoutParams
{

    public int a;
    float b;
    boolean c;
    boolean d;

    public x()
    {
        super(-1, -1);
        a = 0;
    }

    public x(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 0;
        context = context.obtainStyledAttributes(attributeset, DrawerLayout.a());
        a = context.getInt(0, 0);
        context.recycle();
    }

    public x(x x1)
    {
        super(x1);
        a = 0;
        a = x1.a;
    }

    public x(android.view.ViewGroup.LayoutParams layoutparams)
    {
        super(layoutparams);
        a = 0;
    }

    public x(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
    {
        super(marginlayoutparams);
        a = 0;
    }
}
