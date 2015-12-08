// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.textinput;

import android.graphics.Canvas;
import com.google.android.apps.unveil.env.ImageUtils;
import com.google.android.apps.unveil.env.j;
import com.google.android.apps.unveil.env.k;
import com.google.android.apps.unveil.nonstop.c;
import com.google.android.apps.unveil.nonstop.m;
import com.google.android.apps.unveil.protocol.a.a;
import com.google.android.apps.unveil.protocol.a.b;

// Referenced classes of package com.google.android.apps.unveil.textinput:
//            TextInput

public final class z extends c
{

    m a;
    final TextInput j;

    z(TextInput textinput)
    {
        j = textinput;
        super();
    }

    protected final void a(m m1)
    {
        if (a != null)
        {
            a.h();
        }
        a = m1;
        a.g();
    }

    protected final void b(Canvas canvas)
    {
        if (a != null)
        {
            new a();
            Object obj = a;
            int i = ImageUtils.a(((m) (obj)).c, ((m) (obj)).d);
            obj = new b(ImageUtils.encodeJpegFromYUV420SP(((m) (obj)).e(), ((m) (obj)).c, ((m) (obj)).d, i), i, ((m) (obj)).f, ((m) (obj)).b);
            (new com.google.android.apps.unveil.protocol.a.c(a, ((b) (obj)).a)).a(canvas);
        }
    }

    protected final void e()
    {
        finalize();
    }

    protected final void f()
    {
        finalize();
    }

    public final void finalize()
    {
        if (a != null)
        {
            a.h();
            a = null;
        }
    }

    public final j h()
    {
        if (a == null)
        {
            return null;
        } else
        {
            return k.a(a.e(), a.c, a.d);
        }
    }
}
