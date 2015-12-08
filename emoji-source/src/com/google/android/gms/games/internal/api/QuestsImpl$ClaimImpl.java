// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.quest.Milestone;
import com.google.android.gms.games.quest.Quest;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            QuestsImpl

private static abstract class <init> extends com.google.android.gms.games.hodImpl
{

    public com.google.android.gms.games.quest.Result T(Status status)
    {
        return new com.google.android.gms.games.quest.Quests.ClaimMilestoneResult(status) {

            final QuestsImpl.ClaimImpl Qu;
            final Status yJ;

            public Milestone getMilestone()
            {
                return null;
            }

            public Quest getQuest()
            {
                return null;
            }

            public Status getStatus()
            {
                return yJ;
            }

            
            {
                Qu = QuestsImpl.ClaimImpl.this;
                yJ = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return T(status);
    }

    private _cls1.yJ()
    {
    }

    _cls1.yJ(_cls1.yJ yj)
    {
        this();
    }
}
