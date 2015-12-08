// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestBuffer;
import com.google.android.gms.games.request.Requests;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            AppContentFragment

private static final class onLoad extends onLoad
{
    private static final class RequestKey
    {

        public final String applicationId;
        public final String playerId;
        public final String requestId;

        public final boolean equals(Object obj)
        {
            if (obj instanceof RequestKey)
            {
                if (this == obj)
                {
                    return true;
                }
                obj = (RequestKey)obj;
                if (applicationId.equals(((RequestKey) (obj)).applicationId) && playerId.equals(((RequestKey) (obj)).playerId) && requestId.equals(((RequestKey) (obj)).requestId))
                {
                    return true;
                }
            }
            return false;
        }

        public final String toString()
        {
            return (new StringBuilder(applicationId)).append(",").append(playerId).append(",").append(requestId).toString();
        }

        public RequestKey(String s, String s1, String s2)
        {
            applicationId = s;
            playerId = s1;
            requestId = s2;
        }
    }


    private static final HashMap sRequestMap = new HashMap();
    private final String mApplicationId;
    private final Callback mCallback;
    private final String mPlayerId;
    private final Set mRequestIds;

    protected final PendingResult onLoad(GoogleApiClient googleapiclient)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = mRequestIds.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (String)iterator.next();
            obj = new RequestKey(mApplicationId, mPlayerId, ((String) (obj)));
            if (sRequestMap.containsKey(obj))
            {
                arraylist.add(sRequestMap.get(obj));
            }
        } while (true);
        if (arraylist.size() == mRequestIds.size())
        {
            mCallback.onRequestsLoaded(arraylist);
            finish();
        } else
        if (googleapiclient != null)
        {
            return Games.Requests.loadRequestsFirstParty$2c3ee1ac(googleapiclient, mApplicationId, mPlayerId, 65535, 0);
        }
        return null;
    }

    public final volatile void onResult(Result result)
    {
        boolean flag = false;
        result = (com.google.android.gms.games.request.oader)result;
        if (mFragment.canUseResult(result))
        {
            GameRequestBuffer gamerequestbuffer1 = result.quests(1);
            GameRequestBuffer gamerequestbuffer = result.quests(2);
            ArrayList arraylist = new ArrayList(gamerequestbuffer1.getCount() + gamerequestbuffer.getCount());
            int k = gamerequestbuffer1.getCount();
            for (int i = 0; i < k; i++)
            {
                GameRequest gamerequest1 = (GameRequest)((GameRequest)gamerequestbuffer1.get(i)).freeze();
                sRequestMap.put(new RequestKey(mApplicationId, mPlayerId, gamerequest1.getRequestId()), gamerequest1);
                arraylist.add(gamerequest1);
            }

            k = gamerequestbuffer.getCount();
            for (int j = ((flag) ? 1 : 0); j < k; j++)
            {
                GameRequest gamerequest = (GameRequest)((GameRequest)gamerequestbuffer.get(j)).freeze();
                sRequestMap.put(new RequestKey(mApplicationId, mPlayerId, gamerequest.getRequestId()), gamerequest);
                arraylist.add(gamerequest);
            }

            mCallback.onRequestsLoaded(arraylist);
        } else
        {
            GamesLog.e("AppContentFrag", "Failed to load requests");
        }
        result.se();
        finish();
    }


    public Callback(AppContentFragment appcontentfragment, String s, String s1, Set set, Callback callback)
    {
        super(appcontentfragment);
        mApplicationId = s;
        mPlayerId = s1;
        mRequestIds = set;
        mCallback = callback;
        onLoad(null);
    }
}
