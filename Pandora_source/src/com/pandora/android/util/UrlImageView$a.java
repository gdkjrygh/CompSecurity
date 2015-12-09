// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

// Referenced classes of package com.pandora.android.util:
//            UrlImageView

class a extends AsyncTask
{

    final UrlImageView a;
    private String b;

    public transient BitmapDrawable a(String as[])
    {
        b = as[0];
        if (b != null && b.length() != 0) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        as = (new URL(b)).openConnection().getInputStream();
        if (isCancelled()) goto _L1; else goto _L3
_L3:
        as = UrlImageView.a(BitmapFactory.decodeStream(as), UrlImageView.a(a), UrlImageView.b(a));
        as = new BitmapDrawable(a.getResources(), as);
_L5:
        return as;
        as;
        as.printStackTrace();
        as = null;
        continue; /* Loop/switch isn't completed */
        as;
        as.printStackTrace();
        as = null;
        continue; /* Loop/switch isn't completed */
        as;
        as.printStackTrace();
        as = null;
        continue; /* Loop/switch isn't completed */
        as;
        as.printStackTrace();
        as = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected void a(BitmapDrawable bitmapdrawable)
    {
        if (bitmapdrawable != null)
        {
            UrlImageView.a(a, b, bitmapdrawable);
            a.setImageDrawable(bitmapdrawable);
        }
    }

    public Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((BitmapDrawable)obj);
    }

    (UrlImageView urlimageview)
    {
        a = urlimageview;
        super();
    }
}
