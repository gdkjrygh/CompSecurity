// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import java.util.List;

public final class kqx
    implements kqv
{

    private IBinder a;

    public kqx(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(Status status, List list)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.herrevad.internal.IConnectedNetworksQualityCallbacks");
        if (status == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        parcel.writeInt(1);
        status.writeToParcel(parcel, 0);
_L1:
        parcel.writeTypedList(list);
        a.transact(2, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        status;
        parcel.recycle();
        throw status;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
