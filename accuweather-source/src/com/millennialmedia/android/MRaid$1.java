// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Context;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

// Referenced classes of package com.millennialmedia.android:
//            MRaid, MMLog

static final class val.context
    implements Runnable
{

    final Context val$context;
    final String val$url;

    public void run()
    {
        MMLog.w("MRaid", (new StringBuilder()).append("MMJS -  download start (").append(val$url).append(")").toString());
        Object obj = new HttpGet(val$url);
        obj = (new DefaultHttpClient()).execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
        MMLog.w("MRaid", (new StringBuilder()).append("MMJS -  download finish (").append(val$url).append(")").toString());
        if (MRaid.saveMRaid(val$context, ((HttpResponse) (obj)).getEntity().getContent()) && MRaid.storeMraidUrl(val$context, val$url))
        {
            MMLog.w("MRaid", (new StringBuilder()).append("MMJS -  download saved (").append(val$url).append(")").toString());
        }
        if (MRaid.finishedRef == null) goto _L2; else goto _L1
_L1:
        nished nished = (nished)MRaid.finishedRef.get();
        if (nished == null) goto _L2; else goto _L3
_L3:
        nished.finished();
_L2:
        return;
        Object obj1;
        obj1;
        MMLog.e("MRaid", "Mraid download exception: ", ((Throwable) (obj1)));
        if (MRaid.finishedRef == null) goto _L2; else goto _L4
_L4:
        obj1 = (nished)MRaid.finishedRef.get();
        if (obj1 == null) goto _L2; else goto _L5
_L5:
        break; /* Loop/switch isn't completed */
        obj1;
        MMLog.e("MRaid", "Mraid download exception: ", ((Throwable) (obj1)));
        if (MRaid.finishedRef == null) goto _L2; else goto _L6
_L6:
        obj1 = (nished)MRaid.finishedRef.get();
        if (obj1 == null) goto _L2; else goto _L7
_L7:
        break; /* Loop/switch isn't completed */
        obj1;
        MMLog.e("MRaid", "Mraid download exception: ", ((Throwable) (obj1)));
        if (MRaid.finishedRef == null) goto _L2; else goto _L8
_L8:
        obj1 = (nished)MRaid.finishedRef.get();
        if (obj1 == null) goto _L2; else goto _L3
        obj1;
        if (MRaid.finishedRef != null)
        {
            nished nished1 = (nished)MRaid.finishedRef.get();
            if (nished1 != null)
            {
                nished1.finished();
            }
        }
        throw obj1;
    }

    nished(String s, Context context1)
    {
        val$url = s;
        val$context = context1;
        super();
    }
}
