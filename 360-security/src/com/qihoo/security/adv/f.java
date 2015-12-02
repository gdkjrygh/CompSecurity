// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.adv;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

public class f
{
    public static final class a
    {

        private final String a;
        private final boolean b;

        public String a()
        {
            return a;
        }

        a(String s, boolean flag)
        {
            a = s;
            b = flag;
        }
    }

    private static final class b
        implements ServiceConnection
    {

        boolean a;
        private final LinkedBlockingQueue b;

        public IBinder a()
            throws InterruptedException
        {
            if (a)
            {
                throw new IllegalStateException();
            } else
            {
                a = true;
                return (IBinder)b.take();
            }
        }

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            try
            {
                b.put(ibinder);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname)
            {
                return;
            }
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
        }

        private b()
        {
            a = false;
            b = new LinkedBlockingQueue(1);
        }

    }

    private static final class c
        implements IInterface
    {

        private IBinder a;

        public String a()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public boolean a(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            int i;
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            a.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i != 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public IBinder asBinder()
        {
            return a;
        }

        public c(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public static a a(Context context)
        throws Exception
    {
        b b1;
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        Object obj;
        try
        {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        b1 = new b();
        obj = new Intent("com.google.android.gms.ads.identifier.service.START");
        ((Intent) (obj)).setPackage("com.google.android.gms");
        if (!context.bindService(((Intent) (obj)), b1, 1))
        {
            break MISSING_BLOCK_LABEL_116;
        }
        obj = new c(b1.a());
        obj = new a(((c) (obj)).a(), ((c) (obj)).a(true));
        context.unbindService(b1);
        return ((a) (obj));
        Object obj1;
        obj1;
        throw obj1;
        obj1;
        context.unbindService(b1);
        throw obj1;
        throw new IOException("Google Play connection failed");
    }
}
