// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            MobileAdsSettingsParcel, c

public interface y
    extends IInterface
{
    public static abstract class a extends Binder
        implements y
    {

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            String s;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                s = parcel.readString();
                break;
            }
            if (parcel.readInt() != 0)
            {
                c c1 = MobileAdsSettingsParcel.CREATOR;
                parcel = c.a(parcel);
            } else
            {
                parcel = null;
            }
            a(s, parcel);
            parcel1.writeNoException();
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
        }
    }


    public abstract void a(String s, MobileAdsSettingsParcel mobileadssettingsparcel)
        throws RemoteException;
}
