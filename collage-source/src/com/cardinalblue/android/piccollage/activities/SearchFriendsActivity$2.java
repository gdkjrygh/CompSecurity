// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.view.MenuItem;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            SearchFriendsActivity

class a
    implements android.support.v4.view.xpandListener
{

    final SearchFriendsActivity a;

    public boolean onMenuItemActionCollapse(MenuItem menuitem)
    {
        a.finish();
        return true;
    }

    public boolean onMenuItemActionExpand(MenuItem menuitem)
    {
        return true;
    }

    (SearchFriendsActivity searchfriendsactivity)
    {
        a = searchfriendsactivity;
        super();
    }
}
