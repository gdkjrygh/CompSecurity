// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

// Referenced classes of package com.google.android.gms.playlog.internal:
//            a, PlayLoggerContext, e, LogEvent, 
//            c

public static abstract class a.a extends Binder
    implements com.google.android.gms.playlog.internal.a
{
    private static final class a
        implements com.google.android.gms.playlog.internal.a
    {

        private IBinder a;

        public final void a(String s, PlayLoggerContext playloggercontext, LogEvent logevent)
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
            a.transact(2, parcel, null, 1);
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

        public final void a(String s, PlayLoggerContext playloggercontext, List list)
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
            a.transact(3, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            s;
            parcel.recycle();
            throw s;
        }

        public final void a(String s, PlayLoggerContext playloggercontext, byte abyte0[])
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
            a.transact(4, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            s;
            parcel.recycle();
            throw s;
        }

        public final IBinder asBinder()
        {
            return a;
        }

        a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public static com.google.android.gms.playlog.internal.a a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.playlog.internal.IPlayLogService");
        if (iinterface != null && (iinterface instanceof com.google.android.gms.playlog.internal.a))
        {
            return (com.google.android.gms.playlog.internal.a)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        String s = null;
        Object obj1 = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.playlog.internal.IPlayLogService");
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.playlog.internal.IPlayLogService");
            s = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel1 = PlayLoggerContext.CREATOR;
                parcel1 = e.a(parcel);
            } else
            {
                parcel1 = null;
            }
            if (parcel.readInt() != 0)
            {
                obj = LogEvent.CREATOR;
                obj = c.a(parcel);
            }
            a(s, parcel1, ((LogEvent) (obj)));
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.playlog.internal.IPlayLogService");
            obj = parcel.readString();
            parcel1 = s;
            if (parcel.readInt() != 0)
            {
                parcel1 = PlayLoggerContext.CREATOR;
                parcel1 = e.a(parcel);
            }
            a(((String) (obj)), parcel1, parcel.createTypedArrayList(LogEvent.CREATOR));
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.playlog.internal.IPlayLogService");
            obj = parcel.readString();
            parcel1 = obj1;
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel1 = PlayLoggerContext.CREATOR;
            parcel1 = e.a(parcel);
        }
        a(((String) (obj)), parcel1, parcel.createByteArray());
        return true;
    }
}
