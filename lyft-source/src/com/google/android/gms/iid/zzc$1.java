// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.iid;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.google.android.gms.iid:
//            zzc

class a extends Handler
{

    final zzc a;

    public void handleMessage(Message message)
    {
        a.a(message);
    }

    (zzc zzc1, Looper looper)
    {
        a = zzc1;
        super(looper);
    }
}
