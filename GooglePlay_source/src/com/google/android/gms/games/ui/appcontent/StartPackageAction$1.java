// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            StartPackageAction

final class meLoadedCallback extends meLoadedCallback
{

    final StartPackageAction this$0;

    public final void onGameLoaded(GameFirstParty gamefirstparty)
    {
        UiUtils.launchGame(mContext, gamefirstparty.getGame(), null);
    }

    meLoadedCallback()
    {
        this$0 = StartPackageAction.this;
        super();
    }
}
