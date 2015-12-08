// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.j;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.model.internal.g;
import com.google.android.gms.maps.model.internal.h;

// Referenced classes of package com.google.android.gms.maps.internal:
//            ak, b, n, z, 
//            k, w, a, m, 
//            y, j, v

final class am
    implements ak
{

    private IBinder a;

    am(IBinder ibinder)
    {
        a = ibinder;
    }

    public final a a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        a a1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        a1 = com.google.android.gms.maps.internal.b.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return a1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final m a(j j1, GoogleMapOptions googlemapoptions)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        if (j1 == null) goto _L2; else goto _L1
_L1:
        j1 = j1.asBinder();
_L5:
        parcel.writeStrongBinder(j1);
        if (googlemapoptions == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        googlemapoptions.writeToParcel(parcel, 0);
_L6:
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        j1 = n.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return j1;
_L2:
        j1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        j1;
        parcel1.recycle();
        parcel.recycle();
        throw j1;
          goto _L5
    }

    public final y a(j j1, StreetViewPanoramaOptions streetviewpanoramaoptions)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        if (j1 == null) goto _L2; else goto _L1
_L1:
        j1 = j1.asBinder();
_L5:
        parcel.writeStrongBinder(j1);
        if (streetviewpanoramaoptions == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        streetviewpanoramaoptions.writeToParcel(parcel, 0);
_L6:
        a.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        j1 = z.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return j1;
_L2:
        j1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        j1;
        parcel1.recycle();
        parcel.recycle();
        throw j1;
          goto _L5
    }

    public final void a(j j1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        if (j1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        j1 = j1.asBinder();
_L1:
        parcel.writeStrongBinder(j1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        j1 = null;
          goto _L1
        j1;
        parcel1.recycle();
        parcel.recycle();
        throw j1;
    }

    public final void a(j j1, int i)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        if (j1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        j1 = j1.asBinder();
_L1:
        parcel.writeStrongBinder(j1);
        parcel.writeInt(i);
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        j1 = null;
          goto _L1
        j1;
        parcel1.recycle();
        parcel.recycle();
        throw j1;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final com.google.android.gms.maps.internal.j b(j j1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        if (j1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        j1 = j1.asBinder();
_L1:
        parcel.writeStrongBinder(j1);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        j1 = k.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return j1;
        j1 = null;
          goto _L1
        j1;
        parcel1.recycle();
        parcel.recycle();
        throw j1;
    }

    public final g b()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        g g;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        a.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        g = h.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return g;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final v c(j j1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        if (j1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        j1 = j1.asBinder();
_L1:
        parcel.writeStrongBinder(j1);
        a.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        j1 = w.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return j1;
        j1 = null;
          goto _L1
        j1;
        parcel1.recycle();
        parcel.recycle();
        throw j1;
    }
}
