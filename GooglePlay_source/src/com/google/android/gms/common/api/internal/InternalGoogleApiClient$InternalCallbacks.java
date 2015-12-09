// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.api.internal:
//            InternalGoogleApiClient

public static interface 
{

    public abstract void handleOnConnectionFailed(ConnectionResult connectionresult);

    public abstract void handleOnConnectionSuccess(Bundle bundle);

    public abstract void handleOnConnectionSuspended(int i);
}
