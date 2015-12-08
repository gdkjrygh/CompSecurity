// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class NK
    implements com.google.android.gms.games.snapshot.NK
{

    private final String NK;
    private final Status yz;

    public String getSnapshotId()
    {
        return NK;
    }

    public Status getStatus()
    {
        return yz;
    }

    (int i, String s)
    {
        yz = new Status(i);
        NK = s;
    }
}
