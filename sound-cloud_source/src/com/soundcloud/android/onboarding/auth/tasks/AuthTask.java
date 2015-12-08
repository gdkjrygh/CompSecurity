// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth.tasks;

import android.os.Handler;
import android.os.Looper;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.api.legacy.model.PublicApiUser;
import com.soundcloud.android.api.oauth.Token;
import com.soundcloud.android.onboarding.auth.AuthTaskFragment;
import com.soundcloud.android.onboarding.auth.SignupVia;
import com.soundcloud.android.storage.LegacyUserStorage;
import com.soundcloud.android.tasks.ParallelAsyncTask;

// Referenced classes of package com.soundcloud.android.onboarding.auth.tasks:
//            AuthTaskResult

public abstract class AuthTask extends ParallelAsyncTask
{

    private static final int ME_SYNC_DELAY_MILLIS = 30000;
    private final SoundCloudApplication app;
    private AuthTaskFragment fragment;
    private final LegacyUserStorage userStorage;

    public AuthTask(SoundCloudApplication soundcloudapplication, LegacyUserStorage legacyuserstorage)
    {
        app = soundcloudapplication;
        userStorage = legacyuserstorage;
    }

    public Boolean addAccount(PublicApiUser publicapiuser, Token token, SignupVia signupvia)
    {
        if (app.addUserAccountAndEnableSync(publicapiuser, token, signupvia))
        {
            userStorage.createOrUpdate(publicapiuser);
            if (signupvia != SignupVia.NONE)
            {
                (new Handler(Looper.getMainLooper())).postDelayed(new _cls1(), 30000L);
            }
            return Boolean.valueOf(true);
        } else
        {
            return Boolean.valueOf(false);
        }
    }

    protected SoundCloudApplication getSoundCloudApplication()
    {
        return app;
    }

    protected String getString(int i)
    {
        return app.getString(i);
    }

    public void onPostExecute(AuthTaskResult authtaskresult)
    {
        if (fragment == null)
        {
            return;
        } else
        {
            fragment.onTaskResult(authtaskresult);
            return;
        }
    }

    public volatile void onPostExecute(Object obj)
    {
        onPostExecute((AuthTaskResult)obj);
    }

    public void setTaskOwner(AuthTaskFragment authtaskfragment)
    {
        fragment = authtaskfragment;
    }


    private class _cls1
        implements Runnable
    {

        final AuthTask this$0;

        public void run()
        {
            app.startService((new Intent(app, com/soundcloud/android/sync/ApiSyncService)).setData(Content.ME.uri));
        }

        _cls1()
        {
            this$0 = AuthTask.this;
            super();
        }
    }

}
