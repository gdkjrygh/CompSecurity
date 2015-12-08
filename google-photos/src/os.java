// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.WindowInsets;

public final class os extends or
{

    public final WindowInsets a;

    public os(WindowInsets windowinsets)
    {
        a = windowinsets;
    }

    public final int a()
    {
        return a.getSystemWindowInsetLeft();
    }

    public final or a(int i, int j, int k, int l)
    {
        return new os(a.replaceSystemWindowInsets(i, j, k, l));
    }

    public final int b()
    {
        return a.getSystemWindowInsetTop();
    }

    public final int c()
    {
        return a.getSystemWindowInsetRight();
    }

    public final int d()
    {
        return a.getSystemWindowInsetBottom();
    }
}
