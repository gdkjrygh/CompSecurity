// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class YE
    implements com.google.android.gms.games.sultImpl
{

    private final Status Eb;
    private final Bundle YE;

    public Status getStatus()
    {
        return Eb;
    }

    (Status status, Bundle bundle)
    {
        Eb = status;
        YE = bundle;
    }
}
