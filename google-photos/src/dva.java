// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

public final class dva extends Enum
{

    public static final Set a = Collections.unmodifiableSet(EnumSet.allOf(dva));
    public static final Set b;
    private static dva c;
    private static dva d;
    private static final dva e[];

    private dva(String s, int i)
    {
        super(s, i);
    }

    public static dva valueOf(String s)
    {
        return (dva)Enum.valueOf(dva, s);
    }

    public static dva[] values()
    {
        return (dva[])e.clone();
    }

    static 
    {
        c = new dva("SYSTEM_TRAY", 0);
        d = new dva("CARD", 1);
        e = (new dva[] {
            c, d
        });
        b = Collections.unmodifiableSet(EnumSet.of(d));
    }
}
