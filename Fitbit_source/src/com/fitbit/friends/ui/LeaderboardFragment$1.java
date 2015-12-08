// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.friends.ui;

import android.content.Intent;

// Referenced classes of package com.fitbit.friends.ui:
//            LeaderboardFragment, ProfilePhotoUploader

class c
    implements Runnable
{

    final int a;
    final int b;
    final Intent c;
    final LeaderboardFragment d;

    public void run()
    {
        android.support.v4.app.Fragment fragment = d.getParentFragment();
        Object obj = fragment;
        if (fragment == null)
        {
            obj = d;
        }
        switch (a)
        {
        default:
            return;

        case 4906: 
            android.net.Uri uri = ProfilePhotoUploader.a(b, c);
            LeaderboardFragment.a(d).a(((android.support.v4.app.Fragment) (obj)), b, uri);
            return;

        case 4907: 
            android.net.Uri uri1 = ProfilePhotoUploader.b(b, c);
            LeaderboardFragment.a(d).a(((android.support.v4.app.Fragment) (obj)), b, uri1);
            return;

        case 4908: 
            obj = ProfilePhotoUploader.c(b, c);
            break;
        }
        LeaderboardFragment.a(d).a(b, ((android.net.Uri) (obj)));
    }

    (LeaderboardFragment leaderboardfragment, int i, int j, Intent intent)
    {
        d = leaderboardfragment;
        a = i;
        b = j;
        c = intent;
        super();
    }
}
