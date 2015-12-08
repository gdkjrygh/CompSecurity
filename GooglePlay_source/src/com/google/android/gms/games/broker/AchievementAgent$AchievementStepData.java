// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.net.Uri;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.games.broker:
//            AchievementAgent, GamesClientContext

private static final class popupLocationInfo
{

    public Bundle achievementBundle;
    public final String externalAchievementId;
    public final GamesClientContext gamesContext;
    public Uri instanceUri;
    public int newSteps;
    public final int numSteps;
    public final com.google.android.gms.games.internal.pupLocationInfo popupLocationInfo;
    public boolean popupShown;
    public int statusCode;

    public (GamesClientContext gamesclientcontext, String s, int i, com.google.android.gms.games.internal. )
    {
        newSteps = -1;
        statusCode = -1;
        instanceUri = null;
        achievementBundle = null;
        popupShown = false;
        gamesContext = gamesclientcontext;
        externalAchievementId = s;
        numSteps = i;
        popupLocationInfo = ;
    }
}
