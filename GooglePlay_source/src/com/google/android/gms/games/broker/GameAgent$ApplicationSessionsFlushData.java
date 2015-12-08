// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.games.server.api.SessionBatch;
import java.util.ArrayList;
import java.util.Random;

// Referenced classes of package com.google.android.gms.games.broker:
//            GameAgent

private final class updateRequests
{

    public final ArrayList contentProviderOperations = new ArrayList();
    public final Context context;
    public final SessionBatch multipleRequest;
    final GameAgent this$0;
    public final ArrayList updateRequests = new ArrayList();

    public (Context context1, String s, String s1, boolean flag)
    {
        this$0 = GameAgent.this;
        super();
        context = context1;
        multipleRequest = new SessionBatch(s1, Long.valueOf(GameAgent.getClock().currentTimeMillis()), s, Boolean.valueOf(flag), Long.valueOf(GameAgent.access$300(GameAgent.this).nextLong()), updateRequests);
    }
}
