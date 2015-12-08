// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley.toolbox;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.mopub.volley.RequestQueue;
import com.mopub.volley.VolleyError;
import java.util.HashMap;

// Referenced classes of package com.mopub.volley.toolbox:
//            g, d, h, ImageRequest, 
//            e, f

public class ImageLoader
{

    private final RequestQueue a;
    private int b;
    private final ImageCache c;
    private final HashMap d = new HashMap();
    private final HashMap e = new HashMap();
    private final Handler f = new Handler(Looper.getMainLooper());
    private Runnable g;

    public ImageLoader(RequestQueue requestqueue, ImageCache imagecache)
    {
        b = 100;
        a = requestqueue;
        c = imagecache;
    }

    private static String a(String s, int i, int j)
    {
        return (new StringBuilder(s.length() + 12)).append("#W").append(i).append("#H").append(j).append(s).toString();
    }

    static HashMap a(ImageLoader imageloader)
    {
        return imageloader.d;
    }

    private static void a()
    {
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            throw new IllegalStateException("ImageLoader must be invoked from the main thread.");
        } else
        {
            return;
        }
    }

    private void a(String s, h h1)
    {
        e.put(s, h1);
        if (g == null)
        {
            g = new g(this);
            f.postDelayed(g, b);
        }
    }

    static HashMap b(ImageLoader imageloader)
    {
        return imageloader.e;
    }

    static Runnable c(ImageLoader imageloader)
    {
        imageloader.g = null;
        return null;
    }

    public static ImageListener getImageListener(ImageView imageview, int i, int j)
    {
        return new d(j, imageview, i);
    }

    protected final void a(String s, Bitmap bitmap)
    {
        c.putBitmap(s, bitmap);
        h h1 = (h)d.remove(s);
        if (h1 != null)
        {
            h.a(h1, bitmap);
            a(s, h1);
        }
    }

    protected final void a(String s, VolleyError volleyerror)
    {
        h h1 = (h)d.remove(s);
        if (h1 != null)
        {
            h1.setError(volleyerror);
            a(s, h1);
        }
    }

    public ImageContainer get(String s, ImageListener imagelistener)
    {
        return get(s, imagelistener, 0, 0);
    }

    public ImageContainer get(String s, ImageListener imagelistener, int i, int j)
    {
        a();
        String s1 = a(s, i, j);
        Object obj = c.getBitmap(s1);
        if (obj != null)
        {
            s = new ImageContainer(((Bitmap) (obj)), s, null, null);
            imagelistener.onResponse(s, true);
            return s;
        }
        obj = new ImageContainer(null, s, s1, imagelistener);
        imagelistener.onResponse(((ImageContainer) (obj)), true);
        imagelistener = (h)d.get(s1);
        if (imagelistener != null)
        {
            imagelistener.addContainer(((ImageContainer) (obj)));
            return ((ImageContainer) (obj));
        } else
        {
            s = new ImageRequest(s, new e(this, s1), i, j, android.graphics.Bitmap.Config.RGB_565, new f(this, s1));
            a.add(s);
            d.put(s1, new h(this, s, ((ImageContainer) (obj))));
            return ((ImageContainer) (obj));
        }
    }

    public boolean isCached(String s, int i, int j)
    {
        a();
        s = a(s, i, j);
        return c.getBitmap(s) != null;
    }

    public void setBatchedResponseDelay(int i)
    {
        b = i;
    }

    private class ImageCache
    {

        public abstract Bitmap getBitmap(String s);

        public abstract void putBitmap(String s, Bitmap bitmap);
    }


    private class ImageContainer
    {

        final ImageLoader a;
        private Bitmap b;
        private final ImageListener c;
        private final String d;
        private final String e;

        static Bitmap a(ImageContainer imagecontainer, Bitmap bitmap)
        {
            imagecontainer.b = bitmap;
            return bitmap;
        }

        static ImageListener a(ImageContainer imagecontainer)
        {
            return imagecontainer.c;
        }

        public void cancelRequest()
        {
            if (c != null) goto _L2; else goto _L1
_L1:
            return;
_L2:
            h h1 = (h)ImageLoader.a(a).get(d);
            if (h1 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            if (h1.removeContainerAndCancelIfNecessary(this))
            {
                ImageLoader.a(a).remove(d);
                return;
            }
            if (true) goto _L1; else goto _L3
_L3:
            h h2 = (h)ImageLoader.b(a).get(d);
            if (h2 != null)
            {
                h2.removeContainerAndCancelIfNecessary(this);
                if (h.a(h2).size() == 0)
                {
                    ImageLoader.b(a).remove(d);
                    return;
                }
            }
            if (true) goto _L1; else goto _L4
_L4:
        }

        public Bitmap getBitmap()
        {
            return b;
        }

        public String getRequestUrl()
        {
            return e;
        }

        public ImageContainer(Bitmap bitmap, String s, String s1, ImageListener imagelistener)
        {
            a = ImageLoader.this;
            super();
            b = bitmap;
            e = s;
            d = s1;
            c = imagelistener;
        }
    }


    private class ImageListener
        implements com.mopub.volley.Response.ErrorListener
    {

        public abstract void onResponse(ImageContainer imagecontainer, boolean flag);
    }

}
