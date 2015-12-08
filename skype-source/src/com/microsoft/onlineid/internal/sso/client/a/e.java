// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.sso.client.a;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.microsoft.onlineid.b.a;
import com.microsoft.onlineid.d;
import com.microsoft.onlineid.internal.sso.client.f;

// Referenced classes of package com.microsoft.onlineid.internal.sso.client.a:
//            g

public final class e extends g
{

    private final String g;
    private final d h;
    private final com.microsoft.onlineid.f i;

    public e(Context context, Bundle bundle, String s, d d, com.microsoft.onlineid.f f1)
    {
        super(context, bundle);
        g = s;
        h = d;
        i = f1;
    }

    public final Object a()
        throws a, RemoteException
    {
        Bundle bundle = b();
        bundle.putString("com.microsoft.onlineid.user_cid", g);
        bundle.putAll(com.microsoft.onlineid.internal.sso.a.a(h));
        if (i != null)
        {
            bundle.putAll(com.microsoft.onlineid.internal.sso.a.a(i));
        }
        bundle = a.h(bundle);
        com.microsoft.onlineid.internal.sso.client.a.g.a(bundle);
        if (bundle.containsKey("com.microsoft.onlineid.ui_resolution_intent"))
        {
            return (new f()).a(com.microsoft.onlineid.internal.sso.a.f(bundle));
        } else
        {
            return (new f()).a(com.microsoft.onlineid.internal.sso.a.e(bundle));
        }
    }
}
