// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.accessenable;

import android.os.AsyncTask;
import com.adobe.adobepass.accessenabler.utils.Log;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.BasicHttpContext;
import timber.log.Timber;

// Referenced classes of package com.phunware.nbc.sochi.accessenable:
//            TempPassResetActivity

private class <init> extends AsyncTask
{

    final TempPassResetActivity this$0;

    private Integer performHttpDelete(String s, String s1)
    {
        int i;
        try
        {
            s1 = new HttpDelete(s1);
            s1.setHeader("apiKey", s);
            i = (new DefaultHttpClient()).execute(s1, new BasicHttpContext()).getStatusLine().getStatusCode();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Timber.e("Error on delete", new Object[] {
                s
            });
            return Integer.valueOf(0);
        }
        return Integer.valueOf(i);
    }

    protected transient Integer doInBackground(String as[])
    {
        String s1 = as[0];
        String s = as[1];
        String s2 = as[2];
        as = as[3];
        as = (new StringBuilder()).append("https://").append(s1).append(TempPassResetActivity.access$700()).append("?device_id=").append(s2).append("&requestor_id=").append(TempPassResetActivity.access$600(TempPassResetActivity.this)).append("&mvpd_id=").append(as).toString();
        Log.d("TempPassResetActivity", (new StringBuilder()).append("Target URL: ").append(as).toString());
        return performHttpDelete(s, as);
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected void onPostExecute(Integer integer)
    {
        TempPassResetActivity.access$800(TempPassResetActivity.this, integer.intValue());
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Integer)obj);
    }

    private ()
    {
        this$0 = TempPassResetActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
