// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.support.v4.app.Fragment;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.G;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            InstallPackageAction, AppContentFragment

final class LoadedCallback extends LoadedCallback
{

    final InstallPackageAction this$0;
    final String val$gameId;

    public final void onGameLoadFailed()
    {
        GamesLog.e("InstallPkgAct", (new StringBuilder("Game load failed for applicationId ")).append(val$gameId).toString());
    }

    public final void onGameLoaded(GameFirstParty gamefirstparty)
    {
        gamefirstparty = gamefirstparty.getGame().getInstancePackageName();
        if (((Boolean)G.useInAppPurchaseFlow.get()).booleanValue())
        {
            ((GamesFragmentActivity)((Fragment) (mFragment)).mActivity).launchFinskyLightInstallation(mFragment.mCurrentAccountName, gamefirstparty);
            return;
        } else
        {
            UiUtils.viewInPlayStore(((Fragment) (mFragment)).mActivity, gamefirstparty, "GPG_appContentCard");
            return;
        }
    }

    LoadedCallback()
    {
        this$0 = final_installpackageaction;
        val$gameId = String.this;
        super();
    }
}
