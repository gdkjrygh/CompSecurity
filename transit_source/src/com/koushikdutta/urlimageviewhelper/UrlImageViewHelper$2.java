// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.koushikdutta.urlimageviewhelper;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

// Referenced classes of package com.koushikdutta.urlimageviewhelper:
//            UrlImageViewHelper, DrawableCache, UrlImageViewCallback

static final class val.downloads
    implements Runnable
{

    static final boolean $assertionsDisabled;
    final UrlImageViewCallback val$callback;
    final Drawable val$defaultDrawable;
    final ArrayList val$downloads;
    final ImageView val$imageView;
    final ader val$loader;
    final String val$url;

    public void run()
    {
        if (!$assertionsDisabled && !Looper.myLooper().equals(Looper.getMainLooper()))
        {
            throw new AssertionError();
        }
        Object obj1 = val$loader.result;
        Object obj = null;
        if (obj1 != null)
        {
            obj = new mbieDrawable(val$url, UrlImageViewHelper.mResources, ((android.graphics.Bitmap) (obj1)));
        }
        obj1 = obj;
        if (obj == null)
        {
            UrlImageViewHelper.clog((new StringBuilder()).append("No usable result, defaulting ").append(val$url).toString(), new Object[0]);
            obj1 = val$defaultDrawable;
            UrlImageViewHelper.access$200().put(val$url, obj1);
        }
        UrlImageViewHelper.access$300().remove(val$url);
        if (val$callback != null && val$imageView == null)
        {
            val$callback.onLoaded(null, val$loader.result, val$url, false);
        }
        int i = 0;
        obj = val$downloads.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            ImageView imageview = (ImageView)((Iterator) (obj)).next();
            String s = (String)UrlImageViewHelper.access$400().get(imageview);
            if (!val$url.equals(s))
            {
                UrlImageViewHelper.clog((new StringBuilder()).append("Ignoring out of date request to update view for ").append(val$url).append(" ").append(s).append(" ").append(imageview).toString(), new Object[0]);
            } else
            {
                int j = i + 1;
                UrlImageViewHelper.access$400().remove(imageview);
                if (obj1 != null)
                {
                    imageview.setImageDrawable(((Drawable) (obj1)));
                }
                i = j;
                if (val$callback != null)
                {
                    i = j;
                    if (imageview == val$imageView)
                    {
                        val$callback.onLoaded(imageview, val$loader.result, val$url, false);
                        i = j;
                    }
                }
            }
        } while (true);
        UrlImageViewHelper.clog((new StringBuilder()).append("Populated: ").append(i).toString(), new Object[0]);
    }

    static 
    {
        boolean flag;
        if (!com/koushikdutta/urlimageviewhelper/UrlImageViewHelper.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

    ader(ader ader, String s, Drawable drawable, UrlImageViewCallback urlimageviewcallback, ImageView imageview, ArrayList arraylist)
    {
        val$loader = ader;
        val$url = s;
        val$defaultDrawable = drawable;
        val$callback = urlimageviewcallback;
        val$imageView = imageview;
        val$downloads = arraylist;
        super();
    }
}
