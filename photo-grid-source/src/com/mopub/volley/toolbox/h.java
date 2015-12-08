// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley.toolbox;

import android.graphics.Bitmap;
import com.mopub.volley.Request;
import com.mopub.volley.VolleyError;
import java.util.LinkedList;

// Referenced classes of package com.mopub.volley.toolbox:
//            ImageLoader

final class h
{

    final ImageLoader a;
    private final Request b;
    private Bitmap c;
    private VolleyError d;
    private final LinkedList e = new LinkedList();

    public h(ImageLoader imageloader, Request request, ImageLoader.ImageContainer imagecontainer)
    {
        a = imageloader;
        super();
        b = request;
        e.add(imagecontainer);
    }

    static Bitmap a(h h1, Bitmap bitmap)
    {
        h1.c = bitmap;
        return bitmap;
    }

    static LinkedList a(h h1)
    {
        return h1.e;
    }

    static Bitmap b(h h1)
    {
        return h1.c;
    }

    public final void addContainer(ImageLoader.ImageContainer imagecontainer)
    {
        e.add(imagecontainer);
    }

    public final VolleyError getError()
    {
        return d;
    }

    public final boolean removeContainerAndCancelIfNecessary(ImageLoader.ImageContainer imagecontainer)
    {
        e.remove(imagecontainer);
        if (e.size() == 0)
        {
            b.cancel();
            return true;
        } else
        {
            return false;
        }
    }

    public final void setError(VolleyError volleyerror)
    {
        d = volleyerror;
    }
}
