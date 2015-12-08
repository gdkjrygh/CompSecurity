// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;
import java.net.URL;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            ProgramDetailLinkActivity

private class bmImage extends AsyncTask
{

    ImageView bmImage;
    final ProgramDetailLinkActivity this$0;

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
            return null;
        }
        return as;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected void onPostExecute(Bitmap bitmap)
    {
        bmImage.setImageBitmap(bitmap);
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Bitmap)obj);
    }

    public (ImageView imageview)
    {
        this$0 = ProgramDetailLinkActivity.this;
        super();
        bmImage = imageview;
    }
}
