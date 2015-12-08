// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class NN
    implements com.google.android.gms.games.sultImpl
{

    private final Bundle NN;
    private final Status yz;

    public Status getStatus()
    {
        return yz;
    }

    (Status status, Bundle bundle)
    {
        yz = status;
        NN = bundle;
    }
}
