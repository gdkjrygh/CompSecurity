// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface com.google.android.gms.a.a
    extends IInterface
{
    public static abstract class a extends Binder
        implements com.google.android.gms.a.a
    {

        public static com.google.android.gms.a.a a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (iinterface != null && (iinterface instanceof com.google.android.gms.a.a))
            {
                return (com.google.android.gms.a.a)iinterface;
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
        implements com.google.android.gms.a.a
    {

        private IBinder a;

        public IBinder asBinder()
        {
            return a;
        }

        a.a(IBinder ibinder)
        {
            a = ibinder;
        }
    }

}
