// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;


// Referenced classes of package com.google.api.client.http:
//            HttpBackOffUnsuccessfulResponseHandler, HttpResponse

public static interface _cls2
{

    public static final _cls2 ALWAYS = new HttpBackOffUnsuccessfulResponseHandler.BackOffRequired() {

        public boolean isRequired(HttpResponse httpresponse)
        {
            return true;
        }

    };
    public static final _cls1 ON_SERVER_ERROR = new HttpBackOffUnsuccessfulResponseHandler.BackOffRequired() {

        public boolean isRequired(HttpResponse httpresponse)
        {
            return httpresponse.getStatusCode() / 100 == 5;
        }

    };

    public abstract boolean isRequired(HttpResponse httpresponse);

}
