// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.panorama.Panorama;

// Referenced classes of package com.google.android.gms.internal:
//            kg, kh, kf

private static abstract class ama.yE extends com.google.android.gms.common.api.a.yE
{

    protected abstract void a(Context context, kf kf1)
        throws RemoteException;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((kh));
    }

    protected final void a(kh kh1)
        throws RemoteException
    {
        a(kh1.getContext(), (kf)kh1.fo());
    }

    protected .c()
    {
        super(Panorama.yE);
    }
}
