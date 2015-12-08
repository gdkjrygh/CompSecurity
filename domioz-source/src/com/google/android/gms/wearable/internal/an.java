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
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.z;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.k;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            o, p, q, r, 
//            l, n, ao, k, 
//            al

public final class an extends k
{

    private final ExecutorService d = Executors.newCachedThreadPool();
    private final com.google.android.gms.wearable.internal.n e = new com.google.android.gms.wearable.internal.o();
    private final com.google.android.gms.wearable.internal.n f = new p();
    private final com.google.android.gms.wearable.internal.n g = new q();
    private final com.google.android.gms.wearable.internal.n h = new r();

    public an(Context context, Looper looper, n n1, o o1, h h1)
    {
        super(context, looper, 14, n1, o1, h1);
    }

    protected final IInterface a(IBinder ibinder)
    {
        return l.a(ibinder);
    }

    protected final void a(int i, IBinder ibinder, Bundle bundle)
    {
        if (Log.isLoggable("WearableClient", 2))
        {
            Log.d("WearableClient", (new StringBuilder("onPostInitHandler: statusCode ")).append(i).toString());
        }
        if (i == 0)
        {
            e.a(ibinder);
            f.a(ibinder);
            g.a(ibinder);
            h.a(ibinder);
        }
        super.a(i, ibinder, bundle);
    }

    public final void a(z z, PutDataRequest putdatarequest)
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
                catch (z z)
                {
                    throw new IllegalStateException((new StringBuilder("Unable to create ParcelFileDescriptor for asset in request: ")).append(putdatarequest).toString(), z);
                }
                if (Log.isLoggable("WearableClient", 3))
                {
                    Log.d("WearableClient", (new StringBuilder("processAssets: replacing data with FD in asset: ")).append(asset1).append(" read:").append(aparcelfiledescriptor[0]).append(" write:").append(aparcelfiledescriptor[1]).toString());
                }
                putdatarequest1.a((String)((java.util.Map.Entry) (obj)).getKey(), Asset.a(aparcelfiledescriptor[0]));
                obj = new FutureTask(new ao(this, aparcelfiledescriptor[1], asset1.a()));
                arraylist.add(obj);
                d.submit(((Runnable) (obj)));
            }
        }

        try
        {
            ((com.google.android.gms.wearable.internal.k)l()).a(new al(z, arraylist), putdatarequest1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (z z)
        {
            throw new IllegalStateException((new StringBuilder("Unable to putDataItem: ")).append(putdatarequest).toString(), z);
        }
    }

    public final void b()
    {
        e.a(this);
        f.a(this);
        g.a(this);
        h.a(this);
        super.b();
    }

    protected final String e()
    {
        return "com.google.android.gms.wearable.BIND";
    }

    protected final String f()
    {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }
}
