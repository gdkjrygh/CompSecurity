// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.b:
//            o, q

public interface p
    extends IInterface
{
    public static abstract class a extends Binder
        implements p
    {

        public static p a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
            if (iinterface != null && (iinterface instanceof p))
            {
                return (p)iinterface;
            } else
            {
                return new a(ibinder);
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
                parcel1.writeString("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                a();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                b();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                o o = com.google.android.gms.b.o.a.a(parcel.readStrongBinder());
                parcel1 = parcel.readStrongBinder();
                if (parcel1 == null)
                {
                    parcel1 = null;
                } else
                {
                    IInterface iinterface = parcel1.queryLocalInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplaySessionCallbacks");
                    if (iinterface != null && (iinterface instanceof q))
                    {
                        parcel1 = (q)iinterface;
                    } else
                    {
                        parcel1 = new q.a.a(parcel1);
                    }
                }
                a(o, parcel1, parcel.readString(), parcel.readString());
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                a(com.google.android.gms.b.o.a.a(parcel.readStrongBinder()), parcel.readInt());
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                a(com.google.android.gms.b.o.a.a(parcel.readStrongBinder()));
                return true;
            }
        }
    }

    private static final class a.a
        implements p
    {

        private IBinder a;

        public final void a()
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
            a.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel.recycle();
            throw exception;
        }

        public final void a(o o1)
            throws RemoteException
        {
            IBinder ibinder;
            Parcel parcel;
            ibinder = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
            if (o1 == null)
            {
                break MISSING_BLOCK_LABEL_23;
            }
            ibinder = o1.asBinder();
            parcel.writeStrongBinder(ibinder);
            a.transact(6, parcel, null, 1);
            parcel.recycle();
            return;
            o1;
            parcel.recycle();
            throw o1;
        }

        public final void a(o o1, int i)
            throws RemoteException
        {
            IBinder ibinder;
            Parcel parcel;
            ibinder = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
            if (o1 == null)
            {
                break MISSING_BLOCK_LABEL_25;
            }
            ibinder = o1.asBinder();
            parcel.writeStrongBinder(ibinder);
            parcel.writeInt(i);
            a.transact(5, parcel, null, 1);
            parcel.recycle();
            return;
            o1;
            parcel.recycle();
            throw o1;
        }

        public final void a(o o1, q q1, String s, String s1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
            if (o1 == null)
            {
                break MISSING_BLOCK_LABEL_86;
            }
            o1 = o1.asBinder();
_L1:
            parcel.writeStrongBinder(o1);
            o1 = obj;
            if (q1 == null)
            {
                break MISSING_BLOCK_LABEL_46;
            }
            o1 = q1.asBinder();
            parcel.writeStrongBinder(o1);
            parcel.writeString(s);
            parcel.writeString(s1);
            a.transact(4, parcel, null, 1);
            parcel.recycle();
            return;
            o1 = null;
              goto _L1
            o1;
            parcel.recycle();
            throw o1;
        }

        public final IBinder asBinder()
        {
            return a;
        }

        public final void b()
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
            a.transact(3, parcel, null, 1);
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel.recycle();
            throw exception;
        }

        a.a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public abstract void a()
        throws RemoteException;

    public abstract void a(o o)
        throws RemoteException;

    public abstract void a(o o, int i)
        throws RemoteException;

    public abstract void a(o o, q q, String s, String s1)
        throws RemoteException;

    public abstract void b()
        throws RemoteException;
}
