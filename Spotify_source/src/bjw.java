// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;

public final class bjw
    implements bju
{

    private IBinder a;

    public bjw(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(byb byb1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (byb1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        byb1 = byb1.asBinder();
_L1:
        parcel.writeStrongBinder(byb1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        byb1 = null;
          goto _L1
        byb1;
        parcel1.recycle();
        parcel.recycle();
        throw byb1;
    }

    public final void a(byb byb1, int i)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (byb1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        byb1 = byb1.asBinder();
_L1:
        parcel.writeStrongBinder(byb1);
        parcel.writeInt(i);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        byb1 = null;
          goto _L1
        byb1;
        parcel1.recycle();
        parcel.recycle();
        throw byb1;
    }

    public final void a(byb byb1, RewardItemParcel rewarditemparcel)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (byb1 == null) goto _L2; else goto _L1
_L1:
        byb1 = byb1.asBinder();
_L5:
        parcel.writeStrongBinder(byb1);
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
        byb1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        byb1;
        parcel1.recycle();
        parcel.recycle();
        throw byb1;
          goto _L5
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final void b(byb byb1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (byb1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        byb1 = byb1.asBinder();
_L1:
        parcel.writeStrongBinder(byb1);
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        byb1 = null;
          goto _L1
        byb1;
        parcel1.recycle();
        parcel.recycle();
        throw byb1;
    }

    public final void b(byb byb1, int i)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (byb1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        byb1 = byb1.asBinder();
_L1:
        parcel.writeStrongBinder(byb1);
        parcel.writeInt(i);
        a.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        byb1 = null;
          goto _L1
        byb1;
        parcel1.recycle();
        parcel.recycle();
        throw byb1;
    }

    public final void c(byb byb1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (byb1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        byb1 = byb1.asBinder();
_L1:
        parcel.writeStrongBinder(byb1);
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        byb1 = null;
          goto _L1
        byb1;
        parcel1.recycle();
        parcel.recycle();
        throw byb1;
    }

    public final void d(byb byb1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (byb1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        byb1 = byb1.asBinder();
_L1:
        parcel.writeStrongBinder(byb1);
        a.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        byb1 = null;
          goto _L1
        byb1;
        parcel1.recycle();
        parcel.recycle();
        throw byb1;
    }

    public final void e(byb byb1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (byb1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        byb1 = byb1.asBinder();
_L1:
        parcel.writeStrongBinder(byb1);
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        byb1 = null;
          goto _L1
        byb1;
        parcel1.recycle();
        parcel.recycle();
        throw byb1;
    }

    public final void f(byb byb1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (byb1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        byb1 = byb1.asBinder();
_L1:
        parcel.writeStrongBinder(byb1);
        a.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        byb1 = null;
          goto _L1
        byb1;
        parcel1.recycle();
        parcel.recycle();
        throw byb1;
    }

    public final void g(byb byb1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (byb1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        byb1 = byb1.asBinder();
_L1:
        parcel.writeStrongBinder(byb1);
        a.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        byb1 = null;
          goto _L1
        byb1;
        parcel1.recycle();
        parcel.recycle();
        throw byb1;
    }
}
