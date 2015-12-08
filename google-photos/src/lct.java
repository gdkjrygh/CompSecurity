// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public abstract class lct extends Binder
    implements lcs
{

    public static lcs a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.panorama.internal.IPanoramaService");
        if (iinterface != null && (iinterface instanceof lcs))
        {
            return (lcs)iinterface;
        } else
        {
            return new lcu(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.panorama.internal.IPanoramaService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.panorama.internal.IPanoramaService");
            parcel1 = parcel.readStrongBinder();
            break;
        }
        Object obj;
        Bundle bundle;
        boolean flag;
        if (parcel1 == null)
        {
            parcel1 = null;
        } else
        {
            obj = parcel1.queryLocalInterface("com.google.android.gms.panorama.internal.IPanoramaCallbacks");
            if (obj != null && (obj instanceof lcp))
            {
                parcel1 = (lcp)obj;
            } else
            {
                parcel1 = new lcr(parcel1);
            }
        }
        if (parcel.readInt() != 0)
        {
            obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
        } else
        {
            obj = null;
        }
        if (parcel.readInt() != 0)
        {
            bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
        } else
        {
            bundle = null;
        }
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(parcel1, ((Uri) (obj)), bundle, flag);
        return true;
    }
}
