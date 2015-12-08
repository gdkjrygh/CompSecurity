// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.net.http;

import com.vungle.publisher.device.data.AppFingerprint;
import org.json.JSONException;

// Referenced classes of package com.vungle.publisher.net.http:
//            AppFingerprintHttpResponseHandler, HttpTransaction

public class AppFingerprintHttpTransactionFactory extends HttpTransaction.Factory
{

    AppFingerprintHttpRequest.Factory a;
    AppFingerprintHttpResponseHandler b;

    public AppFingerprintHttpTransactionFactory()
    {
    }

    public final HttpTransaction a(AppFingerprint appfingerprint)
        throws JSONException
    {
        return super.a(a.a(appfingerprint), b);
    }
}
