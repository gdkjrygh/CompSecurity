// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import com.scannerfire.utils.TinyURLUtils;
import com.scannerfire.utils.Utils;

// Referenced classes of package com.QRBS.activity:
//            CreateUrl

private class <init> extends AsyncTask
{

    final CreateUrl this$0;
    String tiny;

    protected volatile transient Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected transient String doInBackground(String as[])
    {
        tiny = TinyURLUtils.getTinyUrl(as[0]);
        return "OK";
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((String)obj);
    }

    protected void onPostExecute(String s)
    {
        if (tiny == null)
        {
            Utils.showToastNotification(CreateUrl.this, getString(0x7f08010b));
            return;
        } else
        {
            CreateUrl.access$0(CreateUrl.this, tiny);
            CreateUrl.access$1(CreateUrl.this).dismiss();
            return;
        }
    }

    protected void onPreExecute()
    {
    }

    protected volatile transient void onProgressUpdate(Object aobj[])
    {
        onProgressUpdate((Void[])aobj);
    }

    protected transient void onProgressUpdate(Void avoid[])
    {
    }

    private ()
    {
        this$0 = CreateUrl.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
