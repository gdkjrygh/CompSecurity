// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.service;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.facebook.fbservice.service:
//            w, y, OperationType, aa

public abstract class x extends Binder
    implements w
{

    public x()
    {
        attachInterface(this, "com.facebook.fbservice.service.IBlueService");
    }

    public static w a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.facebook.fbservice.service.IBlueService");
        if (iinterface != null && (iinterface instanceof w))
        {
            return (w)iinterface;
        } else
        {
            return new y(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        boolean flag;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.facebook.fbservice.service.IBlueService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.facebook.fbservice.service.IBlueService");
            OperationType operationtype;
            if (parcel.readInt() != 0)
            {
                operationtype = (OperationType)OperationType.CREATOR.createFromParcel(parcel);
            } else
            {
                operationtype = null;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            parcel = a(operationtype, parcel);
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.facebook.fbservice.service.IBlueService");
            flag = a(parcel.readString(), aa.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            break;
        }
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel1.writeInt(i);
        return true;
    }
}
