// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;
import java.util.List;

// Referenced classes of package com.google.android.gms.signin.internal:
//            f

public interface d
    extends IInterface
{
    public static abstract class a extends Binder
        implements d
    {

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
                parcel1.writeString("com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
                a(parcel.readString(), parcel.createTypedArrayList(Scope.CREATOR), f.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
                a(parcel.readString(), parcel.readString(), f.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;
            }
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
        }
    }


    public abstract void a(String s, String s1, f f)
        throws RemoteException;

    public abstract void a(String s, List list, f f)
        throws RemoteException;
}
