// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.os.AsyncTask;
import com.facebook.Session;

// Referenced classes of package com.kohls.mcommerce.opal.loyalty:
//            FacebookShareActivity

class this._cls0 extends AsyncTask
{

    final FacebookShareActivity this$0;

    protected transient Boolean doInBackground(Void avoid[])
    {
        if (Session.getActiveSession() != null)
        {
            Session.getActiveSession().closeAndClearTokenInformation();
        }
        return Boolean.valueOf(true);
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected void onPostExecute(Boolean boolean1)
    {
        if (!isFinishing());
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Boolean)obj);
    }

    ()
    {
        this$0 = FacebookShareActivity.this;
        super();
    }
}
