// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.photos.autobackup.model.AutoBackupSettings;
import com.google.android.gms.photos.autobackup.model.LocalFolder;
import com.google.android.gms.photos.autobackup.model.SyncSettings;

final class lep
    implements len
{

    private IBinder a;

    lep(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(lek lek1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
        if (lek1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        lek1 = lek1.asBinder();
_L1:
        parcel.writeStrongBinder(lek1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        lek1 = null;
          goto _L1
        lek1;
        parcel1.recycle();
        parcel.recycle();
        throw lek1;
    }

    public final void a(lek lek1, AutoBackupSettings autobackupsettings)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
        if (lek1 == null) goto _L2; else goto _L1
_L1:
        lek1 = lek1.asBinder();
_L5:
        parcel.writeStrongBinder(lek1);
        if (autobackupsettings == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        autobackupsettings.writeToParcel(parcel, 0);
_L6:
        a.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        lek1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        lek1;
        parcel1.recycle();
        parcel.recycle();
        throw lek1;
          goto _L5
    }

    public final void a(lek lek1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
        if (lek1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        lek1 = lek1.asBinder();
_L1:
        parcel.writeStrongBinder(lek1);
        parcel.writeString(s);
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        lek1 = null;
          goto _L1
        lek1;
        parcel1.recycle();
        parcel.recycle();
        throw lek1;
    }

    public final void a(lek lek1, String s, LocalFolder localfolder)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
        if (lek1 == null) goto _L2; else goto _L1
_L1:
        lek1 = lek1.asBinder();
_L5:
        parcel.writeStrongBinder(lek1);
        parcel.writeString(s);
        if (localfolder == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        localfolder.writeToParcel(parcel, 0);
_L6:
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        lek1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        lek1;
        parcel1.recycle();
        parcel.recycle();
        throw lek1;
          goto _L5
    }

    public final void a(lek lek1, String s, SyncSettings syncsettings)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
        if (lek1 == null) goto _L2; else goto _L1
_L1:
        lek1 = lek1.asBinder();
_L5:
        parcel.writeStrongBinder(lek1);
        parcel.writeString(s);
        if (syncsettings == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        syncsettings.writeToParcel(parcel, 0);
_L6:
        a.transact(12, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        lek1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        lek1;
        parcel1.recycle();
        parcel.recycle();
        throw lek1;
          goto _L5
    }

    public final void a(lek lek1, String s, String as[])
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
        if (lek1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        lek1 = lek1.asBinder();
_L1:
        parcel.writeStrongBinder(lek1);
        parcel.writeString(s);
        parcel.writeStringArray(as);
        a.transact(14, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        lek1 = null;
          goto _L1
        lek1;
        parcel1.recycle();
        parcel.recycle();
        throw lek1;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final void b(lek lek1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
        if (lek1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        lek1 = lek1.asBinder();
_L1:
        parcel.writeStrongBinder(lek1);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        lek1 = null;
          goto _L1
        lek1;
        parcel1.recycle();
        parcel.recycle();
        throw lek1;
    }

    public final void b(lek lek1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
        if (lek1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        lek1 = lek1.asBinder();
_L1:
        parcel.writeStrongBinder(lek1);
        parcel.writeString(s);
        a.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        lek1 = null;
          goto _L1
        lek1;
        parcel1.recycle();
        parcel.recycle();
        throw lek1;
    }

    public final void c(lek lek1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
        if (lek1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        lek1 = lek1.asBinder();
_L1:
        parcel.writeStrongBinder(lek1);
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        lek1 = null;
          goto _L1
        lek1;
        parcel1.recycle();
        parcel.recycle();
        throw lek1;
    }

    public final void c(lek lek1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
        if (lek1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        lek1 = lek1.asBinder();
_L1:
        parcel.writeStrongBinder(lek1);
        parcel.writeString(s);
        a.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        lek1 = null;
          goto _L1
        lek1;
        parcel1.recycle();
        parcel.recycle();
        throw lek1;
    }

    public final void d(lek lek1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
        if (lek1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        lek1 = lek1.asBinder();
_L1:
        parcel.writeStrongBinder(lek1);
        a.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        lek1 = null;
          goto _L1
        lek1;
        parcel1.recycle();
        parcel.recycle();
        throw lek1;
    }

    public final void d(lek lek1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
        if (lek1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        lek1 = lek1.asBinder();
_L1:
        parcel.writeStrongBinder(lek1);
        parcel.writeString(s);
        a.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        lek1 = null;
          goto _L1
        lek1;
        parcel1.recycle();
        parcel.recycle();
        throw lek1;
    }

    public final void e(lek lek1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
        if (lek1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        lek1 = lek1.asBinder();
_L1:
        parcel.writeStrongBinder(lek1);
        a.transact(13, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        lek1 = null;
          goto _L1
        lek1;
        parcel1.recycle();
        parcel.recycle();
        throw lek1;
    }

    public final void e(lek lek1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
        if (lek1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        lek1 = lek1.asBinder();
_L1:
        parcel.writeStrongBinder(lek1);
        parcel.writeString(s);
        a.transact(11, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        lek1 = null;
          goto _L1
        lek1;
        parcel1.recycle();
        parcel.recycle();
        throw lek1;
    }
}
