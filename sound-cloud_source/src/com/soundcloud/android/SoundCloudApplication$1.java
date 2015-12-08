// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android;

import android.content.SharedPreferences;

// Referenced classes of package com.soundcloud.android:
//            SoundCloudApplication

class this._cls0
    implements Runnable
{

    final SoundCloudApplication this$0;

    public void run()
    {
        SoundCloudApplication.access$000(SoundCloudApplication.this).edit().remove("c2dm.device_url").apply();
    }

    ()
    {
        this$0 = SoundCloudApplication.this;
        super();
    }
}
