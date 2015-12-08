// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.sso.client.a;

import android.content.Context;
import android.os.RemoteException;
import com.microsoft.onlineid.b.a;

// Referenced classes of package com.microsoft.onlineid.internal.sso.client.a:
//            g

public final class f extends g
{

    public f(Context context)
    {
        super(context, null);
    }

    public final Object a()
        throws a, RemoteException
    {
        android.os.Bundle bundle = a.j(b());
        com.microsoft.onlineid.internal.sso.client.a.g.a(bundle);
        return bundle;
    }
}
