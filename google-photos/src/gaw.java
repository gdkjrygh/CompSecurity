// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

public final class gaw extends Enum
{

    public static final gaw a;
    public static final gaw b;
    public static final gaw c;
    public static final gaw d;
    private static final gaw f[];
    public final Set e;

    private gaw(String s, int i, Set set)
    {
        super(s, i);
        e = set;
    }

    public static gaw a(Set set)
    {
        gaw agaw[] = values();
        int j = agaw.length;
        for (int i = 0; i < j; i++)
        {
            gaw gaw1 = agaw[i];
            if (gaw1.e.equals(set))
            {
                return gaw1;
            }
        }

        set = String.valueOf(set);
        throw new IllegalArgumentException((new StringBuilder(String.valueOf(set).length() + 18)).append("Cannot parse from ").append(set).toString());
    }

    public static gaw valueOf(String s)
    {
        return (gaw)Enum.valueOf(gaw, s);
    }

    public static gaw[] values()
    {
        return (gaw[])f.clone();
    }

    public final boolean a(gav gav1)
    {
        return e.contains(gav1);
    }

    static 
    {
        a = new gaw("LocalOnly", 0, Collections.unmodifiableSet(EnumSet.of(gav.a)));
        b = new gaw("RemoteOnly", 1, Collections.unmodifiableSet(EnumSet.of(gav.b)));
        c = new gaw("LocalRemote", 2, Collections.unmodifiableSet(EnumSet.of(gav.a, gav.b)));
        d = new gaw("Unknown", 3, Collections.emptySet());
        f = (new gaw[] {
            a, b, c, d
        });
    }
}
