// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.content.Intent;

// Referenced classes of package com.google.android.gms.auth:
//            UserRecoverableAuthException

public final class GooglePlayServicesAvailabilityException extends UserRecoverableAuthException
{

    private final int Go;

    GooglePlayServicesAvailabilityException(int i, String s, Intent intent)
    {
        super(s, intent);
        Go = i;
    }

    public final int getConnectionStatusCode()
    {
        return Go;
    }
}
