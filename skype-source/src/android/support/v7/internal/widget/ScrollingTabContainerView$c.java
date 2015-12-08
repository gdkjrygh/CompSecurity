// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v4.view.aj;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            ScrollingTabContainerView

protected final class b
    implements aj
{

    final ScrollingTabContainerView a;
    private boolean b;
    private int c;

    public final void a(View view)
    {
        a.setVisibility(0);
        b = false;
    }

    public final void b(View view)
    {
        if (b)
        {
            return;
        } else
        {
            a.d = null;
            a.setVisibility(c);
            return;
        }
    }

    public final void c(View view)
    {
        b = true;
    }

    protected (ScrollingTabContainerView scrollingtabcontainerview)
    {
        a = scrollingtabcontainerview;
        super();
        b = false;
    }
}
