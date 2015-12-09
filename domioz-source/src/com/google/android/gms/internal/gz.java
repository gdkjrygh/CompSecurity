// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.w;

// Referenced classes of package com.google.android.gms.internal:
//            gy, ha, gp

public abstract class gz extends Binder
    implements gy
{

    public gz()
    {
        attachInterface(this, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
    }

    public static gy a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
        if (iinterface != null && (iinterface instanceof gy))
        {
            return (gy)iinterface;
        } else
        {
            return new ha(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        ParcelFileDescriptor parcelfiledescriptor = null;
        Object obj1 = null;
        Object obj2 = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
            parcel1 = obj;
            if (parcel.readInt() != 0)
            {
                parcel1 = Status.CREATOR;
                parcel1 = w.a(parcel);
            }
            a(parcel1);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
            if (parcel.readInt() != 0)
            {
                parcel1 = Status.CREATOR;
                parcel1 = w.a(parcel);
            } else
            {
                parcel1 = null;
            }
            if (parcel.readInt() != 0)
            {
                parcelfiledescriptor = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
            }
            a(parcel1, parcelfiledescriptor);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
            parcel1 = obj1;
            if (parcel.readInt() != 0)
            {
                parcel1 = Status.CREATOR;
                parcel1 = w.a(parcel);
            }
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(parcel1, flag);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
            parcel1 = obj2;
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel1 = zziv.zzb.CREATOR;
            parcel1 = gp.a(parcel);
        }
        a(parcel1);
        return true;
    }
}
