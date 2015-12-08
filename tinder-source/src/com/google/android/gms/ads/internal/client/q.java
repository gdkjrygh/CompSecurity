// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface q
    extends IInterface
{
    public static abstract class a extends Binder
        implements q
    {

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                long l = a();
                parcel1.writeNoException();
                parcel1.writeLong(l);
                return true;
            }
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
        }
    }


    public abstract long a()
        throws RemoteException;
}
