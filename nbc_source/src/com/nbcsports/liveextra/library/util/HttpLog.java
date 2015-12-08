// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.util;

import android.os.AsyncTask;
import android.os.Build;
import com.phunware.nbc.sochi.system.NBCSystem;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import org.joda.time.DateTime;

public class HttpLog
{
    class HttpFireForgetTask extends AsyncTask
    {

        private Exception exception;
        final HttpLog this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected transient String doInBackground(String as[])
        {
            Object obj;
            Object obj1;
            try
            {
                obj = new URL(as[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                exception = as;
                return null;
            }
            obj1 = as[1];
            obj1 = as[2];
            as = ((URL) (obj)).openConnection();
            as.setDoOutput(true);
            obj = (new StringBuilder()).append("id=").append(URLEncoder.encode(Build.DEVICE, mEncoding)).append("&time=").append(URLEncoder.encode(DateTime.now().toString(), mEncoding)).append("&content=").append(URLEncoder.encode(((String) (obj1)), mEncoding)).toString();
            as.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            as.addRequestProperty("Cache-Control", "no-cache");
            as.addRequestProperty("Cache-Control", "max-age=0");
            as.setRequestProperty("Content-Length", Integer.toString(((String) (obj)).getBytes().length));
            obj1 = as.getOutputStream();
            ((OutputStream) (obj1)).write(((String) (obj)).getBytes());
            ((OutputStream) (obj1)).flush();
            ((OutputStream) (obj1)).close();
            obj = new StringBuilder();
            as = new BufferedReader(new InputStreamReader(as.getInputStream()));
_L1:
            obj1 = as.readLine();
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_234;
            }
            ((StringBuilder) (obj)).append((new StringBuilder()).append(((String) (obj1))).append("\n").toString());
              goto _L1
            as.close();
            as = String.format("Return: %s", new Object[] {
                ((StringBuilder) (obj)).toString()
            });
            return as;
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((String)obj);
        }

        protected void onPostExecute(String s)
        {
            NBCSystem.debugLog(HttpLog.TAG, s);
        }

        HttpFireForgetTask()
        {
            this$0 = HttpLog.this;
            super();
        }
    }


    private static String TAG = "HTTP_LOG";
    private String mEncoding;
    private String mEndpoint;

    public HttpLog(String s, String s1)
    {
        mEndpoint = s;
        mEncoding = s1;
    }

    public void LogHttp(String s, String s1)
    {
        (new HttpFireForgetTask()).execute(new String[] {
            mEndpoint, s, s1
        });
    }



}
