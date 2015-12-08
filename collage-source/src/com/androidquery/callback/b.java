// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.androidquery.callback;

import java.net.Proxy;
import org.apache.http.HttpRequest;
import org.apache.http.impl.client.DefaultHttpClient;

// Referenced classes of package com.androidquery.callback:
//            AbstractAjaxCallback

public abstract class b
{

    public b()
    {
    }

    public abstract Proxy a(AbstractAjaxCallback abstractajaxcallback);

    public abstract void a(AbstractAjaxCallback abstractajaxcallback, HttpRequest httprequest, DefaultHttpClient defaulthttpclient);
}
