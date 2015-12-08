// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tasks;

import android.os.Parcelable;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.api.ApiMapperException;
import com.soundcloud.android.api.ApiRequest;
import com.soundcloud.android.api.ApiRequestException;
import com.soundcloud.android.api.legacy.model.PublicApiResource;
import com.soundcloud.android.api.legacy.model.ScModelManager;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.ParameterizedType;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.soundcloud.android.tasks:
//            ParallelAsyncTask

public abstract class FetchModelTask extends ParallelAsyncTask
{
    public static interface Listener
    {

        public abstract void onError(Object obj);

        public abstract void onSuccess(Parcelable parcelable);
    }


    protected ApiClient api;
    private Set listenerWeakReferences;
    private final long modelId;

    public FetchModelTask(ApiClient apiclient)
    {
        this(apiclient, -1L);
    }

    public FetchModelTask(ApiClient apiclient, long l)
    {
        api = apiclient;
        modelId = l;
    }

    private Class getGenericClassType()
    {
        return (Class)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public void addListener(Listener listener)
    {
        if (listenerWeakReferences == null)
        {
            listenerWeakReferences = new HashSet();
        }
        listenerWeakReferences.add(new WeakReference(listener));
    }

    protected transient PublicApiResource doInBackground(ApiRequest aapirequest[])
    {
        if (aapirequest == null || aapirequest.length == 0)
        {
            throw new IllegalArgumentException("need request");
        } else
        {
            return resolve(aapirequest[0]);
        }
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((ApiRequest[])aobj);
    }

    protected void onPostExecute(PublicApiResource publicapiresource)
    {
        if (listenerWeakReferences != null)
        {
            Iterator iterator = listenerWeakReferences.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Listener listener = (Listener)((WeakReference)iterator.next()).get();
                if (listener != null)
                {
                    if (publicapiresource != null)
                    {
                        listener.onSuccess(publicapiresource);
                    } else
                    {
                        listener.onError(Long.valueOf(modelId));
                    }
                }
            } while (true);
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((PublicApiResource)obj);
    }

    protected abstract void persist(PublicApiResource publicapiresource);

    public PublicApiResource resolve(ApiRequest apirequest)
    {
        if (isCancelled())
        {
            return null;
        }
        apirequest = (PublicApiResource)api.fetchMappedResponse(apirequest, getGenericClassType());
        apirequest.setUpdated();
        persist(apirequest);
        SoundCloudApplication.sModelManager.cache(apirequest, com.soundcloud.android.api.legacy.model.PublicApiResource.CacheUpdateMode.FULL);
        return apirequest;
        apirequest;
_L2:
        apirequest = SoundCloudApplication.TAG;
        return null;
        apirequest;
        continue; /* Loop/switch isn't completed */
        apirequest;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
