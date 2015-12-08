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
//            d, au

public final class f
    implements DataApi
{
    public static class a
        implements com.google.android.gms.wearable.DataApi.DataItemResult
    {

        private final DataItem alE;
        private final Status yw;

        public DataItem getDataItem()
        {
            return alE;
        }

        public Status getStatus()
        {
            return yw;
        }

        public a(Status status, DataItem dataitem)
        {
            yw = status;
            alE = dataitem;
        }
    }

    public static class b
        implements com.google.android.gms.wearable.DataApi.DeleteDataItemsResult
    {

        private final int alF;
        private final Status yw;

        public int getNumDeleted()
        {
            return alF;
        }

        public Status getStatus()
        {
            return yw;
        }

        public b(Status status, int i)
        {
            yw = status;
            alF = i;
        }
    }

    public static class c
        implements com.google.android.gms.wearable.DataApi.GetFdForAssetResult
    {

        private final ParcelFileDescriptor alG;
        private final Status yw;

        public ParcelFileDescriptor getFd()
        {
            return alG;
        }

        public InputStream getInputStream()
        {
            return new android.os.ParcelFileDescriptor.AutoCloseInputStream(alG);
        }

        public Status getStatus()
        {
            return yw;
        }

        public void release()
        {
            try
            {
                alG.close();
                return;
            }
            catch (IOException ioexception)
            {
                return;
            }
        }

        public c(Status status, ParcelFileDescriptor parcelfiledescriptor)
        {
            yw = status;
            alG = parcelfiledescriptor;
        }
    }


    public f()
    {
    }

    private PendingResult a(GoogleApiClient googleapiclient, com.google.android.gms.wearable.DataApi.DataListener datalistener, IntentFilter aintentfilter[])
    {
        return googleapiclient.a(new d(datalistener, aintentfilter) {

            final com.google.android.gms.wearable.DataApi.DataListener alC;
            final IntentFilter alD[];
            final f alz;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((au)a1);
            }

            protected void a(au au1)
                throws RemoteException
            {
                au1.a(this, alC, alD);
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
                alz = f.this;
                alC = datalistener;
                alD = aintentfilter;
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

            final Uri abh;
            final f alz;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((au)a1);
            }

            protected void a(au au1)
                throws RemoteException
            {
                au1.c(this, abh);
            }

            protected com.google.android.gms.wearable.DataApi.DeleteDataItemsResult as(Status status)
            {
                return new b(status, 0);
            }

            protected Result c(Status status)
            {
                return as(status);
            }

            
            {
                alz = f.this;
                abh = uri;
                super();
            }
        });
    }

    public PendingResult getDataItem(GoogleApiClient googleapiclient, Uri uri)
    {
        return googleapiclient.a(new d(uri) {

            final Uri abh;
            final f alz;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((au)a1);
            }

            protected void a(au au1)
                throws RemoteException
            {
                au1.a(this, abh);
            }

            protected com.google.android.gms.wearable.DataApi.DataItemResult aq(Status status)
            {
                return new a(status, null);
            }

            protected Result c(Status status)
            {
                return aq(status);
            }

            
            {
                alz = f.this;
                abh = uri;
                super();
            }
        });
    }

    public PendingResult getDataItems(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new d() {

            final f alz;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((au)a1);
            }

            protected void a(au au1)
                throws RemoteException
            {
                au1.o(this);
            }

            protected DataItemBuffer ar(Status status)
            {
                return new DataItemBuffer(DataHolder.af(status.getStatusCode()));
            }

            protected Result c(Status status)
            {
                return ar(status);
            }

            
            {
                alz = f.this;
                super();
            }
        });
    }

    public PendingResult getDataItems(GoogleApiClient googleapiclient, Uri uri)
    {
        return googleapiclient.a(new d(uri) {

            final Uri abh;
            final f alz;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((au)a1);
            }

            protected void a(au au1)
                throws RemoteException
            {
                au1.b(this, abh);
            }

            protected DataItemBuffer ar(Status status)
            {
                return new DataItemBuffer(DataHolder.af(status.getStatusCode()));
            }

            protected Result c(Status status)
            {
                return ar(status);
            }

            
            {
                alz = f.this;
                abh = uri;
                super();
            }
        });
    }

    public PendingResult getFdForAsset(GoogleApiClient googleapiclient, Asset asset)
    {
        a(asset);
        return googleapiclient.a(new d(asset) {

            final Asset alA;
            final f alz;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((au)a1);
            }

            protected void a(au au1)
                throws RemoteException
            {
                au1.a(this, alA);
            }

            protected com.google.android.gms.wearable.DataApi.GetFdForAssetResult at(Status status)
            {
                return new c(status, null);
            }

            protected Result c(Status status)
            {
                return at(status);
            }

            
            {
                alz = f.this;
                alA = asset;
                super();
            }
        });
    }

    public PendingResult getFdForAsset(GoogleApiClient googleapiclient, DataItemAsset dataitemasset)
    {
        return googleapiclient.a(new d(dataitemasset) {

            final DataItemAsset alB;
            final f alz;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((au)a1);
            }

            protected void a(au au1)
                throws RemoteException
            {
                au1.a(this, alB);
            }

            protected com.google.android.gms.wearable.DataApi.GetFdForAssetResult at(Status status)
            {
                return new c(status, null);
            }

            protected Result c(Status status)
            {
                return at(status);
            }

            
            {
                alz = f.this;
                alB = dataitemasset;
                super();
            }
        });
    }

    public PendingResult putDataItem(GoogleApiClient googleapiclient, PutDataRequest putdatarequest)
    {
        return googleapiclient.a(new d(putdatarequest) {

            final PutDataRequest aly;
            final f alz;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((au)a1);
            }

            protected void a(au au1)
                throws RemoteException
            {
                au1.a(this, aly);
            }

            public com.google.android.gms.wearable.DataApi.DataItemResult aq(Status status)
            {
                return new a(status, null);
            }

            public Result c(Status status)
            {
                return aq(status);
            }

            
            {
                alz = f.this;
                aly = putdatarequest;
                super();
            }
        });
    }

    public PendingResult removeListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.DataApi.DataListener datalistener)
    {
        return googleapiclient.a(new d(datalistener) {

            final com.google.android.gms.wearable.DataApi.DataListener alC;
            final f alz;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((au)a1);
            }

            protected void a(au au1)
                throws RemoteException
            {
                au1.a(this, alC);
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
                alz = f.this;
                alC = datalistener;
                super();
            }
        });
    }
}
