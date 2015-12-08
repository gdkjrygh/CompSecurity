// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            AdSizeParcel

public interface n
    extends IInterface
{

    public abstract AdSizeParcel a()
        throws RemoteException;

    public abstract String b()
        throws RemoteException;
}
