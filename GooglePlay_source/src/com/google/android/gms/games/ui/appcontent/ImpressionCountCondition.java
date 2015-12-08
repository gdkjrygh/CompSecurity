// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.games.appcontent.AppContentCondition;
import com.google.android.gms.games.ui.G;
import com.google.android.gms.games.ui.destination.sharedprefs.SharedPrefsConfig;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            ExtendedAppContentCondition, ExtendedAppContentSection

public final class ImpressionCountCondition extends ExtendedAppContentCondition
    implements android.content.SharedPreferences.OnSharedPreferenceChangeListener
{

    private final String mCounterKey;
    private final String mCounterLastUpdatedKey;
    private final Integer mMaxImpressionCount;
    private boolean mReturnDefaultBoolean;

    public ImpressionCountCondition(ExtendedAppContentSection extendedappcontentsection, AppContentCondition appcontentcondition, ExtendedAppContentCondition.EventListener eventlistener)
    {
        super(extendedappcontentsection, appcontentcondition, eventlistener);
        SharedPrefsConfig.registerListener(mSection.mContext, this);
        mCounterKey = mCondition.getPredicateParameters().getString("impressionName");
        extendedappcontentsection = mCondition.getPredicateParameters().getString("impressionCount");
        if (Strings.isEmptyOrWhitespace(mCounterKey) || Strings.isEmptyOrWhitespace(extendedappcontentsection))
        {
            mReturnDefaultBoolean = true;
            mMaxImpressionCount = Integer.valueOf(0);
            mCounterLastUpdatedKey = null;
            return;
        } else
        {
            mMaxImpressionCount = Integer.valueOf(extendedappcontentsection);
            mCounterLastUpdatedKey = (new StringBuilder()).append(mCounterKey).append("-last-updated").toString();
            return;
        }
    }

    public final boolean evaluate()
    {
        boolean flag1 = true;
        if (mReturnDefaultBoolean)
        {
            flag1 = getDefaultBoolean();
        } else
        {
            android.content.Context context = mSection.mContext;
            int i = SharedPrefsConfig.getInt$607b6e67(context, mCounterKey);
            long l;
            long l1;
            boolean flag;
            if (i <= mMaxImpressionCount.intValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            l = SharedPrefsConfig.getLong(context, mCounterLastUpdatedKey, 0L);
            l1 = System.currentTimeMillis();
            if (l1 - l > ((Long)G.timeBetweenImpressionIncrementsMillis.get()).longValue())
            {
                SharedPrefsConfig.setLong(context, mCounterLastUpdatedKey, l1);
                SharedPrefsConfig.setInt(context, mCounterKey, i + 1);
            }
            if (getExpectedBoolean() != flag)
            {
                return false;
            }
        }
        return flag1;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
    {
        if (s.equals(mCounterKey))
        {
            mEventListener.onConditionChanged$7a33ab32();
        }
    }
}
