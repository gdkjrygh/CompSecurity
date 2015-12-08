// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.c.a.t;
import com.soundcloud.android.properties.ApplicationProperties;

// Referenced classes of package com.soundcloud.android.offline:
//            SoundCloudHostnameVerifier

public class OfflineModule
{

    public static final String STRICT_SSL_CLIENT = "StrictSSLHttpClient";

    public OfflineModule()
    {
    }

    public t provideOkHttpClient(ApplicationProperties applicationproperties, t t1)
    {
        t1 = t1.b();
        if (!applicationproperties.isDebugBuild())
        {
            t1.o = new SoundCloudHostnameVerifier();
        }
        return t1;
    }
}
