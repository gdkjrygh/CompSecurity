// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.v;

import android.os.RemoteException;
import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.v:
//            i, d, h

final class c
    implements Runnable
{

    private List a;
    private String b;
    private h c;
    private c d;

    public final void run()
    {
        try
        {
            c(d);
            Collections.unmodifiableSet(new HashSet(a));
            d d1 = new d();
            c.a(d1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.e("SignInClientImpl", "RemoteException thrown when processing checkServerAuthorization callback", remoteexception);
        }
    }

    ( , List list, String s, h h1)
    {
        d = ;
        a = list;
        b = s;
        c = h1;
        super();
    }
}
