// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.herrevad.NetworkQualityReport;

final class kqp
    implements kqn
{

    private IBinder a;

    kqp(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(NetworkQualityReport networkqualityreport)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.herrevad.internal.ILightweightNetworkQualityService");
        if (networkqualityreport == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        networkqualityreport.writeToParcel(parcel, 0);
_L1:
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        networkqualityreport;
        parcel1.recycle();
        parcel.recycle();
        throw networkqualityreport;
    }

    public final void a(NetworkQualityReport networkqualityreport, String s, String s1, boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.herrevad.internal.ILightweightNetworkQualityService");
        if (networkqualityreport == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        parcel.writeInt(1);
        networkqualityreport.writeToParcel(parcel, 0);
_L1:
        parcel.writeString(s);
        parcel.writeString(s1);
        if (!flag)
        {
            i = 0;
        }
        parcel.writeInt(i);
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        networkqualityreport;
        parcel1.recycle();
        parcel.recycle();
        throw networkqualityreport;
    }

    public final void a(kqk kqk1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.herrevad.internal.ILightweightNetworkQualityService");
        if (kqk1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        kqk1 = kqk1.asBinder();
_L1:
        parcel.writeStrongBinder(kqk1);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        kqk1 = null;
          goto _L1
        kqk1;
        parcel1.recycle();
        parcel.recycle();
        throw kqk1;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
