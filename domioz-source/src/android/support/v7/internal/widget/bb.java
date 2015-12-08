// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v7.internal.view.menu.a;
import android.support.v7.widget.Toolbar;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            ba

final class bb
    implements android.view.View.OnClickListener
{

    final a a;
    final ba b;

    bb(ba ba1)
    {
        b = ba1;
        super();
        a = new a(android.support.v7.internal.widget.ba.a(b).getContext(), ba.b(b));
    }

    public final void onClick(View view)
    {
        if (ba.c(b) != null && ba.d(b))
        {
            ba.c(b).onMenuItemSelected(0, a);
        }
    }
}
