// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.feedback.ErrorReport;

final class lar
    implements lap
{

    private IBinder a;

    lar(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(int i, int j)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.feedback.internal.IFeedbackService");
        parcel.writeInt(i);
        parcel.writeInt(j);
        a.transact(2, parcel, parcel1, 0);
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

    public final boolean a(ErrorReport errorreport)
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.feedback.internal.IFeedbackService");
        if (errorreport == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        parcel.writeInt(1);
        errorreport.writeToParcel(parcel, 0);
_L1:
        int i;
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        if (i == 0)
        {
            flag = false;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        parcel.writeInt(0);
          goto _L1
        errorreport;
        parcel1.recycle();
        parcel.recycle();
        throw errorreport;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final boolean b(ErrorReport errorreport)
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.feedback.internal.IFeedbackService");
        if (errorreport == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        parcel.writeInt(1);
        errorreport.writeToParcel(parcel, 0);
_L1:
        int i;
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        if (i == 0)
        {
            flag = false;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        parcel.writeInt(0);
          goto _L1
        errorreport;
        parcel1.recycle();
        parcel.recycle();
        throw errorreport;
    }
}
