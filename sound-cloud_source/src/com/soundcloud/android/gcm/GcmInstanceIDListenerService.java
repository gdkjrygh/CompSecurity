// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.gcm;

import android.content.Intent;
import com.google.android.gms.iid.InstanceIDListenerService;

// Referenced classes of package com.soundcloud.android.gcm:
//            GcmRegistrationService

public class GcmInstanceIDListenerService extends InstanceIDListenerService
{

    public GcmInstanceIDListenerService()
    {
    }

    public void onTokenRefresh()
    {
        startService(new Intent(this, com/soundcloud/android/gcm/GcmRegistrationService));
    }
}
