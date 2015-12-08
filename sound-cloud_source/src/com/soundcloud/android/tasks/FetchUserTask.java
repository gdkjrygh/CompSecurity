// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tasks;

import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.ApiRequest;
import com.soundcloud.android.api.legacy.model.PublicApiResource;
import com.soundcloud.android.api.legacy.model.PublicApiUser;
import com.soundcloud.android.storage.LegacyUserStorage;

// Referenced classes of package com.soundcloud.android.tasks:
//            FetchModelTask

public class FetchUserTask extends FetchModelTask
{

    public FetchUserTask(ApiClient apiclient)
    {
        super(apiclient);
    }

    public PublicApiUser currentUser()
    {
        return (PublicApiUser)resolve(ApiRequest.get(ApiEndpoints.CURRENT_USER.path()).forPublicApi().build());
    }

    public void execute(long l)
    {
        execute(((Object []) (new ApiRequest[] {
            ApiRequest.get(ApiEndpoints.LEGACY_USER.path(new Object[] {
                Long.valueOf(l)
            })).forPublicApi().build()
        })));
    }

    protected volatile void persist(PublicApiResource publicapiresource)
    {
        persist((PublicApiUser)publicapiresource);
    }

    protected void persist(PublicApiUser publicapiuser)
    {
        (new LegacyUserStorage()).createOrUpdate(publicapiuser);
    }
}
