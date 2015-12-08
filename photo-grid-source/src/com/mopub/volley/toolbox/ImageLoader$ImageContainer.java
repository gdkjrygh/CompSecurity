// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley.toolbox;

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.LinkedList;

// Referenced classes of package com.mopub.volley.toolbox:
//            ImageLoader, h

public class c
{

    final ImageLoader a;
    private Bitmap b;
    private final e c;
    private final String d;
    private final String e;

    static Bitmap a(c c1, Bitmap bitmap)
    {
        c1.b = bitmap;
        return bitmap;
    }

    static b a(b b1)
    {
        return b1.c;
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

    public _cls9(ImageLoader imageloader, Bitmap bitmap, String s, String s1, _cls9 _pcls9)
    {
        a = imageloader;
        super();
        b = bitmap;
        e = s;
        d = s1;
        c = _pcls9;
    }
}
