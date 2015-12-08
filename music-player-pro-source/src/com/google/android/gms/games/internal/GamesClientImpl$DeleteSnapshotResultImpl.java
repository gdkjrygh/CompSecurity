// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class YB
    implements com.google.android.gms.games.snapshot.YB
{

    private final Status Eb;
    private final String YB;

    public String getSnapshotId()
    {
        return YB;
    }

    public Status getStatus()
    {
        return Eb;
    }

    (int i, String s)
    {
        Eb = new Status(i);
        YB = s;
    }
}
