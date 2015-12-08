// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class NM
    implements com.google.android.gms.games.sultImpl
{

    private final String NL;
    private final boolean NM;
    private final Status yz;

    public Status getStatus()
    {
        return yz;
    }

    public (int i, String s, boolean flag)
    {
        yz = new Status(i);
        NL = s;
        NM = flag;
    }
}
