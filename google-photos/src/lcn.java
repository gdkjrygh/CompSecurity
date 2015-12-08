// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.nearby.connection.AppMetadata;

final class lcn
    implements lcl
{

    private IBinder a;

    lcn(IBinder ibinder)
    {
        a = ibinder;
    }

    public final String a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        String s;
        parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        a.transact(1016, parcel, parcel1, 0);
        parcel1.readException();
        s = parcel1.readString();
        parcel1.recycle();
        parcel.recycle();
        return s;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final void a(long l)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        parcel.writeLong(l);
        a.transact(1002, parcel, parcel1, 0);
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

    public final void a(String s, long l)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        parcel.writeString(s);
        parcel.writeLong(l);
        a.transact(1004, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void a(lci lci1, int i, long l, long l1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        if (lci1 == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        lci1 = lci1.asBinder();
_L1:
        parcel.writeStrongBinder(lci1);
        parcel.writeInt(i);
        parcel.writeLong(l);
        parcel.writeLong(l1);
        a.transact(1005, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        lci1 = null;
          goto _L1
        lci1;
        parcel1.recycle();
        parcel.recycle();
        throw lci1;
    }

    public final void a(lci lci1, String s, long l)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        if (lci1 == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        lci1 = lci1.asBinder();
_L1:
        parcel.writeStrongBinder(lci1);
        parcel.writeString(s);
        parcel.writeLong(l);
        a.transact(1009, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        lci1 = null;
          goto _L1
        lci1;
        parcel1.recycle();
        parcel.recycle();
        throw lci1;
    }

    public final void a(lci lci1, String s, long l, long l1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        if (lci1 == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        lci1 = lci1.asBinder();
_L1:
        parcel.writeStrongBinder(lci1);
        parcel.writeString(s);
        parcel.writeLong(l);
        parcel.writeLong(l1);
        a.transact(1003, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        lci1 = null;
          goto _L1
        lci1;
        parcel1.recycle();
        parcel.recycle();
        throw lci1;
    }

    public final void a(lci lci1, String s, AppMetadata appmetadata, long l, long l1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        if (lci1 == null) goto _L2; else goto _L1
_L1:
        lci1 = lci1.asBinder();
_L5:
        parcel.writeStrongBinder(lci1);
        parcel.writeString(s);
        if (appmetadata == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        appmetadata.writeToParcel(parcel, 0);
_L6:
        parcel.writeLong(l);
        parcel.writeLong(l1);
        a.transact(1001, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        lci1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        lci1;
        parcel1.recycle();
        parcel.recycle();
        throw lci1;
          goto _L5
    }

    public final void a(lci lci1, String s, String s1, byte abyte0[], long l)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        if (lci1 == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        lci1 = lci1.asBinder();
_L1:
        parcel.writeStrongBinder(lci1);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeByteArray(abyte0);
        parcel.writeLong(l);
        a.transact(1007, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        lci1 = null;
          goto _L1
        lci1;
        parcel1.recycle();
        parcel.recycle();
        throw lci1;
    }

    public final void a(lci lci1, String s, byte abyte0[], long l)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        if (lci1 == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        lci1 = lci1.asBinder();
_L1:
        parcel.writeStrongBinder(lci1);
        parcel.writeString(s);
        parcel.writeByteArray(abyte0);
        parcel.writeLong(l);
        a.transact(1008, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        lci1 = null;
          goto _L1
        lci1;
        parcel1.recycle();
        parcel.recycle();
        throw lci1;
    }

    public final void a(String as[], byte abyte0[], long l)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        parcel.writeStringArray(as);
        parcel.writeByteArray(abyte0);
        parcel.writeLong(l);
        a.transact(1010, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        as;
        parcel1.recycle();
        parcel.recycle();
        throw as;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final void b(long l)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        parcel.writeLong(l);
        a.transact(1006, parcel, parcel1, 0);
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

    public final void b(String s, long l)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        parcel.writeString(s);
        parcel.writeLong(l);
        a.transact(1012, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void b(String as[], byte abyte0[], long l)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        parcel.writeStringArray(as);
        parcel.writeByteArray(abyte0);
        parcel.writeLong(l);
        a.transact(1011, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        as;
        parcel1.recycle();
        parcel.recycle();
        throw as;
    }

    public final void c(long l)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        parcel.writeLong(l);
        a.transact(1013, parcel, parcel1, 0);
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

    public final void d(long l)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        parcel.writeLong(l);
        a.transact(1014, parcel, parcel1, 0);
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

    public final String e(long l)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        String s;
        parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        parcel.writeLong(l);
        a.transact(1015, parcel, parcel1, 0);
        parcel1.readException();
        s = parcel1.readString();
        parcel1.recycle();
        parcel.recycle();
        return s;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }
}
