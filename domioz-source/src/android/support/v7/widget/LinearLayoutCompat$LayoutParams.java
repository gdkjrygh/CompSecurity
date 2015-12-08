// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.a.l;
import android.util.AttributeSet;

public class h extends android.view.LayoutParams
{

    public float g;
    public int h;

    public (int i, int j)
    {
        super(i, j);
        h = -1;
        g = 0.0F;
    }

    public g(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        h = -1;
        context = context.obtainStyledAttributes(attributeset, l.S);
        g = context.getFloat(l.U, 0.0F);
        h = context.getInt(l.T, -1);
        context.recycle();
    }

    public h(android.view.LayoutParams layoutparams)
    {
        super(layoutparams);
        h = -1;
    }
}
