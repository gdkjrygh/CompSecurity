// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.gcm;

import com.google.android.gms.iid.InstanceIDListenerService;

// Referenced classes of package ly.kite.gcm:
//            GCMRegistrationService

public class GCMInstanceIDListenerService extends InstanceIDListenerService
{

    private static final String LOG_TAG = "GCMInstanceIDListenerService";

    public GCMInstanceIDListenerService()
    {
    }

    public void onTokenRefresh()
    {
        GCMRegistrationService.start(this);
    }
}
