// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding;

import android.os.Bundle;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.api.legacy.PublicApi;
import com.soundcloud.android.onboarding.auth.SignupVia;
import com.soundcloud.android.onboarding.auth.tasks.AuthTask;
import com.soundcloud.android.onboarding.auth.tasks.AuthTaskResult;
import com.soundcloud.android.storage.LegacyUserStorage;

// Referenced classes of package com.soundcloud.android.onboarding:
//            OnboardActivity

class k extends AuthTask
{

    final OnboardActivity this$0;

    protected transient AuthTaskResult doInBackground(Bundle abundle[])
    {
        addAccount(OnboardActivity.access$700(OnboardActivity.this), oldCloudAPI.getToken(), SignupVia.API);
        return null;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Bundle[])aobj);
    }

    protected void onPostExecute(AuthTaskResult authtaskresult)
    {
        onAuthTaskComplete(OnboardActivity.access$700(OnboardActivity.this), SignupVia.API, false, false);
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((AuthTaskResult)obj);
    }

    kResult(SoundCloudApplication soundcloudapplication, LegacyUserStorage legacyuserstorage)
    {
        this$0 = OnboardActivity.this;
        super(soundcloudapplication, legacyuserstorage);
    }
}
