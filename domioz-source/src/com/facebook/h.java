// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.support.v4.content.k;
import com.facebook.internal.bc;

// Referenced classes of package com.facebook:
//            i, q, AccessToken

public abstract class h
{

    private final BroadcastReceiver a = new i(this, (byte)0);
    private final k b = k.a(q.f());
    private boolean c;

    public h()
    {
        c = false;
        bc.a();
        if (!c)
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            b.a(a, intentfilter);
            c = true;
        }
    }

    protected abstract void a(AccessToken accesstoken);
}
