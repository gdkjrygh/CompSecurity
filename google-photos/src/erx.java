// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class erx extends Enum
{

    public static final erx a;
    private static erx c;
    private static erx d;
    private static final erx e[];
    int b;

    private erx(String s, int i, int j)
    {
        super(s, i);
        b = j;
    }

    public static erx valueOf(String s)
    {
        return (erx)Enum.valueOf(erx, s);
    }

    public static erx[] values()
    {
        return (erx[])e.clone();
    }

    static 
    {
        int i = 0;
        c = new erx("UNKNOWN", 0, 0);
        d = new erx("PENDING", 1, 2);
        a = new erx("ACCEPTED", 2, 1);
        e = (new erx[] {
            c, d, a
        });
        HashMap hashmap = new HashMap();
        erx aerx[] = values();
        for (int j = aerx.length; i < j; i++)
        {
            erx erx1 = aerx[i];
            hashmap.put(Integer.valueOf(erx1.b), erx1);
        }

        Collections.unmodifiableMap(hashmap);
    }
}
