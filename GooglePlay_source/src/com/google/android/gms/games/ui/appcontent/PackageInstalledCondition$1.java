// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import com.google.android.gms.games.Game;
import com.google.android.gms.games.client.games.GameFirstParty;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            PackageInstalledCondition

final class dCallback extends dCallback
{

    final PackageInstalledCondition this$0;

    public final void onGameLoaded(GameFirstParty gamefirstparty)
    {
        mPackageName = gamefirstparty.getGame().getInstancePackageName();
        if (mLoadState == 2)
        {
            mEventListener._mth7a33ab32();
        }
    }

    EventListener()
    {
        this$0 = PackageInstalledCondition.this;
        super();
    }
}
