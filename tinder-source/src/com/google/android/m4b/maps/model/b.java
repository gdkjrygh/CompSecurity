// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model;

import android.os.RemoteException;
import com.google.android.m4b.maps.j.x;
import com.google.android.m4b.maps.model.internal.d;

// Referenced classes of package com.google.android.m4b.maps.model:
//            a, RuntimeRemoteException

public final class b
{

    public static d a;

    public static a a()
    {
        a a1;
        try
        {
            a1 = new a(((d)x.a(a, "IBitmapDescriptorFactory is not initialized")).a(0x7f02018d));
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return a1;
    }
}
