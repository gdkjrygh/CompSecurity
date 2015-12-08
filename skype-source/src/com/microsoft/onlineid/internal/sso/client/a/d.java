// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.sso.client.a;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.microsoft.onlineid.b.a;
import com.microsoft.onlineid.f;

// Referenced classes of package com.microsoft.onlineid.internal.sso.client.a:
//            g

public final class d extends g
{

    private final f g;

    public d(Context context, Bundle bundle, f f)
    {
        super(context, bundle);
        g = f;
    }

    public final Object a()
        throws a, RemoteException
    {
        Bundle bundle = b();
        if (g != null)
        {
            bundle.putAll(com.microsoft.onlineid.internal.sso.a.a(g));
        }
        bundle = a.f(bundle);
        com.microsoft.onlineid.internal.sso.client.a.g.a(bundle);
        return com.microsoft.onlineid.internal.sso.a.f(bundle);
    }
}
