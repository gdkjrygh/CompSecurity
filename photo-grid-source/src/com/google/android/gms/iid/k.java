// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.iid;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.google.android.gms.iid:
//            j

final class k extends Handler
{

    final j a;

    k(j j1, Looper looper)
    {
        a = j1;
        super(looper);
    }

    public final void handleMessage(Message message)
    {
        a.a(message);
    }
}
