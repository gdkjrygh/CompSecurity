// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.panorama.Panorama;

// Referenced classes of package com.google.android.gms.internal:
//            kf, kg, ke

private static abstract class ama.yH extends com.google.android.gms.common.api.a.yH
{

    protected abstract void a(Context context, ke ke1)
        throws RemoteException;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((kg));
    }

    protected final void a(kg kg1)
        throws RemoteException
    {
        a(kg1.getContext(), (ke)kg1.ft());
    }

    protected .c()
    {
        super(Panorama.yH);
    }
}
