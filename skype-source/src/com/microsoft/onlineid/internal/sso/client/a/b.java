// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.sso.client.a;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.microsoft.onlineid.b.a;
import com.microsoft.onlineid.f;
import com.microsoft.onlineid.h;

// Referenced classes of package com.microsoft.onlineid.internal.sso.client.a:
//            g

public final class b extends g
{

    private final h g;
    private final f h;

    public b(Context context, Bundle bundle, h h1, f f)
    {
        super(context, bundle);
        g = h1;
        h = f;
    }

    public final Object a()
        throws a, RemoteException
    {
        Bundle bundle = b();
        Object obj;
        if (g != null)
        {
            obj = g.b();
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            bundle.putString("com.microsoft.onlineid.prefill_username", ((String) (obj)));
        }
        if (h != null)
        {
            bundle.putAll(com.microsoft.onlineid.internal.sso.a.a(h));
        }
        obj = a.e(bundle);
        com.microsoft.onlineid.internal.sso.client.a.g.a(((Bundle) (obj)));
        return com.microsoft.onlineid.internal.sso.a.f(((Bundle) (obj)));
    }
}
