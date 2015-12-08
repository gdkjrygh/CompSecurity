// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.herrevad.NetworkQualityReport;

public abstract class kqo extends Binder
    implements kqn
{

    public static kqn a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.herrevad.internal.ILightweightNetworkQualityService");
        if (iinterface != null && (iinterface instanceof kqn))
        {
            return (kqn)iinterface;
        } else
        {
            return new kqp(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj = null;
        String s1 = null;
        String s = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.herrevad.internal.ILightweightNetworkQualityService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.herrevad.internal.ILightweightNetworkQualityService");
            obj = s;
            if (parcel.readInt() != 0)
            {
                obj = (NetworkQualityReport)NetworkQualityReport.CREATOR.createFromParcel(parcel);
            }
            a(((NetworkQualityReport) (obj)));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.herrevad.internal.ILightweightNetworkQualityService");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = ((Parcel) (obj));
            } else
            {
                obj = parcel.queryLocalInterface("com.google.android.gms.herrevad.internal.ILightweightNetworkQualityCallbacks");
                if (obj != null && (obj instanceof kqk))
                {
                    parcel = (kqk)obj;
                } else
                {
                    parcel = new kqm(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.herrevad.internal.ILightweightNetworkQualityService");
            obj = s1;
            break;
        }
        if (parcel.readInt() != 0)
        {
            obj = (NetworkQualityReport)NetworkQualityReport.CREATOR.createFromParcel(parcel);
        }
        s = parcel.readString();
        s1 = parcel.readString();
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(((NetworkQualityReport) (obj)), s, s1, flag);
        parcel1.writeNoException();
        return true;
    }
}
