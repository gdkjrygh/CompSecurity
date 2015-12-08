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
//            d, ba

public final class f
    implements DataApi
{
    private static final class a extends com.google.android.gms.wearable.internal.d
    {

        private com.google.android.gms.wearable.DataApi.DataListener axC;
        private IntentFilter axD[];

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((ba)a1);
        }

        protected void a(ba ba1)
            throws RemoteException
        {
            ba1.a(this, axC, axD);
            axC = null;
            axD = null;
        }

        public Status b(Status status)
        {
            axC = null;
            axD = null;
            return status;
        }

        public Result c(Status status)
        {
            return b(status);
        }

        private a(GoogleApiClient googleapiclient, com.google.android.gms.wearable.DataApi.DataListener datalistener, IntentFilter aintentfilter[])
        {
            super(googleapiclient);
            axC = datalistener;
            axD = aintentfilter;
        }

    }

    public static class b
        implements com.google.android.gms.wearable.DataApi.DataItemResult
    {

        private final Status Eb;
        private final DataItem axE;

        public DataItem getDataItem()
        {
            return axE;
        }

        public Status getStatus()
        {
            return Eb;
        }

        public b(Status status, DataItem dataitem)
        {
            Eb = status;
            axE = dataitem;
        }
    }

    public static class c
        implements com.google.android.gms.wearable.DataApi.DeleteDataItemsResult
    {

        private final Status Eb;
        private final int axF;

        public int getNumDeleted()
        {
            return axF;
        }

        public Status getStatus()
        {
            return Eb;
        }

        public c(Status status, int i)
        {
            Eb = status;
            axF = i;
        }
    }

    public static class d
        implements com.google.android.gms.wearable.DataApi.GetFdForAssetResult
    {

        private final Status Eb;
        private volatile InputStream ZO;
        private volatile ParcelFileDescriptor axG;
        private volatile boolean mClosed;

        public ParcelFileDescriptor getFd()
        {
            if (mClosed)
            {
                throw new IllegalStateException("Cannot access the file descriptor after release().");
            } else
            {
                return axG;
            }
        }

        public InputStream getInputStream()
        {
            if (mClosed)
            {
                throw new IllegalStateException("Cannot access the input stream after release().");
            }
            if (axG == null)
            {
                return null;
            }
            if (ZO == null)
            {
                ZO = new android.os.ParcelFileDescriptor.AutoCloseInputStream(axG);
            }
            return ZO;
        }

        public Status getStatus()
        {
            return Eb;
        }

        public void release()
        {
            if (axG == null)
            {
                return;
            }
            if (mClosed)
            {
                throw new IllegalStateException("releasing an already released result.");
            }
            if (ZO == null)
            {
                break MISSING_BLOCK_LABEL_55;
            }
            ZO.close();
_L1:
            mClosed = true;
            axG = null;
            ZO = null;
            return;
            try
            {
                axG.close();
            }
            catch (IOException ioexception)
            {
                return;
            }
              goto _L1
        }

        public d(Status status, ParcelFileDescriptor parcelfiledescriptor)
        {
            mClosed = false;
            Eb = status;
            axG = parcelfiledescriptor;
        }
    }


    public f()
    {
    }

    private PendingResult a(GoogleApiClient googleapiclient, com.google.android.gms.wearable.DataApi.DataListener datalistener, IntentFilter aintentfilter[])
    {
        return googleapiclient.a(new a(googleapiclient, datalistener, aintentfilter));
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
        return googleapiclient.a(new com.google.android.gms.wearable.internal.d(googleapiclient, uri) {

            final Uri amO;
            final f axy;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ba)a1);
            }

            protected void a(ba ba1)
                throws RemoteException
            {
                ba1.c(this, amO);
            }

            protected com.google.android.gms.wearable.DataApi.DeleteDataItemsResult aG(Status status)
            {
                return new c(status, 0);
            }

            protected Result c(Status status)
            {
                return aG(status);
            }

            
            {
                axy = f.this;
                amO = uri;
                super(googleapiclient);
            }
        });
    }

    public PendingResult getDataItem(GoogleApiClient googleapiclient, Uri uri)
    {
        return googleapiclient.a(new com.google.android.gms.wearable.internal.d(googleapiclient, uri) {

            final Uri amO;
            final f axy;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ba)a1);
            }

            protected void a(ba ba1)
                throws RemoteException
            {
                ba1.a(this, amO);
            }

            protected com.google.android.gms.wearable.DataApi.DataItemResult aE(Status status)
            {
                return new b(status, null);
            }

            protected Result c(Status status)
            {
                return aE(status);
            }

            
            {
                axy = f.this;
                amO = uri;
                super(googleapiclient);
            }
        });
    }

    public PendingResult getDataItems(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new com.google.android.gms.wearable.internal.d(googleapiclient) {

            final f axy;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ba)a1);
            }

            protected void a(ba ba1)
                throws RemoteException
            {
                ba1.n(this);
            }

            protected DataItemBuffer aF(Status status)
            {
                return new DataItemBuffer(DataHolder.av(status.getStatusCode()));
            }

            protected Result c(Status status)
            {
                return aF(status);
            }

            
            {
                axy = f.this;
                super(googleapiclient);
            }
        });
    }

    public PendingResult getDataItems(GoogleApiClient googleapiclient, Uri uri)
    {
        return googleapiclient.a(new com.google.android.gms.wearable.internal.d(googleapiclient, uri) {

            final Uri amO;
            final f axy;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ba)a1);
            }

            protected void a(ba ba1)
                throws RemoteException
            {
                ba1.b(this, amO);
            }

            protected DataItemBuffer aF(Status status)
            {
                return new DataItemBuffer(DataHolder.av(status.getStatusCode()));
            }

            protected Result c(Status status)
            {
                return aF(status);
            }

            
            {
                axy = f.this;
                amO = uri;
                super(googleapiclient);
            }
        });
    }

    public PendingResult getFdForAsset(GoogleApiClient googleapiclient, Asset asset)
    {
        a(asset);
        return googleapiclient.a(new com.google.android.gms.wearable.internal.d(googleapiclient, asset) {

            final f axy;
            final Asset axz;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ba)a1);
            }

            protected void a(ba ba1)
                throws RemoteException
            {
                ba1.a(this, axz);
            }

            protected com.google.android.gms.wearable.DataApi.GetFdForAssetResult aH(Status status)
            {
                return new d(status, null);
            }

            protected Result c(Status status)
            {
                return aH(status);
            }

            
            {
                axy = f.this;
                axz = asset;
                super(googleapiclient);
            }
        });
    }

    public PendingResult getFdForAsset(GoogleApiClient googleapiclient, DataItemAsset dataitemasset)
    {
        return googleapiclient.a(new com.google.android.gms.wearable.internal.d(googleapiclient, dataitemasset) {

            final DataItemAsset axA;
            final f axy;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ba)a1);
            }

            protected void a(ba ba1)
                throws RemoteException
            {
                ba1.a(this, axA);
            }

            protected com.google.android.gms.wearable.DataApi.GetFdForAssetResult aH(Status status)
            {
                return new d(status, null);
            }

            protected Result c(Status status)
            {
                return aH(status);
            }

            
            {
                axy = f.this;
                axA = dataitemasset;
                super(googleapiclient);
            }
        });
    }

    public PendingResult putDataItem(GoogleApiClient googleapiclient, PutDataRequest putdatarequest)
    {
        return googleapiclient.a(new com.google.android.gms.wearable.internal.d(googleapiclient, putdatarequest) {

            final PutDataRequest axx;
            final f axy;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ba)a1);
            }

            protected void a(ba ba1)
                throws RemoteException
            {
                ba1.a(this, axx);
            }

            public com.google.android.gms.wearable.DataApi.DataItemResult aE(Status status)
            {
                return new b(status, null);
            }

            public Result c(Status status)
            {
                return aE(status);
            }

            
            {
                axy = f.this;
                axx = putdatarequest;
                super(googleapiclient);
            }
        });
    }

    public PendingResult removeListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.DataApi.DataListener datalistener)
    {
        return googleapiclient.a(new com.google.android.gms.wearable.internal.d(googleapiclient, datalistener) {

            final com.google.android.gms.wearable.DataApi.DataListener axB;
            final f axy;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ba)a1);
            }

            protected void a(ba ba1)
                throws RemoteException
            {
                ba1.a(this, axB);
            }

            public Status b(Status status)
            {
                return status;
            }

            public Result c(Status status)
            {
                return b(status);
            }

            
            {
                axy = f.this;
                axB = datalistener;
                super(googleapiclient);
            }
        });
    }
}
