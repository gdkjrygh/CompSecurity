// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.ApplicationMetadata;

// Referenced classes of package com.google.android.gms.internal:
//            ij, io

public interface ir
    extends IInterface
{
    public static abstract class a extends Binder
        implements ir
    {

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int k)
            throws RemoteException
        {
            boolean flag2 = false;
            boolean flag = false;
            String s1 = null;
            Object obj = null;
            String s = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, k);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                ad(parcel.readInt());
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                parcel1 = s;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (ApplicationMetadata)ApplicationMetadata.CREATOR.createFromParcel(parcel);
                }
                s = parcel.readString();
                s1 = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    flag = true;
                }
                a(parcel1, s, s1, flag);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                ae(parcel.readInt());
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                parcel1 = parcel.readString();
                double d = parcel.readDouble();
                boolean flag1 = flag2;
                if (parcel.readInt() != 0)
                {
                    flag1 = true;
                }
                a(parcel1, d, flag1);
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                j(parcel.readString(), parcel.readString());
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                b(parcel.readString(), parcel.createByteArray());
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                ag(parcel.readInt());
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                af(parcel.readInt());
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                onApplicationDisconnected(parcel.readInt());
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                a(parcel.readString(), parcel.readLong(), parcel.readInt());
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                a(parcel.readString(), parcel.readLong());
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                parcel1 = s1;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (ij)ij.CREATOR.createFromParcel(parcel);
                }
                b(parcel1);
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                parcel1 = obj;
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel1 = (io)io.CREATOR.createFromParcel(parcel);
            }
            b(parcel1);
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.cast.internal.ICastDeviceControllerListener");
        }
    }


    public abstract void a(ApplicationMetadata applicationmetadata, String s, String s1, boolean flag)
        throws RemoteException;

    public abstract void a(String s, double d, boolean flag)
        throws RemoteException;

    public abstract void a(String s, long l)
        throws RemoteException;

    public abstract void a(String s, long l, int i)
        throws RemoteException;

    public abstract void ad(int i)
        throws RemoteException;

    public abstract void ae(int i)
        throws RemoteException;

    public abstract void af(int i)
        throws RemoteException;

    public abstract void ag(int i)
        throws RemoteException;

    public abstract void b(ij ij)
        throws RemoteException;

    public abstract void b(io io)
        throws RemoteException;

    public abstract void b(String s, byte abyte0[])
        throws RemoteException;

    public abstract void j(String s, String s1)
        throws RemoteException;

    public abstract void onApplicationDisconnected(int i)
        throws RemoteException;
}
