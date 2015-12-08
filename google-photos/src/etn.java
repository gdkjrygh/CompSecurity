// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class etn extends Enum
{

    public static final etn a;
    private static etn c;
    private static etn d;
    private static final etn e[];
    int b;

    private etn(String s, int i, int j)
    {
        super(s, i);
        b = j;
    }

    public static etn valueOf(String s)
    {
        return (etn)Enum.valueOf(etn, s);
    }

    public static etn[] values()
    {
        return (etn[])e.clone();
    }

    static 
    {
        int i = 0;
        c = new etn("UNKNOWN", 0, 0);
        a = new etn("ACCEPTED", 1, 1);
        d = new etn("PENDING", 2, 2);
        e = (new etn[] {
            c, a, d
        });
        HashMap hashmap = new HashMap();
        etn aetn[] = values();
        for (int j = aetn.length; i < j; i++)
        {
            etn etn1 = aetn[i];
            hashmap.put(Integer.valueOf(etn1.b), etn1);
        }

        Collections.unmodifiableMap(hashmap);
    }
}
