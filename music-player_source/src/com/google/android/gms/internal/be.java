// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.c;
import com.google.android.gms.a.d;

// Referenced classes of package com.google.android.gms.internal:
//            bd, bf, ab, b, 
//            z, a, bh

public abstract class be extends Binder
    implements bd
{

    public be()
    {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public static bd a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (iinterface != null && (iinterface instanceof bd))
        {
            return (bd)iinterface;
        } else
        {
            return new bf(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj1 = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            c c1 = d.a(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                obj = ab.a;
                obj = b.a(parcel);
            } else
            {
                obj = null;
            }
            if (parcel.readInt() != 0)
            {
                obj1 = z.a;
                obj1 = com.google.android.gms.internal.a.a(parcel);
            } else
            {
                obj1 = null;
            }
            a(c1, ((ab) (obj)), ((z) (obj1)), parcel.readString(), bh.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            obj1 = a();
            parcel1.writeNoException();
            parcel = ((Parcel) (obj));
            if (obj1 != null)
            {
                parcel = ((c) (obj1)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            c c2 = d.a(parcel.readStrongBinder());
            obj = obj1;
            if (parcel.readInt() != 0)
            {
                obj = z.a;
                obj = com.google.android.gms.internal.a.a(parcel);
            }
            a(c2, ((z) (obj)), parcel.readString(), bh.a(parcel.readStrongBinder()));
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
            c c3 = d.a(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                obj = ab.a;
                obj = b.a(parcel);
            } else
            {
                obj = null;
            }
            if (parcel.readInt() != 0)
            {
                obj1 = z.a;
                obj1 = com.google.android.gms.internal.a.a(parcel);
            } else
            {
                obj1 = null;
            }
            a(c3, ((ab) (obj)), ((z) (obj1)), parcel.readString(), parcel.readString(), bh.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            obj1 = d.a(parcel.readStrongBinder());
            break;
        }
        if (parcel.readInt() != 0)
        {
            obj = z.a;
            obj = com.google.android.gms.internal.a.a(parcel);
        } else
        {
            obj = null;
        }
        a(((c) (obj1)), ((z) (obj)), parcel.readString(), parcel.readString(), bh.a(parcel.readStrongBinder()));
        parcel1.writeNoException();
        return true;
    }
}
