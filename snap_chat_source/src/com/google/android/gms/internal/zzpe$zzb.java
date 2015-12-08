// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.location.Location;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.gms.internal:
//            zzpe

static class  extends com.google.android.gms.location.
{

    private Handler zzamW;

    public void onLocationChanged(Location location)
    {
        if (zzamW == null)
        {
            return;
        } else
        {
            Message message = Message.obtain();
            message.what = 1;
            message.obj = location;
            zzamW.sendMessage(message);
            return;
        }
    }
}
