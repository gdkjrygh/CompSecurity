// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

// Referenced classes of package android.support.v7.widget:
//            LinearLayoutCompat

public static class gravity extends android.view.LayoutParams
{

    public int gravity;
    public float weight;

    public (int i, int j)
    {
        super(i, j);
        gravity = -1;
        weight = 0.0F;
    }

    public weight(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        gravity = -1;
        context = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.ayout);
        weight = context.getFloat(android.support.v7.appcompat.ayout_android_layout_weight, 0.0F);
        gravity = context.getInt(android.support.v7.appcompat.ayout_android_layout_gravity, -1);
        context.recycle();
    }

    public t_Layout_android_layout_gravity(android.view.LayoutParams layoutparams)
    {
        super(layoutparams);
        gravity = -1;
    }
}
