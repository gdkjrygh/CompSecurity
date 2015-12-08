// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v7.internal.view.menu.g;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            a, h

class e
    implements Runnable
{

    final a a;
    private h b;

    public e(a a1, h h1)
    {
        a = a1;
        super();
        b = h1;
    }

    public void run()
    {
        android.support.v7.widget.a.f(a).e();
        View view = (View)android.support.v7.widget.a.g(a);
        if (view != null && view.getWindowToken() != null && b.d())
        {
            android.support.v7.widget.a.a(a, b);
        }
        android.support.v7.widget.a.a(a, null);
    }
}
