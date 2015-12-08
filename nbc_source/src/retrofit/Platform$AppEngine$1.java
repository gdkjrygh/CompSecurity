// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import retrofit.appengine.UrlFetchClient;
import retrofit.client.Client;

// Referenced classes of package retrofit:
//            Platform

class ent
    implements retrofit.client.ent
{

    final val.client this$0;
    final UrlFetchClient val$client;

    public Client get()
    {
        return val$client;
    }

    ent()
    {
        this$0 = final_ent;
        val$client = UrlFetchClient.this;
        super();
    }
}
