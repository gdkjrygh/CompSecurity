// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.location.LocationSettingsResult;

// Referenced classes of package com.google.android.gms.location.internal:
//            k

private static final class a extends a
{

    private com.google.android.gms.internal. a;

    public final void a(LocationSettingsResult locationsettingsresult)
        throws RemoteException
    {
        a.a(locationsettingsresult);
        a = null;
    }

    public ngsResult(com.google.android.gms.internal. )
    {
        boolean flag;
        if ( != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        u.b(flag, "listener can't be null.");
        a = ;
    }
}
