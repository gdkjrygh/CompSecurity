// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model;

import android.net.Uri;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.api.legacy.model.behavior.Refreshable;
import com.soundcloud.android.api.legacy.model.behavior.RelatesToUser;
import com.soundcloud.android.storage.provider.BulkInsertMap;

// Referenced classes of package com.soundcloud.android.api.legacy.model:
//            PublicApiResource, UserHolder, PublicApiUser

public class Friend extends PublicApiResource
    implements UserHolder, Refreshable, RelatesToUser
{

    public long connection_ids[];
    public PublicApiUser user;

    public Friend()
    {
    }

    public Friend(PublicApiUser publicapiuser)
    {
        user = publicapiuser;
    }

    public Uri getBulkInsertUri()
    {
        return null;
    }

    public Refreshable getRefreshableResource()
    {
        return user;
    }

    public PublicApiUser getUser()
    {
        return user;
    }

    public boolean isIncomplete()
    {
        return user.isIncomplete();
    }

    public boolean isStale()
    {
        return user.isStale();
    }

    public void putDependencyValues(BulkInsertMap bulkinsertmap)
    {
        user.putFullContentValues(bulkinsertmap);
    }

    public Uri toUri()
    {
        String s = SoundCloudApplication.TAG;
        return null;
    }
}
