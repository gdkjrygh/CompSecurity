// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;
import com.admarvel.android.util.Logging;
import java.net.URL;

// Referenced classes of package com.admarvel.android.ads:
//            VideoInterstitialControls

private class imageView extends AsyncTask
{

    ImageView imageView;
    final VideoInterstitialControls this$0;

    protected transient Bitmap doInBackground(String as[])
    {
        as = as[0];
        try
        {
            as = BitmapFactory.decodeStream((new URL(as)).openStream());
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            Logging.log(Log.getStackTraceString(as));
            return null;
        }
        return as;
    }

    protected volatile transient Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected void onPostExecute(Bitmap bitmap)
    {
        imageView.setImageBitmap(bitmap);
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Bitmap)obj);
    }

    public (ImageView imageview)
    {
        this$0 = VideoInterstitialControls.this;
        super();
        imageView = imageview;
    }
}
