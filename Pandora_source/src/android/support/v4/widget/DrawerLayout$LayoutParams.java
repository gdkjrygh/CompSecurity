// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

// Referenced classes of package android.support.v4.widget:
//            DrawerLayout

public static class a extends android.view.ms
{

    public int a;
    float b;
    boolean c;
    boolean d;

    public _cls9(int i, int j)
    {
        super(i, j);
        a = 0;
    }

    public a(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 0;
        context = context.obtainStyledAttributes(attributeset, DrawerLayout.d());
        a = context.getInt(0, 0);
        context.recycle();
    }

    public a(a a1)
    {
        super(a1);
        a = 0;
        a = a1.a;
    }

    public a(android.view.LayoutParams layoutparams)
    {
        super(layoutparams);
        a = 0;
    }

    public a(android.view.ms ms)
    {
        super(ms);
        a = 0;
    }
}
