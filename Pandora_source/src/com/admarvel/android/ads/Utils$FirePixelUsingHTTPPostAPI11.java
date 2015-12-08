// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.os.AsyncTask;

// Referenced classes of package com.admarvel.android.ads:
//            Utils

private class url
    implements Runnable
{

    final Utils this$0;
    private String url;

    public void run()
    {
        (new url(Utils.this, url)).tor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public (String s)
    {
        this$0 = Utils.this;
        super();
        url = s;
    }
}
