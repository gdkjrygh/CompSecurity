// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.b;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.achievement.AchievementBuffer;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class NT extends b
    implements com.google.android.gms.games.achievement.Y
{

    private final AchievementBuffer NT;

    public AchievementBuffer getAchievements()
    {
        return NT;
    }

    (DataHolder dataholder)
    {
        super(dataholder);
        NT = new AchievementBuffer(dataholder);
    }
}
