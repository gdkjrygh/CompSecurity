// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import com.google.android.gms.games.Games;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesFragmentActivity

final class this._cls0
    implements Runnable
{

    final GamesFragmentActivity this$0;

    public final void run()
    {
        com.google.android.gms.common.api.GoogleApiClient googleapiclient = getGoogleApiClient();
        String s = Games.getCurrentAccountName(googleapiclient);
        Games.signOut(googleapiclient);
        switchAccount(s);
    }

    ()
    {
        this$0 = GamesFragmentActivity.this;
        super();
    }
}
