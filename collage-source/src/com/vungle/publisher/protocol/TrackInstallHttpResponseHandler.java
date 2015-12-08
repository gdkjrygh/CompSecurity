// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol;

import android.content.SharedPreferences;
import com.vungle.publisher.env.SdkState;
import com.vungle.publisher.net.http.FireAndForgetHttpResponseHandler;
import com.vungle.publisher.net.http.HttpResponse;
import com.vungle.publisher.net.http.HttpTransaction;
import java.io.IOException;
import org.json.JSONException;

public class TrackInstallHttpResponseHandler extends FireAndForgetHttpResponseHandler
{

    SdkState a;

    public TrackInstallHttpResponseHandler()
    {
    }

    protected final void a(HttpTransaction httptransaction, HttpResponse httpresponse)
        throws IOException, JSONException
    {
        super.a(httptransaction, httpresponse);
        a.n.edit().putBoolean("IsVgAppInstalled", true).apply();
    }
}
