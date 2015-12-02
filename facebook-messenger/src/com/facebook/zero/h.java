// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero;

import android.content.res.Resources;
import com.facebook.inject.d;
import com.facebook.zero.ui.l;
import com.facebook.zero.ui.o;

// Referenced classes of package com.facebook.zero:
//            c, d

class h extends d
{

    final c a;

    private h(c c)
    {
        a = c;
        super();
    }

    h(c c, com.facebook.zero.d d1)
    {
        this(c);
    }

    public l a()
    {
        return new l((Resources)a(android/content/res/Resources), (o)a(com/facebook/zero/ui/o));
    }

    public Object b()
    {
        return a();
    }
}
