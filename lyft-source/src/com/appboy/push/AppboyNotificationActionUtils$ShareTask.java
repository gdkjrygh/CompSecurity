// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.push;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import com.appboy.support.AppboyLogger;

// Referenced classes of package com.appboy.push:
//            AppboyNotificationActionUtils

class mContext extends AsyncTask
{

    private final Context mContext;

    protected transient Intent doInBackground(Intent aintent[])
    {
        if (mContext != null)
        {
            return AppboyNotificationActionUtils.access$000(mContext, aintent[0]);
        } else
        {
            return null;
        }
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Intent[])aobj);
    }

    protected void onPostExecute(Intent intent)
    {
label0:
        {
            if (intent != null && mContext != null)
            {
                if (intent == null)
                {
                    break label0;
                }
                mContext.startActivity(intent);
            }
            return;
        }
        AppboyLogger.w(AppboyNotificationActionUtils.access$100(), "Null share intent received.  Not starting share intent.");
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Intent)obj);
    }

    public (Context context)
    {
        mContext = context;
    }
}
