// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

// Referenced classes of package com.fitbit.bluetooth:
//            g

static final class a extends ResultReceiver
{

    final boolean a[];

    protected void onReceiveResult(int i, Bundle bundle)
    {
        a[0] = true;
    }

    (Handler handler, boolean aflag[])
    {
        a = aflag;
        super(handler);
    }
}
