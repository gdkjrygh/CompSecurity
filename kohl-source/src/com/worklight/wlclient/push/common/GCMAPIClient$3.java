// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.push.common;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.worklight.wlclient.push.common:
//            GCMAPIClient

class val.androidKey extends AsyncTask
{

    final GCMAPIClient this$0;
    final String val$alias;
    final String val$androidKey;
    final Context val$context;
    final String val$tag;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient Void doInBackground(Void avoid[])
    {
        if (GCMAPIClient.access$200(GCMAPIClient.this) == null)
        {
            GCMAPIClient.access$202(GCMAPIClient.this, GoogleCloudMessaging.getInstance(val$context.getApplicationContext()));
        }
        avoid = Integer.toString((new AtomicInteger()).incrementAndGet());
        Bundle bundle = new Bundle();
        bundle.putString("action", "com.worklight.wlclient.push.DISMISS_NOTIFICATION");
        if (val$alias != null)
        {
            bundle.putString("alias", val$alias);
        }
        if (val$tag != null)
        {
            bundle.putString("tag", val$tag);
        }
        try
        {
            GCMAPIClient.access$200(GCMAPIClient.this).send(val$androidKey, avoid, bundle);
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            avoid.printStackTrace();
        }
        return null;
    }

    ()
    {
        this$0 = final_gcmapiclient;
        val$context = context1;
        val$alias = s;
        val$tag = s1;
        val$androidKey = String.this;
        super();
    }
}
