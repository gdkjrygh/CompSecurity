// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.reporting.ReportingState;
import com.google.android.gms.location.reporting.UploadRequest;
import com.google.android.gms.location.reporting.UploadRequestResult;

final class lbb
    implements laz
{

    private IBinder a;

    lbb(IBinder ibinder)
    {
        a = ibinder;
    }

    public final int a(long l)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.location.reporting.internal.IReportingService");
        parcel.writeLong(l);
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final int a(Account account, PlaceReport placereport)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.reporting.internal.IReportingService");
        if (account == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        account.writeToParcel(parcel, 0);
_L3:
        if (placereport == null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        parcel.writeInt(1);
        placereport.writeToParcel(parcel, 0);
_L4:
        int i;
        a.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i;
_L2:
        parcel.writeInt(0);
          goto _L3
        account;
        parcel1.recycle();
        parcel.recycle();
        throw account;
        parcel.writeInt(0);
          goto _L4
    }

    public final ReportingState a(Account account)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.reporting.internal.IReportingService");
        if (account == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        account.writeToParcel(parcel, 0);
_L3:
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        account = lid.a(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return account;
_L2:
        parcel.writeInt(0);
          goto _L3
        account;
        parcel1.recycle();
        parcel.recycle();
        throw account;
        account = null;
          goto _L4
    }

    public final UploadRequestResult a(UploadRequest uploadrequest)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.reporting.internal.IReportingService");
        if (uploadrequest == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        uploadrequest.writeToParcel(parcel, 0);
_L3:
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        uploadrequest = lig.a(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return uploadrequest;
_L2:
        parcel.writeInt(0);
          goto _L3
        uploadrequest;
        parcel1.recycle();
        parcel.recycle();
        throw uploadrequest;
        uploadrequest = null;
          goto _L4
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final int b(Account account)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.reporting.internal.IReportingService");
        if (account == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        parcel.writeInt(1);
        account.writeToParcel(parcel, 0);
_L1:
        int i;
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i;
        parcel.writeInt(0);
          goto _L1
        account;
        parcel1.recycle();
        parcel.recycle();
        throw account;
    }
}
