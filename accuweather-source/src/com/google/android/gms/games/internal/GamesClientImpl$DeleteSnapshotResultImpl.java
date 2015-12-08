// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class NH
    implements com.google.android.gms.games.snapshot.NH
{

    private final String NH;
    private final Status yw;

    public String getSnapshotId()
    {
        return NH;
    }

    public Status getStatus()
    {
        return yw;
    }

    (int i, String s)
    {
        yw = new Status(i);
        NH = s;
    }
}
