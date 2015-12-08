// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.achievement.AchievementBuffer;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            AchievementsImpl

class CW
    implements com.google.android.gms.games.achievement.sResult
{

    final Status CW;
    final CW Yl;

    public AchievementBuffer getAchievements()
    {
        return new AchievementBuffer(DataHolder.as(14));
    }

    public Status getStatus()
    {
        return CW;
    }

    public void release()
    {
    }

    Result(Result result, Status status)
    {
        Yl = result;
        CW = status;
        super();
    }
}
