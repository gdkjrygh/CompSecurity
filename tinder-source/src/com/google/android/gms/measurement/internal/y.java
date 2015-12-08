// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.u;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            ac, ab, w, x

class y extends BroadcastReceiver
{

    static final String a = com/google/android/gms/measurement/internal/y.getName();
    final ac b;
    boolean c;
    boolean d;

    y(ac ac1)
    {
        u.a(ac1);
        b = ac1;
    }

    static ac a(y y1)
    {
        return y1.b;
    }

    public final void a()
    {
        b.a();
        b.f().e();
        b.f().e();
        if (!c)
        {
            return;
        }
        b.e().g.a("Unregistering connectivity change receiver");
        c = false;
        d = false;
        Context context = b.a;
        try
        {
            context.unregisterReceiver(this);
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            b.e().a.a("Failed to unregister the network broadcast receiver", illegalargumentexception);
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        b.a();
        context = intent.getAction();
        b.e().g.a("NetworkBroadcastReceiver received action", context);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(context))
        {
            boolean flag = b.i().b();
            if (d != flag)
            {
                d = flag;
                b.f().a(new Runnable(flag) {

                    final boolean a;
                    final y b;

                    public final void run()
                    {
                        y.a(b).l();
                    }

            
            {
                b = y.this;
                a = flag;
                super();
            }
                });
            }
            return;
        } else
        {
            b.e().b.a("NetworkBroadcastReceiver received unknown action", context);
            return;
        }
    }

}
