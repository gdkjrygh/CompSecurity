// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.maps.a.ak;
import com.google.android.gms.maps.a.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

// Referenced classes of package com.google.android.gms.maps:
//            CameraUpdateFactory

public final class d
{

    private static boolean a = false;

    public static int a(Context context)
    {
        int i = 0;
        com/google/android/gms/maps/d;
        JVM INSTR monitorenter ;
        boolean flag;
        y.a(context, "Context is null");
        flag = a;
        if (!flag) goto _L2; else goto _L1
_L1:
        com/google/android/gms/maps/d;
        JVM INSTR monitorexit ;
        return i;
_L2:
        context = ak.a(context);
        CameraUpdateFactory.zza(context.a());
        BitmapDescriptorFactory.zza(context.b());
        a = true;
        continue; /* Loop/switch isn't completed */
        context;
        throw context;
        context;
        i = ((c) (context)).a;
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw new com.google.android.gms.maps.model.c(context);
    }

}
