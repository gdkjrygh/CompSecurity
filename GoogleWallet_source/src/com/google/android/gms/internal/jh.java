// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.dynamic.d;

// Referenced classes of package com.google.android.gms.internal:
//            ji

public interface jh
    extends IInterface
{
    public static abstract class a extends Binder
        implements jh
    {

        public static jh aS(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.audience.dynamite.IAudienceView");
            if (iinterface != null && (iinterface instanceof jh))
            {
                return (jh)iinterface;
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
            com.google.android.gms.common.people.data.a a1 = null;
            boolean flag1 = false;
            boolean flag = false;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.common.audience.dynamite.IAudienceView");
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.common.audience.dynamite.IAudienceView");
                a(com.google.android.gms.dynamic.d.a.bH(parcel.readStrongBinder()), com.google.android.gms.dynamic.d.a.bH(parcel.readStrongBinder()), ji.a.aT(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.common.audience.dynamite.IAudienceView");
                cT(parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.common.audience.dynamite.IAudienceView");
                if (parcel.readInt() != 0)
                {
                    flag = true;
                }
                setShowEmptyText(flag);
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.common.audience.dynamite.IAudienceView");
                if (parcel.readInt() != 0)
                {
                    a1 = Audience.CREATOR;
                    parcel = com.google.android.gms.common.people.data.a.bV(parcel);
                } else
                {
                    parcel = null;
                }
                setAudience(parcel);
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.common.audience.dynamite.IAudienceView");
                parcel = onSaveInstanceState();
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel1.writeInt(1);
                    parcel.writeToParcel(parcel1, 1);
                    return true;
                } else
                {
                    parcel1.writeInt(0);
                    return true;
                }

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.common.audience.dynamite.IAudienceView");
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                onRestoreInstanceState(parcel);
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.common.audience.dynamite.IAudienceView");
                d d1 = getView();
                parcel1.writeNoException();
                parcel = a1;
                if (d1 != null)
                {
                    parcel = d1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.common.audience.dynamite.IAudienceView");
                flag = flag1;
                break;
            }
            if (parcel.readInt() != 0)
            {
                flag = true;
            }
            setIsUnderageAccount(flag);
            parcel1.writeNoException();
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.common.audience.dynamite.IAudienceView");
        }
    }

    static final class a.a
        implements jh
    {

        private IBinder ld;

        public final void a(d d1, d d2, ji ji1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.audience.dynamite.IAudienceView");
            if (d1 == null) goto _L2; else goto _L1
_L1:
            d1 = d1.asBinder();
_L5:
            parcel.writeStrongBinder(d1);
            if (d2 == null) goto _L4; else goto _L3
_L3:
            d1 = d2.asBinder();
_L6:
            parcel.writeStrongBinder(d1);
            d1 = obj;
            if (ji1 == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            d1 = ji1.asBinder();
            parcel.writeStrongBinder(d1);
            ld.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            d1 = null;
              goto _L5
_L4:
            d1 = null;
              goto _L6
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
              goto _L5
        }

        public final IBinder asBinder()
        {
            return ld;
        }

        public final void cT(int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.audience.dynamite.IAudienceView");
            parcel.writeInt(i);
            ld.transact(3, parcel, parcel1, 0);
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

        public final d getView()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            d d1;
            parcel.writeInterfaceToken("com.google.android.gms.common.audience.dynamite.IAudienceView");
            ld.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            d1 = com.google.android.gms.dynamic.d.a.bH(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return d1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final void onRestoreInstanceState(Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.audience.dynamite.IAudienceView");
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            ld.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            bundle;
            parcel1.recycle();
            parcel.recycle();
            throw bundle;
        }

        public final Bundle onSaveInstanceState()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.audience.dynamite.IAudienceView");
            ld.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Bundle bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return bundle;
_L2:
            bundle = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final void setAudience(Audience audience)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.audience.dynamite.IAudienceView");
            if (audience == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            audience.writeToParcel(parcel, 0);
_L1:
            ld.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            audience;
            parcel1.recycle();
            parcel.recycle();
            throw audience;
        }

        public final void setIsUnderageAccount(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.audience.dynamite.IAudienceView");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            ld.transact(9, parcel, parcel1, 0);
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

        public final void setShowEmptyText(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.audience.dynamite.IAudienceView");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
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

        a.a(IBinder ibinder)
        {
            ld = ibinder;
        }
    }


    public abstract void a(d d, d d1, ji ji)
        throws RemoteException;

    public abstract void cT(int i)
        throws RemoteException;

    public abstract d getView()
        throws RemoteException;

    public abstract void onRestoreInstanceState(Bundle bundle)
        throws RemoteException;

    public abstract Bundle onSaveInstanceState()
        throws RemoteException;

    public abstract void setAudience(Audience audience)
        throws RemoteException;

    public abstract void setIsUnderageAccount(boolean flag)
        throws RemoteException;

    public abstract void setShowEmptyText(boolean flag)
        throws RemoteException;
}
