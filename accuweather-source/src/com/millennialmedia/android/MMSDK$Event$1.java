// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;


// Referenced classes of package com.millennialmedia.android:
//            MMSDK, HttpGetRequest, MMLog

static final class val.logString
    implements Runnable
{

    final String val$logString;

    public void run()
    {
        HttpGetRequest httpgetrequest = new HttpGetRequest();
        try
        {
            httpgetrequest.get(val$logString);
            return;
        }
        catch (Exception exception)
        {
            MMLog.e(G, "Error logging event: ", exception);
        }
    }

    (String s)
    {
        val$logString = s;
        super();
    }
}
