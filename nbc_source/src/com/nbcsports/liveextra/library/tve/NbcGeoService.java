// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import com.google.gson.Gson;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import rx.Observable;
import rx.Subscriber;

public class NbcGeoService
{
    public class NbcGeoReponse
    {

        String areaCode;
        String city;
        String continent;
        String countryCode;
        String county;
        String dma;
        String latitude;
        String longitude;
        boolean military;
        String msa;
        String pmsa;
        String regionCode;
        final NbcGeoService this$0;
        String timezone;
        String xffip;
        String zip;

        public String getAreaCode()
        {
            return areaCode;
        }

        public String getCity()
        {
            return city;
        }

        public String getContinent()
        {
            return continent;
        }

        public String getCountryCode()
        {
            return countryCode;
        }

        public String getCounty()
        {
            return county;
        }

        public String getDma()
        {
            return dma;
        }

        public String getLatitude()
        {
            return latitude;
        }

        public String getLongitude()
        {
            return longitude;
        }

        public String getMsa()
        {
            return msa;
        }

        public String getPmsa()
        {
            return pmsa;
        }

        public String getRegionCode()
        {
            return regionCode;
        }

        public String getTimezone()
        {
            return timezone;
        }

        public String getXffip()
        {
            return xffip;
        }

        public String getZip()
        {
            return zip;
        }

        public boolean isMilitary()
        {
            return military;
        }

        public NbcGeoReponse()
        {
            this$0 = NbcGeoService.this;
            super();
        }
    }


    public static final String SERVICE_URL = "http://geo.nbcsports.com/";
    private final OkHttpClient client;
    private final Gson gson;

    public NbcGeoService(Gson gson1, OkHttpClient okhttpclient)
    {
        gson = gson1;
        client = okhttpclient;
    }

    public Observable getNbcGeoResponseObservable()
    {
        this;
        JVM INSTR monitorenter ;
        Observable observable = Observable.create(new rx.Observable.OnSubscribe() {

            final NbcGeoService this$0;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                Request request = (new com.squareup.okhttp.Request.Builder()).url("http://geo.nbcsports.com/").get().build();
                client.newCall(request).enqueue(subscriber. new Callback() {

                    final _cls1 this$1;
                    final Subscriber val$subscriber;

                    public void onFailure(Request request, IOException ioexception)
                    {
                        subscriber.onError(ioexception);
                    }

                    public void onResponse(Response response)
                        throws IOException
                    {
                        response = (NbcGeoReponse)(new Gson()).fromJson(response.body().charStream(), com/nbcsports/liveextra/library/tve/NbcGeoService$NbcGeoReponse);
                        subscriber.onNext(response);
                        subscriber.onCompleted();
                    }

            
            {
                this$1 = final__pcls1;
                subscriber = Subscriber.this;
                super();
            }
                });
            }

            
            {
                this$0 = NbcGeoService.this;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return observable;
        Exception exception;
        exception;
        throw exception;
    }

}
