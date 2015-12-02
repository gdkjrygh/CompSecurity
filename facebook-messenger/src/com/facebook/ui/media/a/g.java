// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.media.a;

import com.google.common.b.c;
import java.io.InputStream;

// Referenced classes of package com.facebook.ui.media.a:
//            c, d

class g extends com.facebook.ui.media.a.c
{

    private final InputStream a;

    g(InputStream inputstream)
    {
        super(d.SUCCESS);
        a = inputstream;
    }

    public InputStream b()
    {
        return a;
    }

    public void c()
    {
        com.google.common.b.c.a(a);
    }
}
