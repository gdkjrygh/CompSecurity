// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            AchievementsImpl

private static abstract class BL extends com.google.android.gms.games.
{

    private final String BL;

    static String a(BL bl)
    {
        return bl.BL;
    }

    public com.google.android.gms.games.achievement.ntResult K(Status status)
    {
        return new com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult(status) {

            final Status CW;
            final AchievementsImpl.UpdateImpl Ym;

            public String getAchievementId()
            {
                return AchievementsImpl.UpdateImpl.a(Ym);
            }

            public Status getStatus()
            {
                return CW;
            }

            
            {
                Ym = AchievementsImpl.UpdateImpl.this;
                CW = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return K(status);
    }

    public _cls1.CW(String s)
    {
        BL = s;
    }
}
