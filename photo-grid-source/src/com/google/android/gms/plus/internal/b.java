// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.a;

// Referenced classes of package com.google.android.gms.plus.internal:
//            a, c

public abstract class b extends Binder
    implements com.google.android.gms.plus.internal.a
{

    public static com.google.android.gms.plus.internal.a a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
        if (iinterface != null && (iinterface instanceof com.google.android.gms.plus.internal.a))
        {
            return (com.google.android.gms.plus.internal.a)iinterface;
        } else
        {
            return new c(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj = null;
        a a1;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
            parcel = a(com.google.android.gms.b.b.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt());
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel = parcel.asBinder();
            } else
            {
                parcel = null;
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
            a1 = a(com.google.android.gms.b.b.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            parcel = obj;
            break;
        }
        if (a1 != null)
        {
            parcel = a1.asBinder();
        }
        parcel1.writeStrongBinder(parcel);
        return true;
    }
}
