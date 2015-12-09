// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.GamesStatusCodes;

// Referenced classes of package com.google.android.gms.games.broker:
//            SnapshotAgent

private static final class status
{

    public final Object result;
    public final Status status;

    public ()
    {
        result = null;
        status = GamesStatusCodes.create(4005);
    }

    public status(Object obj, Status status1)
    {
        result = obj;
        status = status1;
    }
}
