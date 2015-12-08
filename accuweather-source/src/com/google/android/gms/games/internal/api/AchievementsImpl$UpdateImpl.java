// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            AchievementsImpl

private static abstract class xD extends com.google.android.gms.games.
{

    private final String xD;

    static String a(xD xd)
    {
        return xd.xD;
    }

    public Result c(Status status)
    {
        return w(status);
    }

    public com.google.android.gms.games.achievement.ntResult w(Status status)
    {
        return new com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult(status) {

            final AchievementsImpl.UpdateImpl Pi;
            final Status yG;

            public String getAchievementId()
            {
                return AchievementsImpl.UpdateImpl.a(Pi);
            }

            public Status getStatus()
            {
                return yG;
            }

            
            {
                Pi = AchievementsImpl.UpdateImpl.this;
                yG = status;
                super();
            }
        };
    }

    public _cls1.yG(String s)
    {
        xD = s;
    }
}
