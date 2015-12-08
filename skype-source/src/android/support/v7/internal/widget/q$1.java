// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v7.internal.view.menu.a;
import android.support.v7.widget.Toolbar;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            q

final class b
    implements android.view..OnClickListener
{

    final a a;
    final q b;

    public final void onClick(View view)
    {
        if (q.c(b) != null && q.d(b))
        {
            q.c(b).onMenuItemSelected(0, a);
        }
    }

    (q q1)
    {
        b = q1;
        super();
        a = new a(android.support.v7.internal.widget.q.a(b).getContext(), q.b(b));
    }
}
