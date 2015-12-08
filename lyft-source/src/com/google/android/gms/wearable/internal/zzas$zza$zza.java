// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzas, AncsNotificationParcelable, CapabilityInfoParcelable, ChannelEventParcelable, 
//            MessageEventParcelable, NodeParcelable

class a
    implements zzas
{

    private IBinder a;

    public void a(DataHolder dataholder)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
        if (dataholder == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        dataholder.writeToParcel(parcel, 0);
_L1:
        a.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        dataholder;
        parcel.recycle();
        throw dataholder;
    }

    public void a(AncsNotificationParcelable ancsnotificationparcelable)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
        if (ancsnotificationparcelable == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        parcel.writeInt(1);
        ancsnotificationparcelable.writeToParcel(parcel, 0);
_L1:
        a.transact(6, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        ancsnotificationparcelable;
        parcel.recycle();
        throw ancsnotificationparcelable;
    }

    public void a(CapabilityInfoParcelable capabilityinfoparcelable)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
        if (capabilityinfoparcelable == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        parcel.writeInt(1);
        capabilityinfoparcelable.writeToParcel(parcel, 0);
_L1:
        a.transact(8, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        capabilityinfoparcelable;
        parcel.recycle();
        throw capabilityinfoparcelable;
    }

    public void a(ChannelEventParcelable channeleventparcelable)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
        if (channeleventparcelable == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        parcel.writeInt(1);
        channeleventparcelable.writeToParcel(parcel, 0);
_L1:
        a.transact(7, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        channeleventparcelable;
        parcel.recycle();
        throw channeleventparcelable;
    }

    public void a(MessageEventParcelable messageeventparcelable)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
        if (messageeventparcelable == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        messageeventparcelable.writeToParcel(parcel, 0);
_L1:
        a.transact(2, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        messageeventparcelable;
        parcel.recycle();
        throw messageeventparcelable;
    }

    public void a(NodeParcelable nodeparcelable)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
        if (nodeparcelable == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        nodeparcelable.writeToParcel(parcel, 0);
_L1:
        a.transact(3, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        nodeparcelable;
        parcel.recycle();
        throw nodeparcelable;
    }

    public void a(List list)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
        parcel.writeTypedList(list);
        a.transact(5, parcel, null, 1);
        parcel.recycle();
        return;
        list;
        parcel.recycle();
        throw list;
    }

    public IBinder asBinder()
    {
        return a;
    }

    public void b(NodeParcelable nodeparcelable)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
        if (nodeparcelable == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        nodeparcelable.writeToParcel(parcel, 0);
_L1:
        a.transact(4, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        nodeparcelable;
        parcel.recycle();
        throw nodeparcelable;
    }

    e(IBinder ibinder)
    {
        a = ibinder;
    }
}
