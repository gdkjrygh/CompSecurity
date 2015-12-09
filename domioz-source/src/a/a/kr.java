// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.appboy.f.a;

// Referenced classes of package a.a:
//            ad, aa, ko

final class kr extends BroadcastReceiver
{

    final aa a;
    final ko b;

    kr(ko ko1, aa aa1)
    {
        b = ko1;
        a = aa1;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        try
        {
            a.a(new ad(), a/a/ad);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.appboy.f.a.c(ko.d(), "Failed to publish DataSyncEvent.", context);
        }
        a.a.ko.a(a, context);
    }
}
