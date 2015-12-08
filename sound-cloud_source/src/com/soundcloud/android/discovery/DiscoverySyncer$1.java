// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import com.soundcloud.android.sync.SyncResult;
import rx.b.f;

final class 
    implements f
{

    public final Boolean call(SyncResult syncresult)
    {
        return Boolean.valueOf(syncresult.wasSuccess());
    }

    public final volatile Object call(Object obj)
    {
        return call((SyncResult)obj);
    }

    ()
    {
    }
}
