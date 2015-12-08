// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.common.internal:
//            GmsClient, Preconditions

public final class mDisconnectCount
    implements ServiceConnection
{

    private final int mDisconnectCount;
    final GmsClient this$0;

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        Preconditions.checkNotNull(ibinder, "Expecting a valid IBinder");
        GmsClient.access$002(GmsClient.this, ace(ibinder));
        componentname = GmsClient.this;
        int i = mDisconnectCount;
        ((GmsClient) (componentname)).mHandler.sendMessage(((GmsClient) (componentname)).mHandler.obtainMessage(6, i, -1, new lback(componentname)));
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        mHandler.sendMessage(mHandler.obtainMessage(4, mDisconnectCount, 1));
    }

    public lback(int i)
    {
        this$0 = GmsClient.this;
        super();
        mDisconnectCount = i;
    }
}
