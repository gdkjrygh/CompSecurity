// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            AchievementsImpl

private static abstract class xG extends com.google.android.gms.games.
{

    private final String xG;

    static String a(xG xg)
    {
        return xg.xG;
    }

    public Result c(Status status)
    {
        return w(status);
    }

    public com.google.android.gms.games.achievement.ntResult w(Status status)
    {
        return new com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult(status) {

            final AchievementsImpl.UpdateImpl Pl;
            final Status yJ;

            public String getAchievementId()
            {
                return AchievementsImpl.UpdateImpl.a(Pl);
            }

            public Status getStatus()
            {
                return yJ;
            }

            
            {
                Pl = AchievementsImpl.UpdateImpl.this;
                yJ = status;
                super();
            }
        };
    }

    public _cls1.yJ(String s)
    {
        xG = s;
    }
}
