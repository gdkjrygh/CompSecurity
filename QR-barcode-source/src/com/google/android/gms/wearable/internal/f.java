// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import com.google.android.gms.wearable.DataItemBuffer;
import com.google.android.gms.wearable.PutDataRequest;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            d, aw

public final class f
    implements DataApi
{
    public static class a
        implements com.google.android.gms.wearable.DataApi.DataItemResult
    {

        private final Status CM;
        private final DataItem avs;

        public DataItem getDataItem()
        {
            return avs;
        }

        public Status getStatus()
        {
            return CM;
        }

        public a(Status status, DataItem dataitem)
        {
            CM = status;
            avs = dataitem;
        }
    }

    public static class b
        implements com.google.android.gms.wearable.DataApi.DeleteDataItemsResult
    {

        private final Status CM;
        private final int avt;

        public int getNumDeleted()
        {
            return avt;
        }

        public Status getStatus()
        {
            return CM;
        }

        public b(Status status, int i)
        {
            CM = status;
            avt = i;
        }
    }

    public static class c
        implements com.google.android.gms.wearable.DataApi.GetFdForAssetResult
    {

        private final Status CM;
        private volatile InputStream XX;
        private volatile ParcelFileDescriptor avu;
        private volatile boolean mClosed;

        public ParcelFileDescriptor getFd()
        {
            if (mClosed)
            {
                throw new IllegalStateException("Cannot access the file descriptor after release().");
            } else
            {
                return avu;
            }
        }

        public InputStream getInputStream()
        {
            if (mClosed)
            {
                throw new IllegalStateException("Cannot access the input stream after release().");
            }
            if (avu == null)
            {
                return null;
            }
            if (XX == null)
            {
                XX = new android.os.ParcelFileDescriptor.AutoCloseInputStream(avu);
            }
            return XX;
        }

        public Status getStatus()
        {
            return CM;
        }

        public void release()
        {
            if (avu == null)
            {
                return;
            }
            if (mClosed)
            {
                throw new IllegalStateException("releasing an already released result.");
            }
            if (XX == null)
            {
                break MISSING_BLOCK_LABEL_55;
            }
            XX.close();
_L1:
            mClosed = true;
            avu = null;
            XX = null;
            return;
            try
            {
                avu.close();
            }
            catch (IOException ioexception)
            {
                return;
            }
              goto _L1
        }

        public c(Status status, ParcelFileDescriptor parcelfiledescriptor)
        {
            mClosed = false;
            CM = status;
            avu = parcelfiledescriptor;
        }
    }


    public f()
    {
    }

    private PendingResult a(GoogleApiClient googleapiclient, com.google.android.gms.wearable.DataApi.DataListener datalistener, IntentFilter aintentfilter[])
    {
        return googleapiclient.a(new d(datalistener, aintentfilter) {

            final f avn;
            final com.google.android.gms.wearable.DataApi.DataListener avq;
            final IntentFilter avr[];

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((aw)a1);
            }

            protected void a(aw aw1)
                throws RemoteException
            {
                aw1.a(this, avq, avr);
            }

            public Result c(Status status)
            {
                return d(status);
            }

            public Status d(Status status)
            {
                return new Status(13);
            }

            
            {
                avn = f.this;
                avq = datalistener;
                avr = aintentfilter;
                super();
            }
        });
    }

    private void a(Asset asset)
    {
        if (asset == null)
        {
            throw new IllegalArgumentException("asset is null");
        }
        if (asset.getDigest() == null)
        {
            throw new IllegalArgumentException("invalid asset");
        }
        if (asset.getData() != null)
        {
            throw new IllegalArgumentException("invalid asset");
        } else
        {
            return;
        }
    }

    public PendingResult addListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.DataApi.DataListener datalistener)
    {
        return a(googleapiclient, datalistener, null);
    }

    public PendingResult deleteDataItems(GoogleApiClient googleapiclient, Uri uri)
    {
        return googleapiclient.a(new d(uri) {

            final Uri aky;
            final f avn;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((aw)a1);
            }

            protected void a(aw aw1)
                throws RemoteException
            {
                aw1.c(this, aky);
            }

            protected com.google.android.gms.wearable.DataApi.DeleteDataItemsResult aH(Status status)
            {
                return new b(status, 0);
            }

            protected Result c(Status status)
            {
                return aH(status);
            }

            
            {
                avn = f.this;
                aky = uri;
                super();
            }
        });
    }

    public PendingResult getDataItem(GoogleApiClient googleapiclient, Uri uri)
    {
        return googleapiclient.a(new d(uri) {

            final Uri aky;
            final f avn;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((aw)a1);
            }

            protected void a(aw aw1)
                throws RemoteException
            {
                aw1.a(this, aky);
            }

            protected com.google.android.gms.wearable.DataApi.DataItemResult aF(Status status)
            {
                return new a(status, null);
            }

            protected Result c(Status status)
            {
                return aF(status);
            }

            
            {
                avn = f.this;
                aky = uri;
                super();
            }
        });
    }

    public PendingResult getDataItems(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new d() {

            final f avn;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((aw)a1);
            }

            protected void a(aw aw1)
                throws RemoteException
            {
                aw1.o(this);
            }

            protected DataItemBuffer aG(Status status)
            {
                return new DataItemBuffer(DataHolder.as(status.getStatusCode()));
            }

            protected Result c(Status status)
            {
                return aG(status);
            }

            
            {
                avn = f.this;
                super();
            }
        });
    }

    public PendingResult getDataItems(GoogleApiClient googleapiclient, Uri uri)
    {
        return googleapiclient.a(new d(uri) {

            final Uri aky;
            final f avn;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((aw)a1);
            }

            protected void a(aw aw1)
                throws RemoteException
            {
                aw1.b(this, aky);
            }

            protected DataItemBuffer aG(Status status)
            {
                return new DataItemBuffer(DataHolder.as(status.getStatusCode()));
            }

            protected Result c(Status status)
            {
                return aG(status);
            }

            
            {
                avn = f.this;
                aky = uri;
                super();
            }
        });
    }

    public PendingResult getFdForAsset(GoogleApiClient googleapiclient, Asset asset)
    {
        a(asset);
        return googleapiclient.a(new d(asset) {

            final f avn;
            final Asset avo;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((aw)a1);
            }

            protected void a(aw aw1)
                throws RemoteException
            {
                aw1.a(this, avo);
            }

            protected com.google.android.gms.wearable.DataApi.GetFdForAssetResult aI(Status status)
            {
                return new c(status, null);
            }

            protected Result c(Status status)
            {
                return aI(status);
            }

            
            {
                avn = f.this;
                avo = asset;
                super();
            }
        });
    }

    public PendingResult getFdForAsset(GoogleApiClient googleapiclient, DataItemAsset dataitemasset)
    {
        return googleapiclient.a(new d(dataitemasset) {

            final f avn;
            final DataItemAsset avp;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((aw)a1);
            }

            protected void a(aw aw1)
                throws RemoteException
            {
                aw1.a(this, avp);
            }

            protected com.google.android.gms.wearable.DataApi.GetFdForAssetResult aI(Status status)
            {
                return new c(status, null);
            }

            protected Result c(Status status)
            {
                return aI(status);
            }

            
            {
                avn = f.this;
                avp = dataitemasset;
                super();
            }
        });
    }

    public PendingResult putDataItem(GoogleApiClient googleapiclient, PutDataRequest putdatarequest)
    {
        return googleapiclient.a(new d(putdatarequest) {

            final PutDataRequest avm;
            final f avn;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((aw)a1);
            }

            protected void a(aw aw1)
                throws RemoteException
            {
                aw1.a(this, avm);
            }

            public com.google.android.gms.wearable.DataApi.DataItemResult aF(Status status)
            {
                return new a(status, null);
            }

            public Result c(Status status)
            {
                return aF(status);
            }

            
            {
                avn = f.this;
                avm = putdatarequest;
                super();
            }
        });
    }

    public PendingResult removeListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.DataApi.DataListener datalistener)
    {
        return googleapiclient.a(new d(datalistener) {

            final f avn;
            final com.google.android.gms.wearable.DataApi.DataListener avq;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((aw)a1);
            }

            protected void a(aw aw1)
                throws RemoteException
            {
                aw1.a(this, avq);
            }

            public Result c(Status status)
            {
                return d(status);
            }

            public Status d(Status status)
            {
                return new Status(13);
            }

            
            {
                avn = f.this;
                avq = datalistener;
                super();
            }
        });
    }
}
