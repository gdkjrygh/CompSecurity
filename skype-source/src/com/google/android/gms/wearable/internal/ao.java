// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            y, x, ap

public final class ao extends m
{

    private final ExecutorService a = Executors.newCachedThreadPool();
    private final y e = new y();
    private final y f = new y();
    private final y g = new y();
    private final y h = new y();
    private final y i = new y();
    private final y j = new y();
    private final y k = new y();
    private final Map l = new HashMap();

    public ao(Context context, Looper looper, com.google.android.gms.common.api.c.b b1, com.google.android.gms.common.api.c.c c, i i1)
    {
        super(context, looper, 14, i1, b1, c);
    }

    protected final IInterface a(IBinder ibinder)
    {
        return x.a.a(ibinder);
    }

    protected final String a()
    {
        return "com.google.android.gms.wearable.BIND";
    }

    protected final void a(int i1, IBinder ibinder, Bundle bundle, int j1)
    {
        Log.isLoggable("WearableClient", 2);
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        e.a(ibinder);
        f.a(ibinder);
        h.a(ibinder);
        i.a(ibinder);
        j.a(ibinder);
        k.a(ibinder);
        Map map = l;
        map;
        JVM INSTR monitorenter ;
        for (Iterator iterator = l.values().iterator(); iterator.hasNext(); ((y)iterator.next()).a(ibinder)) { }
        break MISSING_BLOCK_LABEL_117;
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

    public final void a(com.google.android.gms.common.api.k.b b1, PutDataRequest putdatarequest)
        throws RemoteException
    {
        for (Iterator iterator = putdatarequest.c().entrySet().iterator(); iterator.hasNext();)
        {
            Asset asset = (Asset)((java.util.Map.Entry)iterator.next()).getValue();
            if (asset.a() == null && asset.b() == null && asset.b == null && asset.c == null)
            {
                throw new IllegalArgumentException((new StringBuilder("Put for ")).append(putdatarequest.a()).append(" contains invalid asset: ").append(asset).toString());
            }
        }

        PutDataRequest putdatarequest1 = PutDataRequest.a(putdatarequest.a());
        putdatarequest1.a(putdatarequest.b());
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator1 = putdatarequest.c().entrySet().iterator(); iterator1.hasNext();)
        {
            Object obj = (java.util.Map.Entry)iterator1.next();
            Asset asset1 = (Asset)((java.util.Map.Entry) (obj)).getValue();
            if (asset1.a() == null)
            {
                putdatarequest1.a((String)((java.util.Map.Entry) (obj)).getKey(), (Asset)((java.util.Map.Entry) (obj)).getValue());
            } else
            {
                ParcelFileDescriptor aparcelfiledescriptor[];
                try
                {
                    aparcelfiledescriptor = ParcelFileDescriptor.createPipe();
                }
                // Misplaced declaration of an exception variable
                catch (com.google.android.gms.common.api.k.b b1)
                {
                    throw new IllegalStateException((new StringBuilder("Unable to create ParcelFileDescriptor for asset in request: ")).append(putdatarequest).toString(), b1);
                }
                if (Log.isLoggable("WearableClient", 3))
                {
                    (new StringBuilder("processAssets: replacing data with FD in asset: ")).append(asset1).append(" read:").append(aparcelfiledescriptor[0]).append(" write:").append(aparcelfiledescriptor[1]);
                }
                putdatarequest1.a((String)((java.util.Map.Entry) (obj)).getKey(), Asset.a(aparcelfiledescriptor[0]));
                obj = new FutureTask(new Callable(aparcelfiledescriptor[1], asset1.a()) {

                    final ParcelFileDescriptor a;
                    final byte b[];
                    final ao c;

                    private Boolean a()
                    {
                        android.os.ParcelFileDescriptor.AutoCloseOutputStream autocloseoutputstream;
                        if (Log.isLoggable("WearableClient", 3))
                        {
                            (new StringBuilder("processAssets: writing data to FD : ")).append(a);
                        }
                        autocloseoutputstream = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(a);
                        Object obj1;
                        autocloseoutputstream.write(b);
                        autocloseoutputstream.flush();
                        if (Log.isLoggable("WearableClient", 3))
                        {
                            (new StringBuilder("processAssets: wrote data: ")).append(a);
                        }
                        obj1 = Boolean.valueOf(true);
                        IOException ioexception;
                        try
                        {
                            if (Log.isLoggable("WearableClient", 3))
                            {
                                (new StringBuilder("processAssets: closing: ")).append(a);
                            }
                            autocloseoutputstream.close();
                        }
                        catch (IOException ioexception1)
                        {
                            return ((Boolean) (obj1));
                        }
                        return ((Boolean) (obj1));
                        obj1;
                        Log.w("WearableClient", (new StringBuilder("processAssets: writing data failed: ")).append(a).toString());
                        try
                        {
                            if (Log.isLoggable("WearableClient", 3))
                            {
                                (new StringBuilder("processAssets: closing: ")).append(a);
                            }
                            autocloseoutputstream.close();
                        }
                        // Misplaced declaration of an exception variable
                        catch (IOException ioexception) { }
                        return Boolean.valueOf(false);
                        obj1;
                        try
                        {
                            if (Log.isLoggable("WearableClient", 3))
                            {
                                (new StringBuilder("processAssets: closing: ")).append(a);
                            }
                            autocloseoutputstream.close();
                        }
                        // Misplaced declaration of an exception variable
                        catch (IOException ioexception) { }
                        throw obj1;
                    }

                    public final Object call()
                        throws Exception
                    {
                        return a();
                    }

            
            {
                c = ao.this;
                a = parcelfiledescriptor;
                b = abyte0;
                super();
            }
                });
                arraylist.add(obj);
                a.submit(((Runnable) (obj)));
            }
        }

        ((x)n()).a(new an.g(b1, arraylist), putdatarequest1);
    }

    public final void a(com.google.android.gms.common.api.k.b b1, com.google.android.gms.wearable.j.a a1, IntentFilter aintentfilter[])
        throws RemoteException
    {
        i.a(this, b1, a1, ap.a(a1, aintentfilter));
    }

    protected final String b()
    {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    public final void d()
    {
        e.a(this);
        f.a(this);
        h.a(this);
        i.a(this);
        j.a(this);
        k.a(this);
        Map map = l;
        map;
        JVM INSTR monitorenter ;
        for (Iterator iterator = l.values().iterator(); iterator.hasNext(); ((y)iterator.next()).a(this)) { }
        break MISSING_BLOCK_LABEL_100;
        Exception exception;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
        map;
        JVM INSTR monitorexit ;
        super.d();
        return;
    }
}
