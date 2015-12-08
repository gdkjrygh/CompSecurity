// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.services;

import android.content.Intent;
import com.google.android.gms.iid.b;

// Referenced classes of package com.tinder.services:
//            GCMRegistrationIntentService

public class InstanceIdUpdateListenerService extends b
{

    public InstanceIdUpdateListenerService()
    {
    }

    public final void b()
    {
        startService(new Intent(this, com/tinder/services/GCMRegistrationIntentService));
    }
}
