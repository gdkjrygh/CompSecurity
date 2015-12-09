// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.iid;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.google.android.gms.iid:
//            d

class a extends Handler
{

    final d a;

    public void handleMessage(Message message)
    {
        a.a(message);
    }

    (d d1, Looper looper)
    {
        a = d1;
        super(looper);
    }
}
