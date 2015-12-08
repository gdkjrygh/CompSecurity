// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.achievement.AchievementBuffer;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            AchievementsImpl

final class val.status
    implements com.google.android.gms.games.achievement.sResult
{

    final val.status this$0;
    final Status val$status;

    public final AchievementBuffer getAchievements()
    {
        return new AchievementBuffer(DataHolder.empty(14));
    }

    public final Status getStatus()
    {
        return val$status;
    }

    public final void release()
    {
    }

    Result()
    {
        this$0 = final_result;
        val$status = Status.this;
        super();
    }
}
