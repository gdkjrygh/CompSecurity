// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.internal.al;
import com.google.android.gms.common.internal.zzc;
import com.google.android.gms.common.internal.zzy;

// Referenced classes of package com.google.android.gms.internal:
//            lu, lw, ls, zzuw

public abstract class lv extends Binder
    implements lu
{

    public static lu a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (iinterface != null && (iinterface instanceof lu))
        {
            return (lu)iinterface;
        } else
        {
            return new lw(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        boolean flag = false;
        Object obj1 = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.signin.internal.ISignInService");
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
            if (parcel.readInt() != 0)
            {
                obj = (zzc)zzc.CREATOR.createFromParcel(parcel);
            }
            a(((zzc) (obj)), ls.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
            obj = obj1;
            if (parcel.readInt() != 0)
            {
                obj = (zzuw)zzuw.CREATOR.createFromParcel(parcel);
            }
            a(((zzuw) (obj)));
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(flag);
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
            obj = obj2;
            if (parcel.readInt() != 0)
            {
                obj = (zzy)zzy.CREATOR.createFromParcel(parcel);
            }
            a(((zzy) (obj)), al.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
            a(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
            i = parcel.readInt();
            obj = obj3;
            if (parcel.readInt() != 0)
            {
                obj = (Account)Account.CREATOR.createFromParcel(parcel);
            }
            a(i, ((Account) (obj)), ls.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
            obj = ac.a(parcel.readStrongBinder());
            i = parcel.readInt();
            break;
        }
        if (parcel.readInt() != 0)
        {
            flag = true;
        }
        a(((com.google.android.gms.common.internal.ab) (obj)), i, flag);
        parcel1.writeNoException();
        return true;
    }
}
