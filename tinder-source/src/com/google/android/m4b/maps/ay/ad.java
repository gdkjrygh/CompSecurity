// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.m4b.maps.dc.b;
import com.google.android.m4b.maps.y.j;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.m4b.maps.ay:
//            i, c, b, ab

public class ad extends i
{
    public static interface a
    {

        public abstract void a(boolean flag);
    }


    private static final String a = com/google/android/m4b/maps/ay/ad.getSimpleName();
    private final com.google.android.m4b.maps.ay.b b;

    public ad(Context context, String s)
    {
        this(context, s, c.c());
    }

    private ad(Context context, String s, com.google.android.m4b.maps.ay.b b1)
    {
        super(context, s, "com.google.android.gms.maps.service.SidewinderService", Executors.newSingleThreadExecutor());
        b = b1;
    }

    static String b()
    {
        return a;
    }

    protected final IInterface a(IBinder ibinder)
    {
        return com.google.android.m4b.maps.dc.b.a.a(ibinder);
    }

    public final Map a()
    {
        Object obj;
        b.b();
        obj = a(((i.b) (new i.b() {

            private ad a;

            private Map a(b b1)
            {
                b1 = b1.b();
                a.c();
                return b1;
                b1;
                if (ab.a(com.google.android.m4b.maps.ay.ad.b(), 6))
                {
                    Log.e(com.google.android.m4b.maps.ay.ad.b(), "An error occurred when fetching the Maps API URL rewriter.");
                }
                a.c();
                return null;
                b1;
                a.c();
                throw b1;
            }

            public final volatile Object a(IInterface iinterface)
            {
                return a((b)iinterface);
            }

            
            {
                a = ad.this;
                super(ad.this);
            }
        })));
        obj = (Map)((Future) (obj)).get();
        return ((Map) (obj));
        Object obj1;
        obj1;
        if (ab.a(a, 6))
        {
            Log.e(a, "Interrupted when fetching the Maps API URL rewriter: ", ((Throwable) (obj1)));
        }
_L2:
        return null;
        obj1;
        if (ab.a(a, 6))
        {
            Log.e(a, "Execution error when fetching the Maps API URL rewriter: ", ((Throwable) (obj1)));
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a(a a1)
    {
        j.a(a1, "callback");
        a(((i.b) (new i.b(a1) {

            private a a;
            private ad b;

            private Void a(b b1)
            {
                boolean flag = b1.a();
                b.c();
_L2:
                a.a(flag);
                return null;
                b1;
                if (ab.a(com.google.android.m4b.maps.ay.ad.b(), 6))
                {
                    Log.e(com.google.android.m4b.maps.ay.ad.b(), "An error occurred when checking if the Maps API should be blocked.");
                }
                flag = true;
                b.c();
                if (true) goto _L2; else goto _L1
_L1:
                b1;
                b.c();
                throw b1;
            }

            public final volatile Object a(IInterface iinterface)
            {
                return a((b)iinterface);
            }

            
            {
                b = ad.this;
                a = a1;
                super(ad.this);
            }
        })));
    }

}
