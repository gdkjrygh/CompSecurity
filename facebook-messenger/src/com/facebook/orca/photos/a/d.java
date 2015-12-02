// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.a;

import android.net.Uri;
import com.facebook.ui.images.b.m;
import com.facebook.ui.images.b.o;
import com.facebook.ui.images.cache.e;
import com.facebook.ui.images.cache.g;
import com.facebook.ui.images.d.h;
import com.facebook.ui.images.d.i;
import com.facebook.user.UserKey;
import com.facebook.user.tiles.c;
import com.facebook.widget.tiles.a;
import com.facebook.widget.tiles.j;
import com.google.common.base.Preconditions;
import java.util.List;

public class d
    implements j
{

    private final c a;
    private final String b;
    private final a c;
    private final Uri d;
    private final boolean e;
    private final List f;

    public d(c c1, String s, a a1, Uri uri, boolean flag, List list)
    {
        a = c1;
        b = s;
        c = a1;
        d = uri;
        e = flag;
        f = list;
    }

    private static h a(int k)
    {
        return (new i()).a((new com.facebook.ui.images.d.d()).a(1.0F).b(1.0F).c(1.0F).e()).a(k / 2).b(k / 2).c(k).d(k).j();
    }

    public int a()
    {
        if (e)
        {
            return 0;
        }
        if (d != null)
        {
            return 1;
        } else
        {
            return f.size();
        }
    }

    public m a(int k, int l, int i1)
    {
        boolean flag;
        if (a() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (d != null)
        {
            h h1 = a(l);
            return m.a(d).a(h1).a(com.facebook.ui.images.cache.e.newBuilder().a(h1.e(), h1.f()).d()).a();
        } else
        {
            return a.a(com.facebook.user.tiles.e.a((UserKey)f.get(k)), l, i1);
        }
    }

    public a b()
    {
        return c;
    }
}
