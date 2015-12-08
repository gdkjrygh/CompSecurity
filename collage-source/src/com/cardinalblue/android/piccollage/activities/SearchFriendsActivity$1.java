// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.text.TextUtils;
import com.cardinalblue.android.piccollage.view.fragments.ad;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            SearchFriendsActivity

class a
    implements android.support.v7.widget.stener
{

    final SearchFriendsActivity a;

    public boolean onQueryTextChange(String s)
    {
        return false;
    }

    public boolean onQueryTextSubmit(String s)
    {
        if (SearchFriendsActivity.a(a) != null && !TextUtils.isEmpty(s))
        {
            SearchFriendsActivity.a(a).a(new String[] {
                "q", s
            });
        }
        return false;
    }

    (SearchFriendsActivity searchfriendsactivity)
    {
        a = searchfriendsactivity;
        super();
    }
}
