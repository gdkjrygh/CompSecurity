// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            ke, kd

public static abstract class a.kq extends Binder
    implements ke
{
    private static class a
        implements ke
    {

        private IBinder kq;

        public void a(kd kd1, Uri uri, Bundle bundle, boolean flag)
            throws RemoteException
        {
            IBinder ibinder;
            Parcel parcel;
            int i;
            ibinder = null;
            i = 1;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.panorama.internal.IPanoramaService");
            if (kd1 == null)
            {
                break MISSING_BLOCK_LABEL_30;
            }
            ibinder = kd1.asBinder();
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
            kq.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L5
            kd1;
            parcel.recycle();
            throw kd1;
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
            return kq;
        }

        a(IBinder ibinder)
        {
            kq = ibinder;
        }
    }


    public static ke bi(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.panorama.internal.IPanoramaService");
        if (iinterface != null && (iinterface instanceof ke))
        {
            return (ke)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        kd kd;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.panorama.internal.IPanoramaService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.panorama.internal.IPanoramaService");
            kd = bh(parcel.readStrongBinder());
            break;
        }
        Bundle bundle;
        boolean flag;
        if (parcel.readInt() != 0)
        {
            parcel1 = (Uri)Uri.CREATOR.createFromParcel(parcel);
        } else
        {
            parcel1 = null;
        }
        if (parcel.readInt() != 0)
        {
            bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
        } else
        {
            bundle = null;
        }
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(kd, parcel1, bundle, flag);
        return true;
    }
}
