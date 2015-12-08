// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.DataHolder;

public abstract class lmw extends Binder
    implements lmv
{

    public lmw()
    {
        attachInterface(this, "com.google.android.gms.people.internal.IPeopleCallbacks");
    }

    public static lmv a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
        if (iinterface != null && (iinterface instanceof lmv))
        {
            return (lmv)iinterface;
        } else
        {
            return new lmx(ibinder);
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
            parcel1.writeString("com.google.android.gms.people.internal.IPeopleCallbacks");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
            i = parcel.readInt();
            if (parcel.readInt() != 0)
            {
                parcel1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel1 = null;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(i, parcel1, parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
            i = parcel.readInt();
            if (parcel.readInt() != 0)
            {
                parcel1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel1 = null;
            }
            if (parcel.readInt() != 0)
            {
                obj = DataHolder.CREATOR;
                obj = kat.a(parcel);
            }
            a(i, parcel1, ((DataHolder) (obj)));
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
            i = parcel.readInt();
            if (parcel.readInt() != 0)
            {
                parcel1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
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
            a(i, parcel1, parcel);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
            i = parcel.readInt();
            parcel1 = obj1;
            if (parcel.readInt() != 0)
            {
                parcel1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            a(i, parcel1, (DataHolder[])parcel.createTypedArray(DataHolder.CREATOR));
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
            i = parcel.readInt();
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
        } else
        {
            parcel1 = null;
        }
        if (parcel.readInt() != 0)
        {
            obj = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
        } else
        {
            obj = null;
        }
        if (parcel.readInt() != 0)
        {
            parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
        } else
        {
            parcel = null;
        }
        a(i, parcel1, ((ParcelFileDescriptor) (obj)), parcel);
        return true;
    }
}
