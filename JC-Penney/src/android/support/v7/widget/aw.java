// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.MenuItem;

// Referenced classes of package android.support.v7.widget:
//            o, Toolbar, bb

class aw
    implements o
{

    final Toolbar a;

    aw(Toolbar toolbar)
    {
        a = toolbar;
        super();
    }

    public boolean a(MenuItem menuitem)
    {
        if (Toolbar.a(a) != null)
        {
            return Toolbar.a(a).a(menuitem);
        } else
        {
            return false;
        }
    }
}
