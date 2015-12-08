// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsResultCreator;

public interface zzpd
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzpd
    {

        public static zzpd zzbl(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.location.internal.ISettingsCallbacks");
            if (iinterface != null && (iinterface instanceof zzpd))
            {
                return (zzpd)iinterface;
            } else
            {
                return new zza(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        {
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.location.internal.ISettingsCallbacks");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.location.internal.ISettingsCallbacks");
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel = LocationSettingsResult.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            zza(parcel);
            parcel1.writeNoException();
            return true;
        }
    }

    static class zza.zza
        implements zzpd
    {

        private IBinder zzle;

        public IBinder asBinder()
        {
            return zzle;
        }

        public void zza(LocationSettingsResult locationsettingsresult)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.location.internal.ISettingsCallbacks");
            if (locationsettingsresult == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            locationsettingsresult.writeToParcel(parcel, 0);
_L1:
            zzle.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            locationsettingsresult;
            parcel1.recycle();
            parcel.recycle();
            throw locationsettingsresult;
        }

        zza.zza(IBinder ibinder)
        {
            zzle = ibinder;
        }
    }


    public abstract void zza(LocationSettingsResult locationsettingsresult);
}
