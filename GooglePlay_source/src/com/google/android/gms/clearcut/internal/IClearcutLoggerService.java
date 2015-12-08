// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.clearcut.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.LogEventParcelableCreator;

// Referenced classes of package com.google.android.gms.clearcut.internal:
//            IClearcutLoggerCallbacks

public interface IClearcutLoggerService
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements IClearcutLoggerService
    {

        public static IClearcutLoggerService asInterface(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
            if (iinterface != null && (iinterface instanceof IClearcutLoggerService))
            {
                return (IClearcutLoggerService)iinterface;
            } else
            {
                return new Proxy(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                parcel1 = parcel.readStrongBinder();
                break;
            }
            if (parcel1 == null)
            {
                parcel1 = null;
            } else
            {
                IInterface iinterface = parcel1.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                if (iinterface != null && (iinterface instanceof IClearcutLoggerCallbacks))
                {
                    parcel1 = (IClearcutLoggerCallbacks)iinterface;
                } else
                {
                    parcel1 = new IClearcutLoggerCallbacks.Stub.Proxy(parcel1);
                }
            }
            if (parcel.readInt() != 0)
            {
                LogEventParcelableCreator logeventparcelablecreator = LogEventParcelable.CREATOR;
                parcel = LogEventParcelableCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            logEvent(parcel1, parcel);
            return true;
        }
    }

    private static final class Stub.Proxy
        implements IClearcutLoggerService
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void logEvent(IClearcutLoggerCallbacks iclearcutloggercallbacks, LogEventParcelable logeventparcelable)
            throws RemoteException
        {
            IBinder ibinder;
            Parcel parcel;
            ibinder = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
            if (iclearcutloggercallbacks == null)
            {
                break MISSING_BLOCK_LABEL_25;
            }
            ibinder = iclearcutloggercallbacks.asBinder();
            parcel.writeStrongBinder(ibinder);
            if (logeventparcelable == null)
            {
                break MISSING_BLOCK_LABEL_69;
            }
            parcel.writeInt(1);
            logeventparcelable.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            iclearcutloggercallbacks;
            parcel.recycle();
            throw iclearcutloggercallbacks;
        }

        Stub.Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public abstract void logEvent(IClearcutLoggerCallbacks iclearcutloggercallbacks, LogEventParcelable logeventparcelable)
        throws RemoteException;
}
