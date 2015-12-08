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
import com.google.android.gms.internal.hb;
import com.google.android.gms.internal.hi;
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
//            b, av, ad, ac, 
//            ao, a, am, v, 
//            p, aq, x, z, 
//            t

public class au extends hb
{
    private static class a extends com.google.android.gms.wearable.internal.a
    {

        private final List amk;
        private final com.google.android.gms.common.api.a.d yR;

        public void a(am am1)
        {
            yR.a(new f.a(new Status(am1.statusCode), am1.alO));
            if (am1.statusCode != 0)
            {
                for (am1 = amk.iterator(); am1.hasNext(); ((FutureTask)am1.next()).cancel(true)) { }
            }
        }

        a(com.google.android.gms.common.api.a.d d1, List list)
        {
            yR = d1;
            amk = list;
        }
    }


    private final ExecutorService agU = Executors.newCachedThreadPool();
    private final HashMap ame = new HashMap();
    private final HashMap amf = new HashMap();
    private final HashMap amg = new HashMap();

    public au(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, new String[0]);
    }

    private FutureTask a(ParcelFileDescriptor parcelfiledescriptor, byte abyte0[])
    {
        return new FutureTask(new Callable(parcelfiledescriptor, abyte0) {

            final au amh;
            final ParcelFileDescriptor amj;
            final byte yL[];

            public Object call()
                throws Exception
            {
                return nt();
            }

            public Boolean nt()
            {
                android.os.ParcelFileDescriptor.AutoCloseOutputStream autocloseoutputstream;
                if (Log.isLoggable("WearableClient", 3))
                {
                    Log.d("WearableClient", (new StringBuilder()).append("processAssets: writing data to FD : ").append(amj).toString());
                }
                autocloseoutputstream = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(amj);
                Object obj;
                autocloseoutputstream.write(yL);
                autocloseoutputstream.flush();
                if (Log.isLoggable("WearableClient", 3))
                {
                    Log.d("WearableClient", (new StringBuilder()).append("processAssets: wrote data: ").append(amj).toString());
                }
                obj = Boolean.valueOf(true);
                IOException ioexception;
                try
                {
                    if (Log.isLoggable("WearableClient", 3))
                    {
                        Log.d("WearableClient", (new StringBuilder()).append("processAssets: closing: ").append(amj).toString());
                    }
                    autocloseoutputstream.close();
                }
                catch (IOException ioexception1)
                {
                    return ((Boolean) (obj));
                }
                return ((Boolean) (obj));
                obj;
                Log.w("WearableClient", (new StringBuilder()).append("processAssets: writing data failed: ").append(amj).toString());
                try
                {
                    if (Log.isLoggable("WearableClient", 3))
                    {
                        Log.d("WearableClient", (new StringBuilder()).append("processAssets: closing: ").append(amj).toString());
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
                        Log.d("WearableClient", (new StringBuilder()).append("processAssets: closing: ").append(amj).toString());
                    }
                    autocloseoutputstream.close();
                }
                // Misplaced declaration of an exception variable
                catch (IOException ioexception) { }
                throw obj;
            }

            
            {
                amh = au.this;
                amj = parcelfiledescriptor;
                yL = abyte0;
                super();
            }
        });
    }

    static HashMap b(au au1)
    {
        return au1.ame;
    }

    static HashMap c(au au1)
    {
        return au1.amf;
    }

    static HashMap d(au au1)
    {
        return au1.amg;
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
        ad ad1;
        obj = new com.google.android.gms.wearable.internal.a() {

            final au amh;

            public void a(Status status)
            {
            }

            
            {
                amh = au.this;
                super();
            }
        };
        if (Log.isLoggable("WearableClient", 2))
        {
            Log.d("WearableClient", (new StringBuilder()).append("onPostInitHandler: service ").append(ibinder).toString());
        }
        ad1 = ad.a.by(ibinder);
        java.util.Map.Entry entry;
        for (Iterator iterator = ame.entrySet().iterator(); iterator.hasNext(); ad1.a(((ab) (obj)), new b((av)entry.getValue())))
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
        for (Iterator iterator1 = amf.entrySet().iterator(); iterator1.hasNext(); ad1.a(((ab) (obj)), new b((av)entry1.getValue())))
        {
            entry1 = (java.util.Map.Entry)iterator1.next();
            if (Log.isLoggable("WearableClient", 2))
            {
                Log.d("WearableClient", (new StringBuilder()).append("onPostInitHandler: adding Message listener ").append(entry1.getValue()).toString());
            }
        }

        try
        {
            Iterator iterator2 = amg.entrySet().iterator();
            while (iterator2.hasNext()) 
            {
                java.util.Map.Entry entry2 = (java.util.Map.Entry)iterator2.next();
                if (Log.isLoggable("WearableClient", 2))
                {
                    Log.d("WearableClient", (new StringBuilder()).append("onPostInitHandler: adding Node listener ").append(entry2.getValue()).toString());
                }
                ad1.a(((ab) (obj)), new b((av)entry2.getValue()));
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

    public void a(com.google.android.gms.common.api.a.d d1, Uri uri)
        throws RemoteException
    {
        ((ad)ft()).a(new com.google.android.gms.wearable.internal.a(d1) {

            final au amh;
            final com.google.android.gms.common.api.a.d ami;

            public void a(v v1)
            {
                ami.a(new f.a(new Status(v1.statusCode), v1.alO));
            }

            
            {
                amh = au.this;
                ami = d1;
                super();
            }
        }, uri);
    }

    public void a(com.google.android.gms.common.api.a.d d1, Asset asset)
        throws RemoteException
    {
        ((ad)ft()).a(new com.google.android.gms.wearable.internal.a(d1) {

            final au amh;
            final com.google.android.gms.common.api.a.d ami;

            public void a(x x1)
            {
                ami.a(new f.c(new Status(x1.statusCode), x1.alP));
            }

            
            {
                amh = au.this;
                ami = d1;
                super();
            }
        }, asset);
    }

    public void a(com.google.android.gms.common.api.a.d d1, com.google.android.gms.wearable.DataApi.DataListener datalistener)
        throws RemoteException
    {
        synchronized (ame)
        {
            datalistener = (ac)ame.remove(datalistener);
        }
        if (datalistener == null)
        {
            d1.a(new Status(4002));
            return;
        } else
        {
            a(d1, ((ac) (datalistener)));
            return;
        }
        d1;
        hashmap;
        JVM INSTR monitorexit ;
        throw d1;
    }

    public void a(com.google.android.gms.common.api.a.d d1, com.google.android.gms.wearable.DataApi.DataListener datalistener, IntentFilter aintentfilter[])
        throws RemoteException
    {
        av av1;
label0:
        {
            av1 = av.a(datalistener, aintentfilter);
            synchronized (ame)
            {
                if (ame.get(datalistener) == null)
                {
                    break label0;
                }
                d1.a(new Status(4001));
            }
            return;
        }
        ame.put(datalistener, av1);
        aintentfilter;
        JVM INSTR monitorexit ;
        ((ad)ft()).a(new com.google.android.gms.wearable.internal.a(datalistener, d1) {

            final com.google.android.gms.wearable.DataApi.DataListener alF;
            final au amh;
            final com.google.android.gms.common.api.a.d ami;

            public void a(Status status)
            {
                if (!status.isSuccess())
                {
                    synchronized (au.b(amh))
                    {
                        au.b(amh).remove(alF);
                    }
                }
                ami.a(status);
                return;
                status;
                hashmap;
                JVM INSTR monitorexit ;
                throw status;
            }

            
            {
                amh = au.this;
                alF = datalistener;
                ami = d1;
                super();
            }
        }, new b(av1));
        return;
        d1;
        aintentfilter;
        JVM INSTR monitorexit ;
        throw d1;
    }

    public void a(com.google.android.gms.common.api.a.d d1, DataItemAsset dataitemasset)
        throws RemoteException
    {
        a(d1, Asset.createFromRef(dataitemasset.getId()));
    }

    public void a(com.google.android.gms.common.api.a.d d1, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener)
        throws RemoteException
    {
        HashMap hashmap = amf;
        hashmap;
        JVM INSTR monitorenter ;
        messagelistener = (ac)amf.remove(messagelistener);
        if (messagelistener != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        d1.a(new Status(4002));
_L2:
        hashmap;
        JVM INSTR monitorexit ;
        return;
        a(d1, ((ac) (messagelistener)));
        if (true) goto _L2; else goto _L1
_L1:
        d1;
        hashmap;
        JVM INSTR monitorexit ;
        throw d1;
    }

    public void a(com.google.android.gms.common.api.a.d d1, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener, IntentFilter aintentfilter[])
        throws RemoteException
    {
        av av1;
label0:
        {
            av1 = av.a(messagelistener, aintentfilter);
            synchronized (amf)
            {
                if (amf.get(messagelistener) == null)
                {
                    break label0;
                }
                d1.a(new Status(4001));
            }
            return;
        }
        amf.put(messagelistener, av1);
        aintentfilter;
        JVM INSTR monitorexit ;
        ((ad)ft()).a(new com.google.android.gms.wearable.internal.a(messagelistener, d1) {

            final com.google.android.gms.wearable.MessageApi.MessageListener alU;
            final au amh;
            final com.google.android.gms.common.api.a.d ami;

            public void a(Status status)
            {
                if (!status.isSuccess())
                {
                    synchronized (au.c(amh))
                    {
                        au.c(amh).remove(alU);
                    }
                }
                ami.a(status);
                return;
                status;
                hashmap;
                JVM INSTR monitorexit ;
                throw status;
            }

            
            {
                amh = au.this;
                alU = messagelistener;
                ami = d1;
                super();
            }
        }, new b(av1));
        return;
        d1;
        aintentfilter;
        JVM INSTR monitorexit ;
        throw d1;
    }

    public void a(com.google.android.gms.common.api.a.d d1, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
        throws RemoteException, RemoteException
    {
        av av1;
label0:
        {
            av1 = av.a(nodelistener);
            synchronized (amg)
            {
                if (amg.get(nodelistener) == null)
                {
                    break label0;
                }
                d1.a(new Status(4001));
            }
            return;
        }
        amg.put(nodelistener, av1);
        hashmap;
        JVM INSTR monitorexit ;
        ((ad)ft()).a(new com.google.android.gms.wearable.internal.a(nodelistener, d1) {

            final com.google.android.gms.wearable.NodeApi.NodeListener alY;
            final au amh;
            final com.google.android.gms.common.api.a.d ami;

            public void a(Status status)
            {
                if (!status.isSuccess())
                {
                    synchronized (au.d(amh))
                    {
                        au.d(amh).remove(alY);
                    }
                }
                ami.a(status);
                return;
                status;
                hashmap1;
                JVM INSTR monitorexit ;
                throw status;
            }

            
            {
                amh = au.this;
                alY = nodelistener;
                ami = d1;
                super();
            }
        }, new b(av1));
        return;
        d1;
        hashmap;
        JVM INSTR monitorexit ;
        throw d1;
    }

    public void a(com.google.android.gms.common.api.a.d d1, PutDataRequest putdatarequest)
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
                catch (com.google.android.gms.common.api.a.d d1)
                {
                    throw new IllegalStateException((new StringBuilder()).append("Unable to create ParcelFileDescriptor for asset in request: ").append(putdatarequest).toString(), d1);
                }
                if (Log.isLoggable("WearableClient", 3))
                {
                    Log.d("WearableClient", (new StringBuilder()).append("processAssets: replacing data with FD in asset: ").append(asset1).append(" read:").append(aparcelfiledescriptor[0]).append(" write:").append(aparcelfiledescriptor[1]).toString());
                }
                putdatarequest1.putAsset((String)((java.util.Map.Entry) (obj)).getKey(), Asset.createFromFd(aparcelfiledescriptor[0]));
                obj = a(aparcelfiledescriptor[1], asset1.getData());
                arraylist.add(obj);
                agU.submit(((Runnable) (obj)));
            }
        }

        try
        {
            ((ad)ft()).a(new a(d1, arraylist), putdatarequest1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            throw new IllegalStateException((new StringBuilder()).append("Unable to putDataItem: ").append(putdatarequest).toString(), d1);
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, ac ac1)
        throws RemoteException
    {
        ((ad)ft()).a(new com.google.android.gms.wearable.internal.a(d1) {

            final au amh;
            final com.google.android.gms.common.api.a.d ami;

            public void a(Status status)
            {
                ami.a(status);
            }

            
            {
                amh = au.this;
                ami = d1;
                super();
            }
        }, new ao(ac1));
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, String s1, byte abyte0[])
        throws RemoteException
    {
        ((ad)ft()).a(new com.google.android.gms.wearable.internal.a(d1) {

            final au amh;
            final com.google.android.gms.common.api.a.d ami;

            public void a(aq aq1)
            {
                ami.a(new ae.a(new Status(aq1.statusCode), aq1.amc));
            }

            
            {
                amh = au.this;
                ami = d1;
                super();
            }
        }, s, s1, abyte0);
    }

    protected void a(hi hi1, com.google.android.gms.internal.hb.e e)
        throws RemoteException
    {
        hi1.e(e, 0x4da6e8, getContext().getPackageName());
    }

    public void b(com.google.android.gms.common.api.a.d d1, Uri uri)
        throws RemoteException
    {
        ((ad)ft()).b(new com.google.android.gms.wearable.internal.a(d1) {

            final au amh;
            final com.google.android.gms.common.api.a.d ami;

            public void Z(DataHolder dataholder)
            {
                ami.a(new DataItemBuffer(dataholder));
            }

            
            {
                amh = au.this;
                ami = d1;
                super();
            }
        }, uri);
    }

    public void b(com.google.android.gms.common.api.a.d d1, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
        throws RemoteException
    {
        HashMap hashmap = amg;
        hashmap;
        JVM INSTR monitorenter ;
        nodelistener = (ac)amg.remove(nodelistener);
        if (nodelistener != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        d1.a(new Status(4002));
_L2:
        hashmap;
        JVM INSTR monitorexit ;
        return;
        a(d1, nodelistener);
        if (true) goto _L2; else goto _L1
_L1:
        d1;
        hashmap;
        JVM INSTR monitorexit ;
        throw d1;
    }

    protected String bu()
    {
        return "com.google.android.gms.wearable.BIND";
    }

    protected String bv()
    {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    protected ad bz(IBinder ibinder)
    {
        return ad.a.by(ibinder);
    }

    public void c(com.google.android.gms.common.api.a.d d1, Uri uri)
        throws RemoteException
    {
        ((ad)ft()).c(new com.google.android.gms.wearable.internal.a(d1) {

            final au amh;
            final com.google.android.gms.common.api.a.d ami;

            public void a(p p1)
            {
                ami.a(new f.b(new Status(p1.statusCode), p1.alL));
            }

            
            {
                amh = au.this;
                ami = d1;
                super();
            }
        }, uri);
    }

    public void disconnect()
    {
        super.disconnect();
        ame.clear();
        amf.clear();
        amg.clear();
    }

    public void o(com.google.android.gms.common.api.a.d d1)
        throws RemoteException
    {
        ((ad)ft()).d(new com.google.android.gms.wearable.internal.a(d1) {

            final au amh;
            final com.google.android.gms.common.api.a.d ami;

            public void Z(DataHolder dataholder)
            {
                ami.a(new DataItemBuffer(dataholder));
            }

            
            {
                amh = au.this;
                ami = d1;
                super();
            }
        });
    }

    public void p(com.google.android.gms.common.api.a.d d1)
        throws RemoteException
    {
        ((ad)ft()).e(new com.google.android.gms.wearable.internal.a(d1) {

            final au amh;
            final com.google.android.gms.common.api.a.d ami;

            public void a(z z1)
            {
                ami.a(new ah.b(new Status(z1.statusCode), z1.alQ));
            }

            
            {
                amh = au.this;
                ami = d1;
                super();
            }
        });
    }

    public void q(com.google.android.gms.common.api.a.d d1)
        throws RemoteException
    {
        ((ad)ft()).f(new com.google.android.gms.wearable.internal.a(d1) {

            final au amh;
            final com.google.android.gms.common.api.a.d ami;

            public void a(t t1)
            {
                ArrayList arraylist = new ArrayList();
                arraylist.addAll(t1.alN);
                ami.a(new ah.a(new Status(t1.statusCode), arraylist));
            }

            
            {
                amh = au.this;
                ami = d1;
                super();
            }
        });
    }

    protected IInterface x(IBinder ibinder)
    {
        return bz(ibinder);
    }
}
