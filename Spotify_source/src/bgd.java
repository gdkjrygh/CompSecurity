// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;

final class bgd
    implements bgb
{

    private IBinder a;

    bgd(IBinder ibinder)
    {
        a = ibinder;
    }

    public final bfy a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        bfy bfy;
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        bfy = bfz.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return bfy;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final void a(bfv bfv1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
        if (bfv1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        bfv1 = bfv1.asBinder();
_L1:
        parcel.writeStrongBinder(bfv1);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        bfv1 = null;
          goto _L1
        bfv1;
        parcel1.recycle();
        parcel.recycle();
        throw bfv1;
    }

    public final void a(ccn ccn1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
        if (ccn1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        ccn1 = ccn1.asBinder();
_L1:
        parcel.writeStrongBinder(ccn1);
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ccn1 = null;
          goto _L1
        ccn1;
        parcel1.recycle();
        parcel.recycle();
        throw ccn1;
    }

    public final void a(ccq ccq1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
        if (ccq1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        ccq1 = ccq1.asBinder();
_L1:
        parcel.writeStrongBinder(ccq1);
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ccq1 = null;
          goto _L1
        ccq1;
        parcel1.recycle();
        parcel.recycle();
        throw ccq1;
    }

    public final void a(NativeAdOptionsParcel nativeadoptionsparcel)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
        if (nativeadoptionsparcel == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        nativeadoptionsparcel.writeToParcel(parcel, 0);
_L1:
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        nativeadoptionsparcel;
        parcel1.recycle();
        parcel.recycle();
        throw nativeadoptionsparcel;
    }

    public final void a(String s, ccw ccw1, cct cct1)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
        parcel.writeString(s);
        if (ccw1 == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        s = ccw1.asBinder();
_L1:
        parcel.writeStrongBinder(s);
        s = obj;
        if (cct1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        s = cct1.asBinder();
        parcel.writeStrongBinder(s);
        a.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s = null;
          goto _L1
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
