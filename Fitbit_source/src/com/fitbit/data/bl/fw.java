// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;
import com.fitbit.util.service.b;

// Referenced classes of package com.fitbit.data.bl:
//            SyncService, dg

public class fw extends b
{

    static final String a = "com.fitbit.data.bl.UnpairDeviceTask.ACTION";
    private static final String b = "com.fitbit.data.bl.UnpairDeviceTask.EXTRA_DEVICE_ID";

    public fw()
    {
    }

    public static Intent a(Context context, String s)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction("com.fitbit.data.bl.UnpairDeviceTask.ACTION");
        if (s != null)
        {
            context.putExtra("com.fitbit.data.bl.UnpairDeviceTask.EXTRA_DEVICE_ID", s);
        }
        return context;
    }

    protected void a(SyncService syncservice, Intent intent, ResultReceiver resultreceiver)
        throws Exception
    {
        syncservice = intent.getStringExtra("com.fitbit.data.bl.UnpairDeviceTask.EXTRA_DEVICE_ID");
        dg.d().b(syncservice, this);
    }
}
