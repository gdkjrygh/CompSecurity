// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient

public static interface 
{

    public static final int CAUSE_NETWORK_LOST = 2;
    public static final int CAUSE_SERVICE_DISCONNECTED = 1;

    public abstract void onConnected(Bundle bundle);

    public abstract void onConnectionSuspended(int i);
}
