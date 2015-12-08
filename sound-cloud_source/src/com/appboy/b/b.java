// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.b;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

public final class b extends Enum
{

    public static final b a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    public static final EnumSet f = EnumSet.allOf(com/appboy/b/b);
    private static final Map g;
    private static final b h[];

    private b(String s, int i)
    {
        super(s, i);
    }

    public static b a(String s)
    {
        return (b)g.get(s.toUpperCase(Locale.US));
    }

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(com/appboy/b/b, s);
    }

    public static b[] values()
    {
        return (b[])h.clone();
    }

    static 
    {
        a = new b("ADVERTISING", 0);
        b = new b("ANNOUNCEMENTS", 1);
        c = new b("NEWS", 2);
        d = new b("SOCIAL", 3);
        e = new b("NO_CATEGORY", 4);
        h = (new b[] {
            a, b, c, d, e
        });
        g = new HashMap();
        b b1;
        for (Iterator iterator = EnumSet.allOf(com/appboy/b/b).iterator(); iterator.hasNext(); g.put(b1.toString(), b1))
        {
            b1 = (b)iterator.next();
        }

    }
}
