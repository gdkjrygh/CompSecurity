// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.os.AsyncTask;
import com.facebook.internal.Utility;

// Referenced classes of package com.facebook.widget:
//            LoginButton

class val.appId extends AsyncTask
{

    final LoginButton this$0;
    final String val$appId;

    protected transient com.facebook.internal.dAppSettings doInBackground(Void avoid[])
    {
        return Utility.queryAppSettings(val$appId, false);
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected void onPostExecute(com.facebook.internal.dAppSettings dappsettings)
    {
        LoginButton.access$300(LoginButton.this, dappsettings);
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((com.facebook.internal.dAppSettings)obj);
    }

    hedAppSettings()
    {
        this$0 = final_loginbutton;
        val$appId = String.this;
        super();
    }
}
