// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.internal.common.TogglingData;

public abstract class kpo extends Binder
    implements kpn
{

    public kpo()
    {
        attachInterface(this, "com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
    }

    public static kpn a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
        if (iinterface != null && (iinterface instanceof kpn))
        {
            return (kpn)iinterface;
        } else
        {
            return new kpp(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj = null;
        GoogleHelp googlehelp = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
            if (parcel.readInt() != 0)
            {
                googlehelp = (GoogleHelp)GoogleHelp.CREATOR.createFromParcel(parcel);
            }
            a(googlehelp);
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
            TogglingData togglingdata = obj;
            if (parcel.readInt() != 0)
            {
                togglingdata = (TogglingData)TogglingData.CREATOR.createFromParcel(parcel);
            }
            a(togglingdata);
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
            a();
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
            b();
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
            c();
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
            d();
            parcel1.writeNoException();
            return true;
        }
    }
}
