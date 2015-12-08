// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.app.Activity;
import com.google.android.gms.games.app.PowerUpUtils;
import com.google.android.gms.games.appcontent.AppContentAction;
import com.google.android.gms.games.ui.destination.sharedprefs.SharedPrefsConfig;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            ExtendedAppContentAction, ExtendedAppContentSection

public final class DismissWhatsNewCardAction extends ExtendedAppContentAction
{

    public DismissWhatsNewCardAction(ExtendedAppContentSection extendedappcontentsection, AppContentAction appcontentaction, ExtendedAppContentAction.EventListener eventlistener)
    {
        super(extendedappcontentsection, appcontentaction, eventlistener);
    }

    public final void execute()
    {
        SharedPrefsConfig.setInt(getContext(), "lastVersionWhatsNewShown", PowerUpUtils.getPlayGamesVersionCode((Activity)mSection.mContext));
    }

    public final int getLogflowUiElementType()
    {
        return 1145;
    }
}
