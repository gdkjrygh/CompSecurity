// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.api2;

import com.google.android.gms.gcm.GoogleCloudMessaging;
import java.util.concurrent.Callable;

// Referenced classes of package com.snapchat.android.api2:
//            LoginTask

final class this._cls0
    implements Callable
{

    final LoginTask this$0;

    public final Object call()
    {
        return LoginTask.access$000(LoginTask.this).register(new String[] {
            "191410808405"
        });
    }

    Messaging()
    {
        this$0 = LoginTask.this;
        super();
    }
}
