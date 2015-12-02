// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.intents;

import android.content.Intent;
import android.os.IBinder;
import com.facebook.base.d.b;
import com.facebook.inject.t;
import com.google.common.d.a.i;

// Referenced classes of package com.facebook.orca.intents:
//            b, d

public class IntentHandlerService extends b
{

    public IntentHandlerService()
    {
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public int onStartCommand(Intent intent, int j, int k)
    {
        i.a(((com.facebook.orca.intents.b)a().a(com/facebook/orca/intents/b)).a(intent), new d(this, k));
        return 2;
    }
}
