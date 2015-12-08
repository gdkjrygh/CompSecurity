// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.service;

import android.content.Intent;
import com.fitbit.multipledevice.MultipleDeviceMode;
import com.fitbit.util.threading.c;

// Referenced classes of package com.fitbit.galileo.service:
//            d

class it> extends c
{

    final d a;

    public void a(Intent intent)
    {
        String s = intent.getAction();
        d d1 = a;
        d1;
        JVM INSTR monitorenter ;
        if (!"com.fitbit.galileo.GALILEO_PROTOCOL_BACKOFF_ALL_CHANGED".equals(s)) goto _L2; else goto _L1
_L1:
        if (d.a(a).a())
        {
            d.b(a);
        }
_L3:
        return;
_L2:
        if (!"com.fitbit.galileo.GALILEO_PROTOCOL_BACKOFF_SYNC_CHANGED".equals(s))
        {
            break MISSING_BLOCK_LABEL_81;
        }
        if (d.a(a).a())
        {
            d.b(a);
        }
          goto _L3
        intent;
        d1;
        JVM INSTR monitorexit ;
        throw intent;
        if (!"com.fitbit.galileo.GALILEO_SYNC_BACKGROUND_SYNC_OPTION_CHANGED".equals(s)) goto _L5; else goto _L4
_L4:
        if (d.a(a).a())
        {
            boolean flag = intent.getBooleanExtra("com.fitbit.galileo.EXTRA_SUCCESS", false);
            d.a(a, flag);
        }
          goto _L3
_L5:
        if (!"com.fitbit.SavedState.SoftTrackerData.ACTION_SYNC_BACKOFF_STATE_CHANGED".equals(s) || !d.a(a).b()) goto _L3; else goto _L6
_L6:
        d.b(a);
          goto _L3
    }

    pleDeviceMode(d d1)
    {
        a = d1;
        super();
    }
}
