// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.appcontent.AppContentAction;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.dialog.PrebuiltDialogs;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            ExtendedAppContentAction, AppContentFragment, ExtendedAppContentSection

public final class StartRecordingAction extends ExtendedAppContentAction
{

    public StartRecordingAction(ExtendedAppContentSection extendedappcontentsection, AppContentAction appcontentaction, ExtendedAppContentAction.EventListener eventlistener)
    {
        super(extendedappcontentsection, appcontentaction, eventlistener);
    }

    public final void execute()
    {
        final String gameId = mAction.getExtras().getString("applicationId");
        mFragment.getGame(gameId, new AppContentFragment.GameLoadedCallback() {

            final StartRecordingAction this$0;
            final String val$gameId;

            public final void onGameLoaded(GameFirstParty gamefirstparty)
            {
                gamefirstparty = gamefirstparty.getGame();
                PrebuiltDialogs.showVideoRecordingPrerecordDialog((GamesFragmentActivity)((Fragment) (mFragment)).mActivity, gameId, gamefirstparty.getInstancePackageName(), null);
            }

            
            {
                this$0 = StartRecordingAction.this;
                gameId = s;
                super();
            }
        });
    }

    public final int getLogflowUiElementType()
    {
        return 1154;
    }
}
