// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import com.google.android.gms.games.internal.GamesLog;
import com.google.android.play.experiments.PlayExperiments;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.broker:
//            Lockable, GamesExperiments, GamesClientContext

final class PlayCommonAgent extends Lockable
{

    private static final Lockable.LockableLock LOCK = new Lockable.LockableLock();

    PlayCommonAgent(Lockable lockable)
    {
        super("PlayCommonAgent", LOCK, lockable);
    }

    public static Set getExperimentIds(GamesClientContext gamesclientcontext)
    {
        gamesclientcontext = GamesExperiments.getInstance().getExperiments(gamesclientcontext.mContext, gamesclientcontext.mClientContext);
        if (gamesclientcontext == null)
        {
            GamesLog.e("PlayCommonAgent", "Failed to retrieve any experiments!");
            return new HashSet();
        } else
        {
            gamesclientcontext.refreshExperiments$d95dfd7();
            return gamesclientcontext.getExperiments();
        }
    }

}
