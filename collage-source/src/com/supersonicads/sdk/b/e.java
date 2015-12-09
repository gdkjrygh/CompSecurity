// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.supersonicads.sdk.b;

import android.os.AsyncTask;
import java.net.HttpURLConnection;
import java.net.URL;

public class e extends AsyncTask
{

    public e()
    {
    }

    protected transient Integer a(String as[])
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        as = (HttpURLConnection)(new URL(as[0])).openConnection();
        as.setConnectTimeout(3000);
        as.getInputStream();
        if (as != null)
        {
            as.disconnect();
        }
_L1:
        return Integer.valueOf(1);
        obj;
        as = ((String []) (obj1));
        obj1 = obj;
_L4:
        obj = as;
        ((Exception) (obj1)).printStackTrace();
        if (as != null)
        {
            as.disconnect();
        }
          goto _L1
        Exception exception;
        exception;
        as = ((String []) (obj));
        obj = exception;
_L3:
        if (as != null)
        {
            as.disconnect();
        }
        throw obj;
        obj;
        if (true) goto _L3; else goto _L2
_L2:
        exception;
          goto _L4
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }
}
