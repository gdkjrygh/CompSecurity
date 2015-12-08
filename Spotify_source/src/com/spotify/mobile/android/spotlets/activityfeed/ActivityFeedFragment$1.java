// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.activityfeed;

import an;
import android.database.Cursor;
import android.os.Bundle;
import cu;
import da;
import dtx;
import edo;
import gcw;

// Referenced classes of package com.spotify.mobile.android.spotlets.activityfeed:
//            ActivityFeedFragment

final class b
    implements an
{

    private String a[] = {
        "private_session"
    };
    private ActivityFeedFragment b;

    public final da a(Bundle bundle)
    {
        return new cu(b.k(), dtx.a, a, null, null);
    }

    public final void a()
    {
        ActivityFeedFragment.a(b).b = true;
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        if (obj != null && ((Cursor) (obj)).moveToFirst())
        {
            ActivityFeedFragment.a(b).b = gcw.a(((Cursor) (obj)), "private_session");
        }
    }

    (ActivityFeedFragment activityfeedfragment)
    {
        b = activityfeedfragment;
        super();
    }
}
