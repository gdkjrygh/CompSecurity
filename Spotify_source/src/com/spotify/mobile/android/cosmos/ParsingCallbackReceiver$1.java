// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos;

import com.spotify.cosmos.router.Response;

// Referenced classes of package com.spotify.mobile.android.cosmos:
//            ParsingCallbackReceiver

class val.parsedObject
    implements Runnable
{

    final ParsingCallbackReceiver this$0;
    final Object val$parsedObject;
    final Response val$response;

    public void run()
    {
        onResolved(val$response, val$parsedObject);
    }

    A()
    {
        this$0 = final_parsingcallbackreceiver;
        val$response = response1;
        val$parsedObject = Object.this;
        super();
    }
}
