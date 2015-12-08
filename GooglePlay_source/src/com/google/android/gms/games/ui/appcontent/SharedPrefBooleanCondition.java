// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.games.appcontent.AppContentCondition;
import com.google.android.gms.games.ui.destination.sharedprefs.SharedPrefsConfig;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            ExtendedAppContentCondition, ExtendedAppContentSection

public final class SharedPrefBooleanCondition extends ExtendedAppContentCondition
    implements android.content.SharedPreferences.OnSharedPreferenceChangeListener
{

    private final String mPreferenceKey;

    public SharedPrefBooleanCondition(ExtendedAppContentSection extendedappcontentsection, AppContentCondition appcontentcondition, ExtendedAppContentCondition.EventListener eventlistener)
    {
        super(extendedappcontentsection, appcontentcondition, eventlistener);
        SharedPrefsConfig.registerListener(mSection.mContext, this);
        mPreferenceKey = mCondition.getPredicateParameters().getString("prefName");
    }

    public final boolean evaluate()
    {
        return getExpectedBoolean() == SharedPrefsConfig.getBoolean(mSection.mContext, mPreferenceKey, getDefaultBoolean());
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
    {
        if (s.equals(mPreferenceKey))
        {
            mEventListener.onConditionChanged$7a33ab32();
        }
    }
}
