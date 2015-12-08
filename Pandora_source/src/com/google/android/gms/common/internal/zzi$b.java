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
//            zzi, zzj

final class a extends Handler
{

    final zzi a;

    public void handleMessage(Message message)
    {
        if ((message.what == 1 || message.what == 5 || message.what == 6) && !a.isConnecting())
        {
            message = (c)message.obj;
            message.zzmb();
            message.unregister();
            return;
        }
        if (message.what == 3)
        {
            message = new ConnectionResult(((Integer)message.obj).intValue(), null);
            if (zzi.zza(a))
            {
                zzi.zzb(a).zza(message);
                return;
            } else
            {
                zzi.zzc(a).zzj(message);
                return;
            }
        }
        if (message.what == 4)
        {
            zzi.zza(a, 4, null);
            zzi.zzc(a).zzaP(((Integer)message.obj).intValue());
            zzi.zza(a, 4, 1, null);
            return;
        }
        if (message.what == 2 && !a.isConnected())
        {
            message = (c)message.obj;
            message.zzmb();
            message.unregister();
            return;
        }
        if (message.what == 2 || message.what == 1 || message.what == 5 || message.what == 6)
        {
            ((c)message.obj).zzmc();
            return;
        } else
        {
            Log.wtf("GmsClient", "Don't know how to handle this message.");
            return;
        }
    }

    public ient.zza(zzi zzi1, Looper looper)
    {
        a = zzi1;
        super(looper);
    }
}
