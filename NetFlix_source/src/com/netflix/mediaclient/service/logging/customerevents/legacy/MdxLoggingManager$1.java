// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.customerevents.legacy;

import com.netflix.mediaclient.Log;
import java.io.IOException;
import org.apache.http.HttpException;
import org.json.JSONException;

// Referenced classes of package com.netflix.mediaclient.service.logging.customerevents.legacy:
//            MdxLoggingManager, MdxCustomerEvent

class val.cevent
    implements Runnable
{

    final MdxLoggingManager this$0;
    final MdxCustomerEvent val$cevent;

    public void run()
    {
        try
        {
            val$cevent.execute();
            return;
        }
        catch (IOException ioexception)
        {
            Log.e("nf_mdxMdxLoggingManager", (new StringBuilder()).append("sendEvent IOException ").append(ioexception).toString());
            return;
        }
        catch (JSONException jsonexception)
        {
            Log.e("nf_mdxMdxLoggingManager", (new StringBuilder()).append("sendEvent JSONException ").append(jsonexception).toString());
            return;
        }
        catch (HttpException httpexception)
        {
            Log.e("nf_mdxMdxLoggingManager", (new StringBuilder()).append("sendEvent HttpException ").append(httpexception).toString());
        }
    }

    ()
    {
        this$0 = final_mdxloggingmanager;
        val$cevent = MdxCustomerEvent.this;
        super();
    }
}
