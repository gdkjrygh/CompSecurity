// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.sso.client.a;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.microsoft.onlineid.b.a;

// Referenced classes of package com.microsoft.onlineid.internal.sso.client.a:
//            g

public final class c extends g
{

    private final String g;

    public c(Context context, Bundle bundle, String s)
    {
        super(context, bundle);
        g = s;
    }

    public final Object a()
        throws a, RemoteException
    {
        Bundle bundle = b();
        bundle.putString("com.microsoft.onlineid.user_cid", g);
        bundle = a.g(bundle);
        com.microsoft.onlineid.internal.sso.client.a.g.a(bundle);
        return com.microsoft.onlineid.internal.sso.a.f(bundle);
    }
}
