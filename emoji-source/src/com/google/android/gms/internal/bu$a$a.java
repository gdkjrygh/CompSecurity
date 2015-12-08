// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;

// Referenced classes of package com.google.android.gms.internal:
//            bu, ai, bv, al

private static class kq
    implements bu
{

    private IBinder kq;

    public void a(d d1, ai ai1, String s, bv bv1)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (d1 == null) goto _L2; else goto _L1
_L1:
        d1 = d1.asBinder();
_L5:
        parcel.writeStrongBinder(d1);
        if (ai1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        ai1.writeToParcel(parcel, 0);
_L6:
        parcel.writeString(s);
        d1 = obj;
        if (bv1 == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        d1 = bv1.asBinder();
        parcel.writeStrongBinder(d1);
        kq.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        d1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        d1;
        parcel1.recycle();
        parcel.recycle();
        throw d1;
          goto _L5
    }

    public void a(d d1, ai ai1, String s, String s1, bv bv1)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (d1 == null) goto _L2; else goto _L1
_L1:
        d1 = d1.asBinder();
_L5:
        parcel.writeStrongBinder(d1);
        if (ai1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        ai1.writeToParcel(parcel, 0);
_L6:
        parcel.writeString(s);
        parcel.writeString(s1);
        d1 = obj;
        if (bv1 == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        d1 = bv1.asBinder();
        parcel.writeStrongBinder(d1);
        kq.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        d1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        d1;
        parcel1.recycle();
        parcel.recycle();
        throw d1;
          goto _L5
    }

    public void a(d d1, al al1, ai ai1, String s, bv bv1)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (d1 == null) goto _L2; else goto _L1
_L1:
        d1 = d1.asBinder();
_L5:
        parcel.writeStrongBinder(d1);
        if (al1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        al1.writeToParcel(parcel, 0);
_L6:
        if (ai1 == null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        parcel.writeInt(1);
        ai1.writeToParcel(parcel, 0);
_L7:
        parcel.writeString(s);
        d1 = obj;
        if (bv1 == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        d1 = bv1.asBinder();
        parcel.writeStrongBinder(d1);
        kq.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        d1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        d1;
        parcel1.recycle();
        parcel.recycle();
        throw d1;
        parcel.writeInt(0);
          goto _L7
    }

    public void a(d d1, al al1, ai ai1, String s, String s1, bv bv1)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (d1 == null) goto _L2; else goto _L1
_L1:
        d1 = d1.asBinder();
_L5:
        parcel.writeStrongBinder(d1);
        if (al1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        al1.writeToParcel(parcel, 0);
_L6:
        if (ai1 == null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        parcel.writeInt(1);
        ai1.writeToParcel(parcel, 0);
_L7:
        parcel.writeString(s);
        parcel.writeString(s1);
        d1 = obj;
        if (bv1 == null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        d1 = bv1.asBinder();
        parcel.writeStrongBinder(d1);
        kq.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        d1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        d1;
        parcel1.recycle();
        parcel.recycle();
        throw d1;
        parcel.writeInt(0);
          goto _L7
    }

    public IBinder asBinder()
    {
        return kq;
    }

    public void destroy()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        kq.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public d getView()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        d d1;
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        kq.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        d1 = com.google.android.gms.dynamic..kq(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return d1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void pause()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        kq.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void resume()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        kq.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void showInterstitial()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        kq.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    (IBinder ibinder)
    {
        kq = ibinder;
    }
}
