// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.logging;

import android.view.View;

// Referenced classes of package com.google.android.gms.games.logging:
//            GamesLogflowLogger

public final class val.rootView
    implements Runnable
{

    final GamesLogflowLogger this$0;
    final long val$impressionId;
    final View val$rootView;

    public final void run()
    {
        GamesLogflowLogger.access$000$2d76c77d(GamesLogflowLogger.this, val$impressionId, val$rootView);
    }

    public ()
    {
        this$0 = final_gameslogflowlogger;
        val$impressionId = l;
        val$rootView = View.this;
        super();
    }
}
