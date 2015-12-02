// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.inject.d;
import com.facebook.orca.f.z;
import com.facebook.orca.photos.a.b;
import com.facebook.orca.threads.q;
import com.facebook.user.tiles.a;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class ae extends d
{

    final h a;

    private ae(h h)
    {
        a = h;
        super();
    }

    ae(h h, i i)
    {
        this(h);
    }

    public b a()
    {
        return new b((com.facebook.widget.tiles.b)a(com/facebook/widget/tiles/b), (a)a(com/facebook/user/tiles/a), (q)a(com/facebook/orca/threads/q), (z)a(com/facebook/orca/f/z));
    }

    public Object b()
    {
        return a();
    }
}
