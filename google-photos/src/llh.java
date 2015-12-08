// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.nearby.sharing.AppContentReceivedResult;

final class llh
    implements llf
{

    private IBinder a;

    llh(IBinder ibinder)
    {
        a = ibinder;
    }

    public final String a(String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.sharing.internal.IAppContentReceiver");
        parcel.writeString(s);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        s = parcel1.readString();
        parcel1.recycle();
        parcel.recycle();
        return s;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void a(AppContentReceivedResult appcontentreceivedresult)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.sharing.internal.IAppContentReceiver");
        if (appcontentreceivedresult == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        appcontentreceivedresult.writeToParcel(parcel, 0);
_L1:
        a.transact(2, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        appcontentreceivedresult;
        parcel.recycle();
        throw appcontentreceivedresult;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
