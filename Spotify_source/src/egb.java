// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Vector;

public class egb
{

    public final String a;
    public egk b;
    public int c;
    public int d;
    private Vector e;

    public egb(String s, String s1)
    {
        this(s, a(s1));
    }

    public egb(String s, Vector vector)
    {
        e = new Vector();
        a = s;
        e = vector;
    }

    private static Vector a(String s)
    {
        s = s.split(",");
        Vector vector = new Vector();
        int j = s.length;
        for (int i = 0; i < j; i++)
        {
            vector.add(s[i].trim());
        }

        return vector;
    }

    public final Vector a()
    {
        return new Vector(e);
    }
}
