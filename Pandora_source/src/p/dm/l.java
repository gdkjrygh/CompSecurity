// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dm;

import java.util.Hashtable;

public class l
{

    private static int a = 0;
    private static Hashtable b = new Hashtable();
    private static Hashtable c = new Hashtable();

    protected static int a()
    {
        int i = a + 1;
        a = i;
        return i;
    }

    public static int a(String s)
    {
        if ("0".equals(s))
        {
            return 0;
        }
        Integer integer1 = (Integer)b.get(s);
        Integer integer = integer1;
        if (integer1 == null)
        {
            integer = new Integer(a());
            b.put(s, integer);
            c.put(integer, s);
        }
        return integer.intValue();
    }

}
