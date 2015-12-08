// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.a;

import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.widget.y;
import android.view.MenuItem;

// Referenced classes of package android.support.v7.internal.a:
//            b

final class d
    implements j
{

    final b a;

    d(b b1)
    {
        a = b1;
        super();
    }

    public final void a(i i)
    {
        if (a.b != null)
        {
            if (a.a.g())
            {
                a.b.onPanelClosed(108, i);
            } else
            if (a.b.onPreparePanel(0, null, i))
            {
                a.b.onMenuOpened(108, i);
                return;
            }
        }
    }

    public final boolean a(i i, MenuItem menuitem)
    {
        return false;
    }
}
