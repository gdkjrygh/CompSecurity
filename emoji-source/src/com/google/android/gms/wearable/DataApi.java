// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import java.io.InputStream;

// Referenced classes of package com.google.android.gms.wearable:
//            Asset, DataItemAsset, PutDataRequest, DataItem, 
//            DataEventBuffer

public interface DataApi
{
    public static interface DataItemResult
        extends Result
    {

        public abstract DataItem getDataItem();
    }

    public static interface DataListener
    {

        public abstract void onDataChanged(DataEventBuffer dataeventbuffer);
    }

    public static interface DeleteDataItemsResult
        extends Result
    {

        public abstract int getNumDeleted();
    }

    public static interface GetFdForAssetResult
        extends Releasable, Result
    {

        public abstract ParcelFileDescriptor getFd();

        public abstract InputStream getInputStream();
    }


    public abstract PendingResult addListener(GoogleApiClient googleapiclient, DataListener datalistener);

    public abstract PendingResult deleteDataItems(GoogleApiClient googleapiclient, Uri uri);

    public abstract PendingResult getDataItem(GoogleApiClient googleapiclient, Uri uri);

    public abstract PendingResult getDataItems(GoogleApiClient googleapiclient);

    public abstract PendingResult getDataItems(GoogleApiClient googleapiclient, Uri uri);

    public abstract PendingResult getFdForAsset(GoogleApiClient googleapiclient, Asset asset);

    public abstract PendingResult getFdForAsset(GoogleApiClient googleapiclient, DataItemAsset dataitemasset);

    public abstract PendingResult putDataItem(GoogleApiClient googleapiclient, PutDataRequest putdatarequest);

    public abstract PendingResult removeListener(GoogleApiClient googleapiclient, DataListener datalistener);
}
