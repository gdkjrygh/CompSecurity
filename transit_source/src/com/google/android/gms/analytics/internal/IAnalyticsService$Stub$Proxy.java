// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            IAnalyticsService

private static class mRemote
    implements IAnalyticsService
{

    private IBinder mRemote;

    public IBinder asBinder()
    {
        return mRemote;
    }

    public void clearHits()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
        mRemote.transact(2, parcel, parcel1, 0);
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

    public String getInterfaceDescriptor()
    {
        return "com.google.android.gms.analytics.internal.IAnalyticsService";
    }

    public void sendHit(Map map, long l, String s, List list)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
        parcel.writeMap(map);
        parcel.writeLong(l);
        parcel.writeString(s);
        parcel.writeTypedList(list);
        mRemote.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        map;
        parcel1.recycle();
        parcel.recycle();
        throw map;
    }

    (IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
