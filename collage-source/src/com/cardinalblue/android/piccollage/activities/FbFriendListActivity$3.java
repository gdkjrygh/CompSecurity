// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import com.cardinalblue.android.piccollage.view.a.h;
import com.cardinalblue.android.piccollage.view.a.s;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            FbFriendListActivity

class a
    implements android.support.v7.widget.istener
{

    final FbFriendListActivity a;

    public boolean onQueryTextChange(String s1)
    {
        if (FbFriendListActivity.b(a) != null)
        {
            ((h)FbFriendListActivity.b(a).c()).a(s1);
        }
        return false;
    }

    public boolean onQueryTextSubmit(String s1)
    {
        return false;
    }

    (FbFriendListActivity fbfriendlistactivity)
    {
        a = fbfriendlistactivity;
        super();
    }
}
