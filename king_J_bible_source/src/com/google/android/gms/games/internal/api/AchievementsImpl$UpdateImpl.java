// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            AchievementsImpl

private static abstract class wp extends com.google.android.gms.games.
{

    private final String wp;

    static String a(wp wp1)
    {
        return wp1.wp;
    }

    public Result d(Status status)
    {
        return u(status);
    }

    public com.google.android.gms.games.achievement.ntResult u(Status status)
    {
        return new com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult(status) {

            final AchievementsImpl.UpdateImpl JX;
            final Status wz;

            public String getAchievementId()
            {
                return AchievementsImpl.UpdateImpl.a(JX);
            }

            public Status getStatus()
            {
                return wz;
            }

            
            {
                JX = AchievementsImpl.UpdateImpl.this;
                wz = status;
                super();
            }
        };
    }

    public _cls1.wz(String s)
    {
        wp = s;
    }
}
