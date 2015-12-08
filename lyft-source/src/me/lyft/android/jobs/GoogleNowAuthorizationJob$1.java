// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import me.lyft.android.logging.L;
import me.lyft.android.rx.SecureObserver;

// Referenced classes of package me.lyft.android.jobs:
//            GoogleNowAuthorizationJob

class this._cls0 extends SecureObserver
{

    final GoogleNowAuthorizationJob this$0;

    public void onSafeError(Throwable throwable)
    {
        L.w(throwable, throwable.getMessage(), new Object[0]);
    }

    ()
    {
        this$0 = GoogleNowAuthorizationJob.this;
        super();
    }
}
