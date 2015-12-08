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
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataItemAsset;
import com.google.android.gms.wearable.DataItemBuffer;
import com.google.android.gms.wearable.PutDataRequest;
import java.io.IOException;
import java.util.ArrayList;
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
//            b, ax, af, ae, 
//            aq, a, ao, v, 
//            x, p, as, z, 
//            ab

public class aw extends e
{
    private static class a extends com.google.android.gms.wearable.internal.a
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;
        private final List avW;

        public void a(ao ao1)
        {
            De.b(new f.a(new Status(ao1.statusCode), ao1.avA));
            if (ao1.statusCode != 0)
            {
                for (ao1 = avW.iterator(); ao1.hasNext(); ((FutureTask)ao1.next()).cancel(true)) { }
            }
        }

        a(com.google.android.gms.common.api.BaseImplementation.b b1, List list)
        {
            De = b1;
            avW = list;
        }
    }


    private final ExecutorService aqA = Executors.newCachedThreadPool();
    private final HashMap avQ = new HashMap();
    private final HashMap avR = new HashMap();
    private final HashMap avS = new HashMap();

    public aw(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, new String[0]);
    }

    private FutureTask a(ParcelFileDescriptor parcelfiledescriptor, byte abyte0[])
    {
        return new FutureTask(new Callable(parcelfiledescriptor, abyte0) {

            final byte CY[];
            final aw avT;
            final ParcelFileDescriptor avU;

            public Object call()
                throws Exception
            {
                return qa();
            }

            public Boolean qa()
            {
                android.os.ParcelFileDescriptor.AutoCloseOutputStream autocloseoutputstream;
                if (Log.isLoggable("WearableClient", 3))
                {
                    Log.d("WearableClient", (new StringBuilder()).append("processAssets: writing data to FD : ").append(avU).toString());
                }
                autocloseoutputstream = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(avU);
                Object obj;
                autocloseoutputstream.write(CY);
                autocloseoutputstream.flush();
                if (Log.isLoggable("WearableClient", 3))
                {
                    Log.d("WearableClient", (new StringBuilder()).append("processAssets: wrote data: ").append(avU).toString());
                }
                obj = Boolean.valueOf(true);
                IOException ioexception;
                try
                {
                    if (Log.isLoggable("WearableClient", 3))
                    {
                        Log.d("WearableClient", (new StringBuilder()).append("processAssets: closing: ").append(avU).toString());
                    }
                    autocloseoutputstream.close();
                }
                catch (IOException ioexception1)
                {
                    return ((Boolean) (obj));
                }
                return ((Boolean) (obj));
                obj;
                Log.w("WearableClient", (new StringBuilder()).append("processAssets: writing data failed: ").append(avU).toString());
                try
                {
                    if (Log.isLoggable("WearableClient", 3))
                    {
                        Log.d("WearableClient", (new StringBuilder()).append("processAssets: closing: ").append(avU).toString());
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
                        Log.d("WearableClient", (new StringBuilder()).append("processAssets: closing: ").append(avU).toString());
                    }
                    autocloseoutputstream.close();
                }
                // Misplaced declaration of an exception variable
                catch (IOException ioexception) { }
                throw obj;
            }

            
            {
                avT = aw.this;
                avU = parcelfiledescriptor;
                CY = abyte0;
                super();
            }
        });
    }

    static HashMap b(aw aw1)
    {
        return aw1.avQ;
    }

    static HashMap c(aw aw1)
    {
        return aw1.avR;
    }

    static HashMap d(aw aw1)
    {
        return aw1.avS;
    }

    protected void a(int i, IBinder ibinder, Bundle bundle)
    {
        if (Log.isLoggable("WearableClient", 2))
        {
            Log.d("WearableClient", (new StringBuilder()).append("onPostInitHandler: statusCode ").append(i).toString());
        }
        if (i != 0) goto _L2; else goto _L1
_L1:
        Object obj;
        af af1;
        obj = new com.google.android.gms.wearable.internal.a() {

            final aw avT;

            public void a(Status status)
            {
            }

            
            {
                avT = aw.this;
                super();
            }
        };
        if (Log.isLoggable("WearableClient", 2))
        {
            Log.d("WearableClient", (new StringBuilder()).append("onPostInitHandler: service ").append(ibinder).toString());
        }
        af1 = af.a.bT(ibinder);
        java.util.Map.Entry entry;
        for (Iterator iterator = avQ.entrySet().iterator(); iterator.hasNext(); af1.a(((ad) (obj)), new b((ax)entry.getValue())))
        {
            entry = (java.util.Map.Entry)iterator.next();
            if (Log.isLoggable("WearableClient", 2))
            {
                Log.d("WearableClient", (new StringBuilder()).append("onPostInitHandler: adding Data listener ").append(entry.getValue()).toString());
            }
        }

          goto _L3
_L2:
        Log.d("WearableClient", "WearableClientImpl.onPostInitHandler: done");
        super.a(i, ibinder, bundle);
        return;
_L3:
        java.util.Map.Entry entry1;
        for (Iterator iterator1 = avR.entrySet().iterator(); iterator1.hasNext(); af1.a(((ad) (obj)), new b((ax)entry1.getValue())))
        {
            entry1 = (java.util.Map.Entry)iterator1.next();
            if (Log.isLoggable("WearableClient", 2))
            {
                Log.d("WearableClient", (new StringBuilder()).append("onPostInitHandler: adding Message listener ").append(entry1.getValue()).toString());
            }
        }

        try
        {
            Iterator iterator2 = avS.entrySet().iterator();
            while (iterator2.hasNext()) 
            {
                java.util.Map.Entry entry2 = (java.util.Map.Entry)iterator2.next();
                if (Log.isLoggable("WearableClient", 2))
                {
                    Log.d("WearableClient", (new StringBuilder()).append("onPostInitHandler: adding Node listener ").append(entry2.getValue()).toString());
                }
                af1.a(((ad) (obj)), new b((ax)entry2.getValue()));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.d("WearableClient", "WearableClientImpl.onPostInitHandler: error while adding listener", ((Throwable) (obj)));
        }
        if (true) goto _L2; else goto _L4
_L4:
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, Uri uri)
        throws RemoteException
    {
        ((af)gS()).a(new com.google.android.gms.wearable.internal.a(b1) {

            final aw avT;
            final com.google.android.gms.common.api.BaseImplementation.b avV;

            public void a(x x1)
            {
                avV.b(new f.a(new Status(x1.statusCode), x1.avA));
            }

            
            {
                avT = aw.this;
                avV = b1;
                super();
            }
        }, uri);
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, Asset asset)
        throws RemoteException
    {
        ((af)gS()).a(new com.google.android.gms.wearable.internal.a(b1) {

            final aw avT;
            final com.google.android.gms.common.api.BaseImplementation.b avV;

            public void a(z z1)
            {
                avV.b(new f.c(new Status(z1.statusCode), z1.avB));
            }

            
            {
                avT = aw.this;
                avV = b1;
                super();
            }
        }, asset);
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, com.google.android.gms.wearable.DataApi.DataListener datalistener)
        throws RemoteException
    {
        synchronized (avQ)
        {
            datalistener = (ae)avQ.remove(datalistener);
        }
        if (datalistener == null)
        {
            b1.b(new Status(4002));
            return;
        } else
        {
            a(b1, ((ae) (datalistener)));
            return;
        }
        b1;
        hashmap;
        JVM INSTR monitorexit ;
        throw b1;
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, com.google.android.gms.wearable.DataApi.DataListener datalistener, IntentFilter aintentfilter[])
        throws RemoteException
    {
        ax ax1;
label0:
        {
            ax1 = ax.a(datalistener, aintentfilter);
            synchronized (avQ)
            {
                if (avQ.get(datalistener) == null)
                {
                    break label0;
                }
                b1.b(new Status(4001));
            }
            return;
        }
        avQ.put(datalistener, ax1);
        aintentfilter;
        JVM INSTR monitorexit ;
        ((af)gS()).a(new com.google.android.gms.wearable.internal.a(datalistener, b1) {

            final aw avT;
            final com.google.android.gms.common.api.BaseImplementation.b avV;
            final com.google.android.gms.wearable.DataApi.DataListener avq;

            public void a(Status status)
            {
                if (!status.isSuccess())
                {
                    synchronized (aw.b(avT))
                    {
                        aw.b(avT).remove(avq);
                    }
                }
                avV.b(status);
                return;
                status;
                hashmap;
                JVM INSTR monitorexit ;
                throw status;
            }

            
            {
                avT = aw.this;
                avq = datalistener;
                avV = b1;
                super();
            }
        }, new b(ax1));
        return;
        b1;
        aintentfilter;
        JVM INSTR monitorexit ;
        throw b1;
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, DataItemAsset dataitemasset)
        throws RemoteException
    {
        a(b1, Asset.createFromRef(dataitemasset.getId()));
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener)
        throws RemoteException
    {
        HashMap hashmap = avR;
        hashmap;
        JVM INSTR monitorenter ;
        messagelistener = (ae)avR.remove(messagelistener);
        if (messagelistener != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        b1.b(new Status(4002));
_L2:
        hashmap;
        JVM INSTR monitorexit ;
        return;
        a(b1, ((ae) (messagelistener)));
        if (true) goto _L2; else goto _L1
_L1:
        b1;
        hashmap;
        JVM INSTR monitorexit ;
        throw b1;
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener, IntentFilter aintentfilter[])
        throws RemoteException
    {
        ax ax1;
label0:
        {
            ax1 = ax.a(messagelistener, aintentfilter);
            synchronized (avR)
            {
                if (avR.get(messagelistener) == null)
                {
                    break label0;
                }
                b1.b(new Status(4001));
            }
            return;
        }
        avR.put(messagelistener, ax1);
        aintentfilter;
        JVM INSTR monitorexit ;
        ((af)gS()).a(new com.google.android.gms.wearable.internal.a(messagelistener, b1) {

            final com.google.android.gms.wearable.MessageApi.MessageListener avG;
            final aw avT;
            final com.google.android.gms.common.api.BaseImplementation.b avV;

            public void a(Status status)
            {
                if (!status.isSuccess())
                {
                    synchronized (aw.c(avT))
                    {
                        aw.c(avT).remove(avG);
                    }
                }
                avV.b(status);
                return;
                status;
                hashmap;
                JVM INSTR monitorexit ;
                throw status;
            }

            
            {
                avT = aw.this;
                avG = messagelistener;
                avV = b1;
                super();
            }
        }, new b(ax1));
        return;
        b1;
        aintentfilter;
        JVM INSTR monitorexit ;
        throw b1;
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
        throws RemoteException, RemoteException
    {
        ax ax1;
label0:
        {
            ax1 = ax.a(nodelistener);
            synchronized (avS)
            {
                if (avS.get(nodelistener) == null)
                {
                    break label0;
                }
                b1.b(new Status(4001));
            }
            return;
        }
        avS.put(nodelistener, ax1);
        hashmap;
        JVM INSTR monitorexit ;
        ((af)gS()).a(new com.google.android.gms.wearable.internal.a(nodelistener, b1) {

            final com.google.android.gms.wearable.NodeApi.NodeListener avK;
            final aw avT;
            final com.google.android.gms.common.api.BaseImplementation.b avV;

            public void a(Status status)
            {
                if (!status.isSuccess())
                {
                    synchronized (aw.d(avT))
                    {
                        aw.d(avT).remove(avK);
                    }
                }
                avV.b(status);
                return;
                status;
                hashmap1;
                JVM INSTR monitorexit ;
                throw status;
            }

            
            {
                avT = aw.this;
                avK = nodelistener;
                avV = b1;
                super();
            }
        }, new b(ax1));
        return;
        b1;
        hashmap;
        JVM INSTR monitorexit ;
        throw b1;
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
                aqA.submit(((Runnable) (obj)));
            }
        }

        try
        {
            ((af)gS()).a(new a(b1, arraylist), putdatarequest1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            throw new IllegalStateException((new StringBuilder()).append("Unable to putDataItem: ").append(putdatarequest).toString(), b1);
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, ae ae1)
        throws RemoteException
    {
        ((af)gS()).a(new com.google.android.gms.wearable.internal.a(b1) {

            final aw avT;
            final com.google.android.gms.common.api.BaseImplementation.b avV;

            public void a(Status status)
            {
                avV.b(status);
            }

            
            {
                avT = aw.this;
                avV = b1;
                super();
            }
        }, new aq(ae1));
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s, String s1, byte abyte0[])
        throws RemoteException
    {
        ((af)gS()).a(new com.google.android.gms.wearable.internal.a(b1) {

            final aw avT;
            final com.google.android.gms.common.api.BaseImplementation.b avV;

            public void a(as as1)
            {
                avV.b(new ag.a(new Status(as1.statusCode), as1.avO));
            }

            
            {
                avT = aw.this;
                avV = b1;
                super();
            }
        }, s, s1, abyte0);
    }

    protected void a(l l1, com.google.android.gms.common.internal.e.e e1)
        throws RemoteException
    {
        l1.e(e1, 0x5e2978, getContext().getPackageName());
    }

    public void b(com.google.android.gms.common.api.BaseImplementation.b b1, Uri uri)
        throws RemoteException
    {
        ((af)gS()).b(new com.google.android.gms.wearable.internal.a(b1) {

            final aw avT;
            final com.google.android.gms.common.api.BaseImplementation.b avV;

            public void aa(DataHolder dataholder)
            {
                avV.b(new DataItemBuffer(dataholder));
            }

            
            {
                avT = aw.this;
                avV = b1;
                super();
            }
        }, uri);
    }

    public void b(com.google.android.gms.common.api.BaseImplementation.b b1, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
        throws RemoteException
    {
        HashMap hashmap = avS;
        hashmap;
        JVM INSTR monitorenter ;
        nodelistener = (ae)avS.remove(nodelistener);
        if (nodelistener != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        b1.b(new Status(4002));
_L2:
        hashmap;
        JVM INSTR monitorexit ;
        return;
        a(b1, nodelistener);
        if (true) goto _L2; else goto _L1
_L1:
        b1;
        hashmap;
        JVM INSTR monitorexit ;
        throw b1;
    }

    protected af bU(IBinder ibinder)
    {
        return af.a.bT(ibinder);
    }

    public void c(com.google.android.gms.common.api.BaseImplementation.b b1, Uri uri)
        throws RemoteException
    {
        ((af)gS()).c(new com.google.android.gms.wearable.internal.a(b1) {

            final aw avT;
            final com.google.android.gms.common.api.BaseImplementation.b avV;

            public void a(p p1)
            {
                avV.b(new f.b(new Status(p1.statusCode), p1.avw));
            }

            
            {
                avT = aw.this;
                avV = b1;
                super();
            }
        }, uri);
    }

    public void disconnect()
    {
        super.disconnect();
        avQ.clear();
        avR.clear();
        avS.clear();
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.wearable.BIND";
    }

    protected IInterface j(IBinder ibinder)
    {
        return bU(ibinder);
    }

    public void o(com.google.android.gms.common.api.BaseImplementation.b b1)
        throws RemoteException
    {
        ((af)gS()).b(new com.google.android.gms.wearable.internal.a(b1) {

            final aw avT;
            final com.google.android.gms.common.api.BaseImplementation.b avV;

            public void aa(DataHolder dataholder)
            {
                avV.b(new DataItemBuffer(dataholder));
            }

            
            {
                avT = aw.this;
                avV = b1;
                super();
            }
        });
    }

    public void p(com.google.android.gms.common.api.BaseImplementation.b b1)
        throws RemoteException
    {
        ((af)gS()).c(new com.google.android.gms.wearable.internal.a(b1) {

            final aw avT;
            final com.google.android.gms.common.api.BaseImplementation.b avV;

            public void a(ab ab1)
            {
                avV.b(new aj.b(new Status(ab1.statusCode), ab1.avC));
            }

            
            {
                avT = aw.this;
                avV = b1;
                super();
            }
        });
    }

    public void q(com.google.android.gms.common.api.BaseImplementation.b b1)
        throws RemoteException
    {
        ((af)gS()).d(new com.google.android.gms.wearable.internal.a(b1) {

            final aw avT;
            final com.google.android.gms.common.api.BaseImplementation.b avV;

            public void a(v v1)
            {
                ArrayList arraylist = new ArrayList();
                arraylist.addAll(v1.avz);
                avV.b(new aj.a(new Status(v1.statusCode), arraylist));
            }

            
            {
                avT = aw.this;
                avV = b1;
                super();
            }
        });
    }
}
