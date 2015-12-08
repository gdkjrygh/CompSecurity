// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.a;

import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.w;
import android.support.v7.internal.widget.y;

// Referenced classes of package android.support.v7.internal.a:
//            b

final class c
    implements w
{

    final b a;
    private boolean b;

    c(b b1)
    {
        a = b1;
        super();
    }

    public final void a(i i, boolean flag)
    {
        if (b)
        {
            return;
        }
        b = true;
        a.a.l();
        if (a.b != null)
        {
            a.b.onPanelClosed(108, i);
        }
        b = false;
    }

    public final boolean a_(i i)
    {
        if (a.b != null)
        {
            a.b.onMenuOpened(108, i);
            return true;
        } else
        {
            return false;
        }
    }
}
