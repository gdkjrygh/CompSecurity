// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.facebook.internal.Y;

// Referenced classes of package com.facebook:
//            s, AccessToken

public abstract class i
{
    private final class a extends BroadcastReceiver
    {

        final i a;

        public final void onReceive(Context context, Intent intent)
        {
            if ("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(intent.getAction()))
            {
                intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN");
                context = (AccessToken)intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN");
                a.a(context);
            }
        }

        private a()
        {
            a = i.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    public final BroadcastReceiver a = new a((byte)0);
    public final LocalBroadcastManager b = LocalBroadcastManager.getInstance(s.f());
    public boolean c;

    public i()
    {
        c = false;
        Y.b();
        a();
    }

    public final void a()
    {
        if (c)
        {
            return;
        } else
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            b.registerReceiver(a, intentfilter);
            c = true;
            return;
        }
    }

    public abstract void a(AccessToken accesstoken);
}
