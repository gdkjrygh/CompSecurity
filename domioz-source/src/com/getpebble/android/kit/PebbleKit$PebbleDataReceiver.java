// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.getpebble.android.kit;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.getpebble.android.kit.a.a;
import java.util.UUID;
import org.json.JSONException;

public abstract class subscribedUuid extends BroadcastReceiver
{

    private final UUID subscribedUuid;

    public void onReceive(Context context, Intent intent)
    {
        UUID uuid = (UUID)intent.getSerializableExtra("uuid");
        if (subscribedUuid.equals(uuid))
        {
            int i = intent.getIntExtra("transaction_id", -1);
            intent = intent.getStringExtra("msg_data");
            if (intent != null && !intent.isEmpty())
            {
                try
                {
                    receiveData(context, i, a.a(intent));
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

    public abstract void receiveData(Context context, int i, a a1);

    protected (UUID uuid)
    {
        subscribedUuid = uuid;
    }
}
