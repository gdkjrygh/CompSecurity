// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.os.Bundle;
import com.google.android.gms.games.appcontent.AppContentAction;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.destination.sharedprefs.SharedPrefsConfig;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            ExtendedAppContentAction, ExtendedAppContentSection

public final class SetSharedPrefBooleanAction extends ExtendedAppContentAction
{

    public SetSharedPrefBooleanAction(ExtendedAppContentSection extendedappcontentsection, AppContentAction appcontentaction, ExtendedAppContentAction.EventListener eventlistener)
    {
        super(extendedappcontentsection, appcontentaction, eventlistener);
    }

    public final void execute()
    {
        Object obj = mAction.getExtras();
        String s = ((Bundle) (obj)).getString("prefName");
        obj = ((Bundle) (obj)).getString("setValue");
        if (s == null || obj == null)
        {
            GamesLog.e("SetSharedPrefBoolAct", "Inconsistent value provided to shared pref action.");
            return;
        } else
        {
            SharedPrefsConfig.setBoolean(getContext(), s, Boolean.valueOf(((String) (obj))).booleanValue());
            return;
        }
    }

    public final int getLogflowUiElementType()
    {
        return 1146;
    }
}
