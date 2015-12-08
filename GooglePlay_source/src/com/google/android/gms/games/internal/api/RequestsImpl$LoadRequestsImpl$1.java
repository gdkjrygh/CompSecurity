// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.request.GameRequestBuffer;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            RequestsImpl

final class val.status
    implements com.google.android.gms.games.request.pl._cls1
{

    final val.status this$0;
    final Status val$status;

    public final GameRequestBuffer getRequests(int i)
    {
        return new GameRequestBuffer(DataHolder.empty(val$status.mStatusCode));
    }

    public final Status getStatus()
    {
        return val$status;
    }

    public final void release()
    {
    }

    ()
    {
        this$0 = final_;
        val$status = Status.this;
        super();
    }
}
