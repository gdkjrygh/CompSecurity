// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.zzc;
import com.google.android.gms.common.internal.zzq;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzy;

// Referenced classes of package com.google.android.gms.internal:
//            zzva, zzuz, zzuw

static class zzle
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

    (IBinder ibinder)
    {
        zzle = ibinder;
    }
}
