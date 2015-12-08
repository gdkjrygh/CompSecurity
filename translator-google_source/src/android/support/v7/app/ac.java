// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v4.view.bt;
import android.support.v4.view.dq;
import android.support.v4.view.eh;
import android.support.v7.internal.widget.ActionBarContextView;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7

final class ac extends eh
{

    final AppCompatDelegateImplV7 a;

    ac(AppCompatDelegateImplV7 appcompatdelegateimplv7)
    {
        a = appcompatdelegateimplv7;
        super();
    }

    public final void a(View view)
    {
        a.q.setVisibility(0);
        a.q.sendAccessibilityEvent(32);
        if (a.q.getParent() != null)
        {
            bt.p((View)a.q.getParent());
        }
    }

    public final void b(View view)
    {
        bt.b(a.q, 1.0F);
        a.t.a(null);
        a.t = null;
    }
}
