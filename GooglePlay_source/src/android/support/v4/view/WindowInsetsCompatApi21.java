// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.WindowInsets;

// Referenced classes of package android.support.v4.view:
//            WindowInsetsCompat

final class WindowInsetsCompatApi21 extends WindowInsetsCompat
{

    final WindowInsets mSource;

    WindowInsetsCompatApi21(WindowInsets windowinsets)
    {
        mSource = windowinsets;
    }

    public final int getSystemWindowInsetBottom()
    {
        return mSource.getSystemWindowInsetBottom();
    }

    public final int getSystemWindowInsetLeft()
    {
        return mSource.getSystemWindowInsetLeft();
    }

    public final int getSystemWindowInsetRight()
    {
        return mSource.getSystemWindowInsetRight();
    }

    public final int getSystemWindowInsetTop()
    {
        return mSource.getSystemWindowInsetTop();
    }

    public final WindowInsetsCompat replaceSystemWindowInsets(int i, int j, int k, int l)
    {
        return new WindowInsetsCompatApi21(mSource.replaceSystemWindowInsets(i, j, k, l));
    }
}
