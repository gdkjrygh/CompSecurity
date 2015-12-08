// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;

final class jok
    implements joi
{

    private IBinder a;

    jok(IBinder ibinder)
    {
        a = ibinder;
    }

    public final IBinder a(kok kok1, AdSizeParcel adsizeparcel, String s, kus kus1, int i)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (kok1 == null) goto _L2; else goto _L1
_L1:
        kok1 = kok1.asBinder();
_L5:
        parcel.writeStrongBinder(kok1);
        if (adsizeparcel == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        adsizeparcel.writeToParcel(parcel, 0);
_L6:
        parcel.writeString(s);
        kok1 = obj;
        if (kus1 == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        kok1 = kus1.asBinder();
        parcel.writeStrongBinder(kok1);
        parcel.writeInt(i);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        kok1 = parcel1.readStrongBinder();
        parcel1.recycle();
        parcel.recycle();
        return kok1;
_L2:
        kok1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        kok1;
        parcel1.recycle();
        parcel.recycle();
        throw kok1;
          goto _L5
    }

    public final IBinder a(kok kok1, AdSizeParcel adsizeparcel, String s, kus kus1, int i, int j)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (kok1 == null) goto _L2; else goto _L1
_L1:
        kok1 = kok1.asBinder();
_L5:
        parcel.writeStrongBinder(kok1);
        if (adsizeparcel == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        adsizeparcel.writeToParcel(parcel, 0);
_L6:
        parcel.writeString(s);
        kok1 = obj;
        if (kus1 == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        kok1 = kus1.asBinder();
        parcel.writeStrongBinder(kok1);
        parcel.writeInt(i);
        parcel.writeInt(j);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        kok1 = parcel1.readStrongBinder();
        parcel1.recycle();
        parcel.recycle();
        return kok1;
_L2:
        kok1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        kok1;
        parcel1.recycle();
        parcel.recycle();
        throw kok1;
          goto _L5
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
