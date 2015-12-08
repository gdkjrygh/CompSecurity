// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;

import android.content.Context;

// Referenced classes of package com.splunk.mint:
//            Mint, Properties, MintUrls

static final class 
    implements Runnable
{

    final String val$apiKey;
    final Context val$context;
    final String val$url;

    public void run()
    {
        Properties.initialize(val$context);
        new MintUrls(val$url, val$apiKey);
        Mint.access$000();
        if (!Mint.netInitializedSuccessfully)
        {
            Mint.access$100();
        }
        Mint.startSession(val$context);
        Mint.flush();
    }

    (Context context1, String s, String s1)
    {
        val$context = context1;
        val$url = s;
        val$apiKey = s1;
        super();
    }
}
