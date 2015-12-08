// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import android.widget.AbsListView;
import com.snapchat.android.analytics.RegistrationAnalytics;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import jl;

// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            NewUserContactBookFragment

final class a
    implements android.widget.wUserContactBookFragment._cls1
{

    private NewUserContactBookFragment a;

    public final void onScroll(AbsListView abslistview, int i, int j, int k)
    {
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (i == 0)
        {
            abslistview = NewUserContactBookFragment.a(a);
            jl jl1 = new jl();
            ((RegistrationAnalytics) (abslistview)).mBlizzardEventLogger.a(jl1);
        }
    }

    (NewUserContactBookFragment newusercontactbookfragment)
    {
        a = newusercontactbookfragment;
        super();
    }
}
