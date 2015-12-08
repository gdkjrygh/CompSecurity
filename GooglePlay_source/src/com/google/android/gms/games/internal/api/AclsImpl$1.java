// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            AclsImpl

static final class val.status
    implements com.google.android.gms.games.internal.game.lResult
{

    final Status val$status;

    public final DataHolder getDataHolder()
    {
        return DataHolder.empty(14);
    }

    public final Status getStatus()
    {
        return val$status;
    }

    public final void release()
    {
    }

    clResult(Status status1)
    {
        val$status = status1;
        super();
    }
}
