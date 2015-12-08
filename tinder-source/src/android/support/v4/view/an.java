// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.WindowInsets;

// Referenced classes of package android.support.v4.view:
//            am

final class an extends am
{

    final WindowInsets a;

    an(WindowInsets windowinsets)
    {
        a = windowinsets;
    }

    public final int a()
    {
        return a.getSystemWindowInsetLeft();
    }

    public final am a(int i, int j, int k, int l)
    {
        return new an(a.replaceSystemWindowInsets(i, j, k, l));
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

    public final boolean e()
    {
        return a.isConsumed();
    }

    public final am f()
    {
        return new an(a.consumeSystemWindowInsets());
    }
}
