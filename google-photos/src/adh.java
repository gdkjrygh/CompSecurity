// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public class adh extends android.view.ViewGroup.MarginLayoutParams
{

    public float g;
    public int h;

    public adh(int i, int j)
    {
        super(i, j);
        h = -1;
        g = 0.0F;
    }

    public adh(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        h = -1;
        context = context.obtainStyledAttributes(attributeset, uh.ak);
        g = context.getFloat(uh.am, 0.0F);
        h = context.getInt(uh.al, -1);
        context.recycle();
    }

    public adh(android.view.ViewGroup.LayoutParams layoutparams)
    {
        super(layoutparams);
        h = -1;
    }
}
