// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.Locale;

final class ohk extends BroadcastReceiver
{

    ohk()
    {
    }

    public final void onReceive(Context context, Intent intent)
    {
        context = (oho)olm.a(context, oho);
        int i = intent.getIntExtra("account_id", -1);
        context.a(i);
        if (!((oho) (context)).b.c(i))
        {
            if (Log.isLoggable("SyncletManager", 3))
            {
                String.format(Locale.US, "requestSyncNow called with invalid account %d", new Object[] {
                    Integer.valueOf(i)
                });
            }
        } else
        {
            olm.a(((oho) (context)).a, ohg);
            if (Log.isLoggable("SyncletManager", 3))
            {
                String.format(Locale.US, "requestSyncNow called with account %d", new Object[] {
                    Integer.valueOf(i)
                });
                return;
            }
        }
    }
}
