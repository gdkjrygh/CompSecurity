// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import retrofit.appengine.UrlFetchClient;
import retrofit.client.Client;

// Referenced classes of package retrofit:
//            Platform

private static class <init> extends <init>
{

    retrofit.client.lient defaultClient()
    {
        return new retrofit.client.Client.Provider() {

            final Platform.AppEngine this$0;
            final UrlFetchClient val$client;

            public Client get()
            {
                return client;
            }

            
            {
                this$0 = Platform.AppEngine.this;
                client = urlfetchclient;
                super();
            }
        };
    }

    private _cls1.val.client()
    {
        super(null);
    }

    >(> >)
    {
        this();
    }
}
