// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.feedback.ErrorReport;

public interface mk
    extends IInterface
{
    public static abstract class a extends Binder
        implements mk
    {

        public static mk bJ(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackService");
            if (iinterface != null && (iinterface instanceof mk))
            {
                return (mk)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            Object obj = null;
            ErrorReport errorreport = null;
            boolean flag = false;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.feedback.internal.IFeedbackService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.feedback.internal.IFeedbackService");
                if (parcel.readInt() != 0)
                {
                    errorreport = (ErrorReport)ErrorReport.CREATOR.createFromParcel(parcel);
                }
                boolean flag1 = a(errorreport);
                parcel1.writeNoException();
                if (flag1)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                parcel1.writeInt(i);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.feedback.internal.IFeedbackService");
                m(parcel.readInt(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.feedback.internal.IFeedbackService");
                errorreport = obj;
                break;
            }
            if (parcel.readInt() != 0)
            {
                errorreport = (ErrorReport)ErrorReport.CREATOR.createFromParcel(parcel);
            }
            boolean flag2 = b(errorreport);
            parcel1.writeNoException();
            i = ((flag) ? 1 : 0);
            if (flag2)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;
        }
    }

    static final class a.a
        implements mk
    {

        private IBinder ld;

        public final boolean a(ErrorReport errorreport)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.feedback.internal.IFeedbackService");
            if (errorreport == null)
            {
                break MISSING_BLOCK_LABEL_72;
            }
            parcel.writeInt(1);
            errorreport.writeToParcel(parcel, 0);
_L1:
            int i;
            ld.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i == 0)
            {
                flag = false;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            parcel.writeInt(0);
              goto _L1
            errorreport;
            parcel1.recycle();
            parcel.recycle();
            throw errorreport;
        }

        public final IBinder asBinder()
        {
            return ld;
        }

        public final boolean b(ErrorReport errorreport)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.feedback.internal.IFeedbackService");
            if (errorreport == null)
            {
                break MISSING_BLOCK_LABEL_72;
            }
            parcel.writeInt(1);
            errorreport.writeToParcel(parcel, 0);
_L1:
            int i;
            ld.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i == 0)
            {
                flag = false;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            parcel.writeInt(0);
              goto _L1
            errorreport;
            parcel1.recycle();
            parcel.recycle();
            throw errorreport;
        }

        public final void m(int i, int j)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.feedback.internal.IFeedbackService");
            parcel.writeInt(i);
            parcel.writeInt(j);
            ld.transact(2, parcel, parcel1, 0);
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


    public abstract boolean a(ErrorReport errorreport)
        throws RemoteException;

    public abstract boolean b(ErrorReport errorreport)
        throws RemoteException;

    public abstract void m(int i, int j)
        throws RemoteException;
}
