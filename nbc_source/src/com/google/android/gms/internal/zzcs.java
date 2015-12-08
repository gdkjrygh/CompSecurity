// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzck

public interface zzcs
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzcs
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
                parcel1.writeString("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                parcel = zzQ(parcel.readString());
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                parcel = zzR(parcel.readString());
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel = parcel.asBinder();
                } else
                {
                    parcel = null;
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                parcel = getAvailableAssetNames();
                parcel1.writeNoException();
                parcel1.writeStringList(parcel);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                parcel = getCustomTemplateId();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                performClick(parcel.readString());
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                recordImpression();
                parcel1.writeNoException();
                return true;
            }
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        }
    }


    public abstract List getAvailableAssetNames()
        throws RemoteException;

    public abstract String getCustomTemplateId()
        throws RemoteException;

    public abstract void performClick(String s)
        throws RemoteException;

    public abstract void recordImpression()
        throws RemoteException;

    public abstract String zzQ(String s)
        throws RemoteException;

    public abstract zzck zzR(String s)
        throws RemoteException;
}
