// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import retrofit.appengine.UrlFetchClient;

class <init> extends <init>
{

    retrofit.client. defaultClient()
    {
        class _cls1
            implements retrofit.client.Client.Provider
        {

            final Platform.AppEngine this$0;
            final UrlFetchClient val$client;

            public Client get()
            {
                return client;
            }

            _cls1()
            {
                this$0 = Platform.AppEngine.this;
                client = urlfetchclient;
                super();
            }
        }

        return new _cls1();
    }

    private der()
    {
        super(null);
    }

    >(> >)
    {
        this();
    }
}
