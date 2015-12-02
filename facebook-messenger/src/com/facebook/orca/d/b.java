// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import android.content.Context;
import com.facebook.common.e.h;
import com.facebook.ui.c.d;
import com.facebook.ui.media.cache.a;
import com.facebook.ui.media.cache.l;
import com.facebook.ui.media.cache.m;
import com.google.common.b.c;
import com.google.common.b.f;
import java.io.File;
import java.io.FileOutputStream;

// Referenced classes of package com.facebook.orca.d:
//            c, a

class b extends a
{

    final com.facebook.orca.d.a a;

    b(com.facebook.orca.d.a a1, Context context, h h, d d, com.facebook.analytics.cache.h h1, com.facebook.common.time.a a2, m m)
    {
        a = a1;
        super(context, h, d, h1, a2, m);
    }

    protected volatile Object a(l l, File file)
    {
        return a((com.facebook.orca.d.c)l, file);
    }

    protected void a(com.facebook.orca.d.c c1, byte abyte0[], File file)
    {
        c1 = new FileOutputStream(file);
        c1.write(abyte0);
        c.a(c1);
        return;
        abyte0;
        c.a(c1);
        throw abyte0;
    }

    protected volatile void a(l l, Object obj, File file)
    {
        a((com.facebook.orca.d.c)l, (byte[])obj, file);
    }

    protected byte[] a(com.facebook.orca.d.c c1, File file)
    {
        return f.c(file);
    }
}
