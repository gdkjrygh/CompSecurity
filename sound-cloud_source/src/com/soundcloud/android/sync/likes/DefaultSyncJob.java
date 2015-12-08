// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.likes;

import com.soundcloud.android.sync.SyncJob;
import java.util.concurrent.Callable;

public class DefaultSyncJob
    implements SyncJob
{

    private Exception syncException;
    private boolean syncResultChanged;
    private final Callable syncer;

    public DefaultSyncJob(Callable callable)
    {
        syncer = callable;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof DefaultSyncJob))
            {
                return false;
            }
            obj = (DefaultSyncJob)obj;
            if (!syncer.equals(((DefaultSyncJob) (obj)).syncer))
            {
                return false;
            }
        }
        return true;
    }

    public Exception getException()
    {
        return syncException;
    }

    public int hashCode()
    {
        return syncer.hashCode();
    }

    public void onQueued()
    {
    }

    public boolean resultedInAChange()
    {
        return syncResultChanged;
    }

    public void run()
    {
        try
        {
            syncResultChanged = ((Boolean)syncer.call()).booleanValue();
            return;
        }
        catch (Exception exception)
        {
            syncException = exception;
        }
    }

    public boolean wasSuccess()
    {
        return syncException == null;
    }
}
