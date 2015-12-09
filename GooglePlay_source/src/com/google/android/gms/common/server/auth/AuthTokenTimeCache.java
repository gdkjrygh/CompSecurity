// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.auth;

import java.util.HashMap;

public final class AuthTokenTimeCache
{

    private static AuthTokenTimeCache sInstance;
    final HashMap mTokenTimes = new HashMap();

    private AuthTokenTimeCache()
    {
    }

    public static AuthTokenTimeCache getInstance()
    {
        com/google/android/gms/common/server/auth/AuthTokenTimeCache;
        JVM INSTR monitorenter ;
        AuthTokenTimeCache authtokentimecache;
        if (sInstance == null)
        {
            sInstance = new AuthTokenTimeCache();
        }
        authtokentimecache = sInstance;
        com/google/android/gms/common/server/auth/AuthTokenTimeCache;
        JVM INSTR monitorexit ;
        return authtokentimecache;
        Exception exception;
        exception;
        com/google/android/gms/common/server/auth/AuthTokenTimeCache;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Long getTokenTime(String s)
    {
        synchronized (mTokenTimes)
        {
            s = (Long)mTokenTimes.get(s);
        }
        return s;
        s;
        hashmap;
        JVM INSTR monitorexit ;
        throw s;
    }
}
