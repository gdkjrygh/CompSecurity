// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol;

import com.vungle.publisher.net.http.HttpTransaction;

// Referenced classes of package com.vungle.publisher.protocol:
//            TrackInstallHttpResponseHandler

public class TrackInstallHttpTransactionFactory extends com.vungle.publisher.net.http.HttpTransaction.Factory
{

    TrackInstallHttpRequest.Factory a;
    TrackInstallHttpResponseHandler b;

    public TrackInstallHttpTransactionFactory()
    {
    }

    public final HttpTransaction a()
    {
        return super.a(a.d(), b);
    }
}
