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

        private final DataItem alH;
        private final Status yz;

        public DataItem getDataItem()
        {
            return alH;
        }

        public Status getStatus()
        {
            return yz;
        }

        public a(Status status, DataItem dataitem)
        {
            yz = status;
            alH = dataitem;
        }
    }

    public static class b
        implements com.google.android.gms.wearable.DataApi.DeleteDataItemsResult
    {

        private final int alI;
        private final Status yz;

        public int getNumDeleted()
        {
            return alI;
        }

        public Status getStatus()
        {
            return yz;
        }

        public b(Status status, int i)
        {
            yz = status;
            alI = i;
        }
    }

    public static class c
        implements com.google.android.gms.wearable.DataApi.GetFdForAssetResult
    {

        private final ParcelFileDescriptor alJ;
        private final Status yz;

        public ParcelFileDescriptor getFd()
        {
            return alJ;
        }

        public InputStream getInputStream()
        {
            return new android.os.ParcelFileDescriptor.AutoCloseInputStream(alJ);
        }

        public Status getStatus()
        {
            return yz;
        }

        public void release()
        {
            try
            {
                alJ.close();
                return;
            }
            catch (IOException ioexception)
            {
                return;
            }
        }

        public c(Status status, ParcelFileDescriptor parcelfiledescriptor)
        {
            yz = status;
            alJ = parcelfiledescriptor;
        }
    }


    public f()
    {
    }

    private PendingResult a(GoogleApiClient googleapiclient, com.google.android.gms.wearable.DataApi.DataListener datalistener, IntentFilter aintentfilter[])
    {
        return googleapiclient.a(new d(datalistener, aintentfilter) {

            final f alC;
            final com.google.android.gms.wearable.DataApi.DataListener alF;
            final IntentFilter alG[];

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((au)a1);
            }

            protected void a(au au1)
                throws RemoteException
            {
                au1.a(this, alF, alG);
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
                alC = f.this;
                alF = datalistener;
                alG = aintentfilter;
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

            final Uri abk;
            final f alC;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((au)a1);
            }

            protected void a(au au1)
                throws RemoteException
            {
                au1.c(this, abk);
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
                alC = f.this;
                abk = uri;
                super();
            }
        });
    }

    public PendingResult getDataItem(GoogleApiClient googleapiclient, Uri uri)
    {
        return googleapiclient.a(new d(uri) {

            final Uri abk;
            final f alC;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((au)a1);
            }

            protected void a(au au1)
                throws RemoteException
            {
                au1.a(this, abk);
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
                alC = f.this;
                abk = uri;
                super();
            }
        });
    }

    public PendingResult getDataItems(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new d() {

            final f alC;

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
                alC = f.this;
                super();
            }
        });
    }

    public PendingResult getDataItems(GoogleApiClient googleapiclient, Uri uri)
    {
        return googleapiclient.a(new d(uri) {

            final Uri abk;
            final f alC;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((au)a1);
            }

            protected void a(au au1)
                throws RemoteException
            {
                au1.b(this, abk);
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
                alC = f.this;
                abk = uri;
                super();
            }
        });
    }

    public PendingResult getFdForAsset(GoogleApiClient googleapiclient, Asset asset)
    {
        a(asset);
        return googleapiclient.a(new d(asset) {

            final f alC;
            final Asset alD;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((au)a1);
            }

            protected void a(au au1)
                throws RemoteException
            {
                au1.a(this, alD);
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
                alC = f.this;
                alD = asset;
                super();
            }
        });
    }

    public PendingResult getFdForAsset(GoogleApiClient googleapiclient, DataItemAsset dataitemasset)
    {
        return googleapiclient.a(new d(dataitemasset) {

            final f alC;
            final DataItemAsset alE;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((au)a1);
            }

            protected void a(au au1)
                throws RemoteException
            {
                au1.a(this, alE);
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
                alC = f.this;
                alE = dataitemasset;
                super();
            }
        });
    }

    public PendingResult putDataItem(GoogleApiClient googleapiclient, PutDataRequest putdatarequest)
    {
        return googleapiclient.a(new d(putdatarequest) {

            final PutDataRequest alB;
            final f alC;

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

            public com.google.android.gms.wearable.DataApi.DataItemResult aq(Status status)
            {
                return new a(status, null);
            }

            public Result c(Status status)
            {
                return aq(status);
            }

            
            {
                alC = f.this;
                alB = putdatarequest;
                super();
            }
        });
    }

    public PendingResult removeListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.DataApi.DataListener datalistener)
    {
        return googleapiclient.a(new d(datalistener) {

            final f alC;
            final com.google.android.gms.wearable.DataApi.DataListener alF;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((au)a1);
            }

            protected void a(au au1)
                throws RemoteException
            {
                au1.a(this, alF);
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
                alC = f.this;
                alF = datalistener;
                super();
            }
        });
    }
}
