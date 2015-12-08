// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.appboy.f.a;

// Referenced classes of package a.a:
//            au, aa

final class av extends BroadcastReceiver
{

    final au a;

    av(au au1)
    {
        a = au1;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        context = ((Context) (a.a.au.a(a)));
        context;
        JVM INSTR monitorenter ;
        au.b(a);
_L1:
        return;
        intent;
        au.c(a).a(intent, java/lang/Throwable);
          goto _L1
        intent;
        com.appboy.f.a.c(au.e(), "Failed to log throwable.", intent);
          goto _L1
        intent;
        throw intent;
    }
}
