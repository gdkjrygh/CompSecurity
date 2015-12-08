// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;

import java.util.ArrayList;

// Referenced classes of package com.yume.android.sdk:
//            M, S, g, d, 
//            YuMeAdBlockType, n

final class Q
{

    private M a;
    private int b;
    private int c;
    private String d;
    private String e;
    private int f;
    private g g;
    private ArrayList h;
    private S i;

    Q()
    {
        a = M.a();
        b = -1;
        c = -1;
        f = -1;
        i = S.a;
    }

    public final int a()
    {
        return b;
    }

    public final void a(int j)
    {
        b = j;
    }

    public final void a(S s)
    {
        if (i != s)
        {
            if (g != null)
            {
                Object obj = g.b;
                if (obj != null)
                {
                    obj = ((d) (obj)).a();
                    if (obj == YuMeAdBlockType.PREROLL)
                    {
                        a.b((new StringBuilder("Current Preroll Playlist State: ")).append(s).toString());
                    } else
                    if (obj == YuMeAdBlockType.MIDROLL)
                    {
                        a.b((new StringBuilder("Current Midroll Playlist State: ")).append(s).toString());
                    } else
                    if (obj == YuMeAdBlockType.POSTROLL)
                    {
                        a.b((new StringBuilder("Current Postroll Playlist State: ")).append(s).toString());
                    } else
                    {
                        a.b((new StringBuilder("Current Playlist State: ")).append(s).toString());
                    }
                } else
                {
                    a.b((new StringBuilder("Current Playlist State: ")).append(s).toString());
                }
            } else
            {
                a.b((new StringBuilder("Current Playlist State: ")).append(s).toString());
            }
        }
        i = s;
    }

    public final void a(g g1)
    {
        g = g1;
    }

    public final void a(n n)
    {
        if (h == null)
        {
            h = new ArrayList();
        }
        h.add(n);
    }

    public final void a(String s)
    {
        d = s;
    }

    public final int b()
    {
        return c;
    }

    public final void b(int j)
    {
        c = j;
    }

    public final void b(String s)
    {
        e = s;
    }

    public final String c()
    {
        return d;
    }

    public final void c(int j)
    {
        f = j;
    }

    public final String d()
    {
        return e;
    }

    public final int e()
    {
        return f;
    }

    public final g f()
    {
        return g;
    }

    public final ArrayList g()
    {
        return h;
    }

    public final S h()
    {
        return i;
    }
}
