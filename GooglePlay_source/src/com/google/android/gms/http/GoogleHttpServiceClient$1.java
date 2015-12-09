// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.http;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.http:
//            GoogleHttpServiceClient

final class this._cls0
    implements ServiceConnection
{

    final GoogleHttpServiceClient this$0;

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        GoogleHttpServiceClient.access$002(GoogleHttpServiceClient.this, Interface(ibinder));
        GoogleHttpServiceClient.access$100(GoogleHttpServiceClient.this).countDown();
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
    }

    ()
    {
        this$0 = GoogleHttpServiceClient.this;
        super();
    }
}
