// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.b.d;
import com.facebook.internal.n;

// Referenced classes of package com.facebook:
//            g

public abstract class c
{
    private final class a extends BroadcastReceiver
    {

        final c a;

        public final void onReceive(Context context, Intent intent)
        {
            if ("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(intent.getAction()))
            {
                intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN");
                intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN");
                a.a();
            }
        }

        private a()
        {
            a = c.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    public final BroadcastReceiver a = new a((byte)0);
    public final d b = d.a(g.g());
    public boolean c;

    public c()
    {
        c = false;
        n.b();
        b();
    }

    public abstract void a();

    public final void b()
    {
        if (c)
        {
            return;
        } else
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            b.a(a, intentfilter);
            c = true;
            return;
        }
    }
}
