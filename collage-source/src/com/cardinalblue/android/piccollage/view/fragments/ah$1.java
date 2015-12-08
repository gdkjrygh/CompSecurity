// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.view.MenuItem;
import com.cardinalblue.android.piccollage.controller.d;
import com.squareup.a.b;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            ah

class a
    implements android.support.v4.view.temCompat.OnActionExpandListener
{

    final ah a;

    public boolean onMenuItemActionCollapse(MenuItem menuitem)
    {
        return true;
    }

    public boolean onMenuItemActionExpand(MenuItem menuitem)
    {
        d.a().c(new <init>(null));
        a.a = null;
        return true;
    }

    tener(ah ah1)
    {
        a = ah1;
        super();
    }
}
