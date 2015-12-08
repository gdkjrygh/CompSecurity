// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import HZ;
import android.content.DialogInterface;
import com.snapchat.android.analytics.RegistrationAnalytics;

// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            NewUserContactBookFragment

final class a
    implements android.content.er
{

    private NewUserContactBookFragment a;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        NewUserContactBookFragment.a(a).b(true);
        if (NewUserContactBookFragment.b(a))
        {
            a.Y();
            return;
        } else
        {
            HZ.a(a.F);
            return;
        }
    }

    (NewUserContactBookFragment newusercontactbookfragment)
    {
        a = newusercontactbookfragment;
        super();
    }
}
