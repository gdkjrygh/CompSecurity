// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import com.cardinalblue.android.piccollage.model.gson.FbFriendRequest;
import com.cardinalblue.android.piccollage.view.a.h;
import com.cardinalblue.android.piccollage.view.a.s;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            FbFriendListActivity

class a
    implements com.cardinalblue.android.piccollage.controller.network.
{

    final FbFriendListActivity a;

    public void a(FbFriendRequest fbfriendrequest)
    {
        ((h)FbFriendListActivity.b(a).c()).a();
        FbFriendListActivity.a(a, fbfriendrequest);
    }

    public void a(Throwable throwable)
    {
        FbFriendListActivity.a(a, throwable);
    }

    (FbFriendListActivity fbfriendlistactivity)
    {
        a = fbfriendlistactivity;
        super();
    }
}
