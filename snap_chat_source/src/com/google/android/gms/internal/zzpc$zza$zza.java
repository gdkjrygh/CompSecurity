// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.StatusCreator;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.zzb;
import com.google.android.gms.location.zzd;
import com.google.android.gms.location.zzl;
import com.google.android.gms.location.zzm;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzpc, zzpb, zzpg, zzpi, 
//            zzpd

static class zzle
    implements zzpc
{

    private IBinder zzle;

    public IBinder asBinder()
    {
        return zzle;
    }

    public void zzW(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        zzle.transact(12, parcel, parcel1, 0);
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

    public Status zza(zzb zzb1, PendingIntent pendingintent)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (zzb1 == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        zzb1.writeToParcel(parcel, 0);
_L5:
        if (pendingintent == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        pendingintent.writeToParcel(parcel, 0);
_L6:
        zzle.transact(60, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        zzb1 = Status.CREATOR.createFromParcel(parcel1);
_L7:
        parcel1.recycle();
        parcel.recycle();
        return zzb1;
_L2:
        parcel.writeInt(0);
          goto _L5
        zzb1;
        parcel1.recycle();
        parcel.recycle();
        throw zzb1;
_L4:
        parcel.writeInt(0);
          goto _L6
        zzb1 = null;
          goto _L7
    }

    public void zza(long l, boolean flag, PendingIntent pendingintent)
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        parcel.writeLong(l);
        if (!flag)
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (pendingintent == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        parcel.writeInt(1);
        pendingintent.writeToParcel(parcel, 0);
_L1:
        zzle.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        pendingintent;
        parcel1.recycle();
        parcel.recycle();
        throw pendingintent;
    }

    public void zza(PendingIntent pendingintent)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (pendingintent == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        pendingintent.writeToParcel(parcel, 0);
_L1:
        zzle.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        pendingintent;
        parcel1.recycle();
        parcel.recycle();
        throw pendingintent;
    }

    public void zza(PendingIntent pendingintent, zzpb zzpb1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (pendingintent == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        pendingintent.writeToParcel(parcel, 0);
_L3:
        if (zzpb1 == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        pendingintent = zzpb1.asBinder();
_L4:
        parcel.writeStrongBinder(pendingintent);
        parcel.writeString(s);
        zzle.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        pendingintent;
        parcel1.recycle();
        parcel.recycle();
        throw pendingintent;
        pendingintent = null;
          goto _L4
    }

    public void zza(Location location, int i)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (location == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        parcel.writeInt(1);
        location.writeToParcel(parcel, 0);
_L1:
        parcel.writeInt(i);
        zzle.transact(26, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        location;
        parcel1.recycle();
        parcel.recycle();
        throw location;
    }

    public void zza(zzpb zzpb1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (zzpb1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        zzpb1 = zzpb1.asBinder();
_L1:
        parcel.writeStrongBinder(zzpb1);
        parcel.writeString(s);
        zzle.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzpb1 = null;
          goto _L1
        zzpb1;
        parcel1.recycle();
        parcel.recycle();
        throw zzpb1;
    }

    public void zza(zzpg zzpg1, PendingIntent pendingintent)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (zzpg1 == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        zzpg1.writeToParcel(parcel, 0);
_L3:
        if (pendingintent == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        parcel.writeInt(1);
        pendingintent.writeToParcel(parcel, 0);
_L4:
        zzle.transact(53, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        zzpg1;
        parcel1.recycle();
        parcel.recycle();
        throw zzpg1;
        parcel.writeInt(0);
          goto _L4
    }

    public void zza(zzpg zzpg1, zzd zzd1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (zzpg1 == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        zzpg1.writeToParcel(parcel, 0);
_L3:
        if (zzd1 == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        zzpg1 = zzd1.asBinder();
_L4:
        parcel.writeStrongBinder(zzpg1);
        zzle.transact(52, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        zzpg1;
        parcel1.recycle();
        parcel.recycle();
        throw zzpg1;
        zzpg1 = null;
          goto _L4
    }

    public void zza(zzpi zzpi1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (zzpi1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        zzpi1.writeToParcel(parcel, 0);
_L1:
        zzle.transact(59, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        zzpi1;
        parcel1.recycle();
        parcel.recycle();
        throw zzpi1;
    }

    public void zza(GeofencingRequest geofencingrequest, PendingIntent pendingintent, zzpb zzpb1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (geofencingrequest == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        geofencingrequest.writeToParcel(parcel, 0);
_L5:
        if (pendingintent == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        pendingintent.writeToParcel(parcel, 0);
_L6:
        if (zzpb1 == null)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        geofencingrequest = zzpb1.asBinder();
_L7:
        parcel.writeStrongBinder(geofencingrequest);
        zzle.transact(57, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L5
        geofencingrequest;
        parcel1.recycle();
        parcel.recycle();
        throw geofencingrequest;
_L4:
        parcel.writeInt(0);
          goto _L6
        geofencingrequest = null;
          goto _L7
    }

    public void zza(LocationRequest locationrequest, PendingIntent pendingintent)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (locationrequest == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        locationrequest.writeToParcel(parcel, 0);
_L3:
        if (pendingintent == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        parcel.writeInt(1);
        pendingintent.writeToParcel(parcel, 0);
_L4:
        zzle.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        locationrequest;
        parcel1.recycle();
        parcel.recycle();
        throw locationrequest;
        parcel.writeInt(0);
          goto _L4
    }

    public void zza(LocationRequest locationrequest, zzd zzd1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (locationrequest == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        locationrequest.writeToParcel(parcel, 0);
_L3:
        if (zzd1 == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        locationrequest = zzd1.asBinder();
_L4:
        parcel.writeStrongBinder(locationrequest);
        zzle.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        locationrequest;
        parcel1.recycle();
        parcel.recycle();
        throw locationrequest;
        locationrequest = null;
          goto _L4
    }

    public void zza(LocationRequest locationrequest, zzd zzd1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (locationrequest == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        locationrequest.writeToParcel(parcel, 0);
_L3:
        if (zzd1 == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        locationrequest = zzd1.asBinder();
_L4:
        parcel.writeStrongBinder(locationrequest);
        parcel.writeString(s);
        zzle.transact(20, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        locationrequest;
        parcel1.recycle();
        parcel.recycle();
        throw locationrequest;
        locationrequest = null;
          goto _L4
    }

    public void zza(LocationSettingsRequest locationsettingsrequest, zzpd zzpd1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (locationsettingsrequest == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        locationsettingsrequest.writeToParcel(parcel, 0);
_L3:
        if (zzpd1 == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        locationsettingsrequest = zzpd1.asBinder();
_L4:
        parcel.writeStrongBinder(locationsettingsrequest);
        parcel.writeString(s);
        zzle.transact(63, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        locationsettingsrequest;
        parcel1.recycle();
        parcel.recycle();
        throw locationsettingsrequest;
        locationsettingsrequest = null;
          goto _L4
    }

    public void zza(zzd zzd1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (zzd1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzd1 = zzd1.asBinder();
_L1:
        parcel.writeStrongBinder(zzd1);
        zzle.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzd1 = null;
          goto _L1
        zzd1;
        parcel1.recycle();
        parcel.recycle();
        throw zzd1;
    }

    public void zza(List list, PendingIntent pendingintent, zzpb zzpb1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        parcel.writeTypedList(list);
        if (pendingintent == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        pendingintent.writeToParcel(parcel, 0);
_L3:
        if (zzpb1 == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        list = zzpb1.asBinder();
_L4:
        parcel.writeStrongBinder(list);
        parcel.writeString(s);
        zzle.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        list;
        parcel1.recycle();
        parcel.recycle();
        throw list;
        list = null;
          goto _L4
    }

    public void zza(String as[], zzpb zzpb1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        parcel.writeStringArray(as);
        if (zzpb1 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        as = zzpb1.asBinder();
_L1:
        parcel.writeStrongBinder(as);
        parcel.writeString(s);
        zzle.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        as = null;
          goto _L1
        as;
        parcel1.recycle();
        parcel.recycle();
        throw as;
    }

    public Status zzb(PendingIntent pendingintent)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (pendingintent == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        pendingintent.writeToParcel(parcel, 0);
_L3:
        zzle.transact(61, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        pendingintent = Status.CREATOR.createFromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return pendingintent;
_L2:
        parcel.writeInt(0);
          goto _L3
        pendingintent;
        parcel1.recycle();
        parcel.recycle();
        throw pendingintent;
        pendingintent = null;
          goto _L4
    }

    public void zzb(Location location)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (location == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        location.writeToParcel(parcel, 0);
_L1:
        zzle.transact(13, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        location;
        parcel1.recycle();
        parcel.recycle();
        throw location;
    }

    public void zzc(PendingIntent pendingintent)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (pendingintent == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        pendingintent.writeToParcel(parcel, 0);
_L1:
        zzle.transact(11, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        pendingintent;
        parcel1.recycle();
        parcel.recycle();
        throw pendingintent;
    }

    public Location zzcj(String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        parcel.writeString(s);
        zzle.transact(21, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        s = (Location)Location.CREATOR.createFromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return s;
_L2:
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public zzl zzck(String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        parcel.writeString(s);
        zzle.transact(34, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        s = zzl.CREATOR.zzdt(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return s;
_L2:
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public Location zzpv()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        zzle.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Location location = (Location)Location.CREATOR.createFromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return location;
_L2:
        location = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public IBinder zzpw()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        IBinder ibinder;
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        zzle.transact(51, parcel, parcel1, 0);
        parcel1.readException();
        ibinder = parcel1.readStrongBinder();
        parcel1.recycle();
        parcel.recycle();
        return ibinder;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    ngsRequest(IBinder ibinder)
    {
        zzle = ibinder;
    }
}
