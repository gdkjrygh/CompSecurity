// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            fe, fd

private static class dG
    implements fe
{

    private IBinder dG;

    public void a(fd fd1, Uri uri, Bundle bundle, boolean flag)
        throws RemoteException
    {
        IBinder ibinder;
        Parcel parcel;
        int i;
        ibinder = null;
        i = 1;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.panorama.internal.IPanoramaService");
        if (fd1 == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        ibinder = fd1.asBinder();
        parcel.writeStrongBinder(ibinder);
        if (uri == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L5:
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
        break MISSING_BLOCK_LABEL_128;
_L6:
        parcel.writeInt(i);
        dG.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L5
        fd1;
        parcel.recycle();
        throw fd1;
_L4:
        parcel.writeInt(0);
        while (!flag) 
        {
            i = 0;
            break;
        }
          goto _L6
    }

    public IBinder asBinder()
    {
        return dG;
    }

    (IBinder ibinder)
    {
        dG = ibinder;
    }
}
