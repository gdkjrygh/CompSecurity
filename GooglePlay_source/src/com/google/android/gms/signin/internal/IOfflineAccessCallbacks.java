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
//            ISignInService

public interface IOfflineAccessCallbacks
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements IOfflineAccessCallbacks
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
                checkServerAuthorization(parcel.readString(), parcel.createTypedArrayList(Scope.CREATOR), ISignInService.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
                uploadServerAuthCode(parcel.readString(), parcel.readString(), ISignInService.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;
            }
        }

        public Stub()
        {
            attachInterface(this, "com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
        }
    }


    public abstract void checkServerAuthorization(String s, List list, ISignInService isigninservice)
        throws RemoteException;

    public abstract void uploadServerAuthCode(String s, String s1, ISignInService isigninservice)
        throws RemoteException;
}
