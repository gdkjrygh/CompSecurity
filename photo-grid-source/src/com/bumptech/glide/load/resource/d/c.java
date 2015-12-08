// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.d;

import com.bumptech.glide.i.a;
import com.bumptech.glide.load.b.x;
import com.bumptech.glide.load.c.j;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.t;
import com.bumptech.glide.load.resource.c.b;
import java.io.InputStream;

// Referenced classes of package com.bumptech.glide.load.resource.d:
//            e, d, a, b

public final class c
    implements e
{

    private static final com.bumptech.glide.load.resource.d.e a = new com.bumptech.glide.load.resource.d.e();
    private static final d b = new d();
    private final e c;
    private final e d;
    private final com.bumptech.glide.load.b.a.e e;
    private final com.bumptech.glide.load.resource.d.e f;
    private final d g;
    private String h;

    public c(e e1, e e2, com.bumptech.glide.load.b.a.e e3)
    {
        this(e1, e2, e3, a, b);
    }

    private c(e e1, e e2, com.bumptech.glide.load.b.a.e e3, com.bumptech.glide.load.resource.d.e e4, d d1)
    {
        c = e1;
        d = e2;
        e = e3;
        f = e4;
        g = d1;
    }

    private x a(j j1, int i, int k)
    {
        Object obj2;
        a a1;
        byte abyte0[];
        obj2 = null;
        a1 = com.bumptech.glide.i.a.a();
        abyte0 = a1.b();
        if (j1.a() == null) goto _L2; else goto _L1
_L1:
        Object obj;
        t t1;
        t1 = new t(j1.a(), abyte0);
        t1.mark(2048);
        obj = (new ImageHeaderParser(t1)).a();
        t1.reset();
        if (obj != com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.ImageType.GIF) goto _L4; else goto _L3
_L3:
        obj = d.a(t1, i, k);
        if (obj == null) goto _L4; else goto _L5
_L5:
        Object obj1 = (b)((x) (obj)).b();
        if (((b) (obj1)).e() <= 1) goto _L7; else goto _L6
_L6:
        obj = new com.bumptech.glide.load.resource.d.a(null, ((x) (obj)));
_L10:
        obj1 = obj;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        obj1 = b(new j(t1, j1.b()), i, k);
_L8:
        a1.a(abyte0);
        j1 = obj2;
        if (obj1 != null)
        {
            j1 = new com.bumptech.glide.load.resource.d.b(((com.bumptech.glide.load.resource.d.a) (obj1)));
        }
        return j1;
_L7:
        obj = new com.bumptech.glide.load.resource.d.a(new com.bumptech.glide.load.resource.bitmap.c(((b) (obj1)).b(), e), null);
        continue; /* Loop/switch isn't completed */
        j1;
        a1.a(abyte0);
        throw j1;
_L2:
        obj1 = b(j1, i, k);
        if (true) goto _L8; else goto _L4
_L4:
        obj = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private com.bumptech.glide.load.resource.d.a b(j j1, int i, int k)
    {
        j1 = c.a(j1, i, k);
        if (j1 != null)
        {
            return new com.bumptech.glide.load.resource.d.a(j1, null);
        } else
        {
            return null;
        }
    }

    public final volatile x a(Object obj, int i, int k)
    {
        return a((j)obj, i, k);
    }

    public final String a()
    {
        if (h == null)
        {
            h = (new StringBuilder()).append(d.a()).append(c.a()).toString();
        }
        return h;
    }

}
