// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.tiles;

import android.content.res.Resources;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.widget.tiles:
//            b, c, e, f

class h extends d
{

    final e a;

    private h(e e)
    {
        a = e;
        super();
    }

    h(e e, f f)
    {
        this(e);
    }

    public b a()
    {
        return new b((Resources)a(android/content/res/Resources), (c)a(com/facebook/widget/tiles/c));
    }

    public Object b()
    {
        return a();
    }
}
