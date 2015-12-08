// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;
import com.facebook.ads.internal.view.e;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;

// Referenced classes of package com.facebook.ads.internal.util:
//            l, m, g, r, 
//            b, c

public class k extends AsyncTask
{

    private static final String a = com/facebook/ads/internal/util/k.getSimpleName();
    private final Context b;
    private final ImageView c;
    private final e d;
    private l e;

    public k(Context context)
    {
        b = context;
        d = null;
        c = null;
    }

    public k(ImageView imageview)
    {
        b = imageview.getContext();
        d = null;
        c = imageview;
    }

    public k(e e1)
    {
        b = e1.getContext();
        d = e1;
        c = null;
    }

    public k a(l l1)
    {
        e = l1;
        return this;
    }

    protected void a(Bitmap abitmap[])
    {
        if (c != null)
        {
            c.setImageBitmap(abitmap[0]);
        }
        if (d != null)
        {
            d.a(abitmap[0], abitmap[1]);
        }
        if (e != null)
        {
            e.a();
        }
    }

    protected transient Bitmap[] a(String as[])
    {
        Object obj2;
        String s;
        obj2 = null;
        s = as[0];
        as = m.a(b, s);
        Object obj;
        obj = as;
        if (as != null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        obj = as;
        Object obj1 = g.b().execute(new HttpGet(s)).getEntity();
        obj = as;
        byte abyte0[] = EntityUtils.toByteArray(((HttpEntity) (obj1)));
        obj = as;
        as = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length);
        obj = as;
        ((HttpEntity) (obj1)).consumeContent();
        obj = as;
        m.a(b, s, as);
        obj = as;
        as = ((String []) (obj));
        e e1 = d;
        obj = obj2;
        obj1 = as;
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        obj = obj2;
        obj1 = as;
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        obj = new r(as);
        ((r) (obj)).a(Math.round((float)as.getWidth() / 40F));
        obj = ((r) (obj)).a();
        obj1 = as;
_L2:
        return (new Bitmap[] {
            obj1, obj
        });
        Throwable throwable;
        throwable;
        obj = null;
        as = null;
_L3:
        Log.e(a, (new StringBuilder()).append("Error downloading image: ").append(s).toString(), throwable);
        com.facebook.ads.internal.util.c.a(com.facebook.ads.internal.util.b.a(throwable, null));
        throwable = ((Throwable) (obj));
        obj = as;
        if (true) goto _L2; else goto _L1
_L1:
        throwable;
        as = null;
          goto _L3
        throwable;
        obj = as;
        as = null;
          goto _L3
        throwable;
        obj = as;
          goto _L3
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Bitmap[])obj);
    }

}
