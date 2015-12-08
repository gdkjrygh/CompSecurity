// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.quest.Quest;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            QuestsImpl

private static abstract class <init> extends com.google.android.gms.games.odImpl
{

    public final volatile Result createFailedResult(final Status status)
    {
        return new com.google.android.gms.games.quest.Quests.AcceptQuestResult() {

            final QuestsImpl.AcceptImpl this$0;
            final Status val$status;

            public final Quest getQuest()
            {
                return null;
            }

            public final Status getStatus()
            {
                return status;
            }

            
            {
                this$0 = QuestsImpl.AcceptImpl.this;
                status = status1;
                super();
            }
        };
    }

    private _cls1.val.status(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }

    (GoogleApiClient googleapiclient, byte byte0)
    {
        this(googleapiclient);
    }
}
