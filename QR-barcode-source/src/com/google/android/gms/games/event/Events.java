// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.event;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;

// Referenced classes of package com.google.android.gms.games.event:
//            EventBuffer

public interface Events
{
    public static interface LoadEventsResult
        extends Releasable, Result
    {

        public abstract EventBuffer getEvents();
    }


    public abstract void increment(GoogleApiClient googleapiclient, String s, int i);

    public abstract PendingResult load(GoogleApiClient googleapiclient, boolean flag);

    public transient abstract PendingResult loadByIds(GoogleApiClient googleapiclient, boolean flag, String as[]);
}
