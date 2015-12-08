// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.api2;

import Qd;
import java.util.concurrent.Callable;
import kr;

// Referenced classes of package com.snapchat.android.api2:
//            LoginTask

final class val.payload
    implements Callable
{

    final LoginTask this$0;
    final val.payload val$payload;

    public final Object call()
    {
        return LoginTask.access$200(LoginTask.this).a(new String[] {
            mLoginName, LoginTask.access$100(LoginTask.this), ((Qd) (val$payload)).timestamp, "/loq/login"
        });
    }

    ()
    {
        this$0 = final_logintask;
        val$payload = val.payload.this;
        super();
    }
}
