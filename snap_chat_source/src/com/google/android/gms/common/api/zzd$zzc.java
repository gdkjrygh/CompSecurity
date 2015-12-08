// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.google.android.gms.common.api:
//            zzd

final class zzNb extends Handler
{

    final zzd zzNb;

    public final void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            (new StringBuilder("Unknown message id: ")).append(message.what);
            return;

        case 1: // '\001'
            zzd.zzl(zzNb);
            return;

        case 2: // '\002'
            zzd.zzk(zzNb);
            break;
        }
    }

    (zzd zzd1, Looper looper)
    {
        zzNb = zzd1;
        super(looper);
    }
}
