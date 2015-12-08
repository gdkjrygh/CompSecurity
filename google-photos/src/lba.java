// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.reporting.ReportingState;
import com.google.android.gms.location.reporting.UploadRequestResult;

public abstract class lba extends Binder
    implements laz
{

    public static laz a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.location.reporting.internal.IReportingService");
        if (iinterface != null && (iinterface instanceof laz))
        {
            return (laz)iinterface;
        } else
        {
            return new lbb(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.location.reporting.internal.IReportingService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.location.reporting.internal.IReportingService");
            if (parcel.readInt() != 0)
            {
                parcel = (Account)Account.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            parcel = a(parcel);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
            } else
            {
                parcel1.writeInt(0);
            }
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.location.reporting.internal.IReportingService");
            if (parcel.readInt() != 0)
            {
                parcel = (Account)Account.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            i = b(parcel);
            parcel1.writeNoException();
            parcel1.writeInt(i);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.location.reporting.internal.IReportingService");
            if (parcel.readInt() != 0)
            {
                obj = lif.a(parcel);
            }
            parcel = a(((com.google.android.gms.location.reporting.UploadRequest) (obj)));
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
            } else
            {
                parcel1.writeInt(0);
            }
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.location.reporting.internal.IReportingService");
            i = a(parcel.readLong());
            parcel1.writeNoException();
            parcel1.writeInt(i);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.location.reporting.internal.IReportingService");
            break;
        }
        if (parcel.readInt() != 0)
        {
            obj = (Account)Account.CREATOR.createFromParcel(parcel);
        } else
        {
            obj = null;
        }
        if (parcel.readInt() != 0)
        {
            parcel = (PlaceReport)PlaceReport.CREATOR.createFromParcel(parcel);
        } else
        {
            parcel = null;
        }
        i = a(((Account) (obj)), parcel);
        parcel1.writeNoException();
        parcel1.writeInt(i);
        return true;
    }
}
