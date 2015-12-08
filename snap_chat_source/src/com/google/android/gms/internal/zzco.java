// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;

public interface zzco
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzco
    {

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        {
            zzd zzd2 = null;
            Object obj = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                zzl(parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                recordImpression();
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                parcel = zzcw();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                zzd2 = zzcx();
                parcel1.writeNoException();
                parcel = obj;
                if (zzd2 != null)
                {
                    parcel = zzd2.asBinder();
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
                zzd zzd1 = zzcy();
                parcel1.writeNoException();
                parcel = zzd2;
                if (zzd1 != null)
                {
                    parcel = zzd1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                parcel = zzcz();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                double d = zzcA();
                parcel1.writeNoException();
                parcel1.writeDouble(d);
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                parcel = zzcB();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                parcel = zzcC();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;
            }
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
        }
    }


    public abstract String getBody();

    public abstract void recordImpression();

    public abstract double zzcA();

    public abstract String zzcB();

    public abstract String zzcC();

    public abstract String zzcw();

    public abstract zzd zzcx();

    public abstract zzd zzcy();

    public abstract String zzcz();

    public abstract void zzl(int i);
}
