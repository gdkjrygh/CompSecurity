// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.ads.internal.reward.mediation.client:
//            zza, RewardItemParcel

final class a
    implements zza
{

    private IBinder a;

    a(IBinder ibinder)
    {
        a = ibinder;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final void zza(com.google.android.gms.b.a a1, RewardItemParcel rewarditemparcel)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (a1 == null) goto _L2; else goto _L1
_L1:
        a1 = a1.asBinder();
_L5:
        parcel.writeStrongBinder(a1);
        if (rewarditemparcel == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        rewarditemparcel.writeToParcel(parcel, 0);
_L6:
        a.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        a1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        a1;
        parcel1.recycle();
        parcel.recycle();
        throw a1;
          goto _L5
    }

    public final void zzb(com.google.android.gms.b.a a1, int i)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        a1 = a1.asBinder();
_L1:
        parcel.writeStrongBinder(a1);
        parcel.writeInt(i);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        a1 = null;
          goto _L1
        a1;
        parcel1.recycle();
        parcel.recycle();
        throw a1;
    }

    public final void zzc(com.google.android.gms.b.a a1, int i)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        a1 = a1.asBinder();
_L1:
        parcel.writeStrongBinder(a1);
        parcel.writeInt(i);
        a.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        a1 = null;
          goto _L1
        a1;
        parcel1.recycle();
        parcel.recycle();
        throw a1;
    }

    public final void zzg(com.google.android.gms.b.a a1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        a1 = a1.asBinder();
_L1:
        parcel.writeStrongBinder(a1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        a1 = null;
          goto _L1
        a1;
        parcel1.recycle();
        parcel.recycle();
        throw a1;
    }

    public final void zzh(com.google.android.gms.b.a a1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        a1 = a1.asBinder();
_L1:
        parcel.writeStrongBinder(a1);
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        a1 = null;
          goto _L1
        a1;
        parcel1.recycle();
        parcel.recycle();
        throw a1;
    }

    public final void zzi(com.google.android.gms.b.a a1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        a1 = a1.asBinder();
_L1:
        parcel.writeStrongBinder(a1);
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        a1 = null;
          goto _L1
        a1;
        parcel1.recycle();
        parcel.recycle();
        throw a1;
    }

    public final void zzj(com.google.android.gms.b.a a1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        a1 = a1.asBinder();
_L1:
        parcel.writeStrongBinder(a1);
        a.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        a1 = null;
          goto _L1
        a1;
        parcel1.recycle();
        parcel.recycle();
        throw a1;
    }

    public final void zzk(com.google.android.gms.b.a a1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        a1 = a1.asBinder();
_L1:
        parcel.writeStrongBinder(a1);
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        a1 = null;
          goto _L1
        a1;
        parcel1.recycle();
        parcel.recycle();
        throw a1;
    }

    public final void zzl(com.google.android.gms.b.a a1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        a1 = a1.asBinder();
_L1:
        parcel.writeStrongBinder(a1);
        a.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        a1 = null;
          goto _L1
        a1;
        parcel1.recycle();
        parcel.recycle();
        throw a1;
    }

    public final void zzm(com.google.android.gms.b.a a1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        a1 = a1.asBinder();
_L1:
        parcel.writeStrongBinder(a1);
        a.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        a1 = null;
          goto _L1
        a1;
        parcel1.recycle();
        parcel.recycle();
        throw a1;
    }
}
