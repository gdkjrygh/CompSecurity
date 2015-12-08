// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.photos.autobackup.model.AutoBackupSettings;
import com.google.android.gms.photos.autobackup.model.AutoBackupStatus;
import com.google.android.gms.photos.autobackup.model.LocalFolder;
import com.google.android.gms.photos.autobackup.model.MediaState;
import com.google.android.gms.photos.autobackup.model.MigrationStatus;
import com.google.android.gms.photos.autobackup.model.SyncSettings;

public abstract class lel extends Binder
    implements lek
{

    public lel()
    {
        attachInterface(this, "com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
    }

    public static lek a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
        if (iinterface != null && (iinterface instanceof lek))
        {
            return (lek)iinterface;
        } else
        {
            return new lem(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
            i = parcel.readInt();
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(i, flag, parcel.readString());
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
            i = parcel.readInt();
            if (parcel.readInt() != 0)
            {
                parcel = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(i, parcel);
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
            a(parcel.readInt(), parcel.createTypedArrayList(AutoBackupSettings.CREATOR));
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
            b(parcel.readInt(), parcel.createTypedArrayList(LocalFolder.CREATOR));
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
            Status status;
            if (parcel.readInt() != 0)
            {
                status = (Status)Status.CREATOR.createFromParcel(parcel);
            } else
            {
                status = null;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (LocalFolder)LocalFolder.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(status, parcel);
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
            i = parcel.readInt();
            if (parcel.readInt() != 0)
            {
                parcel = (AutoBackupStatus)AutoBackupStatus.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(i, parcel);
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
            a(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
            c(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
            b(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
            i = parcel.readInt();
            if (parcel.readInt() != 0)
            {
                parcel = (SyncSettings)SyncSettings.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(i, parcel);
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
            d(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
            i = parcel.readInt();
            if (parcel.readInt() != 0)
            {
                parcel = (MigrationStatus)MigrationStatus.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(i, parcel);
            parcel1.writeNoException();
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
            i = parcel.readInt();
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel = (MediaState)MediaState.CREATOR.createFromParcel(parcel);
        } else
        {
            parcel = null;
        }
        a(i, parcel);
        parcel1.writeNoException();
        return true;
    }
}
