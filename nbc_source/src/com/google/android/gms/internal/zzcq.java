// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzck

public interface zzcq
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzcq
    {

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            zzd zzd1 = null;
            Object obj = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                zzd1 = zzdD();
                parcel1.writeNoException();
                parcel = obj;
                if (zzd1 != null)
                {
                    parcel = zzd1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                parcel = zzdx();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                parcel = getImages();
                parcel1.writeNoException();
                parcel1.writeList(parcel);
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                parcel = getBody();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                zzck zzck1 = zzdG();
                parcel1.writeNoException();
                parcel = zzd1;
                if (zzck1 != null)
                {
                    parcel = zzck1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                parcel = zzdz();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                parcel = zzdH();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;
            }
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeContentAd");
        }
    }


    public abstract String getBody()
        throws RemoteException;

    public abstract List getImages()
        throws RemoteException;

    public abstract zzd zzdD()
        throws RemoteException;

    public abstract zzck zzdG()
        throws RemoteException;

    public abstract String zzdH()
        throws RemoteException;

    public abstract String zzdx()
        throws RemoteException;

    public abstract String zzdz()
        throws RemoteException;
}
