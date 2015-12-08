// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.getpebble.android.kit;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.UUID;
import org.json.JSONException;
import p.bo.a;

// Referenced classes of package com.getpebble.android.kit:
//            PebbleKit

public static abstract class a extends BroadcastReceiver
{

    private final UUID a;

    public abstract void a(Context context, int i, a a1);

    public void onReceive(Context context, Intent intent)
    {
        UUID uuid = (UUID)intent.getSerializableExtra("uuid");
        if (a.equals(uuid))
        {
            int i = intent.getIntExtra("transaction_id", -1);
            intent = intent.getStringExtra("msg_data");
            if (intent != null && !intent.isEmpty())
            {
                try
                {
                    a(context, i, p.bo.a.a(intent));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    context.printStackTrace();
                }
                return;
            }
        }
    }

    protected (UUID uuid)
    {
        a = uuid;
    }
}
