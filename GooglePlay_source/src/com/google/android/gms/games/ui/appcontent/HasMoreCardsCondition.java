// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import com.google.android.gms.games.appcontent.AppContentCondition;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.DatabufferRecyclerAdapter;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            ExtendedAppContentCondition, ExtendedAppContentSection

public final class HasMoreCardsCondition extends ExtendedAppContentCondition
{

    public HasMoreCardsCondition(ExtendedAppContentSection extendedappcontentsection, AppContentCondition appcontentcondition, ExtendedAppContentCondition.EventListener eventlistener)
    {
        super(extendedappcontentsection, appcontentcondition, eventlistener);
    }

    public final boolean evaluate()
    {
        if (!(mSection.mDataAdapter instanceof DatabufferRecyclerAdapter))
        {
            GamesLog.e("HasMoreCond", "HasMoreCondition set on unsupported adapter.");
        } else
        {
            DatabufferRecyclerAdapter databufferrecycleradapter = (DatabufferRecyclerAdapter)mSection.mDataAdapter;
            if (databufferrecycleradapter.mMaxNumItems == databufferrecycleradapter.getItemCount())
            {
                return true;
            }
        }
        return false;
    }
}
