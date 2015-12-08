// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.WindowInsets;

// Referenced classes of package android.support.v4.view:
//            ek, bd

final class ci
    implements android.view.View.OnApplyWindowInsetsListener
{

    final bd a;

    ci(bd bd1)
    {
        a = bd1;
        super();
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowinsets)
    {
        windowinsets = new ek(windowinsets);
        return ((ek)a.a(view, windowinsets)).a;
    }
}
