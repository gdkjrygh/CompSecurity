// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.activityfeed;

import android.content.DialogInterface;
import com.spotify.mobile.android.spotlets.activityfeed.model.ResourceModel;
import gms;
import u;

// Referenced classes of package com.spotify.mobile.android.spotlets.activityfeed:
//            ActivityFeedFragment

final class a
    implements android.content.Listener
{

    private ResourceModel a;
    private ActivityFeedFragment b;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        b.k().startActivity(gms.a(b.k(), a.getParent().getUri()).a);
    }

    (ActivityFeedFragment activityfeedfragment, ResourceModel resourcemodel)
    {
        b = activityfeedfragment;
        a = resourcemodel;
        super();
    }
}
