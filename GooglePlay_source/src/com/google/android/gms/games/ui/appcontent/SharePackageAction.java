// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.appcontent.AppContentAction;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.GamesFragmentActivity;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            ExtendedAppContentAction, AppContentFragment, ExtendedAppContentSection

public final class SharePackageAction extends ExtendedAppContentAction
{

    public SharePackageAction(ExtendedAppContentSection extendedappcontentsection, AppContentAction appcontentaction, ExtendedAppContentAction.EventListener eventlistener)
    {
        super(extendedappcontentsection, appcontentaction, eventlistener);
    }

    public final void execute()
    {
        final String applicationId = mAction.getExtras().getString("applicationId");
        if (applicationId == null || applicationId.isEmpty())
        {
            GamesLog.e("SharePackageAct", "No applicationId specified.");
            return;
        } else
        {
            mFragment.getGame(applicationId, new AppContentFragment.GameLoadedCallback() {

                final SharePackageAction this$0;
                final String val$applicationId;

                public final void onGameLoadFailed()
                {
                    GamesLog.e("SharePackageAct", (new StringBuilder("Game load failed for applicationId ")).append(applicationId).toString());
                }

                public final void onGameLoaded(GameFirstParty gamefirstparty)
                {
                    gamefirstparty = gamefirstparty.getGame();
                    ((GamesFragmentActivity)((Fragment) (mFragment)).mActivity).shareGame(gamefirstparty.getDisplayName(), gamefirstparty.getInstancePackageName());
                }

            
            {
                this$0 = SharePackageAction.this;
                applicationId = s;
                super();
            }
            });
            return;
        }
    }

    public final int getLogflowUiElementType()
    {
        return 1141;
    }
}
