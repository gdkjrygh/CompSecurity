// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.WindowInsets;

// Referenced classes of package android.support.v4.view:
//            ds, bi

final class cd
    implements android.view.View.OnApplyWindowInsetsListener
{

    final bi a;

    cd(bi bi1)
    {
        a = bi1;
        super();
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowinsets)
    {
        windowinsets = new ds(windowinsets);
        return ((ds)a.a(view, windowinsets)).e();
    }
}
