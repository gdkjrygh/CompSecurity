// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v7.internal.view.menu.a;
import android.support.v7.widget.Toolbar;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            an

class ao
    implements android.view.View.OnClickListener
{

    final a a;
    final an b;

    ao(an an1)
    {
        b = an1;
        super();
        a = new a(android.support.v7.internal.widget.an.a(b).getContext(), 0, 0x102002c, 0, 0, an.b(b));
    }

    public void onClick(View view)
    {
        if (an.c(b) != null && an.d(b))
        {
            an.c(b).onMenuItemSelected(0, a);
        }
    }
}
