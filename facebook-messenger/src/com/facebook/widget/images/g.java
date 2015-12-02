// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.images;

import com.google.common.d.a.h;
import java.util.List;

// Referenced classes of package com.facebook.widget.images:
//            UrlImage

class g
    implements h
{

    final List a;
    final UrlImage b;

    g(UrlImage urlimage, List list)
    {
        b = urlimage;
        a = list;
        super();
    }

    public volatile void a(Object obj)
    {
        a((List)obj);
    }

    public void a(Throwable throwable)
    {
        UrlImage.a(b, throwable);
    }

    public void a(List list)
    {
        if (UrlImage.a(b) == a)
        {
            UrlImage.a(b, list);
        }
    }
}
