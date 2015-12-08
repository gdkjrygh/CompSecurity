// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api;

import android.support.v4.util.SparseArrayCompat;
import com.google.common.base.Objects;

// Referenced classes of package com.pinterest.api:
//            RequestParams, BaseApiResponseHandler

public final class ApiCacheStore
{

    private final SparseArrayCompat a = new SparseArrayCompat();

    protected ApiCacheStore()
    {
    }

    private static int b(String s, RequestParams requestparams, String s1)
    {
        return Objects.hashCode(new Object[] {
            s, requestparams.a(), s1
        });
    }

    public final BaseApiResponseHandler a(BaseApiResponseHandler baseapiresponsehandler, String s, RequestParams requestparams, String s1)
    {
        return new _cls1(baseapiresponsehandler, s, requestparams, s1);
    }

    public final String a(String s, RequestParams requestparams, String s1)
    {
        return (String)a.get(b(s, requestparams, s1));
    }

    public final void a(String s, RequestParams requestparams, String s1, String s2)
    {
        int i = b(s, requestparams, s1);
        a.put(i, s2);
    }

    private class _cls1 extends BaseApiResponseHandler
    {

        final BaseApiResponseHandler a;
        final String b;
        final RequestParams c;
        final String d;
        final ApiCacheStore e;

        public void onHeaderReceived(Map map)
        {
            a.onHeaderReceived(map);
        }

        public volatile void onResponse(Object obj)
        {
            onResponse((String)obj);
        }

        public void onResponse(String s)
        {
            e.a(b, c, d, s);
            a.onResponse(s);
        }

        _cls1(BaseApiResponseHandler baseapiresponsehandler, String s, RequestParams requestparams, String s1)
        {
            e = ApiCacheStore.this;
            a = baseapiresponsehandler;
            b = s;
            c = requestparams;
            d = s1;
            super();
        }
    }

}
