// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.d;

// Referenced classes of package com.google.android.gms.internal:
//            j, l, ab, b, 
//            ba, bc

public abstract class k extends Binder
    implements j
{

    public static j a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (iinterface != null && (iinterface instanceof j))
        {
            return (j)iinterface;
        } else
        {
            return new l(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int i1)
    {
        com.google.android.gms.a.c c;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, i1);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            c = d.a(parcel.readStrongBinder());
            break;
        }
        Object obj;
        ab ab1;
        String s;
        if (parcel.readInt() != 0)
        {
            b b1 = ab.a;
            ab1 = b.a(parcel);
        } else
        {
            ab1 = null;
        }
        s = parcel.readString();
        obj = parcel.readStrongBinder();
        if (obj == null)
        {
            obj = null;
        } else
        {
            android.os.IInterface iinterface = ((IBinder) (obj)).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
            if (iinterface != null && (iinterface instanceof ba))
            {
                obj = (ba)iinterface;
            } else
            {
                obj = new bc(((IBinder) (obj)));
            }
        }
        parcel = a(c, ab1, s, ((ba) (obj)), parcel.readInt());
        parcel1.writeNoException();
        parcel1.writeStrongBinder(parcel);
        return true;
    }
}
