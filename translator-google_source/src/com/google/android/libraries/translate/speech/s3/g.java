// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.speech.s3;

import com.google.android.apps.gsa.speech.audio.f;
import com.google.android.apps.gsa.speech.audio.i;
import com.google.android.libraries.translate.e.o;
import java.io.InputStream;

// Referenced classes of package com.google.android.libraries.translate.speech.s3:
//            c, d, b, f

final class g extends i
{

    final c i;
    private final int j;
    private final boolean k = false;

    public g(c c1, int l)
    {
        i = c1;
        super(l);
        j = l;
    }

    public final InputStream a()
    {
        int l = j << 1 << 3;
        Object obj;
        if (c.b(i))
        {
            obj = new d(j, l, k);
        } else
        if (o.b)
        {
            obj = new f(j, l, 16, k, new com.google.android.libraries.translate.speech.s3.f(), false, 0, true);
        } else
        {
            obj = new com.google.android.apps.gsa.speech.audio.g(j, l, 16, false, null, false);
        }
        c.a(i, new b(((InputStream) (obj)), i));
        return c.c(i);
    }
}
