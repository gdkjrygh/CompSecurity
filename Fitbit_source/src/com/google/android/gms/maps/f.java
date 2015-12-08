// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.internal.am;
import com.google.android.gms.maps.internal.al;
import com.google.android.gms.maps.internal.p;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.b;

// Referenced classes of package com.google.android.gms.maps:
//            b

public final class f
{

    private f()
    {
    }

    public static int a(Context context)
    {
        am.a(context);
        try
        {
            context = al.a(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return ((GooglePlayServicesNotAvailableException) (context)).errorCode;
        }
        a(((p) (context)));
        return 0;
    }

    public static void a(p p1)
    {
        try
        {
            b.a(p1.a());
            b.a(p1.b());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (p p1)
        {
            throw new RuntimeRemoteException(p1);
        }
    }
}
