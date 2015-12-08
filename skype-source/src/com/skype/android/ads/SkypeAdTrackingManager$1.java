// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.ads;

import android.util.Log;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpRequestBase;

// Referenced classes of package com.skype.android.ads:
//            SkypeAdTrackingManager

final class a
    implements ponseListener
{

    final int a;
    final SkypeAdTrackingManager b;

    public final void a(HttpRequestBase httprequestbase, Exception exception)
    {
        Log.e("SkypeAdTrackingManager", (new StringBuilder("post tracking exception ")).append(exception.toString()).toString());
        SkypeAdTrackingManager.a(SkypeAdTrackingManager.c() + a);
    }

    public final void a(HttpRequestBase httprequestbase, HttpResponse httpresponse)
    {
        (new StringBuilder("Tracking Server Response status code: ")).append(httpresponse.getStatusLine().getStatusCode());
        if (httpresponse.getStatusLine().getStatusCode() >= 400)
        {
            SkypeAdTrackingManager.a(SkypeAdTrackingManager.c() + a);
        } else
        {
            SkypeAdTrackingManager.a(0);
        }
        try
        {
            httprequestbase = httpresponse.getEntity();
        }
        // Misplaced declaration of an exception variable
        catch (HttpRequestBase httprequestbase)
        {
            Log.e("SkypeAdTrackingManager", (new StringBuilder("tracking exception ")).append(httprequestbase.toString()).toString());
            return;
        }
        if (httprequestbase == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        httprequestbase = httprequestbase.getContent();
        if (httprequestbase == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        httprequestbase.close();
    }

    ponseListener(SkypeAdTrackingManager skypeadtrackingmanager, int i)
    {
        b = skypeadtrackingmanager;
        a = i;
        super();
    }
}
