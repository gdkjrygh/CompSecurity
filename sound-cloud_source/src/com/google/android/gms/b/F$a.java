// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.b:
//            B, F

private static final class a extends B
{

    private final com.google.android.gms.common.api.zzb a;

    public final void a(int i)
        throws RemoteException
    {
        a.zzn(new Status(i));
    }

    public .api.zzb(com.google.android.gms.common.api.zzb zzb)
    {
        a = zzb;
    }
}
