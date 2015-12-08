// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface b
    extends IInterface
{
    public static abstract class a extends Binder
        implements b
    {

        public static b z(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (iinterface != null && (iinterface instanceof b))
            {
                return (b)iinterface;
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
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.dynamic.IObjectWrapper");
                break;
            }
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.dynamic.IObjectWrapper");
        }
    }

    private static class a.a
        implements b
    {

        private IBinder dG;

        public IBinder asBinder()
        {
            return dG;
        }

        a.a(IBinder ibinder)
        {
            dG = ibinder;
        }
    }

}
