// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections.tasks;

import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.api.legacy.PublicApi;
import com.soundcloud.android.tasks.ParallelAsyncTask;
import java.lang.ref.WeakReference;

// Referenced classes of package com.soundcloud.android.collections.tasks:
//            CollectionLoaderFactory, ReturnData, CollectionLoader, CollectionParams

public class CollectionTask extends ParallelAsyncTask
{
    public static interface Callback
    {

        public abstract void onPostTaskExecute(ReturnData returndata);
    }


    private final PublicApi api;
    private final WeakReference callback;
    private final CollectionLoaderFactory collectionLoaderFactory;

    public CollectionTask(PublicApi publicapi, Callback callback1)
    {
        this(publicapi, callback1, new CollectionLoaderFactory());
    }

    protected CollectionTask(PublicApi publicapi, Callback callback1, CollectionLoaderFactory collectionloaderfactory)
    {
        api = publicapi;
        callback = new WeakReference(callback1);
        collectionLoaderFactory = collectionloaderfactory;
    }

    protected transient ReturnData doInBackground(CollectionParams acollectionparams[])
    {
        acollectionparams = acollectionparams[0];
        Object obj = SoundCloudApplication.TAG;
        (new StringBuilder()).append(getClass().getSimpleName()).append("Loading collection with params: ").append(acollectionparams);
        obj = collectionLoaderFactory.createCollectionLoader(acollectionparams);
        if (obj == null)
        {
            return new ReturnData(acollectionparams);
        } else
        {
            return ((CollectionLoader) (obj)).load(api, acollectionparams);
        }
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((CollectionParams[])aobj);
    }

    protected void onPostExecute(ReturnData returndata)
    {
        Callback callback1 = (Callback)callback.get();
        if (callback1 != null)
        {
            callback1.onPostTaskExecute(returndata);
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((ReturnData)obj);
    }
}
