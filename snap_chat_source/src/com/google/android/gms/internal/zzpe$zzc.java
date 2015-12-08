// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.location.zzh;

// Referenced classes of package com.google.android.gms.internal:
//            zzpe

static class  extends com.google.android.gms.location.
{

    private Handler zzamW;

    public void zza(zzh zzh)
    {
        if (zzamW == null)
        {
            return;
        } else
        {
            Message message = Message.obtain();
            message.obj = zzh;
            zzamW.sendMessage(message);
            return;
        }
    }
}
