// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.webkit.URLUtil;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.amobee.richmedia.view:
//            AmobeeView

class url extends AsyncTask
{

    final AmobeeView this$0;
    String url;

    protected transient Bitmap doInBackground(String as[])
    {
        url = as[0];
        try
        {
            if (URLUtil.isValidUrl(url))
            {
                as = (HttpURLConnection)(new URL(url)).openConnection();
                as.setDoInput(true);
                as.setUseCaches(true);
                as.connect();
                return BitmapFactory.decodeStream(as.getInputStream(), null, new android.graphics.>());
            }
            raiseError("Store picture failed.", "storePicture");
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            raiseError("Store picture failed.", "storePicture");
            return null;
        }
        return null;
    }

    protected volatile transient Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected void onPostExecute(Bitmap bitmap)
    {
        if (bitmap != null)
        {
            try
            {
                if (android.provider.ertImage(getContext().getContentResolver(), bitmap, url.substring(url.lastIndexOf("/") + 1), null) == null)
                {
                    raiseError("Store picture failed.", "storePicture");
                }
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bitmap bitmap)
            {
                raiseError("Store picture failed.", "storePicture");
            }
            return;
        } else
        {
            raiseError("Store picture failed.", "storePicture");
            return;
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Bitmap)obj);
    }

    ()
    {
        this$0 = AmobeeView.this;
        super();
        url = null;
    }
}
