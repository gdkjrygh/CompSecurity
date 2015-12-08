// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.MenuItem;

// Referenced classes of package android.support.v7.widget:
//            Toolbar

final class a
    implements View.e
{

    final Toolbar a;

    public final boolean a(MenuItem menuitem)
    {
        if (Toolbar.a(a) != null)
        {
            return Toolbar.a(a).a(menuitem);
        } else
        {
            return false;
        }
    }

    View.e(Toolbar toolbar)
    {
        a = toolbar;
        super();
    }
}
