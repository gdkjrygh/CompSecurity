// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import com.appboy.f.a;

// Referenced classes of package a.a:
//            ko, d, aa

final class kq extends BroadcastReceiver
{

    final aa a;
    final ko b;

    kq(ko ko1, aa aa)
    {
        b = ko1;
        a = aa;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        try
        {
            context = (ConnectivityManager)context.getSystemService("connectivity");
            ko.b(b).a(intent, context);
            b.c();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.appboy.f.a.c(ko.d(), "Failed to process connectivity event.", context);
        }
        a.a.ko.a(a, context);
    }
}
