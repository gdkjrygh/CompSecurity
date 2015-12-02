// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.inject.d;
import com.facebook.orca.attachments.a;
import com.facebook.orca.f.k;
import com.facebook.orca.f.z;
import com.facebook.orca.photos.a.b;
import com.facebook.orca.photos.a.e;
import com.facebook.orca.threads.q;
import com.facebook.user.tiles.c;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class bm extends d
{

    final h a;

    private bm(h h)
    {
        a = h;
        super();
    }

    bm(h h, i i)
    {
        this(h);
    }

    public e a()
    {
        return new e((a)a(com/facebook/orca/attachments/a), (z)a(com/facebook/orca/f/z), (c)a(com/facebook/user/tiles/c), (b)a(com/facebook/orca/photos/a/b), (com.facebook.user.tiles.a)a(com/facebook/user/tiles/a), (q)a(com/facebook/orca/threads/q), (k)a(com/facebook/orca/f/k));
    }

    public Object b()
    {
        return a();
    }
}
