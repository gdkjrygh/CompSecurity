// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.w;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.af;
import com.google.android.gms.location.s;
import com.google.android.gms.location.zzb;
import com.google.android.gms.location.zzl;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            jo, jl, zzpg, zzpi, 
//            jr

final class jq
    implements jo
{

    private IBinder a;

    jq(IBinder ibinder)
    {
        a = ibinder;
    }

    public final Location a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        a.transact(7, parcel, parcel1, 0);
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

    public final Location a(String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        parcel.writeString(s1);
        a.transact(21, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        s1 = (Location)Location.CREATOR.createFromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return s1;
_L2:
        s1 = null;
        if (true) goto _L4; else goto _L3
_L3:
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public final Status a(zzb zzb1, PendingIntent pendingintent)
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
        a.transact(60, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        zzb1 = Status.CREATOR;
        zzb1 = w.a(parcel1);
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

    public final void a(long l, boolean flag, PendingIntent pendingintent)
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
        a.transact(5, parcel, parcel1, 0);
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

    public final void a(PendingIntent pendingintent)
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
        a.transact(6, parcel, parcel1, 0);
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

    public final void a(PendingIntent pendingintent, jl jl1, String s1)
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
        if (jl1 == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        pendingintent = jl1.asBinder();
_L4:
        parcel.writeStrongBinder(pendingintent);
        parcel.writeString(s1);
        a.transact(2, parcel, parcel1, 0);
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

    public final void a(Location location)
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
        a.transact(13, parcel, parcel1, 0);
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

    public final void a(Location location, int i)
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
        a.transact(26, parcel, parcel1, 0);
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

    public final void a(jl jl1, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (jl1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        jl1 = jl1.asBinder();
_L1:
        parcel.writeStrongBinder(jl1);
        parcel.writeString(s1);
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        jl1 = null;
          goto _L1
        jl1;
        parcel1.recycle();
        parcel.recycle();
        throw jl1;
    }

    public final void a(zzpg zzpg1, PendingIntent pendingintent)
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
        a.transact(53, parcel, parcel1, 0);
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

    public final void a(zzpg zzpg1, s s1)
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
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        zzpg1 = s1.asBinder();
_L4:
        parcel.writeStrongBinder(zzpg1);
        a.transact(52, parcel, parcel1, 0);
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

    public final void a(zzpi zzpi1)
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
        a.transact(59, parcel, parcel1, 0);
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

    public final void a(GeofencingRequest geofencingrequest, PendingIntent pendingintent, jl jl1)
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
        if (jl1 == null)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        geofencingrequest = jl1.asBinder();
_L7:
        parcel.writeStrongBinder(geofencingrequest);
        a.transact(57, parcel, parcel1, 0);
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

    public final void a(LocationRequest locationrequest, PendingIntent pendingintent)
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
        a.transact(9, parcel, parcel1, 0);
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

    public final void a(LocationRequest locationrequest, s s1)
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
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        locationrequest = s1.asBinder();
_L4:
        parcel.writeStrongBinder(locationrequest);
        a.transact(8, parcel, parcel1, 0);
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

    public final void a(LocationRequest locationrequest, s s1, String s2)
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
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        locationrequest = s1.asBinder();
_L4:
        parcel.writeStrongBinder(locationrequest);
        parcel.writeString(s2);
        a.transact(20, parcel, parcel1, 0);
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

    public final void a(LocationSettingsRequest locationsettingsrequest, jr jr1, String s1)
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
        if (jr1 == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        locationsettingsrequest = jr1.asBinder();
_L4:
        parcel.writeStrongBinder(locationsettingsrequest);
        parcel.writeString(s1);
        a.transact(63, parcel, parcel1, 0);
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

    public final void a(s s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        s1 = s1.asBinder();
_L1:
        parcel.writeStrongBinder(s1);
        a.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s1 = null;
          goto _L1
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public final void a(List list, PendingIntent pendingintent, jl jl1, String s1)
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
        if (jl1 == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        list = jl1.asBinder();
_L4:
        parcel.writeStrongBinder(list);
        parcel.writeString(s1);
        a.transact(1, parcel, parcel1, 0);
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

    public final void a(boolean flag)
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
        a.transact(12, parcel, parcel1, 0);
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

    public final void a(String as[], jl jl1, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        parcel.writeStringArray(as);
        if (jl1 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        as = jl1.asBinder();
_L1:
        parcel.writeStrongBinder(as);
        parcel.writeString(s1);
        a.transact(3, parcel, parcel1, 0);
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

    public final IBinder asBinder()
    {
        return a;
    }

    public final IBinder b()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        IBinder ibinder;
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        a.transact(51, parcel, parcel1, 0);
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

    public final Status b(PendingIntent pendingintent)
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
        a.transact(61, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        pendingintent = Status.CREATOR;
        pendingintent = w.a(parcel1);
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

    public final zzl b(String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        parcel.writeString(s1);
        a.transact(34, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        s1 = zzl.CREATOR;
        s1 = af.a(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return s1;
_L2:
        s1 = null;
        if (true) goto _L4; else goto _L3
_L3:
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public final void c(PendingIntent pendingintent)
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
        a.transact(11, parcel, parcel1, 0);
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
}
