// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.transaction;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.debug.log.b;

public class h extends BroadcastReceiver
{

    public h()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if (b.b(2))
        {
            b.b("fb-mms:MessagingNotification", "[MessagingNotification] clear notification: mark all msgs seen");
        }
    }
}
