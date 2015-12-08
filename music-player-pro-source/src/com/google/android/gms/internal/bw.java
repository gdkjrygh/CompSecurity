// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;

public interface bw
    extends IInterface
{
    public static abstract class a extends Binder
        implements bw
    {

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int k)
            throws RemoteException
        {
            d d3 = null;
            Object obj = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, k);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                j(parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                aw();
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                parcel = bB();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                d3 = bC();
                parcel1.writeNoException();
                parcel = obj;
                if (d3 != null)
                {
                    parcel = d3.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                parcel = getBody();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                d d2 = bD();
                parcel1.writeNoException();
                parcel = d3;
                if (d2 != null)
                {
                    parcel = d2.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                parcel = bE();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                double d1 = bF();
                parcel1.writeNoException();
                parcel1.writeDouble(d1);
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                parcel = bG();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                parcel = bH();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;
            }
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
        }
    }


    public abstract void aw()
        throws RemoteException;

    public abstract String bB()
        throws RemoteException;

    public abstract d bC()
        throws RemoteException;

    public abstract d bD()
        throws RemoteException;

    public abstract String bE()
        throws RemoteException;

    public abstract double bF()
        throws RemoteException;

    public abstract String bG()
        throws RemoteException;

    public abstract String bH()
        throws RemoteException;

    public abstract String getBody()
        throws RemoteException;

    public abstract void j(int i)
        throws RemoteException;
}
