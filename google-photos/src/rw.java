// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public class rw extends android.view.ViewGroup.MarginLayoutParams
{

    public int a;

    public rw(int i, int j)
    {
        super(i, j);
        a = 0;
        a = 0x800013;
    }

    public rw(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 0;
        context = context.obtainStyledAttributes(attributeset, uh.t);
        a = context.getInt(uh.u, 0);
        context.recycle();
    }

    public rw(android.view.ViewGroup.LayoutParams layoutparams)
    {
        super(layoutparams);
        a = 0;
    }

    public rw(rw rw1)
    {
        super(rw1);
        a = 0;
        a = rw1.a;
    }
}
