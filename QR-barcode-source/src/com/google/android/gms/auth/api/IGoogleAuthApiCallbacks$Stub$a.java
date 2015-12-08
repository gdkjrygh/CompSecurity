// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.auth.api:
//            IGoogleAuthApiCallbacks, GoogleAuthApiResponse

private static class lb
    implements IGoogleAuthApiCallbacks
{

    private IBinder lb;

    public IBinder asBinder()
    {
        return lb;
    }

    public void onConnectionSuccess(GoogleAuthApiResponse googleauthapiresponse)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.auth.api.IGoogleAuthApiCallbacks");
        if (googleauthapiresponse == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        googleauthapiresponse.writeToParcel(parcel, 0);
_L1:
        lb.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        googleauthapiresponse;
        parcel1.recycle();
        parcel.recycle();
        throw googleauthapiresponse;
    }

    public void onError(int i, String s, PendingIntent pendingintent)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.auth.api.IGoogleAuthApiCallbacks");
        parcel.writeInt(i);
        parcel.writeString(s);
        if (pendingintent == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        parcel.writeInt(1);
        pendingintent.writeToParcel(parcel, 0);
_L1:
        lb.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    (IBinder ibinder)
    {
        lb = ibinder;
    }
}
