// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth.tasks;

import android.os.Bundle;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.ApiMapperException;
import com.soundcloud.android.api.ApiRequest;
import com.soundcloud.android.api.ApiRequestException;
import com.soundcloud.android.api.FilePart;
import com.soundcloud.android.api.StringPart;
import com.soundcloud.android.api.legacy.model.PublicApiUser;
import com.soundcloud.android.onboarding.auth.SignupVia;
import com.soundcloud.android.storage.LegacyUserStorage;
import java.io.File;
import java.io.IOException;

// Referenced classes of package com.soundcloud.android.onboarding.auth.tasks:
//            AuthTask, AuthTaskResult

public class AddUserInfoTask extends AuthTask
{

    private final AccountOperations accountOperations;
    private final ApiClient apiClient;
    private final File avatarFile;
    private final String permalink;
    private final String username;

    public AddUserInfoTask(SoundCloudApplication soundcloudapplication, String s, String s1, File file, LegacyUserStorage legacyuserstorage, ApiClient apiclient, AccountOperations accountoperations)
    {
        super(soundcloudapplication, legacyuserstorage);
        apiClient = apiclient;
        username = s1;
        permalink = s;
        avatarFile = file;
        accountOperations = accountoperations;
    }

    protected transient AuthTaskResult doInBackground(Bundle abundle[])
    {
        abundle = ApiRequest.put(ApiEndpoints.CURRENT_USER.path()).forPublicApi().withFormPart(StringPart.from("user[username]", username)).withFormPart(StringPart.from("user[permalink]", permalink));
        if (avatarFile != null && avatarFile.canWrite())
        {
            abundle.withFormPart(FilePart.from("user[avatar_data]", avatarFile, "application/octet-stream"));
        }
        abundle = (PublicApiUser)apiClient.fetchMappedResponse(abundle.build(), com/soundcloud/android/api/legacy/model/PublicApiUser);
        addAccount(abundle, accountOperations.getSoundCloudToken(), SignupVia.API);
        abundle = AuthTaskResult.success(abundle, SignupVia.API, false);
        return abundle;
        abundle;
        return AuthTaskResult.failure(abundle);
        abundle;
_L2:
        return AuthTaskResult.failure(abundle);
        abundle;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Bundle[])aobj);
    }
}
