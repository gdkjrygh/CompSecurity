// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            AchievementsImpl

class wz
    implements com.google.android.gms.games.achievement.Result
{

    final wz JX;
    final Status wz;

    public String getAchievementId()
    {
        return esult(JX);
    }

    public Status getStatus()
    {
        return wz;
    }

    esult(esult esult, Status status)
    {
        JX = esult;
        wz = status;
        super();
    }
}
