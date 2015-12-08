// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.lib2.opensense.social;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.htc.lib2.opensense.social:
//            ISocialPluginResponse

public static abstract class attachInterface extends Binder
    implements ISocialPluginResponse
{

    private static final String DESCRIPTOR = "com.htc.lib2.opensense.social.ISocialPluginResponse";
    static final int TRANSACTION_onError = 2;
    static final int TRANSACTION_onResult = 1;

    public static ISocialPluginResponse asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.htc.lib2.opensense.social.ISocialPluginResponse");
    /* block-local class not found */
    class Proxy {}

        if (iinterface != null && (iinterface instanceof ISocialPluginResponse))
        {
            return (ISocialPluginResponse)iinterface;
        } else
        {
            return new Proxy(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.htc.lib2.opensense.social.ISocialPluginResponse");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.htc.lib2.opensense.social.ISocialPluginResponse");
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.omParcel(parcel);
            } else
            {
                parcel = null;
            }
            onResult(parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.htc.lib2.opensense.social.ISocialPluginResponse");
            onError(parcel.readInt(), parcel.readString());
            return true;
        }
    }

    public Proxy()
    {
        attachInterface(this, "com.htc.lib2.opensense.social.ISocialPluginResponse");
    }
}
