// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.playlog.internal:
//            LoggerConnectionCallbacks, LogEventCache, PlayLoggerContext, IPlayLogService, 
//            LogEvent

public final class PlayLoggerImpl extends GmsClient
{

    public boolean mIsCaching;
    public final Object mLock = new Object();
    private final LogEventCache mLogEventCache = new LogEventCache();
    public final LoggerConnectionCallbacks mLoggerConnectionCallbacks;
    public final String mPackageName;

    public PlayLoggerImpl(Context context, Looper looper, LoggerConnectionCallbacks loggerconnectioncallbacks, ClientSettings clientsettings)
    {
        super(context, looper, 24, clientsettings, loggerconnectioncallbacks, loggerconnectioncallbacks);
        mPackageName = context.getPackageName();
        mLoggerConnectionCallbacks = (LoggerConnectionCallbacks)Preconditions.checkNotNull(loggerconnectioncallbacks);
        mLoggerConnectionCallbacks.mLoggerImpl = this;
        mIsCaching = true;
    }

    protected final volatile IInterface createServiceInterface(IBinder ibinder)
    {
        return IPlayLogService.Stub.asInterface(ibinder);
    }

    public void flushCacheToService()
    {
        Object obj;
        ArrayList arraylist;
        LogEventCache.Item item;
        Iterator iterator;
        boolean flag;
        if (!mIsCaching)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        if (mLogEventCache.mCache.isEmpty()) goto _L2; else goto _L1
_L1:
        obj = null;
        arraylist = new ArrayList();
        iterator = mLogEventCache.mCache.iterator();
_L3:
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_158;
            }
            item = (LogEventCache.Item)iterator.next();
            if (!item.loggerContext.equals(obj))
            {
                break MISSING_BLOCK_LABEL_110;
            }
            arraylist.add(item.event);
        } while (true);
        obj;
        Log.e("PlayLoggerImpl", "Couldn't send cached log events to AndroidLog service.  Retaining in memory cache.");
_L2:
        return;
        if (!arraylist.isEmpty())
        {
            ((IPlayLogService)getService()).sendLogEvents(mPackageName, ((PlayLoggerContext) (obj)), arraylist);
            arraylist.clear();
        }
        obj = item.loggerContext;
        arraylist.add(item.event);
          goto _L3
        if (!arraylist.isEmpty())
        {
            ((IPlayLogService)getService()).sendLogEvents(mPackageName, ((PlayLoggerContext) (obj)), arraylist);
        }
        mLogEventCache.mCache.clear();
        return;
    }

    protected final String getServiceDescriptor()
    {
        return "com.google.android.gms.playlog.internal.IPlayLogService";
    }

    protected final String getStartServiceAction()
    {
        return "com.google.android.gms.playlog.service.START";
    }

    public final void saveToMemoryCache(PlayLoggerContext playloggercontext, LogEvent logevent)
    {
        LogEventCache logeventcache = mLogEventCache;
        logeventcache.mCache.add(new LogEventCache.Item(playloggercontext, logevent, (byte)0));
        for (; logeventcache.mCache.size() > logeventcache.mCapacity; logeventcache.mCache.remove(0)) { }
    }

    final void setIsCaching(boolean flag)
    {
        Object obj = mLock;
        obj;
        JVM INSTR monitorenter ;
        boolean flag1;
        flag1 = mIsCaching;
        mIsCaching = flag;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        if (!mIsCaching)
        {
            flushCacheToService();
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
