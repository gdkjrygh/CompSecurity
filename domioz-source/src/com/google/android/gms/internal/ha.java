// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            gy

final class ha
    implements gy
{

    private IBinder a;

    ha(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(Status status)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
        if (status == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        status.writeToParcel(parcel, 0);
_L1:
        a.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        status;
        parcel.recycle();
        throw status;
    }

    public final void a(Status status, ParcelFileDescriptor parcelfiledescriptor)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
        if (status == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        status.writeToParcel(parcel, 0);
_L3:
        if (parcelfiledescriptor == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        parcel.writeInt(1);
        parcelfiledescriptor.writeToParcel(parcel, 0);
_L4:
        a.transact(2, parcel, null, 1);
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        status;
        parcel.recycle();
        throw status;
        parcel.writeInt(0);
          goto _L4
    }

    public final void a(Status status, boolean flag)
    {
        Parcel parcel;
        int i;
        i = 1;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
        if (status == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        status.writeToParcel(parcel, 0);
          goto _L3
_L5:
        parcel.writeInt(i);
        a.transact(3, parcel, null, 1);
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
        break; /* Loop/switch isn't completed */
        status;
        parcel.recycle();
        throw status;
_L6:
        i = 0;
        if (true) goto _L4; else goto _L3
_L4:
        break; /* Loop/switch isn't completed */
_L3:
        if (!flag) goto _L6; else goto _L5
    }

    public final void a(zziv.zzb zzb)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
        if (zzb == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        zzb.writeToParcel(parcel, 0);
_L1:
        a.transact(4, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        zzb;
        parcel.recycle();
        throw zzb;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
