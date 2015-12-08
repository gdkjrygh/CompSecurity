// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v4.view.af;
import android.support.v4.view.ak;
import android.support.v4.view.x;
import android.support.v7.internal.widget.ActionBarContextView;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7

final class a extends ak
{

    final AppCompatDelegateImplV7 a;

    public final void a(View view)
    {
        a.n.setVisibility(0);
        a.n.sendAccessibilityEvent(32);
        if (a.n.getParent() != null)
        {
            x.w((View)a.n.getParent());
        }
    }

    public final void b(View view)
    {
        x.c(a.n, 1.0F);
        a.q.a(null);
        a.q = null;
    }

    xtView(AppCompatDelegateImplV7 appcompatdelegateimplv7)
    {
        a = appcompatdelegateimplv7;
        super();
    }
}
