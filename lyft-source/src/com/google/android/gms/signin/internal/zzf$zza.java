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

// Referenced classes of package com.google.android.gms.signin.internal:
//            zzf, CheckServerAuthResult

public abstract class Accessor.zza extends Binder
    implements zzf
{

    public static zzf a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        class zza
            implements zzf
        {

            private IBinder a;

            public void a(int i)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                parcel.writeInt(i);
                a.transact(7, parcel, parcel1, 0);
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

            public void a(int i, Account account, zze zze1)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                parcel.writeInt(i);
                if (account == null) goto _L2; else goto _L1
_L1:
                parcel.writeInt(1);
                account.writeToParcel(parcel, 0);
_L3:
                if (zze1 == null)
                {
                    break MISSING_BLOCK_LABEL_112;
                }
                account = zze1.asBinder();
_L4:
                parcel.writeStrongBinder(account);
                a.transact(8, parcel, parcel1, 0);
                parcel1.readException();
                parcel1.recycle();
                parcel.recycle();
                return;
_L2:
                parcel.writeInt(0);
                  goto _L3
                account;
                parcel1.recycle();
                parcel.recycle();
                throw account;
                account = null;
                  goto _L4
            }

            public void a(AuthAccountRequest authaccountrequest, zze zze1)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                if (authaccountrequest == null) goto _L2; else goto _L1
_L1:
                parcel.writeInt(1);
                authaccountrequest.writeToParcel(parcel, 0);
_L3:
                if (zze1 == null)
                {
                    break MISSING_BLOCK_LABEL_96;
                }
                authaccountrequest = zze1.asBinder();
_L4:
                parcel.writeStrongBinder(authaccountrequest);
                a.transact(2, parcel, parcel1, 0);
                parcel1.readException();
                parcel1.recycle();
                parcel.recycle();
                return;
_L2:
                parcel.writeInt(0);
                  goto _L3
                authaccountrequest;
                parcel1.recycle();
                parcel.recycle();
                throw authaccountrequest;
                authaccountrequest = null;
                  goto _L4
            }

            public void a(IAccountAccessor iaccountaccessor, int i, boolean flag)
            {
                Parcel parcel;
                Parcel parcel1;
                boolean flag1;
                flag1 = false;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                if (iaccountaccessor == null)
                {
                    break MISSING_BLOCK_LABEL_91;
                }
                iaccountaccessor = iaccountaccessor.asBinder();
_L1:
                parcel.writeStrongBinder(iaccountaccessor);
                parcel.writeInt(i);
                i = ((flag1) ? 1 : 0);
                if (flag)
                {
                    i = 1;
                }
                parcel.writeInt(i);
                a.transact(9, parcel, parcel1, 0);
                parcel1.readException();
                parcel1.recycle();
                parcel.recycle();
                return;
                iaccountaccessor = null;
                  goto _L1
                iaccountaccessor;
                parcel1.recycle();
                parcel.recycle();
                throw iaccountaccessor;
            }

            public void a(ResolveAccountRequest resolveaccountrequest, zzq zzq1)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                if (resolveaccountrequest == null) goto _L2; else goto _L1
_L1:
                parcel.writeInt(1);
                resolveaccountrequest.writeToParcel(parcel, 0);
_L3:
                if (zzq1 == null)
                {
                    break MISSING_BLOCK_LABEL_96;
                }
                resolveaccountrequest = zzq1.asBinder();
_L4:
                parcel.writeStrongBinder(resolveaccountrequest);
                a.transact(5, parcel, parcel1, 0);
                parcel1.readException();
                parcel1.recycle();
                parcel.recycle();
                return;
_L2:
                parcel.writeInt(0);
                  goto _L3
                resolveaccountrequest;
                parcel1.recycle();
                parcel.recycle();
                throw resolveaccountrequest;
                resolveaccountrequest = null;
                  goto _L4
            }

            public void a(CheckServerAuthResult checkserverauthresult)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                if (checkserverauthresult == null)
                {
                    break MISSING_BLOCK_LABEL_56;
                }
                parcel.writeInt(1);
                checkserverauthresult.writeToParcel(parcel, 0);
_L1:
                a.transact(3, parcel, parcel1, 0);
                parcel1.readException();
                parcel1.recycle();
                parcel.recycle();
                return;
                parcel.writeInt(0);
                  goto _L1
                checkserverauthresult;
                parcel1.recycle();
                parcel.recycle();
                throw checkserverauthresult;
            }

            public void a(boolean flag)
            {
                Parcel parcel;
                Parcel parcel1;
                int i;
                i = 0;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                if (flag)
                {
                    i = 1;
                }
                parcel.writeInt(i);
                a.transact(4, parcel, parcel1, 0);
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

            public IBinder asBinder()
            {
                return a;
            }

            zza(IBinder ibinder)
            {
                a = ibinder;
            }
        }

        if (iinterface != null && (iinterface instanceof zzf))
        {
            return (zzf)iinterface;
        } else
        {
            return new zza(ibinder);
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
                obj = (AuthAccountRequest)AuthAccountRequest.CREATOR.createFromParcel(parcel);
            }
            a(((AuthAccountRequest) (obj)), a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
            obj = obj1;
            if (parcel.readInt() != 0)
            {
                obj = (CheckServerAuthResult)CheckServerAuthResult.CREATOR.createFromParcel(parcel);
            }
            a(((CheckServerAuthResult) (obj)));
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
                obj = (ResolveAccountRequest)ResolveAccountRequest.CREATOR.createFromParcel(parcel);
            }
            a(((ResolveAccountRequest) (obj)), com.google.android.gms.common.internal.a(parcel.readStrongBinder()));
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
            a(i, ((Account) (obj)), a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
            obj = com.google.android.gms.common.internal.Accessor.zza.a(parcel.readStrongBinder());
            i = parcel.readInt();
            break;
        }
        if (parcel.readInt() != 0)
        {
            flag = true;
        }
        a(((IAccountAccessor) (obj)), i, flag);
        parcel1.writeNoException();
        return true;
    }
}
