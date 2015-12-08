// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class YD
    implements com.google.android.gms.games.sultImpl
{

    private final Status Eb;
    private final String YC;
    private final boolean YD;

    public Status getStatus()
    {
        return Eb;
    }

    public (int i, String s, boolean flag)
    {
        Eb = new Status(i);
        YC = s;
        YD = flag;
    }
}
