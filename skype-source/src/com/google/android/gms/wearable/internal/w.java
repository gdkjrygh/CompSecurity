// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.g;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            AmsEntityUpdateParcelable, AncsNotificationParcelable, CapabilityInfoParcelable, ChannelEventParcelable, 
//            MessageEventParcelable, NodeParcelable

public interface w
    extends IInterface
{
    public static abstract class a extends Binder
        implements w
    {

        public static w a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            if (iinterface != null && (iinterface instanceof w))
            {
                return (w)iinterface;
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
            Object obj1 = null;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            Object obj = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.wearable.internal.IWearableListener");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                parcel1 = obj;
                if (parcel.readInt() != 0)
                {
                    parcel1 = DataHolder.CREATOR;
                    parcel1 = g.a(parcel);
                }
                a(parcel1);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                parcel1 = obj1;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (MessageEventParcelable)MessageEventParcelable.CREATOR.createFromParcel(parcel);
                }
                a(parcel1);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                parcel1 = obj2;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (NodeParcelable)NodeParcelable.CREATOR.createFromParcel(parcel);
                }
                a(parcel1);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                parcel1 = obj3;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (NodeParcelable)NodeParcelable.CREATOR.createFromParcel(parcel);
                }
                b(parcel1);
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                a(parcel.createTypedArrayList(NodeParcelable.CREATOR));
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                parcel1 = obj4;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (AncsNotificationParcelable)AncsNotificationParcelable.CREATOR.createFromParcel(parcel);
                }
                a(parcel1);
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                parcel1 = obj5;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (ChannelEventParcelable)ChannelEventParcelable.CREATOR.createFromParcel(parcel);
                }
                a(parcel1);
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                parcel1 = obj6;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (CapabilityInfoParcelable)CapabilityInfoParcelable.CREATOR.createFromParcel(parcel);
                }
                a(parcel1);
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                parcel1 = obj7;
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel1 = (AmsEntityUpdateParcelable)AmsEntityUpdateParcelable.CREATOR.createFromParcel(parcel);
            }
            a(parcel1);
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.wearable.internal.IWearableListener");
        }
    }

    private static final class a.a
        implements w
    {

        private IBinder a;

        public final void a(DataHolder dataholder)
            throws RemoteException
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

        public final void a(AmsEntityUpdateParcelable amsentityupdateparcelable)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (amsentityupdateparcelable == null)
            {
                break MISSING_BLOCK_LABEL_45;
            }
            parcel.writeInt(1);
            amsentityupdateparcelable.writeToParcel(parcel, 0);
_L1:
            a.transact(9, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            amsentityupdateparcelable;
            parcel.recycle();
            throw amsentityupdateparcelable;
        }

        public final void a(AncsNotificationParcelable ancsnotificationparcelable)
            throws RemoteException
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

        public final void a(CapabilityInfoParcelable capabilityinfoparcelable)
            throws RemoteException
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

        public final void a(ChannelEventParcelable channeleventparcelable)
            throws RemoteException
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

        public final void a(MessageEventParcelable messageeventparcelable)
            throws RemoteException
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

        public final void a(NodeParcelable nodeparcelable)
            throws RemoteException
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

        public final void a(List list)
            throws RemoteException
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

        public final IBinder asBinder()
        {
            return a;
        }

        public final void b(NodeParcelable nodeparcelable)
            throws RemoteException
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

        a.a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public abstract void a(DataHolder dataholder)
        throws RemoteException;

    public abstract void a(AmsEntityUpdateParcelable amsentityupdateparcelable)
        throws RemoteException;

    public abstract void a(AncsNotificationParcelable ancsnotificationparcelable)
        throws RemoteException;

    public abstract void a(CapabilityInfoParcelable capabilityinfoparcelable)
        throws RemoteException;

    public abstract void a(ChannelEventParcelable channeleventparcelable)
        throws RemoteException;

    public abstract void a(MessageEventParcelable messageeventparcelable)
        throws RemoteException;

    public abstract void a(NodeParcelable nodeparcelable)
        throws RemoteException;

    public abstract void a(List list)
        throws RemoteException;

    public abstract void b(NodeParcelable nodeparcelable)
        throws RemoteException;
}
