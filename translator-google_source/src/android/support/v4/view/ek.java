// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.WindowInsets;

// Referenced classes of package android.support.v4.view:
//            ej

final class ek extends ej
{

    final WindowInsets a;

    ek(WindowInsets windowinsets)
    {
        a = windowinsets;
    }

    public final int a()
    {
        return a.getSystemWindowInsetLeft();
    }

    public final ej a(int i, int j, int k, int l)
    {
        return new ek(a.replaceSystemWindowInsets(i, j, k, l));
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
