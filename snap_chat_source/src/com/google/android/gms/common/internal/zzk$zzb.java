// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzk, zzl

final class zzPT extends Handler
{

    final zzk zzPT;

    public final void handleMessage(Message message)
    {
        if ((message.what == 1 || message.what == 5 || message.what == 6) && !zzPT.isConnecting())
        {
            message = (nnecting)message.obj;
            message.zzjf();
            message.unregister();
            return;
        }
        if (message.what == 3)
        {
            zzk.zza(zzPT).zzg(new ConnectionResult(((Integer)message.obj).intValue(), null));
            return;
        }
        if (message.what == 4)
        {
            zzk.zza(zzPT, 4, null);
            zzk.zza(zzPT).zzaJ(((Integer)message.obj).intValue());
            zzk.zza(zzPT, 4, 1, null);
            return;
        }
        if (message.what == 2 && !zzPT.isConnected())
        {
            message = (nnected)message.obj;
            message.zzjf();
            message.unregister();
            return;
        }
        if (message.what == 2 || message.what == 1 || message.what == 5 || message.what == 6)
        {
            ((unregister)message.obj).zzjg();
            return;
        } else
        {
            Log.wtf("GmsClient", "Don't know how to handle this message.");
            return;
        }
    }

    public (zzk zzk1, Looper looper)
    {
        zzPT = zzk1;
        super(looper);
    }
}
