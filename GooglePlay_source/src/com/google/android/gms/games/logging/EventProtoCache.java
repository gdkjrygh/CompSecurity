// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.logging;

import com.google.android.gms.games.internal.GamesLog;
import java.lang.reflect.Array;

public final class EventProtoCache
{
    public static final class ElementCache
    {

        private Object mCache[];
        Class mClazz;
        private int mCount;
        private int mHighWater;
        private final int mLimit;

        public final Object obtain()
        {
            this;
            JVM INSTR monitorenter ;
            Object obj;
            if (mCount <= 0)
            {
                break MISSING_BLOCK_LABEL_43;
            }
            mCount = mCount - 1;
            obj = mCache[mCount];
            mCache[mCount] = null;
            this;
            JVM INSTR monitorexit ;
            return obj;
            this;
            JVM INSTR monitorexit ;
            Object obj1;
            Exception exception;
            try
            {
                obj1 = mClazz.newInstance();
            }
            catch (Exception exception1)
            {
                GamesLog.e("EventProtoCache", "Exception from mClazz.newInstance ", exception1);
                return null;
            }
            return obj1;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final void recycle(Object obj)
        {
            this;
            JVM INSTR monitorenter ;
            if (mCount < mLimit)
            {
                mCache[mCount] = obj;
                mCount = mCount + 1;
                if (mCount > mHighWater)
                {
                    mHighWater = mCount;
                }
            }
            this;
            JVM INSTR monitorexit ;
            return;
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public ElementCache(Class class1, int i)
        {
            mLimit = i;
            mCount = 0;
            mHighWater = 0;
            mCache = (Object[])Array.newInstance(class1, i);
            mClazz = class1;
        }
    }


    private static EventProtoCache INSTANCE = null;
    final ElementCache mCachePlaylogGamesBackgroundAction = new ElementCache(com/google/android/gms/games/proto/PlayGames$PlaylogGamesBackgroundActionEvent, 10);
    final ElementCache mCachePlaylogGamesClick = new ElementCache(com/google/android/gms/games/proto/PlayGames$PlaylogGamesClickEvent, 10);
    final ElementCache mCachePlaylogGamesImpression = new ElementCache(com/google/android/gms/games/proto/PlayGames$PlaylogGamesImpressionEvent, 10);
    final ElementCache mCachePlaylogGamesLogEvent = new ElementCache(com/google/android/gms/games/proto/PlayGames$PlaylogGamesLogEvent, 40);
    public final ElementCache mCachePlaylogGamesSearch = new ElementCache(com/google/android/gms/games/proto/PlayGames$PlaylogGamesSearchEvent, 10);
    final ElementCache mCachePlaylogGamesUIElement = new ElementCache(com/google/android/gms/games/proto/PlayGames$PlaylogGamesUiElement, 50);

    private EventProtoCache()
    {
    }

    public static EventProtoCache getInstance()
    {
        com/google/android/gms/games/logging/EventProtoCache;
        JVM INSTR monitorenter ;
        EventProtoCache eventprotocache;
        if (INSTANCE == null)
        {
            INSTANCE = new EventProtoCache();
        }
        eventprotocache = INSTANCE;
        com/google/android/gms/games/logging/EventProtoCache;
        JVM INSTR monitorexit ;
        return eventprotocache;
        Exception exception;
        exception;
        throw exception;
    }

    public final com.google.android.gms.games.proto.PlayGames.PlaylogGamesClickEvent obtainPlaylogGamesClickEvent()
    {
        return (com.google.android.gms.games.proto.PlayGames.PlaylogGamesClickEvent)mCachePlaylogGamesClick.obtain();
    }

    public final com.google.android.gms.games.proto.PlayGames.PlaylogGamesImpressionEvent obtainPlaylogGamesImpressionEvent()
    {
        return (com.google.android.gms.games.proto.PlayGames.PlaylogGamesImpressionEvent)mCachePlaylogGamesImpression.obtain();
    }

    public final com.google.android.gms.games.proto.PlayGames.PlaylogGamesLogEvent obtainPlaylogGamesLogEvent()
    {
        return (com.google.android.gms.games.proto.PlayGames.PlaylogGamesLogEvent)mCachePlaylogGamesLogEvent.obtain();
    }

    public final com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement obtainPlaylogGamesUiElement()
    {
        return (com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement)mCachePlaylogGamesUIElement.obtain();
    }

    public final void recycle(com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement playloggamesuielement)
    {
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement aplayloggamesuielement[] = playloggamesuielement.child;
        int j = aplayloggamesuielement.length;
        for (int i = 0; i < j; i++)
        {
            recycle(aplayloggamesuielement[i]);
        }

        playloggamesuielement.clear();
        mCachePlaylogGamesUIElement.recycle(playloggamesuielement);
    }

}
