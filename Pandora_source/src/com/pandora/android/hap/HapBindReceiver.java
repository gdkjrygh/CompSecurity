// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.hap;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.pandora.android.provider.b;

// Referenced classes of package com.pandora.android.hap:
//            a

public class HapBindReceiver extends BroadcastReceiver
{

    public HapBindReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if (b.a.u())
        {
            intent = intent.getExtras();
            context = null;
            if (intent != null)
            {
                context = intent.getString("service_name");
            }
            a.a().a(context);
        }
    }
}
