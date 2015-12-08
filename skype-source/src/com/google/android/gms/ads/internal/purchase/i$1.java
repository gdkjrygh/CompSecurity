// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.internal.gd;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            i, b

final class a
    implements ServiceConnection
{

    final Context a;
    final i b;

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        boolean flag = false;
        componentname = new b(a.getApplicationContext(), false);
        componentname.a(ibinder);
        int j = componentname.c(a.getPackageName(), "inapp");
        ibinder = p.h();
        if (j == 0)
        {
            flag = true;
        }
        ibinder.b(flag);
        a.unbindService(this);
        componentname.a = null;
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
    }

    (i j, Context context)
    {
        b = j;
        a = context;
        super();
    }
}
