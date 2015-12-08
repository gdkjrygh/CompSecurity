// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class aeg extends aee
{

    aeg(aex aex1)
    {
        super(aex1, (byte)0);
    }

    public final int a(View view)
    {
        aez aez1 = (aez)view.getLayoutParams();
        return a.getDecoratedTop(view) - aez1.topMargin;
    }

    public final void a(int i)
    {
        a.offsetChildrenVertical(i);
    }

    public final int b()
    {
        return a.getPaddingTop();
    }

    public final int b(View view)
    {
        aez aez1 = (aez)view.getLayoutParams();
        int i = a.getDecoratedBottom(view);
        return aez1.bottomMargin + i;
    }

    public final int c()
    {
        return a.getHeight() - a.getPaddingBottom();
    }

    public final int c(View view)
    {
        aez aez1 = (aez)view.getLayoutParams();
        int i = a.getDecoratedMeasuredHeight(view);
        int j = aez1.topMargin;
        return aez1.bottomMargin + (i + j);
    }

    public final int d()
    {
        return a.getHeight();
    }

    public final int d(View view)
    {
        aez aez1 = (aez)view.getLayoutParams();
        int i = a.getDecoratedMeasuredWidth(view);
        int j = aez1.leftMargin;
        return aez1.rightMargin + (i + j);
    }

    public final int e()
    {
        return a.getHeight() - a.getPaddingTop() - a.getPaddingBottom();
    }

    public final int f()
    {
        return a.getPaddingBottom();
    }
}
