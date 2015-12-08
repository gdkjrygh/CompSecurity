// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.activityfeed;

import android.view.View;
import android.widget.AdapterView;
import fxh;

// Referenced classes of package com.spotify.mobile.android.spotlets.activityfeed:
//            ActivityFeedFragment

final class a
    implements android.widget.lickListener
{

    private ActivityFeedFragment a;

    public final boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (fxh)view.findViewById(0x7f110012).getTag(0x7f110041);
        if (adapterview != null)
        {
            adapterview.a(a.k());
            return true;
        } else
        {
            return false;
        }
    }

    (ActivityFeedFragment activityfeedfragment)
    {
        a = activityfeedfragment;
        super();
    }
}
