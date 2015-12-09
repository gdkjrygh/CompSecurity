// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import com.google.android.gms.games.appcontent.AppContentCondition;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            ExtendedAppContentCondition, ExtendedAppContentSection, AppContentFragment

public final class ProfileIsVisibleCondition extends ExtendedAppContentCondition
    implements com.google.android.gms.games.ui.util.BaseGamesProfileVisibilityHelper.ProfileVisibilityInformer
{

    private boolean mProfileIsVisible;

    public ProfileIsVisibleCondition(ExtendedAppContentSection extendedappcontentsection, AppContentCondition appcontentcondition, ExtendedAppContentCondition.EventListener eventlistener)
    {
        super(extendedappcontentsection, appcontentcondition, eventlistener);
        eventlistener = extendedappcontentsection.mFragment;
        synchronized (((AppContentFragment) (eventlistener)).mVisibilityInformersLock)
        {
            ((AppContentFragment) (eventlistener)).mVisibilityInformers.add(this);
        }
        mProfileIsVisible = extendedappcontentsection.mFragment.mProfileIsVisible;
        return;
        extendedappcontentsection;
        appcontentcondition;
        JVM INSTR monitorexit ;
        throw extendedappcontentsection;
    }

    public final boolean evaluate()
    {
        return Boolean.valueOf(mCondition.getExpectedValue()).booleanValue() == mProfileIsVisible;
    }

    public final boolean getProfileVisibility()
    {
        return mProfileIsVisible;
    }

    public final void updateProfileVisibility(boolean flag)
    {
        mProfileIsVisible = flag;
        mEventListener.onConditionChanged$7a33ab32();
    }
}
