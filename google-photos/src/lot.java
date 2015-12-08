// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.CheckServerAuthResult;
import com.google.android.gms.signin.internal.RecordConsentRequest;

public abstract class lot extends Binder
    implements los
{

    public static los a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (iinterface != null && (iinterface instanceof los))
        {
            return (los)iinterface;
        } else
        {
            return new lou(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        boolean flag2 = false;
        boolean flag = false;
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
            AuthAccountRequest authaccountrequest;
            if (parcel.readInt() != 0)
            {
                authaccountrequest = (AuthAccountRequest)AuthAccountRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                authaccountrequest = null;
            }
            a(authaccountrequest, loq.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
            if (parcel.readInt() != 0)
            {
                parcel = (CheckServerAuthResult)CheckServerAuthResult.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
            if (parcel.readInt() != 0)
            {
                flag = true;
            }
            a(flag);
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
            ResolveAccountRequest resolveaccountrequest;
            if (parcel.readInt() != 0)
            {
                resolveaccountrequest = (ResolveAccountRequest)ResolveAccountRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                resolveaccountrequest = null;
            }
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj;
            } else
            {
                android.os.IInterface iinterface = parcel.queryLocalInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
                if (iinterface != null && (iinterface instanceof kcp))
                {
                    parcel = (kcp)iinterface;
                } else
                {
                    parcel = new kcr(parcel);
                }
            }
            a(resolveaccountrequest, parcel);
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
            Account account;
            if (parcel.readInt() != 0)
            {
                account = (Account)Account.CREATOR.createFromParcel(parcel);
            } else
            {
                account = null;
            }
            a(i, account, loq.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
            kay kay = kaz.a(parcel.readStrongBinder());
            i = parcel.readInt();
            boolean flag1 = flag2;
            if (parcel.readInt() != 0)
            {
                flag1 = true;
            }
            a(kay, i, flag1);
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
            RecordConsentRequest recordconsentrequest;
            if (parcel.readInt() != 0)
            {
                recordconsentrequest = (RecordConsentRequest)RecordConsentRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                recordconsentrequest = null;
            }
            a(recordconsentrequest, loq.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
            a(loq.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }
}
