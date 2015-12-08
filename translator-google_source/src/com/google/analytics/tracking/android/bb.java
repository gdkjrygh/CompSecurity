// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;

// Referenced classes of package com.google.analytics.tracking.android:
//            ap, az

final class bb
    implements ap
{

    final az a;

    bb(az az)
    {
        a = az;
        super();
    }

    public final HttpClient a()
    {
        return new DefaultHttpClient();
    }
}
