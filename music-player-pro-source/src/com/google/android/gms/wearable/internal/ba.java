// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.jl;
import com.google.android.gms.internal.jt;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataItemAsset;
import com.google.android.gms.wearable.PutDataRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ag, af

public class ba extends jl
{

    private final ExecutorService asJ = Executors.newCachedThreadPool();
    private final ag ayg = new ag.b();
    private final ag ayh = new ag.c();
    private final ag ayi = new ag.d();

    public ba(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, new String[0]);
    }

    private FutureTask a(ParcelFileDescriptor parcelfiledescriptor, byte abyte0[])
    {
        return new FutureTask(new Callable(parcelfiledescriptor, abyte0) {

            final byte DU[];
            final ParcelFileDescriptor ayj;
            final ba ayk;

            public Object call()
                throws Exception
            {
                return rr();
            }

            public Boolean rr()
            {
                android.os.ParcelFileDescriptor.AutoCloseOutputStream autocloseoutputstream;
                if (Log.isLoggable("WearableClient", 3))
                {
                    Log.d("WearableClient", (new StringBuilder()).append("processAssets: writing data to FD : ").append(ayj).toString());
                }
                autocloseoutputstream = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(ayj);
                Object obj;
                autocloseoutputstream.write(DU);
                autocloseoutputstream.flush();
                if (Log.isLoggable("WearableClient", 3))
                {
                    Log.d("WearableClient", (new StringBuilder()).append("processAssets: wrote data: ").append(ayj).toString());
                }
                obj = Boolean.valueOf(true);
                IOException ioexception;
                try
                {
                    if (Log.isLoggable("WearableClient", 3))
                    {
                        Log.d("WearableClient", (new StringBuilder()).append("processAssets: closing: ").append(ayj).toString());
                    }
                    autocloseoutputstream.close();
                }
                catch (IOException ioexception1)
                {
                    return ((Boolean) (obj));
                }
                return ((Boolean) (obj));
                obj;
                Log.w("WearableClient", (new StringBuilder()).append("processAssets: writing data failed: ").append(ayj).toString());
                try
                {
                    if (Log.isLoggable("WearableClient", 3))
                    {
                        Log.d("WearableClient", (new StringBuilder()).append("processAssets: closing: ").append(ayj).toString());
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
                        Log.d("WearableClient", (new StringBuilder()).append("processAssets: closing: ").append(ayj).toString());
                    }
                    autocloseoutputstream.close();
                }
                // Misplaced declaration of an exception variable
                catch (IOException ioexception) { }
                throw obj;
            }

            
            {
                ayk = ba.this;
                ayj = parcelfiledescriptor;
                DU = abyte0;
                super();
            }
        });
    }

    protected void a(int i, IBinder ibinder, Bundle bundle)
    {
        if (Log.isLoggable("WearableClient", 2))
        {
            Log.d("WearableClient", (new StringBuilder()).append("onPostInitHandler: statusCode ").append(i).toString());
        }
        if (i == 0)
        {
            ayg.ca(ibinder);
            ayh.ca(ibinder);
            ayi.ca(ibinder);
        }
        super.a(i, ibinder, bundle);
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, Uri uri)
        throws RemoteException
    {
        ((af)hw()).a(new az.d(b1), uri);
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, Asset asset)
        throws RemoteException
    {
        ((af)hw()).a(new az.f(b1), asset);
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, com.google.android.gms.wearable.DataApi.DataListener datalistener)
        throws RemoteException
    {
        ayg.a(this, b1, datalistener);
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, com.google.android.gms.wearable.DataApi.DataListener datalistener, IntentFilter aintentfilter[])
        throws RemoteException
    {
        ayg.a(this, b1, datalistener, aintentfilter);
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, DataItemAsset dataitemasset)
        throws RemoteException
    {
        a(b1, Asset.createFromRef(dataitemasset.getId()));
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener)
        throws RemoteException
    {
        ayh.a(this, b1, messagelistener);
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener, IntentFilter aintentfilter[])
        throws RemoteException
    {
        ayh.a(this, b1, messagelistener, aintentfilter);
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
        throws RemoteException, RemoteException
    {
        ayi.a(this, b1, nodelistener, null);
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, PutDataRequest putdatarequest)
        throws RemoteException
    {
        for (Iterator iterator = putdatarequest.getAssets().entrySet().iterator(); iterator.hasNext();)
        {
            Asset asset = (Asset)((java.util.Map.Entry)iterator.next()).getValue();
            if (asset.getData() == null && asset.getDigest() == null && asset.getFd() == null && asset.getUri() == null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Put for ").append(putdatarequest.getUri()).append(" contains invalid asset: ").append(asset).toString());
            }
        }

        PutDataRequest putdatarequest1 = PutDataRequest.k(putdatarequest.getUri());
        putdatarequest1.setData(putdatarequest.getData());
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator1 = putdatarequest.getAssets().entrySet().iterator(); iterator1.hasNext();)
        {
            Object obj = (java.util.Map.Entry)iterator1.next();
            Asset asset1 = (Asset)((java.util.Map.Entry) (obj)).getValue();
            if (asset1.getData() == null)
            {
                putdatarequest1.putAsset((String)((java.util.Map.Entry) (obj)).getKey(), (Asset)((java.util.Map.Entry) (obj)).getValue());
            } else
            {
                ParcelFileDescriptor aparcelfiledescriptor[];
                try
                {
                    aparcelfiledescriptor = ParcelFileDescriptor.createPipe();
                }
                // Misplaced declaration of an exception variable
                catch (com.google.android.gms.common.api.BaseImplementation.b b1)
                {
                    throw new IllegalStateException((new StringBuilder()).append("Unable to create ParcelFileDescriptor for asset in request: ").append(putdatarequest).toString(), b1);
                }
                if (Log.isLoggable("WearableClient", 3))
                {
                    Log.d("WearableClient", (new StringBuilder()).append("processAssets: replacing data with FD in asset: ").append(asset1).append(" read:").append(aparcelfiledescriptor[0]).append(" write:").append(aparcelfiledescriptor[1]).toString());
                }
                putdatarequest1.putAsset((String)((java.util.Map.Entry) (obj)).getKey(), Asset.createFromFd(aparcelfiledescriptor[0]));
                obj = a(aparcelfiledescriptor[1], asset1.getData());
                arraylist.add(obj);
                asJ.submit(((Runnable) (obj)));
            }
        }

        try
        {
            ((af)hw()).a(new az.i(b1, arraylist), putdatarequest1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            throw new IllegalStateException((new StringBuilder()).append("Unable to putDataItem: ").append(putdatarequest).toString(), b1);
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s, String s1, byte abyte0[])
        throws RemoteException
    {
        ((af)hw()).a(new az.j(b1), s, s1, abyte0);
    }

    protected void a(jt jt1, com.google.android.gms.internal.jl.e e)
        throws RemoteException
    {
        jt1.e(e, 0x648278, getContext().getPackageName());
    }

    public void b(com.google.android.gms.common.api.BaseImplementation.b b1, Uri uri)
        throws RemoteException
    {
        ((af)hw()).b(new az.e(b1), uri);
    }

    public void b(com.google.android.gms.common.api.BaseImplementation.b b1, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
        throws RemoteException
    {
        ayi.a(this, b1, nodelistener);
    }

    protected String bK()
    {
        return "com.google.android.gms.wearable.BIND";
    }

    protected String bL()
    {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    public void c(com.google.android.gms.common.api.BaseImplementation.b b1, Uri uri)
        throws RemoteException
    {
        ((af)hw()).c(new az.b(b1), uri);
    }

    protected af cb(IBinder ibinder)
    {
        return af.a.bZ(ibinder);
    }

    public void disconnect()
    {
        ayg.b(this);
        ayh.b(this);
        ayi.b(this);
        super.disconnect();
    }

    protected IInterface l(IBinder ibinder)
    {
        return cb(ibinder);
    }

    public void n(com.google.android.gms.common.api.BaseImplementation.b b1)
        throws RemoteException
    {
        ((af)hw()).b(new az.e(b1));
    }

    public void o(com.google.android.gms.common.api.BaseImplementation.b b1)
        throws RemoteException
    {
        ((af)hw()).c(new az.g(b1));
    }

    public void p(com.google.android.gms.common.api.BaseImplementation.b b1)
        throws RemoteException
    {
        ((af)hw()).d(new az.c(b1));
    }
}
