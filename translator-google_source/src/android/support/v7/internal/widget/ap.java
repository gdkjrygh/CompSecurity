// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v7.internal.view.menu.a;
import android.support.v7.widget.Toolbar;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            ao

final class ap
    implements android.view.View.OnClickListener
{

    final a a;
    final ao b;

    ap(ao ao1)
    {
        b = ao1;
        super();
        a = new a(b.a.getContext(), b.b);
    }

    public final void onClick(View view)
    {
        if (b.c != null && b.d)
        {
            b.c.onMenuItemSelected(0, a);
        }
    }
}
