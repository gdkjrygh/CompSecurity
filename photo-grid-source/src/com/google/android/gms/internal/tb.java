// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.appdatasearch.k;

// Referenced classes of package com.google.android.gms.internal:
//            ta, tc, te

public abstract class tb extends Binder
    implements ta
{

    public static ta a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (iinterface != null && (iinterface instanceof ta))
        {
            return (ta)iinterface;
        } else
        {
            return new tc(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            a(te.a(parcel.readStrongBinder()), parcel.readString(), (UsageInfo[])parcel.createTypedArray(UsageInfo.CREATOR));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            a(te.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            b(te.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            td td = te.a(parcel.readStrongBinder());
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(td, flag);
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            Object obj;
            if (parcel.readInt() != 0)
            {
                obj = com.google.android.gms.appdatasearch.GetRecentContextCall.Request.CREATOR;
                obj = k.a(parcel);
            } else
            {
                obj = null;
            }
            a(((com.google.android.gms.appdatasearch.GetRecentContextCall.Request) (obj)), te.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            a(te.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;
        }
    }
}
