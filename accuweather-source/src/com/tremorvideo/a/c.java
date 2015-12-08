// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.a;

import android.os.Bundle;
import android.util.Log;
import android.webkit.CookieSyncManager;

// Referenced classes of package com.tremorvideo.a:
//            b, d, a

class c
    implements b.a
{

    final b a;

    c(b b1)
    {
        a = b1;
        super();
    }

    public void a()
    {
        Log.d("Facebook-authorize", "Login canceled");
        b.a(a).a();
    }

    public void a(Bundle bundle)
    {
        CookieSyncManager.getInstance().sync();
        a.a(bundle.getString("access_token"));
        a.b(bundle.getString("expires_in"));
        if (a.a())
        {
            Log.d("Facebook-authorize", (new StringBuilder()).append("Login Success! access_token=").append(a.b()).append(" expires=").append(a.c()).toString());
            b.a(a).a(bundle);
            return;
        } else
        {
            b.a(a).a(new d("Failed to receive access token."));
            return;
        }
    }

    public void a(a a1)
    {
        Log.d("Facebook-authorize", (new StringBuilder()).append("Login failed: ").append(a1).toString());
        b.a(a).a(a1);
    }

    public void a(d d1)
    {
        Log.d("Facebook-authorize", (new StringBuilder()).append("Login failed: ").append(d1).toString());
        b.a(a).a(d1);
    }
}
