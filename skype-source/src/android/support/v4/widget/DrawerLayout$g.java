// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

// Referenced classes of package android.support.v4.widget:
//            DrawerLayout

public static final class a extends android.view.nLayoutParams
{

    public int a;
    float b;
    boolean c;
    boolean d;

    public ()
    {
        super(-1, -1);
        a = 0;
    }

    public a(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 0;
        context = context.obtainStyledAttributes(attributeset, DrawerLayout.f());
        a = context.getInt(0, 0);
        context.recycle();
    }

    public (a a1)
    {
        super(a1);
        a = 0;
        a = a1.a;
    }

    public a(android.view.tParams tparams)
    {
        super(tparams);
        a = 0;
    }

    public (android.view.nLayoutParams nlayoutparams)
    {
        super(nlayoutparams);
        a = 0;
    }
}
