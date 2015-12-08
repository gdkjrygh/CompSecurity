// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.j;
import com.google.android.gms.b.k;

// Referenced classes of package com.google.android.gms.internal:
//            bs, bu, zzba, w, 
//            zzax, u, bw

public abstract class bt extends Binder
    implements bs
{

    public static bs a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (iinterface != null && (iinterface instanceof bs))
        {
            return (bs)iinterface;
        } else
        {
            return new bu(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int l)
    {
        Object obj4 = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, l);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            j j2 = k.a(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                obj = zzba.CREATOR;
                obj = w.a(parcel);
            } else
            {
                obj = null;
            }
            if (parcel.readInt() != 0)
            {
                obj4 = zzax.CREATOR;
                obj4 = u.a(parcel);
            } else
            {
                obj4 = null;
            }
            a(j2, ((zzba) (obj)), ((zzax) (obj4)), parcel.readString(), bw.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            obj4 = a();
            parcel1.writeNoException();
            parcel = ((Parcel) (obj));
            if (obj4 != null)
            {
                parcel = ((j) (obj4)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            j j3 = k.a(parcel.readStrongBinder());
            Object obj1 = obj4;
            if (parcel.readInt() != 0)
            {
                obj1 = zzax.CREATOR;
                obj1 = u.a(parcel);
            }
            a(j3, ((zzax) (obj1)), parcel.readString(), bw.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            b();
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            c();
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            j j4 = k.a(parcel.readStrongBinder());
            Object obj2;
            Object obj5;
            if (parcel.readInt() != 0)
            {
                obj2 = zzba.CREATOR;
                obj2 = w.a(parcel);
            } else
            {
                obj2 = null;
            }
            if (parcel.readInt() != 0)
            {
                obj5 = zzax.CREATOR;
                obj5 = u.a(parcel);
            } else
            {
                obj5 = null;
            }
            a(j4, ((zzba) (obj2)), ((zzax) (obj5)), parcel.readString(), parcel.readString(), bw.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            j j1 = k.a(parcel.readStrongBinder());
            Object obj3;
            if (parcel.readInt() != 0)
            {
                obj3 = zzax.CREATOR;
                obj3 = u.a(parcel);
            } else
            {
                obj3 = null;
            }
            a(j1, ((zzax) (obj3)), parcel.readString(), parcel.readString(), bw.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            d();
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            e();
            parcel1.writeNoException();
            return true;
        }
    }
}
