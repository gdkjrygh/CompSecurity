// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections.tasks;

import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.api.legacy.PublicApi;
import com.soundcloud.android.api.legacy.UnexpectedResponseException;
import com.soundcloud.android.api.legacy.model.CollectionHolder;
import java.io.IOException;

// Referenced classes of package com.soundcloud.android.collections.tasks:
//            CollectionLoader, CollectionParams, ReturnData

public class RemoteCollectionLoader
    implements CollectionLoader
{

    public RemoteCollectionLoader()
    {
    }

    public ReturnData load(PublicApi publicapi, CollectionParams collectionparams)
    {
        try
        {
            publicapi = publicapi.readCollection(collectionparams.getRequest());
            publicapi.removeUnknownResources();
            publicapi = new ReturnData(publicapi.getCollection(), collectionparams, publicapi.getNextHref(), 200, publicapi.moreResourcesExist(), true);
        }
        // Misplaced declaration of an exception variable
        catch (PublicApi publicapi)
        {
            String s = SoundCloudApplication.TAG;
            return new ReturnData.Error(collectionparams, publicapi.getStatusCode());
        }
        // Misplaced declaration of an exception variable
        catch (PublicApi publicapi)
        {
            publicapi = SoundCloudApplication.TAG;
            return new ReturnData.Error(collectionparams);
        }
        return publicapi;
    }
}
