// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

final class avl
    implements avj
{

    private IBinder a;

    avl(IBinder ibinder)
    {
        a = ibinder;
    }

    public final atz a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        atz atz;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        atz = aua.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return atz;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final aul a(aaf aaf1, GoogleMapOptions googlemapoptions)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        if (aaf1 == null) goto _L2; else goto _L1
_L1:
        aaf1 = aaf1.asBinder();
_L5:
        parcel.writeStrongBinder(aaf1);
        if (googlemapoptions == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        googlemapoptions.writeToParcel(parcel, 0);
_L6:
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        aaf1 = aum.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return aaf1;
_L2:
        aaf1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        aaf1;
        parcel1.recycle();
        parcel.recycle();
        throw aaf1;
          goto _L5
    }

    public final aux a(aaf aaf1, StreetViewPanoramaOptions streetviewpanoramaoptions)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        if (aaf1 == null) goto _L2; else goto _L1
_L1:
        aaf1 = aaf1.asBinder();
_L5:
        parcel.writeStrongBinder(aaf1);
        if (streetviewpanoramaoptions == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        streetviewpanoramaoptions.writeToParcel(parcel, 0);
_L6:
        a.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        aaf1 = auy.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return aaf1;
_L2:
        aaf1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        aaf1;
        parcel1.recycle();
        parcel.recycle();
        throw aaf1;
          goto _L5
    }

    public final void a(aaf aaf1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        if (aaf1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        aaf1 = aaf1.asBinder();
_L1:
        parcel.writeStrongBinder(aaf1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        aaf1 = null;
          goto _L1
        aaf1;
        parcel1.recycle();
        parcel.recycle();
        throw aaf1;
    }

    public final void a(aaf aaf1, int i)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        if (aaf1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        aaf1 = aaf1.asBinder();
_L1:
        parcel.writeStrongBinder(aaf1);
        parcel.writeInt(i);
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        aaf1 = null;
          goto _L1
        aaf1;
        parcel1.recycle();
        parcel.recycle();
        throw aaf1;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final aui b(aaf aaf1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        if (aaf1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        aaf1 = aaf1.asBinder();
_L1:
        parcel.writeStrongBinder(aaf1);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        aaf1 = auj.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return aaf1;
        aaf1 = null;
          goto _L1
        aaf1;
        parcel1.recycle();
        parcel.recycle();
        throw aaf1;
    }

    public final ayk b()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        ayk ayk;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        a.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        ayk = ayl.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return ayk;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final auu c(aaf aaf1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        if (aaf1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        aaf1 = aaf1.asBinder();
_L1:
        parcel.writeStrongBinder(aaf1);
        a.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        aaf1 = auv.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return aaf1;
        aaf1 = null;
          goto _L1
        aaf1;
        parcel1.recycle();
        parcel.recycle();
        throw aaf1;
    }
}
