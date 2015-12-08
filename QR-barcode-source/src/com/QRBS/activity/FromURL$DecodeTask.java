// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.widget.ImageView;
import com.scannerfire.utils.Utils;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

// Referenced classes of package com.QRBS.activity:
//            FromURL

private class <init> extends AsyncTask
{

    final FromURL this$0;

    protected volatile transient Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected transient String doInBackground(String as[])
    {
        String s;
        as = getCorrectUrl(FromURL.access$0(FromURL.this));
        boolean flag;
        try
        {
            flag = FromURL.access$1(FromURL.this).checkConnectivity(FromURL.access$2(FromURL.this));
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            return "problem";
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            return "problem";
        }
        if (!flag)
        {
            return "noConn";
        }
        s = (new URL(as)).openConnection().getHeaderField("Content-Type");
        if (s == null)
        {
            return "noImage";
        }
        if (!s.startsWith("image/"))
        {
            return "noImage";
        } else
        {
            getBitmapFromURL(as);
            return "OK";
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((String)obj);
    }

    protected void onPostExecute(String s)
    {
        FromURL.access$1(FromURL.this).clearScreen();
        if (s.equals("OK"))
        {
            FromURL.access$3(FromURL.this).setImageBitmap(FromURL.access$4(FromURL.this));
            if (FromURL.access$4(FromURL.this).getHeight() > 2024 || FromURL.access$4(FromURL.this).getWidth() > 2024)
            {
                Utils.showToastNotification(FromURL.access$2(FromURL.this), getString(0x7f08010e));
            }
            FromURL.access$5(FromURL.this, FromURL.access$4(FromURL.this));
        } else
        {
            if (s.equals("noImage"))
            {
                Utils.showToastNotification(FromURL.access$2(FromURL.this), getString(0x7f08010f));
                return;
            }
            if (s.equals("noConn"))
            {
                Utils.showToastNotification(FromURL.access$2(FromURL.this), getString(0x7f0800ff));
                return;
            }
            if (s.equals("problem"))
            {
                Utils.showToastNotification(FromURL.access$2(FromURL.this), getString(0x7f080110));
                return;
            }
        }
    }

    private ()
    {
        this$0 = FromURL.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
