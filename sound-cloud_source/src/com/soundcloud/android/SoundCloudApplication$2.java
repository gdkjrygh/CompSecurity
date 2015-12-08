// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android;

import com.soundcloud.android.utils.IOUtils;

// Referenced classes of package com.soundcloud.android:
//            Consts, SoundCloudApplication

class this._cls0
    implements Runnable
{

    final SoundCloudApplication this$0;

    public void run()
    {
        IOUtils.deleteDir(Consts.OLD_EXTERNAL_CACHE_DIRECTORY);
    }

    ()
    {
        this$0 = SoundCloudApplication.this;
        super();
    }
}
