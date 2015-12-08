// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.at;
import com.google.android.gms.common.internal.bd;

// Referenced classes of package com.google.android.gms.signin.internal:
//            i, k, g, CheckServerAuthResult, 
//            RecordConsentRequest

public abstract class j extends Binder
    implements i
{

    public static i a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (iinterface != null && (iinterface instanceof i))
        {
            return (i)iinterface;
        } else
        {
            return new k(ibinder);
        }
    }

    public boolean onTransact(int l, Parcel parcel, Parcel parcel1, int i1)
    {
        boolean flag = false;
        Object obj = null;
        Object obj1 = null;
        Object obj2 = null;
        Object obj3 = null;
        AuthAccountRequest authaccountrequest = null;
        switch (l)
        {
        default:
            return super.onTransact(l, parcel, parcel1, i1);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.signin.internal.ISignInService");
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
            if (parcel.readInt() != 0)
            {
                authaccountrequest = (AuthAccountRequest)AuthAccountRequest.CREATOR.createFromParcel(parcel);
            }
            a(authaccountrequest, g.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
            CheckServerAuthResult checkserverauthresult = obj;
            if (parcel.readInt() != 0)
            {
                checkserverauthresult = (CheckServerAuthResult)CheckServerAuthResult.CREATOR.createFromParcel(parcel);
            }
            a(checkserverauthresult);
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
            ResolveAccountRequest resolveaccountrequest = obj1;
            if (parcel.readInt() != 0)
            {
                resolveaccountrequest = (ResolveAccountRequest)ResolveAccountRequest.CREATOR.createFromParcel(parcel);
            }
            a(resolveaccountrequest, bd.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
            a(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
            l = parcel.readInt();
            Account account = obj2;
            if (parcel.readInt() != 0)
            {
                account = (Account)Account.CREATOR.createFromParcel(parcel);
            }
            a(l, account, g.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
            com.google.android.gms.common.internal.as as = at.a(parcel.readStrongBinder());
            l = parcel.readInt();
            if (parcel.readInt() != 0)
            {
                flag = true;
            }
            a(as, l, flag);
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
            RecordConsentRequest recordconsentrequest = obj3;
            if (parcel.readInt() != 0)
            {
                recordconsentrequest = (RecordConsentRequest)RecordConsentRequest.CREATOR.createFromParcel(parcel);
            }
            a(recordconsentrequest, g.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
            a(g.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }
}
