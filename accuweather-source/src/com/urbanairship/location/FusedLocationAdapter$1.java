// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.location;

import android.os.Bundle;
import com.urbanairship.Logger;
import java.util.concurrent.Semaphore;

// Referenced classes of package com.urbanairship.location:
//            FusedLocationAdapter

class val.semaphore
    implements com.google.android.gms.common.t.ConnectionCallbacks
{

    final FusedLocationAdapter this$0;
    final Semaphore val$semaphore;

    public void onConnected(Bundle bundle)
    {
        Logger.verbose("Google Play services connected for fused location.");
        val$semaphore.release();
    }

    public void onDisconnected()
    {
        Logger.verbose("Google Play services disconnected for fused location.");
    }

    lient.ConnectionCallbacks()
    {
        this$0 = final_fusedlocationadapter;
        val$semaphore = Semaphore.this;
        super();
    }
}
