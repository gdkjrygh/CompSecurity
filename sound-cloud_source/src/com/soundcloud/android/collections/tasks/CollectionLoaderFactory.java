// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections.tasks;

import com.soundcloud.android.api.legacy.model.activities.Activity;
import com.soundcloud.android.storage.provider.Content;

// Referenced classes of package com.soundcloud.android.collections.tasks:
//            CollectionParams, ActivitiesLoader, RemoteCollectionLoader, CollectionLoader

class CollectionLoaderFactory
{

    CollectionLoaderFactory()
    {
    }

    private boolean collectionIsLocatedRemotely(CollectionParams collectionparams)
    {
        return collectionparams.getRequest() != null;
    }

    private boolean resourceIsASoundcloudActivity(CollectionParams collectionparams)
    {
        collectionparams = collectionparams.getContent().getModelType();
        return collectionparams != null && com/soundcloud/android/api/legacy/model/activities/Activity.isAssignableFrom(collectionparams);
    }

    public CollectionLoader createCollectionLoader(CollectionParams collectionparams)
    {
        if (resourceIsASoundcloudActivity(collectionparams))
        {
            return new ActivitiesLoader();
        }
        if (collectionIsLocatedRemotely(collectionparams))
        {
            return new RemoteCollectionLoader();
        } else
        {
            return null;
        }
    }
}
