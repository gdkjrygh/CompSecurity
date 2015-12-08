// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.zzc;
import com.google.android.gms.common.internal.zzq;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzy;

// Referenced classes of package com.google.android.gms.internal:
//            zzuz, zzuw

public interface zzva
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzva
    {

        public static zzva zzcF(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
            if (iinterface != null && (iinterface instanceof zzva))
            {
                return (zzva)iinterface;
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
                    obj = (zzc)zzc.CREATOR.createFromParcel(parcel);
                }
                zza(((zzc) (obj)), zzuz.zza.zzcE(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                obj = obj1;
                if (parcel.readInt() != 0)
                {
                    obj = (zzuw)zzuw.CREATOR.createFromParcel(parcel);
                }
                zza(((zzuw) (obj)));
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
                zzaf(flag);
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                obj = obj2;
                if (parcel.readInt() != 0)
                {
                    obj = (zzy)zzy.CREATOR.createFromParcel(parcel);
                }
                zza(((zzy) (obj)), com.google.android.gms.common.internal.zzt.zza.zzV(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                zzhb(parcel.readInt());
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
                zza(i, ((Account) (obj)), zzuz.zza.zzcE(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                obj = com.google.android.gms.common.internal.zzq.zza.zzR(parcel.readStrongBinder());
                i = parcel.readInt();
                break;
            }
            if (parcel.readInt() != 0)
            {
                flag = true;
            }
            zza(((zzq) (obj)), i, flag);
            parcel1.writeNoException();
            return true;
        }
    }

    static class zza.zza
        implements zzva
    {

        private IBinder zzle;

        public IBinder asBinder()
        {
            return zzle;
        }

        public void zza(int i, Account account, zzuz zzuz1)
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
            if (zzuz1 == null)
            {
                break MISSING_BLOCK_LABEL_112;
            }
            account = zzuz1.asBinder();
_L4:
            parcel.writeStrongBinder(account);
            zzle.transact(8, parcel, parcel1, 0);
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

        public void zza(zzc zzc1, zzuz zzuz1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
            if (zzc1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            zzc1.writeToParcel(parcel, 0);
_L3:
            if (zzuz1 == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            zzc1 = zzuz1.asBinder();
_L4:
            parcel.writeStrongBinder(zzc1);
            zzle.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            zzc1;
            parcel1.recycle();
            parcel.recycle();
            throw zzc1;
            zzc1 = null;
              goto _L4
        }

        public void zza(zzq zzq1, int i, boolean flag)
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
            if (zzq1 == null)
            {
                break MISSING_BLOCK_LABEL_91;
            }
            zzq1 = zzq1.asBinder();
_L1:
            parcel.writeStrongBinder(zzq1);
            parcel.writeInt(i);
            i = ((flag1) ? 1 : 0);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            zzle.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzq1 = null;
              goto _L1
            zzq1;
            parcel1.recycle();
            parcel.recycle();
            throw zzq1;
        }

        public void zza(zzy zzy1, zzt zzt1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
            if (zzy1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            zzy1.writeToParcel(parcel, 0);
_L3:
            if (zzt1 == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            zzy1 = zzt1.asBinder();
_L4:
            parcel.writeStrongBinder(zzy1);
            zzle.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            zzy1;
            parcel1.recycle();
            parcel.recycle();
            throw zzy1;
            zzy1 = null;
              goto _L4
        }

        public void zza(zzuw zzuw1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
            if (zzuw1 == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            zzuw1.writeToParcel(parcel, 0);
_L1:
            zzle.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            zzuw1;
            parcel1.recycle();
            parcel.recycle();
            throw zzuw1;
        }

        public void zzaf(boolean flag)
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
            zzle.transact(4, parcel, parcel1, 0);
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

        public void zzhb(int i)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
            parcel.writeInt(i);
            zzle.transact(7, parcel, parcel1, 0);
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

        zza.zza(IBinder ibinder)
        {
            zzle = ibinder;
        }
    }


    public abstract void zza(int i, Account account, zzuz zzuz);

    public abstract void zza(zzc zzc, zzuz zzuz);

    public abstract void zza(zzq zzq, int i, boolean flag);

    public abstract void zza(zzy zzy, zzt zzt);

    public abstract void zza(zzuw zzuw);

    public abstract void zzaf(boolean flag);

    public abstract void zzhb(int i);
}
