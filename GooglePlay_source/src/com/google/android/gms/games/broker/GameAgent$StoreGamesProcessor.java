// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.server.api.FirstPartyApplication;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.broker:
//            GameAgent, Agents

private final class <init>
    implements ocessor
{

    private ArrayList mApps;
    private final ClientContext mClientContext;
    private final Context mContext;
    private final String mExternalPlayerId;
    private final boolean mKnownMuted;
    final GameAgent this$0;

    public final void processGameList(ArrayList arraylist)
    {
        mApps = arraylist;
        (new Thread(this)).start();
    }

    public final void run()
    {
        ArrayList arraylist = new ArrayList();
        long l = Agents.resolveExternalPlayerId(mContext, mClientContext, mExternalPlayerId);
        if (l == -1L)
        {
            GamesLog.e("GameAgent", (new StringBuilder("Failed to find record for player ")).append(mExternalPlayerId).append(" when storing game collection.").toString());
            return;
        }
        if (mKnownMuted)
        {
            arraylist.add(ContentProviderOperation.newUpdate(com.google.android.gms.games.provider.tContentUri(mClientContext)).withValue("muted", Integer.valueOf(0)).build());
        }
        int j = mApps.size();
        int i = 0;
        while (i < j) 
        {
            FirstPartyApplication firstpartyapplication = (FirstPartyApplication)mApps.get(i);
            com.google.android.gms.games.server.api.Application application = firstpartyapplication.getGamesData();
            com.google.android.gms.games.server.api.MarketApplication marketapplication = firstpartyapplication.getMarketData();
            if (application == null && marketapplication == null)
            {
                GamesLog.w("GameAgent", "Received application with no app data and no Market data!");
            } else
            {
                if (application != null && mKnownMuted)
                {
                    ((FastContentValuesJsonResponse) (application)).mValues.put("muted", Integer.valueOf(1));
                }
                GameAgent.access$200$465cae21(GameAgent.this, mContext, mClientContext, firstpartyapplication, application, marketapplication, Long.valueOf(l), mKnownMuted, arraylist);
            }
            i++;
        }
        Agents.applyContentOperations(mContext.getContentResolver(), arraylist, "GameAgent");
    }

    private nResponse(Context context, ClientContext clientcontext, String s, boolean flag)
    {
        this$0 = GameAgent.this;
        super();
        mContext = context;
        mClientContext = clientcontext;
        mExternalPlayerId = s;
        mKnownMuted = flag;
    }

    mKnownMuted(Context context, ClientContext clientcontext, String s, boolean flag, byte byte0)
    {
        this(context, clientcontext, s, flag);
    }
}
