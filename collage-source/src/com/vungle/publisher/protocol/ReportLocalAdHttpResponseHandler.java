// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol;

import com.vungle.publisher.cx;
import com.vungle.publisher.net.http.HttpResponse;
import com.vungle.publisher.net.http.HttpTransaction;
import com.vungle.publisher.protocol.message.ReportLocalAd;
import com.vungle.publisher.protocol.message.RequestLocalAd;
import java.io.IOException;
import org.json.JSONException;

// Referenced classes of package com.vungle.publisher.protocol:
//            ReportLocalAdHttpRequest, ReportAdHttpRequest, EventTrackingHttpLogEntryDeleteDelegate

class ReportLocalAdHttpResponseHandler extends cx
{

    EventTrackingHttpLogEntryDeleteDelegate b;

    ReportLocalAdHttpResponseHandler()
    {
    }

    protected final void a(HttpTransaction httptransaction, HttpResponse httpresponse)
        throws IOException, JSONException
    {
        super.a(httptransaction, httpresponse);
        b.a(((RequestLocalAd)((ReportLocalAd)((ReportAdHttpRequest) ((ReportLocalAdHttpRequest)httptransaction.a)).g).d()).g);
    }
}
