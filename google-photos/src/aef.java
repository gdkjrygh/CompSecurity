// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class aef extends aee
{

    aef(aex aex1)
    {
        super(aex1, (byte)0);
    }

    public final int a(View view)
    {
        aez aez1 = (aez)view.getLayoutParams();
        return a.getDecoratedLeft(view) - aez1.leftMargin;
    }

    public final void a(int i)
    {
        a.offsetChildrenHorizontal(i);
    }

    public final int b()
    {
        return a.getPaddingLeft();
    }

    public final int b(View view)
    {
        aez aez1 = (aez)view.getLayoutParams();
        int i = a.getDecoratedRight(view);
        return aez1.rightMargin + i;
    }

    public final int c()
    {
        return a.getWidth() - a.getPaddingRight();
    }

    public final int c(View view)
    {
        aez aez1 = (aez)view.getLayoutParams();
        int i = a.getDecoratedMeasuredWidth(view);
        int j = aez1.leftMargin;
        return aez1.rightMargin + (i + j);
    }

    public final int d()
    {
        return a.getWidth();
    }

    public final int d(View view)
    {
        aez aez1 = (aez)view.getLayoutParams();
        int i = a.getDecoratedMeasuredHeight(view);
        int j = aez1.topMargin;
        return aez1.bottomMargin + (i + j);
    }

    public final int e()
    {
        return a.getWidth() - a.getPaddingLeft() - a.getPaddingRight();
    }

    public final int f()
    {
        return a.getPaddingRight();
    }
}
