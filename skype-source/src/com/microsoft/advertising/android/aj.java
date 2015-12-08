// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.microsoft.advertising.android:
//            ai, av

public final class aj
{
    public static final class a
    {

        private final String a;
        private final boolean b;

        public final String a()
        {
            return a;
        }

        public final boolean b()
        {
            return b;
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

        public final IBinder a()
            throws InterruptedException
        {
            if (a)
            {
                throw new IllegalStateException();
            } else
            {
                a = true;
                return (IBinder)b.poll(2L, TimeUnit.SECONDS);
            }
        }

        public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
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

        public final void onServiceDisconnected(ComponentName componentname)
        {
        }

        private b()
        {
            a = false;
            b = new LinkedBlockingQueue(1);
        }

        b(byte byte0)
        {
            this();
        }
    }

    private static final class c
        implements IInterface
    {

        private IBinder a;

        public final String a()
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

        public final IBinder asBinder()
        {
            return a;
        }

        public final boolean b()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            parcel.writeInt(1);
            a.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i == 0)
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

        public c(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public static t.a a(Context context, ai ai1)
    {
        Object obj;
        t.a a1;
        b b1;
        long l;
        l = System.currentTimeMillis();
        a1 = new t.a();
        obj = null;
        b1 = new b((byte)0);
        if (!a(context, b1))
        {
            break MISSING_BLOCK_LABEL_145;
        }
        Object obj1;
        obj1 = new c(b1.a());
        obj1 = new a(((c) (obj1)).a(), ((c) (obj1)).b());
        context.unbindService(b1);
        context = ((Context) (obj1));
_L1:
        Exception exception;
        if (context != null)
        {
            a1.a(context.b());
            context = context.a();
            if (context != null)
            {
                a1.a(context);
            }
        } else
        {
            a1.a(true);
        }
        if (ai1 != null)
        {
            ai1.a("fetchAdvertisingId", l);
        }
        return a1;
        exception;
        av.c("AdRequestManager", "Exception While Fetching Binder from Service Connection");
        context.unbindService(b1);
        context = obj;
          goto _L1
        ai1;
        context.unbindService(b1);
        throw ai1;
        av.c("AdRequestManager", "Unable to bind to the Google Play service");
        context = obj;
          goto _L1
    }

    private static boolean a(Context context, b b1)
    {
        boolean flag;
        try
        {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            flag = context.bindService(intent, b1, 1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            av.c("AdRequestManager", "Exception While Binding to Google Play Services");
            return false;
        }
        return flag;
    }
}
