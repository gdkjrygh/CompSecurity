// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.net.http;

import com.vungle.publisher.device.data.AppFingerprint;
import javax.inject.Provider;
import org.json.JSONException;

// Referenced classes of package com.vungle.publisher.net.http:
//            IngestHttpRequest, HttpRequest

public class AppFingerprintHttpRequest extends IngestHttpRequest
{
    public static class Factory extends IngestHttpRequest.Factory
    {

        Provider a;

        public final AppFingerprintHttpRequest a(AppFingerprint appfingerprint)
            throws JSONException
        {
            AppFingerprintHttpRequest appfingerprinthttprequest = (AppFingerprintHttpRequest)d();
            appfingerprinthttprequest.d = appfingerprint.c();
            return appfingerprinthttprequest;
        }

        protected final String a()
        {
            return "installedApps";
        }

        protected final HttpRequest b()
        {
            return (AppFingerprintHttpRequest)a.get();
        }

        public Factory()
        {
        }
    }


    public AppFingerprintHttpRequest()
    {
    }

    protected final HttpRequest.b a()
    {
        return HttpRequest.b.l;
    }
}
