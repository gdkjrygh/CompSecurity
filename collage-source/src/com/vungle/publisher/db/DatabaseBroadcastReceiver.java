// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.db;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.vungle.log.Logger;
import com.vungle.publisher.bv;

// Referenced classes of package com.vungle.publisher.db:
//            DatabaseHelper

public class DatabaseBroadcastReceiver extends BroadcastReceiver
{

    public Context a;
    DatabaseHelper b;
    bv c;

    DatabaseBroadcastReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        try
        {
            if ("com.vungle.publisher.db.DUMP_TABLES".equals(intent.getAction()))
            {
                Logger.d("VungleDumpDatabase", (new StringBuilder()).append(c.b()).append(" received dump tables request").toString());
                context = intent.getStringArrayExtra("tables");
                b.a(context);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Logger.w("VungleDumpDatabase", "error dumping database", context);
        }
    }
}
