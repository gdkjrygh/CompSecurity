// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.cache;

import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.common.e.h;
import com.facebook.ui.media.attachments.MediaResource;
import com.facebook.ui.media.attachments.d;
import com.facebook.ui.media.cache.a;
import com.facebook.ui.media.cache.l;
import com.facebook.ui.media.cache.m;
import com.google.common.b.c;
import java.io.File;
import java.io.FileOutputStream;

// Referenced classes of package com.facebook.ui.images.cache:
//            d, e, a

class b extends a
{

    final com.facebook.ui.images.cache.a a;

    b(com.facebook.ui.images.cache.a a1, Context context, h h, com.facebook.ui.c.d d1, com.facebook.analytics.cache.h h1, com.facebook.common.time.a a2, m m)
    {
        a = a1;
        super(context, h, d1, h1, a2, m);
    }

    protected Bitmap a(com.facebook.ui.images.cache.d d1, File file)
    {
        int i = d1.a().b;
        int j = d1.a().c;
        d1 = d1.a().d;
        file = MediaResource.a(file);
        file = com.facebook.ui.images.cache.a.a(a).b(file);
        return com.facebook.ui.images.cache.a.c(a).a(file, i, j, com.facebook.ui.images.cache.a.b(a), d1);
    }

    protected volatile Object a(l l, File file)
    {
        return a((com.facebook.ui.images.cache.d)l, file);
    }

    protected void a(com.facebook.ui.images.cache.d d1, Bitmap bitmap, File file)
    {
        d1 = new FileOutputStream(file);
        if (!bitmap.hasAlpha()) goto _L2; else goto _L1
_L1:
        bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, d1);
_L4:
        c.a(d1);
        return;
_L2:
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 95, d1);
        if (true) goto _L4; else goto _L3
_L3:
        bitmap;
        c.a(d1);
        throw bitmap;
    }

    protected volatile void a(l l, Object obj, File file)
    {
        a((com.facebook.ui.images.cache.d)l, (Bitmap)obj, file);
    }
}
