// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.b;

import com.facebook.common.time.a;
import com.facebook.http.protocol.h;
import com.facebook.ui.media.attachments.MediaResource;

// Referenced classes of package com.facebook.orca.photos.b:
//            x, w, h, y

class z
    implements h
{

    final x a;
    private final MediaResource b;
    private int c;
    private long d;

    private z(x x1, MediaResource mediaresource)
    {
        a = x1;
        super();
        c = 0;
        d = 0L;
        b = mediaresource;
    }

    z(x x1, MediaResource mediaresource, y y)
    {
        this(x1, mediaresource);
    }

    public void a(long l, long l1)
    {
        int i;
        long l2;
label0:
        {
            l2 = com.facebook.orca.photos.b.x.a(a).a();
            if (l2 - d >= 200L || l == l1)
            {
                i = (int)((100D * (double)l) / (double)l1);
                if (i != c)
                {
                    break label0;
                }
            }
            return;
        }
        c = i;
        d = l2;
        x.b(a).a(new w(b, i));
    }
}
