// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley.toolbox;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.mopub.volley.toolbox:
//            ImageLoader, h

final class g
    implements Runnable
{

    final ImageLoader a;

    g(ImageLoader imageloader)
    {
        a = imageloader;
        super();
    }

    public final void run()
    {
        for (Iterator iterator = ImageLoader.b(a).values().iterator(); iterator.hasNext();)
        {
            h h1 = (h)iterator.next();
            Iterator iterator1 = h.a(h1).iterator();
            while (iterator1.hasNext()) 
            {
                ImageLoader.ImageContainer imagecontainer = (ImageLoader.ImageContainer)iterator1.next();
                if (ImageLoader.ImageContainer.a(imagecontainer) != null)
                {
                    if (h1.getError() == null)
                    {
                        ImageLoader.ImageContainer.a(imagecontainer, h.b(h1));
                        ImageLoader.ImageContainer.a(imagecontainer).onResponse(imagecontainer, false);
                    } else
                    {
                        ImageLoader.ImageContainer.a(imagecontainer).onErrorResponse(h1.getError());
                    }
                }
            }
        }

        ImageLoader.b(a).clear();
        ImageLoader.c(a);
    }
}
