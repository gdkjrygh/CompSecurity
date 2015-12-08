// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;


// Referenced classes of package com.millennialmedia.android:
//            HttpGetRequest, MMLog

static final class val.urls
    implements Runnable
{

    final String val$urls[];

    public void run()
    {
        String as[] = val$urls;
        int j = as.length;
        int i = 0;
        while (i < j) 
        {
            String s = as[i];
            MMLog.v("HttpGetRequest", String.format("Logging event to: %s", new Object[] {
                s
            }));
            try
            {
                (new HttpGetRequest()).get(s);
            }
            catch (Exception exception)
            {
                MMLog.e("HttpGetRequest", "Logging request failed.", exception);
            }
            i++;
        }
    }

    (String as[])
    {
        val$urls = as;
        super();
    }
}
