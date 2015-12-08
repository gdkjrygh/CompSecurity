// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import com.google.android.gms.games.appcontent.AppContentCondition;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            ExtendedAppContentSection, AppContentFragment

public abstract class ExtendedAppContentCondition
{
    public static interface EventListener
    {

        public abstract void onConditionChanged$7a33ab32();
    }


    protected final AppContentCondition mCondition;
    protected final EventListener mEventListener;
    protected final ExtendedAppContentSection mSection;

    public ExtendedAppContentCondition(ExtendedAppContentSection extendedappcontentsection, AppContentCondition appcontentcondition, EventListener eventlistener)
    {
        mSection = extendedappcontentsection;
        mCondition = appcontentcondition;
        mEventListener = eventlistener;
    }

    public abstract boolean evaluate();

    public final boolean getDefaultBoolean()
    {
        return Boolean.valueOf(mCondition.getDefaultValue()).booleanValue();
    }

    public final boolean getExpectedBoolean()
    {
        return Boolean.valueOf(mCondition.getExpectedValue()).booleanValue();
    }

    public final AppContentFragment getFragment()
    {
        return mSection.mFragment;
    }
}
