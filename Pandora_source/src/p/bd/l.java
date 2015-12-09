// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bd;

import java.util.Vector;
import p.bg.by;
import p.bh.u;

public class l
{

    public static Vector a(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            Vector vector = new Vector();
            vector.add(a(u.a, s));
            return vector;
        }
    }

    public static by a(u u1, String s)
    {
        by by1 = new by();
        by1.a(u1);
        by1.a(s);
        return by1;
    }
}
