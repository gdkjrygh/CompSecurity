// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.b.k;
import android.util.AttributeSet;

public class ab extends android.view.ViewGroup.MarginLayoutParams
{

    public float g;
    public int h;

    public ab(int i, int j)
    {
        super(i, j);
        h = -1;
        g = 0.0F;
    }

    public ab(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        h = -1;
        context = context.obtainStyledAttributes(attributeset, k.LinearLayoutCompat_Layout);
        g = context.getFloat(k.LinearLayoutCompat_Layout_android_layout_weight, 0.0F);
        h = context.getInt(k.LinearLayoutCompat_Layout_android_layout_gravity, -1);
        context.recycle();
    }

    public ab(android.view.ViewGroup.LayoutParams layoutparams)
    {
        super(layoutparams);
        h = -1;
    }
}
