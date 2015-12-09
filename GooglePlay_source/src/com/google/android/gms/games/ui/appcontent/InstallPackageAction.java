// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.appcontent.AppContentAction;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.G;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            ExtendedAppContentAction, AppContentFragment, ExtendedAppContentSection

public final class InstallPackageAction extends ExtendedAppContentAction
    implements com.google.android.gms.games.ui.GamesFragment.OnActivityResultListener
{

    public InstallPackageAction(ExtendedAppContentSection extendedappcontentsection, AppContentAction appcontentaction, ExtendedAppContentAction.EventListener eventlistener)
    {
        super(extendedappcontentsection, appcontentaction, eventlistener);
        mFragment.registerOnActivityResultListener(this, new int[] {
            2
        });
    }

    public final void execute()
    {
        final String gameId = mAction.getExtras().getString("applicationId");
        if (TextUtils.isEmpty(gameId))
        {
            GamesLog.e("InstallPkgAct", "No applicationId specified.");
            return;
        } else
        {
            mFragment.getGame(gameId, new AppContentFragment.GameLoadedCallback() {

                final InstallPackageAction this$0;
                final String val$gameId;

                public final void onGameLoadFailed()
                {
                    GamesLog.e("InstallPkgAct", (new StringBuilder("Game load failed for applicationId ")).append(gameId).toString());
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

            
            {
                this$0 = InstallPackageAction.this;
                gameId = s;
                super();
            }
            });
            return;
        }
    }

    public final int getLogflowUiElementType()
    {
        return 1147;
    }

    public final void onActivityResult(int i, int j, Intent intent)
    {
        if (j != -1)
        {
            return;
        } else
        {
            mEventListener.onActionChanged$5ea2ff71();
            return;
        }
    }
}
