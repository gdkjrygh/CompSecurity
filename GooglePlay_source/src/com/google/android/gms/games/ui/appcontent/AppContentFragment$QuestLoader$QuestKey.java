// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;


// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            AppContentFragment

private final class questId
{

    public final String applicationId;
    public final String playerId;
    public final String questId;
    final questId this$0;

    public final boolean equals(Object obj)
    {
        if (obj instanceof questId)
        {
            if (this == obj)
            {
                return true;
            }
            obj = (questId)obj;
            if (applicationId.equals(((applicationId) (obj)).applicationId) && playerId.equals(((playerId) (obj)).playerId) && questId.equals(questId))
            {
                return true;
            }
        }
        return false;
    }

    public final String toString()
    {
        return (new StringBuilder(applicationId)).append(",").append(playerId).append(",").append(questId).toString();
    }

    public (String s, String s1, String s2)
    {
        this$0 = this._cls0.this;
        super();
        applicationId = s;
        playerId = s1;
        questId = s2;
    }
}
