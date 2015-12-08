// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.os.Bundle;
import com.google.android.gms.games.appcontent.AppContentAction;
import com.google.android.gms.games.appcontent.AppContentSection;
import com.google.android.gms.games.ui.GamesFragmentActivity;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            ExtendedAppContentAction, ExtendedAppContentSection, AppContentFragment

public final class UpgradeToPlusAction extends ExtendedAppContentAction
{

    public UpgradeToPlusAction(ExtendedAppContentSection extendedappcontentsection, AppContentAction appcontentaction, ExtendedAppContentAction.EventListener eventlistener)
    {
        super(extendedappcontentsection, appcontentaction, eventlistener);
    }

    public final void execute()
    {
        mSection.mFragment.getLogSource();
        Integer integer = null;
        Bundle bundle = mSection.mSection.getExtras();
        if (bundle.containsKey("upgradeToPlusSubSource"))
        {
            integer = Integer.valueOf(bundle.getInt("upgradeToPlusSubSource"));
        }
        ((GamesFragmentActivity)mSection.mContext).launchPlusUpgradeFlow(2, integer);
    }

    public final int getLogflowUiElementType()
    {
        return 1143;
    }
}
