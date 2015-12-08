// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.a.b;

// Referenced classes of package com.google.android.gms.maps:
//            SupportMapFragment, b, e

final class a extends com.google.android.gms.maps.a._08_
{

    final e a;
    final a b;

    public final void a(b b1)
        throws RemoteException
    {
        a.onMapReady(new com.google.android.gms.maps.b(b1));
    }

    ( , e e1)
    {
        b = ;
        a = e1;
        super();
    }
}
