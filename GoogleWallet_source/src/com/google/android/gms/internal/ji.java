// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.common.people.data.b;

public interface ji
    extends IInterface
{
    public static abstract class a extends Binder
        implements ji
    {

        public static ji aT(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.audience.dynamite.IAudienceViewCallbacks");
            if (iinterface != null && (iinterface instanceof ji))
            {
                return (ji)iinterface;
            } else
            {
                return new a(ibinder);
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
                parcel1.writeString("com.google.android.gms.common.audience.dynamite.IAudienceViewCallbacks");
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.common.audience.dynamite.IAudienceViewCallbacks");
                if (parcel.readInt() != 0)
                {
                    b b1 = AudienceMember.CREATOR;
                    parcel = b.bW(parcel);
                } else
                {
                    parcel = null;
                }
                removeAudienceMember(parcel);
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.common.audience.dynamite.IAudienceViewCallbacks");
                editAudience();
                parcel1.writeNoException();
                return true;
            }
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.common.audience.dynamite.IAudienceViewCallbacks");
        }
    }

    static final class a.a
        implements ji
    {

        private IBinder ld;

        public final IBinder asBinder()
        {
            return ld;
        }

        public final void editAudience()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.audience.dynamite.IAudienceViewCallbacks");
            ld.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final void removeAudienceMember(AudienceMember audiencemember)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.audience.dynamite.IAudienceViewCallbacks");
            if (audiencemember == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            audiencemember.writeToParcel(parcel, 0);
_L1:
            ld.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            audiencemember;
            parcel1.recycle();
            parcel.recycle();
            throw audiencemember;
        }

        a.a(IBinder ibinder)
        {
            ld = ibinder;
        }
    }


    public abstract void editAudience()
        throws RemoteException;

    public abstract void removeAudienceMember(AudienceMember audiencemember)
        throws RemoteException;
}
