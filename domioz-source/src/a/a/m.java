// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import com.appboy.d.c;
import java.util.Locale;

public final class m extends Enum
    implements c
{

    public static final m a;
    public static final m b;
    public static final m c;
    private static final m d[];

    private m(String s, int i)
    {
        super(s, i);
    }

    public static m valueOf(String s)
    {
        return (m)Enum.valueOf(a/a/m, s);
    }

    public static m[] values()
    {
        return (m[])d.clone();
    }

    public final Object a()
    {
        return toString().toLowerCase(Locale.US);
    }

    static 
    {
        a = new m("FEED", 0);
        b = new m("INAPP", 1);
        c = new m("CONFIG", 2);
        d = (new m[] {
            a, b, c
        });
    }
}
