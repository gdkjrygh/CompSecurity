// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import com.facebook.ads.internal.util.g;
import com.facebook.ads.internal.util.s;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

public class f
{
    private static final class a
        implements IInterface
    {

        private IBinder a;

        public String a()
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s1;
            parcel.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            s1 = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s1;
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

        public boolean b()
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

        a(IBinder ibinder)
        {
            a = ibinder;
        }
    }

    private static final class b
        implements ServiceConnection
    {

        private AtomicBoolean a;
        private final BlockingQueue b;

        public IBinder a()
        {
            if (a.compareAndSet(true, true))
            {
                throw new IllegalStateException("Binder already consumed");
            } else
            {
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
            a = new AtomicBoolean(false);
            b = new LinkedBlockingDeque();
        }

    }


    public static final String a = com/facebook/ads/internal/f.getSimpleName();
    private final String b;
    private final boolean c;

    private f(String s1, boolean flag)
    {
        b = s1;
        c = flag;
    }

    private static f a(Context context)
    {
        Object obj = g.a("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", new Class[] {
            android/content/Context
        });
        if (obj == null)
        {
            return null;
        }
        obj = g.a(null, ((java.lang.reflect.Method) (obj)), new Object[] {
            context
        });
        if (obj == null || ((Integer)obj).intValue() != 0)
        {
            return null;
        }
        obj = g.a("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new Class[] {
            android/content/Context
        });
        if (obj == null)
        {
            return null;
        }
        context = ((Context) (g.a(null, ((java.lang.reflect.Method) (obj)), new Object[] {
            context
        })));
        if (context == null)
        {
            return null;
        }
        obj = g.a(context.getClass(), "getId", new Class[0]);
        java.lang.reflect.Method method = g.a(context.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
        if (obj == null || method == null)
        {
            return null;
        } else
        {
            return new f((String)g.a(context, ((java.lang.reflect.Method) (obj)), new Object[0]), ((Boolean)g.a(context, method, new Object[0])).booleanValue());
        }
    }

    public static f a(Context context, com.facebook.ads.internal.util.g.a a1)
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new IllegalStateException("Cannot get advertising info on main thread.");
        }
        if (a1 != null && !s.a(a1.b))
        {
            a1 = new f(a1.b, a1.c);
        } else
        {
            f f1 = a(context);
            a1 = f1;
            if (f1 == null)
            {
                return b(context);
            }
        }
        return a1;
    }

    private static f b(Context context)
    {
        b b1;
        b1 = new b();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (!context.bindService(intent, b1, 1))
        {
            break MISSING_BLOCK_LABEL_87;
        }
        Object obj;
        obj = new a(b1.a());
        obj = new f(((a) (obj)).a(), ((a) (obj)).b());
        context.unbindService(b1);
        return ((f) (obj));
        Object obj1;
        obj1;
        Log.d(a, "Unable to get advertising id from service", ((Throwable) (obj1)));
        context.unbindService(b1);
        return null;
        obj1;
        context.unbindService(b1);
        throw obj1;
    }

    public String a()
    {
        return b;
    }

    public boolean b()
    {
        return c;
    }

}
