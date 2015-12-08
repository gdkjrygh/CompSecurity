// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.client.OkClient;
import retrofit.converter.GsonConverter;
import rx.Observable;

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            AnvatoRequest

public class Anvato
{
    public static interface API
    {

        public abstract Observable channelLookup(String s, AnvatoRequest anvatorequest);

        public abstract Observable eventLookup(String s, AnvatoRequest anvatorequest);

        public abstract Observable schedulerLookup(String s, AnvatoRequest anvatorequest);
    }


    private final OkHttpClient client;
    private final Gson gson;

    public Anvato(Gson gson1, OkHttpClient okhttpclient)
    {
        gson = gson1;
        client = okhttpclient;
    }

    private RequestInterceptor getRequestInterceptor()
    {
        return new RequestInterceptor() {

            final Anvato this$0;

            public void intercept(retrofit.RequestInterceptor.RequestFacade requestfacade)
            {
                requestfacade.addQueryParam("anvack", "nbcu_nbcsn_nbcsn_android_prod_b109b4f6825d04ea71bb272a16cd2c773aeb57df");
                requestfacade.addQueryParam("returnDebugInfo", "1");
            }

            
            {
                this$0 = Anvato.this;
                super();
            }
        };
    }

    public API getRestAdapter()
    {
        return (API)(new retrofit.RestAdapter.Builder()).setEndpoint("http://tkx-cable-prod.nbc.anvato.net").setClient(new OkClient(client)).setLogLevel(retrofit.RestAdapter.LogLevel.NONE).setRequestInterceptor(getRequestInterceptor()).setConverter(new GsonConverter(gson)).build().create(com/nbcsports/liveextra/library/tve/Anvato$API);
    }
}
