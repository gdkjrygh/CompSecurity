// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.feedback.ErrorReport;

public abstract class laq extends Binder
    implements lap
{

    public static lap a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackService");
        if (iinterface != null && (iinterface instanceof lap))
        {
            return (lap)iinterface;
        } else
        {
            return new lar(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj = null;
        ErrorReport errorreport = null;
        boolean flag = false;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.feedback.internal.IFeedbackService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.feedback.internal.IFeedbackService");
            if (parcel.readInt() != 0)
            {
                errorreport = (ErrorReport)ErrorReport.CREATOR.createFromParcel(parcel);
            }
            boolean flag1 = a(errorreport);
            parcel1.writeNoException();
            if (flag1)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel1.writeInt(i);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.feedback.internal.IFeedbackService");
            a(parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.feedback.internal.IFeedbackService");
            errorreport = obj;
            break;
        }
        if (parcel.readInt() != 0)
        {
            errorreport = (ErrorReport)ErrorReport.CREATOR.createFromParcel(parcel);
        }
        boolean flag2 = b(errorreport);
        parcel1.writeNoException();
        i = ((flag) ? 1 : 0);
        if (flag2)
        {
            i = 1;
        }
        parcel1.writeInt(i);
        return true;
    }
}
