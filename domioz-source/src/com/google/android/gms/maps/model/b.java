// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.ap;
import com.google.android.gms.maps.model.internal.g;

// Referenced classes of package com.google.android.gms.maps.model:
//            a, e

public final class b
{

    private static g a;

    public static a a()
    {
        a a1;
        try
        {
            a1 = new a(((g)ap.a(a, "IBitmapDescriptorFactory is not initialized")).a(0x7f020144));
        }
        catch (RemoteException remoteexception)
        {
            throw new e(remoteexception);
        }
        return a1;
    }

    public static void a(g g1)
    {
        if (a != null)
        {
            return;
        } else
        {
            a = (g)ap.a(g1);
            return;
        }
    }
}
