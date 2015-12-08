// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.gaid;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.cleanmaster.gaid:
//            AdvertisingIdInterface

final class b
    implements AdvertisingIdInterface
{

    private IBinder a;

    b(IBinder ibinder)
    {
        a = ibinder;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final String getId()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        String s;
        parcel.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        s = parcel1.readString();
        parcel1.recycle();
        parcel.recycle();
        return s;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final boolean isLimitAdTrackingEnabled(boolean flag)
    {
        Parcel parcel;
        Exception exception;
        boolean flag1 = true;
        parcel = Parcel.obtain();
        Parcel parcel1 = Parcel.obtain();
        int i;
        try
        {
            parcel.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        }
        catch (SecurityException securityexception)
        {
            parcel1.recycle();
            parcel.recycle();
            return false;
        }
        finally
        {
            parcel1.recycle();
        }
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        if (i != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        parcel.recycle();
        throw exception;
    }
}
