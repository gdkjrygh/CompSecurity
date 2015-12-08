// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.quest.Quest;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            QuestsImpl

private static abstract class <init> extends com.google.android.gms.games.odImpl
{

    public com.google.android.gms.games.quest.lt ah(Status status)
    {
        return new com.google.android.gms.games.quest.Quests.AcceptQuestResult(status) {

            final Status CW;
            final QuestsImpl.AcceptImpl Zw;

            public Quest getQuest()
            {
                return null;
            }

            public Status getStatus()
            {
                return CW;
            }

            
            {
                Zw = QuestsImpl.AcceptImpl.this;
                CW = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return ah(status);
    }

    private _cls1.CW()
    {
    }

    _cls1.CW(_cls1.CW cw)
    {
        this();
    }
}
