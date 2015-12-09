// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            NotificationsImpl

final class val.status
    implements com.google.android.gms.games.ngLoadImpl._cls1
{

    final val.status this$0;
    final Status val$status;

    public final DataHolder getDataHolder()
    {
        return DataHolder.empty(14);
    }

    public final Status getStatus()
    {
        return val$status;
    }

    ()
    {
        this$0 = final_;
        val$status = Status.this;
        super();
    }
}
