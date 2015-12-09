// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.n;

// Referenced classes of package com.google.android.gms.internal:
//            jr

public abstract class js extends Binder
    implements jr
{

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.location.internal.ISettingsCallbacks");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.location.internal.ISettingsCallbacks");
            break;
        }
        if (parcel.readInt() != 0)
        {
            n n1 = LocationSettingsResult.CREATOR;
            parcel = n.a(parcel);
        } else
        {
            parcel = null;
        }
        a(parcel);
        parcel1.writeNoException();
        return true;
    }
}
