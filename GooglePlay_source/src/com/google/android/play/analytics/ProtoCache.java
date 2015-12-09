// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.analytics;

import android.util.Log;
import java.lang.reflect.Array;

public class ProtoCache
{
    private static final class ElementCache
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
                Log.wtf(ProtoCache.TAG, "Exception from mClazz.newInstance ", exception1);
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


    private static ProtoCache INSTANCE = null;
    private static final String TAG = com/google/android/play/analytics/ProtoCache.getSimpleName();
    public final ElementCache mCacheLogEvent = new ElementCache(com/google/android/play/analytics/ClientAnalytics$LogEvent, 60);
    final ElementCache mCacheLogEventKeyValues = new ElementCache(com/google/android/play/analytics/ClientAnalytics$LogEventKeyValues, 50);

    private ProtoCache()
    {
    }

    public static ProtoCache getInstance()
    {
        com/google/android/play/analytics/ProtoCache;
        JVM INSTR monitorenter ;
        ProtoCache protocache;
        if (INSTANCE == null)
        {
            INSTANCE = new ProtoCache();
        }
        protocache = INSTANCE;
        com/google/android/play/analytics/ProtoCache;
        JVM INSTR monitorexit ;
        return protocache;
        Exception exception;
        exception;
        throw exception;
    }

    public final void recycle(ClientAnalytics.LogEvent logevent)
    {
        ClientAnalytics.LogEventKeyValues alogeventkeyvalues[] = logevent.value;
        for (int i = 0; i < alogeventkeyvalues.length; i++)
        {
            ClientAnalytics.LogEventKeyValues logeventkeyvalues = alogeventkeyvalues[i];
            logeventkeyvalues.clear();
            mCacheLogEventKeyValues.recycle(logeventkeyvalues);
        }

        logevent.clear();
        mCacheLogEvent.recycle(logevent);
    }


}
