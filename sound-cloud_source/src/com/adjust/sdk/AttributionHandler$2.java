// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;

import org.json.JSONObject;

// Referenced classes of package com.adjust.sdk:
//            AttributionHandler

class val.jsonResponse
    implements Runnable
{

    final AttributionHandler this$0;
    final JSONObject val$jsonResponse;

    public void run()
    {
        AttributionHandler.access$100(AttributionHandler.this, val$jsonResponse);
    }

    ()
    {
        this$0 = final_attributionhandler;
        val$jsonResponse = JSONObject.this;
        super();
    }
}
