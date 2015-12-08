// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

// Referenced classes of package com.google.android.gms.playlog.internal:
//            PlayLoggerContext, LogEvent, PlayLoggerContextCreator, LogEventCreator

public interface IPlayLogService
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements IPlayLogService
    {

        public static IPlayLogService asInterface(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.playlog.internal.IPlayLogService");
            if (iinterface != null && (iinterface instanceof IPlayLogService))
            {
                return (IPlayLogService)iinterface;
            } else
            {
                return new Proxy(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            String s2;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.playlog.internal.IPlayLogService");
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.playlog.internal.IPlayLogService");
                String s = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    parcel1 = PlayLoggerContext.CREATOR;
                    parcel1 = PlayLoggerContextCreator.createFromParcel(parcel);
                } else
                {
                    parcel1 = null;
                }
                if (parcel.readInt() != 0)
                {
                    LogEventCreator logeventcreator = LogEvent.CREATOR;
                    parcel = LogEventCreator.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                sendLogEvent(s, parcel1, parcel);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.playlog.internal.IPlayLogService");
                String s1 = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    parcel1 = PlayLoggerContext.CREATOR;
                    parcel1 = PlayLoggerContextCreator.createFromParcel(parcel);
                } else
                {
                    parcel1 = null;
                }
                sendLogEvents(s1, parcel1, parcel.createTypedArrayList(LogEvent.CREATOR));
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.playlog.internal.IPlayLogService");
                s2 = parcel.readString();
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel1 = PlayLoggerContext.CREATOR;
                parcel1 = PlayLoggerContextCreator.createFromParcel(parcel);
            } else
            {
                parcel1 = null;
            }
            sendSerializedLogEvent(s2, parcel1, parcel.createByteArray());
            return true;
        }
    }

    private static final class Stub.Proxy
        implements IPlayLogService
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void sendLogEvent(String s, PlayLoggerContext playloggercontext, LogEvent logevent)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.playlog.internal.IPlayLogService");
            parcel.writeString(s);
            if (playloggercontext == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            playloggercontext.writeToParcel(parcel, 0);
_L3:
            if (logevent == null)
            {
                break MISSING_BLOCK_LABEL_90;
            }
            parcel.writeInt(1);
            logevent.writeToParcel(parcel, 0);
_L4:
            mRemote.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            s;
            parcel.recycle();
            throw s;
            parcel.writeInt(0);
              goto _L4
        }

        public final void sendLogEvents(String s, PlayLoggerContext playloggercontext, List list)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.playlog.internal.IPlayLogService");
            parcel.writeString(s);
            if (playloggercontext == null)
            {
                break MISSING_BLOCK_LABEL_62;
            }
            parcel.writeInt(1);
            playloggercontext.writeToParcel(parcel, 0);
_L1:
            parcel.writeTypedList(list);
            mRemote.transact(3, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            s;
            parcel.recycle();
            throw s;
        }

        public final void sendSerializedLogEvent(String s, PlayLoggerContext playloggercontext, byte abyte0[])
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.playlog.internal.IPlayLogService");
            parcel.writeString(s);
            if (playloggercontext == null)
            {
                break MISSING_BLOCK_LABEL_62;
            }
            parcel.writeInt(1);
            playloggercontext.writeToParcel(parcel, 0);
_L1:
            parcel.writeByteArray(abyte0);
            mRemote.transact(4, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            s;
            parcel.recycle();
            throw s;
        }

        Stub.Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public abstract void sendLogEvent(String s, PlayLoggerContext playloggercontext, LogEvent logevent)
        throws RemoteException;

    public abstract void sendLogEvents(String s, PlayLoggerContext playloggercontext, List list)
        throws RemoteException;

    public abstract void sendSerializedLogEvent(String s, PlayLoggerContext playloggercontext, byte abyte0[])
        throws RemoteException;
}
