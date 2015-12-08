// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.feedback.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.feedback.ErrorReport;

public interface IFeedbackService
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements IFeedbackService
    {

        public static IFeedbackService asInterface(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackService");
            if (iinterface != null && (iinterface instanceof IFeedbackService))
            {
                return (IFeedbackService)iinterface;
            } else
            {
                return new Proxy(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            boolean flag1 = false;
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
                boolean flag2;
                if (parcel.readInt() != 0)
                {
                    parcel = (ErrorReport)ErrorReport.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                flag2 = startFeedback(parcel);
                parcel1.writeNoException();
                i = ((flag) ? 1 : 0);
                if (flag2)
                {
                    i = 1;
                }
                parcel1.writeInt(i);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.feedback.internal.IFeedbackService");
                captureScreen(parcel.readInt(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.feedback.internal.IFeedbackService");
                break;
            }
            boolean flag3;
            if (parcel.readInt() != 0)
            {
                parcel = (ErrorReport)ErrorReport.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            flag3 = silentSendFeedback(parcel);
            parcel1.writeNoException();
            i = ((flag1) ? 1 : 0);
            if (flag3)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;
        }
    }

    private static final class Stub.Proxy
        implements IFeedbackService
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void captureScreen(int i, int j)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.feedback.internal.IFeedbackService");
            parcel.writeInt(i);
            parcel.writeInt(j);
            mRemote.transact(2, parcel, parcel1, 0);
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

        public final boolean silentSendFeedback(ErrorReport errorreport)
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
            mRemote.transact(3, parcel, parcel1, 0);
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

        public final boolean startFeedback(ErrorReport errorreport)
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
            mRemote.transact(1, parcel, parcel1, 0);
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

        Stub.Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public abstract void captureScreen(int i, int j)
        throws RemoteException;

    public abstract boolean silentSendFeedback(ErrorReport errorreport)
        throws RemoteException;

    public abstract boolean startFeedback(ErrorReport errorreport)
        throws RemoteException;
}
