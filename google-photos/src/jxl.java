// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public abstract class jxl extends Binder
    implements jxk
{

    public jxl()
    {
        attachInterface(this, "com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
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
            parcel1.writeString("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel = (Status)Status.CREATOR.createFromParcel(parcel);
        } else
        {
            parcel = null;
        }
        a(parcel);
        return true;
    }
}
