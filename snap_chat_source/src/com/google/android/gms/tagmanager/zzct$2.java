// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzct

class zzaAG
    implements android.os..Callback
{

    final zzct zzaAG;

    public boolean handleMessage(Message message)
    {
        if (1 == message.what && zzct.zzfK().equals(message.obj))
        {
            zzaAG.dispatch();
            if (zzct.zzb(zzaAG) > 0 && !zzct.zzc(zzaAG))
            {
                zzct.zzd(zzaAG).sendMessageDelayed(zzct.zzd(zzaAG).obtainMessage(1, zzct.zzfK()), zzct.zzb(zzaAG));
            }
        }
        return true;
    }

    (zzct zzct1)
    {
        zzaAG = zzct1;
        super();
    }
}
