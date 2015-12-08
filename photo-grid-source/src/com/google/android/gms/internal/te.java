// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.appdatasearch.l;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            td, tf

public abstract class te extends Binder
    implements td
{

    public te()
    {
        attachInterface(this, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
    }

    public static td a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
        if (iinterface != null && (iinterface instanceof td))
        {
            return (td)iinterface;
        } else
        {
            return new tf(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
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
            if (parcel.readInt() != 0)
            {
                parcel = (Status)Status.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
            if (parcel.readInt() != 0)
            {
                parcel1 = (Status)Status.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel1 = null;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(parcel1, parcel);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
            boolean flag;
            if (parcel.readInt() != 0)
            {
                parcel1 = (Status)Status.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel1 = null;
            }
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
            parcel1 = obj;
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel1 = com.google.android.gms.appdatasearch.GetRecentContextCall.Response.CREATOR;
            parcel1 = l.a(parcel);
        }
        a(parcel1);
        return true;
    }
}
