// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.server.api.AchievementUpdateMultipleRequest;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.broker:
//            AchievementAgent, GamesClientContext

private final class updateRequests
{

    public final ArrayList contentProviderOperations = new ArrayList();
    public final GamesClientContext gamesContext;
    public final AchievementUpdateMultipleRequest multipleRequest;
    final AchievementAgent this$0;
    public final ArrayList updateRequests = new ArrayList();

    public (GamesClientContext gamesclientcontext)
    {
        this$0 = AchievementAgent.this;
        super();
        boolean flag;
        if (!gamesclientcontext.mIsFirstParty)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "This should always be a 3P games context");
        gamesContext = gamesclientcontext;
        multipleRequest = new AchievementUpdateMultipleRequest(updateRequests);
    }
}
