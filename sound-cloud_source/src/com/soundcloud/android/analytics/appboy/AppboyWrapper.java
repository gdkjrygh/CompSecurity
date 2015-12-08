// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics.appboy;

import android.app.Activity;
import android.util.Base64;
import bo.app.ac;
import bo.app.br;
import com.appboy.a;
import com.appboy.c;
import com.appboy.d.b.b;

public class AppboyWrapper
{

    private final a appboy;

    public AppboyWrapper(a a1)
    {
        appboy = a1;
    }

    private String encodeUserId(String s)
    {
        return Base64.encodeToString(s.getBytes(), 2);
    }

    c changeUser(String s)
    {
        return appboy.c(encodeUserId(s));
    }

    public boolean closeSession(Activity activity)
    {
        return appboy.b(activity);
    }

    public void handleRegistration(String s)
    {
        appboy.d(s);
    }

    boolean logCustomEvent(String s)
    {
        return appboy.a(s);
    }

    boolean logCustomEvent(String s, com.appboy.d.b.a a1)
    {
        return appboy.a(s, a1);
    }

    public boolean openSession(Activity activity)
    {
        return appboy.a(activity);
    }

    public void registerInAppMessageManager(Activity activity)
    {
        com.appboy.ui.inappmessage.a.a().a(activity);
    }

    void requestImmediateDataFlush()
    {
        appboy.d();
    }

    public void requestInAppMessageRefresh()
    {
        a a1 = appboy;
        Object obj = a1.h;
        obj;
        JVM INSTR monitorenter ;
        a1.f.a(ac.b);
_L1:
        return;
        Exception exception1;
        exception1;
        a1.a(exception1);
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    public void setAppboyEndpointProvider(final String authority)
    {
        a.a(new _cls1());
    }

    public void setAttribution(String s, String s1, String s2, String s3)
    {
        s = new b(s, s1, s2, s3);
        appboy.e().a(s);
    }

    public void unregisterInAppMessageManager(Activity activity)
    {
        com.appboy.ui.inappmessage.a.a().b(activity);
    }

    private class _cls1
        implements f
    {

        final AppboyWrapper this$0;
        final String val$authority;

        public Uri getApiEndpoint(Uri uri)
        {
            return uri.buildUpon().authority(authority).build();
        }

        public Uri getResourceEndpoint(Uri uri)
        {
            return uri;
        }

        _cls1()
        {
            this$0 = AppboyWrapper.this;
            authority = s;
            super();
        }
    }

}
