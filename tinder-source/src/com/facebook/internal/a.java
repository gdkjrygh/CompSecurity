// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.facebook.FacebookException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.facebook.internal:
//            m

public class com.facebook.internal.a
{
    private static final class a
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

        a(IBinder ibinder)
        {
            a = ibinder;
        }
    }

    private static final class b
        implements ServiceConnection
    {

        AtomicBoolean a;
        final BlockingQueue b;

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
            a = new AtomicBoolean(false);
            b = new LinkedBlockingDeque();
        }

        b(byte byte0)
        {
            this();
        }
    }


    private static final String e = com/facebook/internal/a.getCanonicalName();
    private static com.facebook.internal.a g;
    String a;
    String b;
    String c;
    boolean d;
    private long f;

    public com.facebook.internal.a()
    {
    }

    public static com.facebook.internal.a a(Context context)
    {
        Object obj2 = null;
        if (g == null || System.currentTimeMillis() - g.f >= 0x36ee80L) goto _L2; else goto _L1
_L1:
        Object obj = g;
_L10:
        return ((com.facebook.internal.a) (obj));
_L2:
        com.facebook.internal.a a1;
        b(context);
        a1 = c(context);
        if (a1 == null)
        {
            a1 = new com.facebook.internal.a();
        }
        if (context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0) == null) goto _L4; else goto _L3
_L3:
        obj = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
_L9:
        Object obj1 = context.getPackageManager();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_388;
        }
        obj1 = ((PackageManager) (obj1)).getInstallerPackageName(context.getPackageName());
_L14:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        a1.c = ((String) (obj1));
        if (obj != null) goto _L6; else goto _L5
_L5:
        return a(a1);
_L4:
        if (context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0) == null) goto _L8; else goto _L7
_L7:
        obj = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
          goto _L9
_L6:
        context = context.getContentResolver().query(((Uri) (obj)), new String[] {
            "aid", "androidid", "limit_tracking"
        }, null, null, null);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_177;
        }
        obj = context;
        if (context.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_198;
        }
        obj = context;
        a1 = a(a1);
        obj = a1;
        if (context != null)
        {
            context.close();
            return a1;
        }
          goto _L10
        obj = context;
        int i = context.getColumnIndex("aid");
        obj = context;
        int j = context.getColumnIndex("androidid");
        obj = context;
        int k = context.getColumnIndex("limit_tracking");
        obj = context;
        a1.a = context.getString(i);
        if (j <= 0 || k <= 0)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        obj = context;
        if (a1.b != null)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        obj = context;
        a1.b = context.getString(j);
        obj = context;
        a1.d = Boolean.parseBoolean(context.getString(k));
        if (context != null)
        {
            context.close();
        }
        return a(a1);
        Exception exception;
        exception;
        context = null;
_L13:
        obj = context;
        Log.d(e, (new StringBuilder("Caught unexpected exception in getAttributionId(): ")).append(exception.toString()).toString());
        if (context != null)
        {
            context.close();
        }
        return null;
        context;
        obj = obj2;
_L12:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw context;
        context;
        if (true) goto _L12; else goto _L11
_L11:
        exception;
        if (true) goto _L13; else goto _L8
_L8:
        obj = null;
          goto _L9
        obj1 = null;
          goto _L14
    }

    private static com.facebook.internal.a a(com.facebook.internal.a a1)
    {
        a1.f = System.currentTimeMillis();
        g = a1;
        return a1;
    }

    private static com.facebook.internal.a b(Context context)
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new FacebookException("getAndroidId cannot be called on the main thread.");
        }
          goto _L1
        context;
        m.a("android_id", context);
_L3:
        return null;
_L1:
        Object obj = m.a("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", new Class[] {
            android/content/Context
        });
        if (obj == null) goto _L3; else goto _L2
_L2:
        obj = m.a(null, ((java.lang.reflect.Method) (obj)), new Object[] {
            context
        });
        if (!(obj instanceof Integer) || ((Integer)obj).intValue() != 0) goto _L3; else goto _L4
_L4:
        obj = m.a("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new Class[] {
            android/content/Context
        });
        if (obj == null) goto _L3; else goto _L5
_L5:
        context = ((Context) (m.a(null, ((java.lang.reflect.Method) (obj)), new Object[] {
            context
        })));
        if (context == null) goto _L3; else goto _L6
_L6:
        java.lang.reflect.Method method;
        obj = m.a(context.getClass(), "getId", new Class[0]);
        method = m.a(context.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
        if (obj == null || method == null) goto _L3; else goto _L7
_L7:
        com.facebook.internal.a a1 = new com.facebook.internal.a();
        a1.b = (String)m.a(context, ((java.lang.reflect.Method) (obj)), new Object[0]);
        a1.d = ((Boolean)m.a(context, method, new Object[0])).booleanValue();
        return null;
    }

    private static com.facebook.internal.a c(Context context)
    {
        b b1;
        b1 = new b((byte)0);
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (!context.bindService(intent, b1, 1))
        {
            break MISSING_BLOCK_LABEL_70;
        }
        if (b1.a.compareAndSet(true, true))
        {
            throw new IllegalStateException("Binder already consumed");
        }
        break MISSING_BLOCK_LABEL_72;
        Object obj;
        obj;
        m.a("android_id", ((Exception) (obj)));
        context.unbindService(b1);
        return null;
        com.facebook.internal.a a2;
        a a1 = new a((IBinder)b1.b.take());
        a2 = new com.facebook.internal.a();
        a2.b = a1.a();
        a2.d = a1.b();
        context.unbindService(b1);
        return a2;
        a1;
        context.unbindService(b1);
        throw a1;
    }

}
