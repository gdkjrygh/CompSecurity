// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public abstract class lcq extends Binder
    implements lcp
{

    public lcq()
    {
        attachInterface(this, "com.google.android.gms.panorama.internal.IPanoramaCallbacks");
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.panorama.internal.IPanoramaCallbacks");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.panorama.internal.IPanoramaCallbacks");
            i = parcel.readInt();
            break;
        }
        Bundle bundle;
        if (parcel.readInt() != 0)
        {
            bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
        } else
        {
            bundle = null;
        }
        j = parcel.readInt();
        if (parcel.readInt() != 0)
        {
            parcel = (Intent)Intent.CREATOR.createFromParcel(parcel);
        } else
        {
            parcel = null;
        }
        a(i, bundle, j, parcel);
        parcel1.writeNoException();
        return true;
    }
}
