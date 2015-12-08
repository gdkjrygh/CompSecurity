// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class NJ
    implements com.google.android.gms.games.sultImpl
{

    private final String NI;
    private final boolean NJ;
    private final Status yw;

    public Status getStatus()
    {
        return yw;
    }

    public (int i, String s, boolean flag)
    {
        yw = new Status(i);
        NI = s;
        NJ = flag;
    }
}
