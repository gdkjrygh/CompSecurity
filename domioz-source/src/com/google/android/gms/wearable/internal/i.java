// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.h;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            h, j, zzal, zzao, 
//            zze

public abstract class i extends Binder
    implements com.google.android.gms.wearable.internal.h
{

    public i()
    {
        attachInterface(this, "com.google.android.gms.wearable.internal.IWearableListener");
    }

    public static com.google.android.gms.wearable.internal.h a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
        if (iinterface != null && (iinterface instanceof com.google.android.gms.wearable.internal.h))
        {
            return (com.google.android.gms.wearable.internal.h)iinterface;
        } else
        {
            return new j(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int k, Parcel parcel, Parcel parcel1, int l)
    {
        Object obj1 = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj = null;
        switch (k)
        {
        default:
            return super.onTransact(k, parcel, parcel1, l);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.wearable.internal.IWearableListener");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
            parcel1 = obj;
            if (parcel.readInt() != 0)
            {
                parcel1 = DataHolder.CREATOR;
                parcel1 = h.a(parcel);
            }
            a(parcel1);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
            parcel1 = obj1;
            if (parcel.readInt() != 0)
            {
                parcel1 = (zzal)zzal.CREATOR.createFromParcel(parcel);
            }
            a(parcel1);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
            parcel1 = obj2;
            if (parcel.readInt() != 0)
            {
                parcel1 = (zzao)zzao.CREATOR.createFromParcel(parcel);
            }
            a(parcel1);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
            parcel1 = obj3;
            if (parcel.readInt() != 0)
            {
                parcel1 = (zzao)zzao.CREATOR.createFromParcel(parcel);
            }
            b(parcel1);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
            parcel1 = obj4;
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel1 = (zze)zze.CREATOR.createFromParcel(parcel);
        }
        a(parcel1);
        return true;
    }
}
