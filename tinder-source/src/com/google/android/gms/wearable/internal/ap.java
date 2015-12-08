// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.j;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            z

public final class ap extends j
{

    final ExecutorService e = Executors.newCachedThreadPool();
    final z f = new z();
    final z g = new z();
    final z h = new z();
    final z i = new z();
    final z j = new z();
    final z k = new z();
    final z l = new z();
    private final Map m = new HashMap();

    public ap(Context context, Looper looper, com.google.android.gms.common.api.c.b b, com.google.android.gms.common.api.c.c c, g g1)
    {
        super(context, looper, 14, g1, b, c);
    }

    protected final IInterface a(IBinder ibinder)
    {
        return y.a.a(ibinder);
    }

    public final void a()
    {
        f.a(this);
        g.a(this);
        h.a(this);
        i.a(this);
        j.a(this);
        k.a(this);
        l.a(this);
        Map map = m;
        map;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m.values().iterator(); iterator.hasNext(); ((z)iterator.next()).a(this)) { }
        break MISSING_BLOCK_LABEL_108;
        Exception exception;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
        map;
        JVM INSTR monitorexit ;
        super.a();
        return;
    }

    protected final void a(int i1, IBinder ibinder, Bundle bundle, int j1)
    {
        if (Log.isLoggable("WearableClient", 2))
        {
            Log.d("WearableClient", (new StringBuilder("onPostInitHandler: statusCode ")).append(i1).toString());
        }
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        f.a(ibinder);
        g.a(ibinder);
        h.a(ibinder);
        i.a(ibinder);
        j.a(ibinder);
        k.a(ibinder);
        l.a(ibinder);
        Map map = m;
        map;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m.values().iterator(); iterator.hasNext(); ((z)iterator.next()).a(ibinder)) { }
        break MISSING_BLOCK_LABEL_149;
        ibinder;
        map;
        JVM INSTR monitorexit ;
        throw ibinder;
        map;
        JVM INSTR monitorexit ;
_L2:
        super.a(i1, ibinder, bundle, j1);
        return;
    }

    protected final String e()
    {
        return "com.google.android.gms.wearable.BIND";
    }

    protected final String f()
    {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    // Unreferenced inner class com/google/android/gms/wearable/internal/ap$1

/* anonymous class */
    final class _cls1
        implements Callable
    {

        final ParcelFileDescriptor a;
        final byte b[];
        final ap c;

        private Boolean a()
        {
            android.os.ParcelFileDescriptor.AutoCloseOutputStream autocloseoutputstream;
            if (Log.isLoggable("WearableClient", 3))
            {
                Log.d("WearableClient", (new StringBuilder("processAssets: writing data to FD : ")).append(a).toString());
            }
            autocloseoutputstream = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(a);
            Object obj;
            autocloseoutputstream.write(b);
            autocloseoutputstream.flush();
            if (Log.isLoggable("WearableClient", 3))
            {
                Log.d("WearableClient", (new StringBuilder("processAssets: wrote data: ")).append(a).toString());
            }
            obj = Boolean.valueOf(true);
            IOException ioexception;
            try
            {
                if (Log.isLoggable("WearableClient", 3))
                {
                    Log.d("WearableClient", (new StringBuilder("processAssets: closing: ")).append(a).toString());
                }
                autocloseoutputstream.close();
            }
            catch (IOException ioexception1)
            {
                return ((Boolean) (obj));
            }
            return ((Boolean) (obj));
            obj;
            Log.w("WearableClient", (new StringBuilder("processAssets: writing data failed: ")).append(a).toString());
            try
            {
                if (Log.isLoggable("WearableClient", 3))
                {
                    Log.d("WearableClient", (new StringBuilder("processAssets: closing: ")).append(a).toString());
                }
                autocloseoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception) { }
            return Boolean.valueOf(false);
            obj;
            try
            {
                if (Log.isLoggable("WearableClient", 3))
                {
                    Log.d("WearableClient", (new StringBuilder("processAssets: closing: ")).append(a).toString());
                }
                autocloseoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception) { }
            throw obj;
        }

        public final Object call()
            throws Exception
        {
            return a();
        }

            
            {
                c = ap.this;
                a = parcelfiledescriptor;
                b = abyte0;
                super();
            }
    }

}
