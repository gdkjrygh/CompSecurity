// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.os.Bundle;
import com.google.android.gms.games.appcontent.AppContentCondition;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            ExtendedAppContentCondition, ExtendedAppContentSection

public final class ApiLevelCondition extends ExtendedAppContentCondition
{

    private final int mApiLevel;

    public ApiLevelCondition(ExtendedAppContentSection extendedappcontentsection, AppContentCondition appcontentcondition, ExtendedAppContentCondition.EventListener eventlistener)
    {
        super(extendedappcontentsection, appcontentcondition, eventlistener);
        mApiLevel = Integer.valueOf(mCondition.getPredicateParameters().getString("apiLevel")).intValue();
    }

    public final boolean evaluate()
    {
        boolean flag;
        if (Integer.valueOf(android.os.Build.VERSION.SDK).intValue() >= mApiLevel)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return getExpectedBoolean() == flag;
    }
}
