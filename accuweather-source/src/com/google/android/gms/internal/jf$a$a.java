// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.a;
import com.google.android.gms.location.b;
import com.google.android.gms.location.c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            jf, je, jl, kb, 
//            jn, jz, jp, jr, 
//            jv

private static class ko
    implements jf
{

    private IBinder ko;

    public void a(long l, boolean flag, PendingIntent pendingintent)
        throws RemoteException
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
        ko.transact(5, parcel, parcel1, 0);
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

    public void a(PendingIntent pendingintent)
        throws RemoteException
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
        ko.transact(11, parcel, parcel1, 0);
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

    public void a(PendingIntent pendingintent, je je1, String s)
        throws RemoteException
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
        if (je1 == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        pendingintent = je1.asBinder();
_L4:
        parcel.writeStrongBinder(pendingintent);
        parcel.writeString(s);
        ko.transact(2, parcel, parcel1, 0);
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

    public void a(Location location, int i)
        throws RemoteException
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
        ko.transact(26, parcel, parcel1, 0);
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

    public void a(je je1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (je1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        je1 = je1.asBinder();
_L1:
        parcel.writeStrongBinder(je1);
        parcel.writeString(s);
        ko.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        je1 = null;
          goto _L1
        je1;
        parcel1.recycle();
        parcel.recycle();
        throw je1;
    }

    public void a(jl jl1, kb kb1, PendingIntent pendingintent)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (jl1 == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        jl1.writeToParcel(parcel, 0);
_L5:
        if (kb1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        kb1.writeToParcel(parcel, 0);
_L6:
        if (pendingintent == null)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        parcel.writeInt(1);
        pendingintent.writeToParcel(parcel, 0);
_L7:
        ko.transact(48, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L5
        jl1;
        parcel1.recycle();
        parcel.recycle();
        throw jl1;
_L4:
        parcel.writeInt(0);
          goto _L6
        parcel.writeInt(0);
          goto _L7
    }

    public void a(jn jn1, kb kb1, jz jz1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (jn1 == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        jn1.writeToParcel(parcel, 0);
_L5:
        if (kb1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        kb1.writeToParcel(parcel, 0);
_L6:
        if (jz1 == null)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        jn1 = jz1.asBinder();
_L7:
        parcel.writeStrongBinder(jn1);
        ko.transact(17, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L5
        jn1;
        parcel1.recycle();
        parcel.recycle();
        throw jn1;
_L4:
        parcel.writeInt(0);
          goto _L6
        jn1 = null;
          goto _L7
    }

    public void a(jp jp1, kb kb1)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (jp1 == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        jp1.writeToParcel(parcel, 0);
_L3:
        if (kb1 == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        parcel.writeInt(1);
        kb1.writeToParcel(parcel, 0);
_L4:
        ko.transact(25, parcel, null, 1);
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        jp1;
        parcel.recycle();
        throw jp1;
        parcel.writeInt(0);
          goto _L4
    }

    public void a(jr jr1, kb kb1, PendingIntent pendingintent)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (jr1 == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        jr1.writeToParcel(parcel, 0);
_L5:
        if (kb1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        kb1.writeToParcel(parcel, 0);
_L6:
        if (pendingintent == null)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        parcel.writeInt(1);
        pendingintent.writeToParcel(parcel, 0);
_L7:
        ko.transact(18, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L5
        jr1;
        parcel1.recycle();
        parcel.recycle();
        throw jr1;
_L4:
        parcel.writeInt(0);
          goto _L6
        parcel.writeInt(0);
          goto _L7
    }

    public void a(jv jv1, kb kb1, jz jz1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (jv1 == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        jv1.writeToParcel(parcel, 0);
_L5:
        if (kb1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        kb1.writeToParcel(parcel, 0);
_L6:
        if (jz1 == null)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        jv1 = jz1.asBinder();
_L7:
        parcel.writeStrongBinder(jv1);
        ko.transact(46, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L5
        jv1;
        parcel1.recycle();
        parcel.recycle();
        throw jv1;
_L4:
        parcel.writeInt(0);
          goto _L6
        jv1 = null;
          goto _L7
    }

    public void a(kb kb1, PendingIntent pendingintent)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (kb1 == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        kb1.writeToParcel(parcel, 0);
_L3:
        if (pendingintent == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        parcel.writeInt(1);
        pendingintent.writeToParcel(parcel, 0);
_L4:
        ko.transact(19, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        kb1;
        parcel1.recycle();
        parcel.recycle();
        throw kb1;
        parcel.writeInt(0);
          goto _L4
    }

    public void a(LocationRequest locationrequest, PendingIntent pendingintent)
        throws RemoteException
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
        ko.transact(9, parcel, parcel1, 0);
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

    public void a(LocationRequest locationrequest, a a1)
        throws RemoteException
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
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        locationrequest = a1.asBinder();
_L4:
        parcel.writeStrongBinder(locationrequest);
        ko.transact(8, parcel, parcel1, 0);
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

    public void a(LocationRequest locationrequest, a a1, String s)
        throws RemoteException
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
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        locationrequest = a1.asBinder();
_L4:
        parcel.writeStrongBinder(locationrequest);
        parcel.writeString(s);
        ko.transact(20, parcel, parcel1, 0);
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

    public void a(a a1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        a1 = a1.asBinder();
_L1:
        parcel.writeStrongBinder(a1);
        ko.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        a1 = null;
          goto _L1
        a1;
        parcel1.recycle();
        parcel.recycle();
        throw a1;
    }

    public void a(LatLng latlng, jn jn1, kb kb1, jz jz1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (latlng == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        latlng.writeToParcel(parcel, 0);
_L7:
        if (jn1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        jn1.writeToParcel(parcel, 0);
_L8:
        if (kb1 == null) goto _L6; else goto _L5
_L5:
        parcel.writeInt(1);
        kb1.writeToParcel(parcel, 0);
_L9:
        if (jz1 == null)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        latlng = jz1.asBinder();
_L10:
        parcel.writeStrongBinder(latlng);
        ko.transact(16, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L7
        latlng;
        parcel1.recycle();
        parcel.recycle();
        throw latlng;
_L4:
        parcel.writeInt(0);
          goto _L8
_L6:
        parcel.writeInt(0);
          goto _L9
        latlng = null;
          goto _L10
    }

    public void a(LatLngBounds latlngbounds, int i, jn jn1, kb kb1, jz jz1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (latlngbounds == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        latlngbounds.writeToParcel(parcel, 0);
_L7:
        parcel.writeInt(i);
        if (jn1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        jn1.writeToParcel(parcel, 0);
_L8:
        if (kb1 == null) goto _L6; else goto _L5
_L5:
        parcel.writeInt(1);
        kb1.writeToParcel(parcel, 0);
_L9:
        if (jz1 == null)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        latlngbounds = jz1.asBinder();
_L10:
        parcel.writeStrongBinder(latlngbounds);
        ko.transact(14, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L7
        latlngbounds;
        parcel1.recycle();
        parcel.recycle();
        throw latlngbounds;
_L4:
        parcel.writeInt(0);
          goto _L8
_L6:
        parcel.writeInt(0);
          goto _L9
        latlngbounds = null;
          goto _L10
    }

    public void a(LatLngBounds latlngbounds, int i, String s, jn jn1, kb kb1, jz jz1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (latlngbounds == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        latlngbounds.writeToParcel(parcel, 0);
_L7:
        parcel.writeInt(i);
        parcel.writeString(s);
        if (jn1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        jn1.writeToParcel(parcel, 0);
_L8:
        if (kb1 == null) goto _L6; else goto _L5
_L5:
        parcel.writeInt(1);
        kb1.writeToParcel(parcel, 0);
_L9:
        if (jz1 == null)
        {
            break MISSING_BLOCK_LABEL_176;
        }
        latlngbounds = jz1.asBinder();
_L10:
        parcel.writeStrongBinder(latlngbounds);
        ko.transact(47, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L7
        latlngbounds;
        parcel1.recycle();
        parcel.recycle();
        throw latlngbounds;
_L4:
        parcel.writeInt(0);
          goto _L8
_L6:
        parcel.writeInt(0);
          goto _L9
        latlngbounds = null;
          goto _L10
    }

    public void a(String s, kb kb1, jz jz1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        parcel.writeString(s);
        if (kb1 == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        kb1.writeToParcel(parcel, 0);
_L3:
        if (jz1 == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        s = jz1.asBinder();
_L4:
        parcel.writeStrongBinder(s);
        ko.transact(15, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
        s = null;
          goto _L4
    }

    public void a(String s, LatLngBounds latlngbounds, jn jn1, kb kb1, jz jz1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        parcel.writeString(s);
        if (latlngbounds == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        latlngbounds.writeToParcel(parcel, 0);
_L7:
        if (jn1 == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        jn1.writeToParcel(parcel, 0);
_L8:
        if (kb1 == null) goto _L6; else goto _L5
_L5:
        parcel.writeInt(1);
        kb1.writeToParcel(parcel, 0);
_L9:
        if (jz1 == null)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        s = jz1.asBinder();
_L10:
        parcel.writeStrongBinder(s);
        ko.transact(45, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L7
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
_L4:
        parcel.writeInt(0);
          goto _L8
_L6:
        parcel.writeInt(0);
          goto _L9
        s = null;
          goto _L10
    }

    public void a(String s, List list, List list1, kb kb1, jz jz1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        parcel.writeString(s);
        parcel.writeStringList(list);
        parcel.writeTypedList(list1);
        if (kb1 == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        kb1.writeToParcel(parcel, 0);
_L3:
        if (jz1 == null)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        s = jz1.asBinder();
_L4:
        parcel.writeStrongBinder(s);
        ko.transact(50, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
        s = null;
          goto _L4
    }

    public void a(List list, PendingIntent pendingintent, je je1, String s)
        throws RemoteException
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
        if (je1 == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        list = je1.asBinder();
_L4:
        parcel.writeStrongBinder(list);
        parcel.writeString(s);
        ko.transact(1, parcel, parcel1, 0);
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

    public void a(String as[], je je1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        parcel.writeStringArray(as);
        if (je1 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        as = je1.asBinder();
_L1:
        parcel.writeStrongBinder(as);
        parcel.writeString(s);
        ko.transact(3, parcel, parcel1, 0);
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

    public IBinder asBinder()
    {
        return ko;
    }

    public void b(kb kb1, PendingIntent pendingintent)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (kb1 == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        kb1.writeToParcel(parcel, 0);
_L3:
        if (pendingintent == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        parcel.writeInt(1);
        pendingintent.writeToParcel(parcel, 0);
_L4:
        ko.transact(49, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        kb1;
        parcel1.recycle();
        parcel.recycle();
        throw kb1;
        parcel.writeInt(0);
          goto _L4
    }

    public void b(String s, kb kb1, jz jz1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        parcel.writeString(s);
        if (kb1 == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        kb1.writeToParcel(parcel, 0);
_L3:
        if (jz1 == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        s = jz1.asBinder();
_L4:
        parcel.writeStrongBinder(s);
        ko.transact(42, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
        s = null;
          goto _L4
    }

    public Location bo(String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        parcel.writeString(s);
        ko.transact(21, parcel, parcel1, 0);
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

    public b bp(String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        parcel.writeString(s);
        ko.transact(34, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        s = b.CREATOR.bs(parcel1);
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

    public Location iR()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        ko.transact(7, parcel, parcel1, 0);
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

    public IBinder iS()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        IBinder ibinder;
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        ko.transact(51, parcel, parcel1, 0);
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

    public void removeActivityUpdates(PendingIntent pendingintent)
        throws RemoteException
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
        ko.transact(6, parcel, parcel1, 0);
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

    public void setMockLocation(Location location)
        throws RemoteException
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
        ko.transact(13, parcel, parcel1, 0);
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

    public void setMockMode(boolean flag)
        throws RemoteException
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
        ko.transact(12, parcel, parcel1, 0);
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

    gBounds(IBinder ibinder)
    {
        ko = ibinder;
    }
}
