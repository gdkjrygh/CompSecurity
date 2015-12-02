// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.facebook.fbservice.service:
//            z, ab, OperationResult

public abstract class aa extends Binder
    implements z
{

    public aa()
    {
        attachInterface(this, "com.facebook.fbservice.service.ICompletionHandler");
    }

    public static z a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.facebook.fbservice.service.ICompletionHandler");
        if (iinterface != null && (iinterface instanceof z))
        {
            return (z)iinterface;
        } else
        {
            return new ab(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj = null;
        OperationResult operationresult = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.facebook.fbservice.service.ICompletionHandler");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.facebook.fbservice.service.ICompletionHandler");
            if (parcel.readInt() != 0)
            {
                operationresult = (OperationResult)OperationResult.CREATOR.createFromParcel(parcel);
            }
            a(operationresult);
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.facebook.fbservice.service.ICompletionHandler");
            operationresult = obj;
            break;
        }
        if (parcel.readInt() != 0)
        {
            operationresult = (OperationResult)OperationResult.CREATOR.createFromParcel(parcel);
        }
        b(operationresult);
        parcel1.writeNoException();
        return true;
    }
}
