// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.service;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.facebook.fbservice.service:
//            w, OperationType, z

class y
    implements w
{

    private IBinder a;

    y(IBinder ibinder)
    {
        a = ibinder;
    }

    public String a(OperationType operationtype, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.facebook.fbservice.service.IBlueService");
        if (operationtype == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        operationtype.writeToParcel(parcel, 0);
_L3:
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L4:
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        operationtype = parcel1.readString();
        parcel1.recycle();
        parcel.recycle();
        return operationtype;
_L2:
        parcel.writeInt(0);
          goto _L3
        operationtype;
        parcel1.recycle();
        parcel.recycle();
        throw operationtype;
        parcel.writeInt(0);
          goto _L4
    }

    public boolean a(String s, z z1)
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.facebook.fbservice.service.IBlueService");
        parcel.writeString(s);
        if (z1 == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        s = z1.asBinder();
_L1:
        int i;
        parcel.writeStrongBinder(s);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        if (i != 0)
        {
            flag = true;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        s = null;
          goto _L1
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public IBinder asBinder()
    {
        return a;
    }
}
