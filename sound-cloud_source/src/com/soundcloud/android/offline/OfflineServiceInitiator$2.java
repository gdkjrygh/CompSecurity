// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.sync.SyncResult;
import rx.b.f;

final class 
    implements f
{

    public final Boolean call(SyncResult syncresult)
    {
        boolean flag;
        if ("syncPlaylist".equals(syncresult.getAction()) && syncresult.wasChanged() && syncresult.hasChangedEntities().booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public final volatile Object call(Object obj)
    {
        return call((SyncResult)obj);
    }

    ()
    {
    }
}
