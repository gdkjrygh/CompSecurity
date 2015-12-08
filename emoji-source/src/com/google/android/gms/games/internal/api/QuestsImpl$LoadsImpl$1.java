// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.quest.QuestBuffer;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            QuestsImpl

class yJ
    implements com.google.android.gms.games.quest.
{

    final yJ Qv;
    final Status yJ;

    public QuestBuffer getQuests()
    {
        return null;
    }

    public Status getStatus()
    {
        return yJ;
    }

    public void release()
    {
    }

    ( , Status status)
    {
        Qv = ;
        yJ = status;
        super();
    }
}
