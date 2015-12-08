// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.clearcut.LogEventParcelable;

final class jxp
    implements jxn
{

    private IBinder a;

    jxp(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(jxk jxk1, LogEventParcelable logeventparcelable)
    {
        IBinder ibinder;
        Parcel parcel;
        ibinder = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        if (jxk1 == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        ibinder = jxk1.asBinder();
        parcel.writeStrongBinder(ibinder);
        if (logeventparcelable == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        parcel.writeInt(1);
        logeventparcelable.writeToParcel(parcel, 0);
_L1:
        a.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        jxk1;
        parcel.recycle();
        throw jxk1;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
