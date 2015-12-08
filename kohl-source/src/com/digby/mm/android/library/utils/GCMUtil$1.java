// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.utils;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import java.util.Random;

// Referenced classes of package com.digby.mm.android.library.utils:
//            GCMUtil

static final class val.context extends AsyncTask
{

    final Context val$context;

    protected transient Boolean doInBackground(String as[])
    {
        int i;
        long l;
        as = as[0];
        l = GCMUtil.access$000().nextInt(1000) + 2000;
        i = 1;
_L2:
        if (i > 5)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        Log.d("GCMUtil", (new StringBuilder()).append("Attempt #").append(i).append(" to register with senderId =").append(as).toString());
        Object obj;
        if (GCMUtil.access$100() == null)
        {
            GCMUtil.access$102(GoogleCloudMessaging.getInstance(val$context));
        }
        obj = GCMUtil.access$100().register(new String[] {
            as
        });
        GCMUtil.access$200(val$context, ((String) (obj)));
        obj = Boolean.TRUE;
        return ((Boolean) (obj));
        Exception exception;
        exception;
        if (i != 5)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        return Boolean.FALSE;
        try
        {
            Thread.sleep(l);
        }
        catch (InterruptedException interruptedexception)
        {
            Thread.currentThread().interrupt();
        }
        l *= 2L;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    ng(Context context1)
    {
        val$context = context1;
        super();
    }
}
