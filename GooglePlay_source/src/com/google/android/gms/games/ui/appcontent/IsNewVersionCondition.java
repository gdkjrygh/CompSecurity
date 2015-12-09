// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.app.Activity;
import android.content.SharedPreferences;
import com.google.android.gms.games.app.PowerUpUtils;
import com.google.android.gms.games.appcontent.AppContentCondition;
import com.google.android.gms.games.ui.destination.sharedprefs.SharedPrefsConfig;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            ExtendedAppContentCondition, ExtendedAppContentSection

public final class IsNewVersionCondition extends ExtendedAppContentCondition
    implements android.content.SharedPreferences.OnSharedPreferenceChangeListener
{

    public IsNewVersionCondition(ExtendedAppContentSection extendedappcontentsection, AppContentCondition appcontentcondition, ExtendedAppContentCondition.EventListener eventlistener)
    {
        super(extendedappcontentsection, appcontentcondition, eventlistener);
        SharedPrefsConfig.registerListener(extendedappcontentsection.mContext, this);
    }

    public final boolean evaluate()
    {
        return PowerUpUtils.getPlayGamesVersionCode((Activity)mSection.mContext) > SharedPrefsConfig.getInt$607b6e67(mSection.mContext, "lastVersionWhatsNewShown");
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
    {
        if (s.equals("lastVersionWhatsNewShown"))
        {
            mEventListener.onConditionChanged$7a33ab32();
        }
    }
}
