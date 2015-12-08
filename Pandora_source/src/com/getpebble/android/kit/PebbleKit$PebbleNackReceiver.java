// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.getpebble.android.kit;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.UUID;

// Referenced classes of package com.getpebble.android.kit:
//            PebbleKit

public static abstract class a extends BroadcastReceiver
{

    private final UUID a;

    public abstract void a(Context context, int i);

    public void onReceive(Context context, Intent intent)
    {
        a(context, intent.getIntExtra("transaction_id", -1));
    }

    protected (UUID uuid)
    {
        a = uuid;
    }
}
