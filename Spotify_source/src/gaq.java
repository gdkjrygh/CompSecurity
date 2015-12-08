// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public final class gaq extends Animation
{

    private View a;
    private android.view.ViewGroup.MarginLayoutParams b;
    private int c;
    private int d;

    public gaq(View view, int i, boolean flag)
    {
        boolean flag1 = false;
        super();
        a = view;
        b = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int j;
        if (flag)
        {
            j = 0;
        } else
        {
            j = -i;
        }
        c = j;
        j = ((flag1) ? 1 : 0);
        if (flag)
        {
            j = -i;
        }
        d = j;
        setDuration(400L);
        b.topMargin = c;
    }

    protected final void applyTransformation(float f, Transformation transformation)
    {
        b.topMargin = c + (int)((float)(d - c) * f);
        a.requestLayout();
    }

    public final boolean getTransformation(long l, Transformation transformation)
    {
        boolean flag = super.getTransformation(l, transformation);
        if (!flag && hasEnded())
        {
            b.topMargin = 0;
        }
        return flag;
    }
}
