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

public final class h extends g
{

    private final Bundle g;

    public h(Context context, Bundle bundle)
    {
        super(context, null);
        g = bundle;
    }

    public final Object a()
        throws a, RemoteException
    {
        Bundle bundle = b();
        bundle.putAll(g);
        com.microsoft.onlineid.internal.sso.client.a.g.a(a.i(bundle));
        return null;
    }
}
