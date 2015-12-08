// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.service;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

// Referenced classes of package com.fitbit.util.service:
//            e, h

class a extends ResultReceiver
{

    final e a;

    protected void onReceiveResult(int i, Bundle bundle)
    {
        e.a(a, new h(i, bundle));
        a.deliverResult(e.a(a));
    }

    (e e1, Handler handler)
    {
        a = e1;
        super(handler);
    }
}
