// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.ComponentName;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.media:
//            g, c, d

public static final class c
{

    private final c a;
    private final ArrayList b = new ArrayList();
    private final ing c;
    private d d;

    static c a(c c1)
    {
        return c1.a;
    }

    static ArrayList b(a a1)
    {
        return a1.b;
    }

    int a(String s)
    {
        int j = b.size();
        for (int i = 0; i < j; i++)
        {
            if (a((a)b.get(i)).equals(s))
            {
                return i;
            }
        }

        return -1;
    }

    public c a()
    {
        g.d();
        return a;
    }

    boolean a(d d1)
    {
        if (d != d1)
        {
            d = d1;
            return true;
        } else
        {
            return false;
        }
    }

    public String b()
    {
        return c.a();
    }

    public ComponentName c()
    {
        return c.b();
    }

    public String toString()
    {
        return (new StringBuilder()).append("MediaRouter.RouteProviderInfo{ packageName=").append(b()).append(" }").toString();
    }

    (c c1)
    {
        a = c1;
        c = c1.c();
    }
}
