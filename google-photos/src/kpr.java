// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.googlehelp.GoogleHelp;

public abstract class kpr extends Binder
    implements kpq
{

    public static kpq a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
        if (iinterface != null && (iinterface instanceof kpq))
        {
            return (kpq)iinterface;
        } else
        {
            return new kps(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            GoogleHelp googlehelp;
            if (parcel.readInt() != 0)
            {
                googlehelp = (GoogleHelp)GoogleHelp.CREATOR.createFromParcel(parcel);
            } else
            {
                googlehelp = null;
            }
            a(googlehelp, kpo.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            GoogleHelp googlehelp1;
            Bitmap bitmap1;
            if (parcel.readInt() != 0)
            {
                googlehelp1 = (GoogleHelp)GoogleHelp.CREATOR.createFromParcel(parcel);
            } else
            {
                googlehelp1 = null;
            }
            if (parcel.readInt() != 0)
            {
                bitmap1 = (Bitmap)Bitmap.CREATOR.createFromParcel(parcel);
            } else
            {
                bitmap1 = null;
            }
            a(googlehelp1, bitmap1, kpo.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            Bitmap bitmap;
            if (parcel.readInt() != 0)
            {
                bitmap = (Bitmap)Bitmap.CREATOR.createFromParcel(parcel);
            } else
            {
                bitmap = null;
            }
            a(bitmap, kpo.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            a(kpo.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            b(kpo.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            c(kpo.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }
}
