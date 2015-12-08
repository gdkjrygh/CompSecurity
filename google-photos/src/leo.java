// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.photos.autobackup.model.AutoBackupSettings;
import com.google.android.gms.photos.autobackup.model.LocalFolder;
import com.google.android.gms.photos.autobackup.model.SyncSettings;

public abstract class leo extends Binder
    implements len
{

    public static len a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
        if (iinterface != null && (iinterface instanceof len))
        {
            return (len)iinterface;
        } else
        {
            return new lep(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        String s = null;
        lek lek = null;
        LocalFolder localfolder = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
            a(lel.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
            b(lel.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
            a(lel.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
            c(lel.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
            b(lel.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
            lek = lel.a(parcel.readStrongBinder());
            s = parcel.readString();
            if (parcel.readInt() != 0)
            {
                localfolder = (LocalFolder)LocalFolder.CREATOR.createFromParcel(parcel);
            }
            a(lek, s, localfolder);
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
            c(lel.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
            d(lel.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
            lek = lel.a(parcel.readStrongBinder());
            Object obj = s;
            if (parcel.readInt() != 0)
            {
                obj = (AutoBackupSettings)AutoBackupSettings.CREATOR.createFromParcel(parcel);
            }
            a(lek, ((AutoBackupSettings) (obj)));
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
            d(lel.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
            e(lel.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
            lek lek1 = lel.a(parcel.readStrongBinder());
            String s1 = parcel.readString();
            Object obj1 = lek;
            if (parcel.readInt() != 0)
            {
                obj1 = (SyncSettings)SyncSettings.CREATOR.createFromParcel(parcel);
            }
            a(lek1, s1, ((SyncSettings) (obj1)));
            parcel1.writeNoException();
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
            e(lel.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
            a(lel.a(parcel.readStrongBinder()), parcel.readString(), parcel.createStringArray());
            parcel1.writeNoException();
            return true;
        }
    }
}
