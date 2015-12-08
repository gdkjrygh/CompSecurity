// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.internal.widget.ActionBarContextView;
import android.view.View;

final class tj extends op
{

    private td a;

    tj(td td1)
    {
        a = td1;
        super();
    }

    public final void a(View view)
    {
        a.q.setVisibility(0);
        a.q.sendAccessibilityEvent(32);
        if (a.q.getParent() != null)
        {
            mk.u((View)a.q.getParent());
        }
    }

    public final void b(View view)
    {
        mk.c(a.q, 1.0F);
        a.t.a(null);
        a.t = null;
    }
}
