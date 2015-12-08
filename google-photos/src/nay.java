// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public final class nay extends BroadcastReceiver
{

    public nay()
    {
    }

    public final void onReceive(Context context, Intent intent)
    {
        try
        {
            ((nbj)olm.a(context, nbj)).l();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("ConnectivityReceiver", "Ignore during app install", context);
        }
    }
}
