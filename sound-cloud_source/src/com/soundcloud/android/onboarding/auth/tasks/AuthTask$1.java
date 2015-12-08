// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth.tasks;

import android.content.Intent;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.storage.provider.Content;
import com.soundcloud.android.sync.ApiSyncService;

// Referenced classes of package com.soundcloud.android.onboarding.auth.tasks:
//            AuthTask

class this._cls0
    implements Runnable
{

    final AuthTask this$0;

    public void run()
    {
        AuthTask.access$000(AuthTask.this).startService((new Intent(AuthTask.access$000(AuthTask.this), com/soundcloud/android/sync/ApiSyncService)).setData(Content.ME.uri));
    }

    ()
    {
        this$0 = AuthTask.this;
        super();
    }
}
