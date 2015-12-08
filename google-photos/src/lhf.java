// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.GestureRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
import java.util.List;

final class lhf
    implements lhd
{

    private IBinder a;

    lhf(IBinder ibinder)
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

    public final Status a(GestureRequest gesturerequest, PendingIntent pendingintent)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (gesturerequest == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        gesturerequest.writeToParcel(parcel, 0);
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
            break MISSING_BLOCK_LABEL_127;
        }
        gesturerequest = (Status)Status.CREATOR.createFromParcel(parcel1);
_L7:
        parcel1.recycle();
        parcel.recycle();
        return gesturerequest;
_L2:
        parcel.writeInt(0);
          goto _L5
        gesturerequest;
        parcel1.recycle();
        parcel.recycle();
        throw gesturerequest;
_L4:
        parcel.writeInt(0);
          goto _L6
        gesturerequest = null;
          goto _L7
    }

    public final ActivityRecognitionResult a(String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        parcel.writeString(s);
        a.transact(64, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        s = lgp.a(parcel1);
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

    public final void a(PendingIntent pendingintent, lha lha1, String s)
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
        if (lha1 == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        pendingintent = lha1.asBinder();
_L4:
        parcel.writeStrongBinder(pendingintent);
        parcel.writeString(s);
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

    public final void a(GeofencingRequest geofencingrequest, PendingIntent pendingintent, lha lha1)
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
        if (lha1 == null)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        geofencingrequest = lha1.asBinder();
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

    public final void a(LocationRequest locationrequest, lim lim1)
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
        if (lim1 == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        locationrequest = lim1.asBinder();
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

    public final void a(LocationRequest locationrequest, lim lim1, String s)
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
        if (lim1 == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        locationrequest = lim1.asBinder();
_L4:
        parcel.writeStrongBinder(locationrequest);
        parcel.writeString(s);
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

    public final void a(LocationSettingsRequest locationsettingsrequest, lhg lhg1, String s)
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
        if (lhg1 == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        locationsettingsrequest = lhg1.asBinder();
_L4:
        parcel.writeStrongBinder(locationsettingsrequest);
        parcel.writeString(s);
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

    public final void a(LocationRequestInternal locationrequestinternal, PendingIntent pendingintent)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (locationrequestinternal == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        locationrequestinternal.writeToParcel(parcel, 0);
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
        locationrequestinternal;
        parcel1.recycle();
        parcel.recycle();
        throw locationrequestinternal;
        parcel.writeInt(0);
          goto _L4
    }

    public final void a(LocationRequestInternal locationrequestinternal, lim lim1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (locationrequestinternal == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        locationrequestinternal.writeToParcel(parcel, 0);
_L3:
        if (lim1 == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        locationrequestinternal = lim1.asBinder();
_L4:
        parcel.writeStrongBinder(locationrequestinternal);
        a.transact(52, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        locationrequestinternal;
        parcel1.recycle();
        parcel.recycle();
        throw locationrequestinternal;
        locationrequestinternal = null;
          goto _L4
    }

    public final void a(LocationRequestUpdateData locationrequestupdatedata)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (locationrequestupdatedata == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        locationrequestupdatedata.writeToParcel(parcel, 0);
_L1:
        a.transact(59, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        locationrequestupdatedata;
        parcel1.recycle();
        parcel.recycle();
        throw locationrequestupdatedata;
    }

    public final void a(List list, PendingIntent pendingintent, lha lha1, String s)
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
        if (lha1 == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        list = lha1.asBinder();
_L4:
        parcel.writeStrongBinder(list);
        parcel.writeString(s);
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

    public final void a(lha lha1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (lha1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        lha1 = lha1.asBinder();
_L1:
        parcel.writeStrongBinder(lha1);
        parcel.writeString(s);
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        lha1 = null;
          goto _L1
        lha1;
        parcel1.recycle();
        parcel.recycle();
        throw lha1;
    }

    public final void a(lim lim1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (lim1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        lim1 = lim1.asBinder();
_L1:
        parcel.writeStrongBinder(lim1);
        a.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        lim1 = null;
          goto _L1
        lim1;
        parcel1.recycle();
        parcel.recycle();
        throw lim1;
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

    public final void a(String as[], lha lha1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        parcel.writeStringArray(as);
        if (lha1 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        as = lha1.asBinder();
_L1:
        parcel.writeStrongBinder(as);
        parcel.writeString(s);
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

    public final Location b(String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        parcel.writeString(s);
        a.transact(21, parcel, parcel1, 0);
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
        a.transact(65, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        pendingintent = (Status)Status.CREATOR.createFromParcel(parcel1);
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

    public final Status c(PendingIntent pendingintent)
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
        a.transact(66, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        pendingintent = (Status)Status.CREATOR.createFromParcel(parcel1);
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

    public final LocationAvailability c(String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        parcel.writeString(s);
        a.transact(34, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        s = lgs.a(parcel1);
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

    public final Status d(PendingIntent pendingintent)
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
            break MISSING_BLOCK_LABEL_97;
        }
        pendingintent = (Status)Status.CREATOR.createFromParcel(parcel1);
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

    public final void e(PendingIntent pendingintent)
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
