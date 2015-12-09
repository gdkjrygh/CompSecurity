// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.c.a.j;
import com.ford.syncV4.e.c.ay;
import com.ford.syncV4.e.c.bs;
import java.util.Vector;

public final class f
{

    public static ay a(bs bs1, String s, Vector vector, String s1, Vector vector1, Boolean boolean1, j j1, j j2, 
            Vector vector2, String s2, Integer integer)
    {
        ay ay1 = new ay();
        Integer integer1 = integer;
        if (integer == null)
        {
            integer1 = Integer.valueOf(1);
        }
        ay1.a(integer1);
        integer = bs1;
        if (bs1 == null)
        {
            integer = new bs();
            integer.a(new Integer(1));
            integer.b(new Integer(0));
        }
        ay1.a(integer);
        ay1.a(s);
        ay1.a(vector);
        bs1 = s1;
        if (s1 == null)
        {
            bs1 = s;
        }
        ay1.b(bs1);
        bs1 = vector1;
        if (vector1 == null)
        {
            bs1 = new Vector();
            bs1.add(s);
        }
        ay1.b(bs1);
        ay1.a(boolean1);
        bs1 = j1;
        if (j1 == null)
        {
            bs1 = j.a;
        }
        ay1.a(bs1);
        bs1 = j2;
        if (j2 == null)
        {
            bs1 = j.a;
        }
        ay1.b(bs1);
        ay1.c(vector2);
        ay1.d(s2);
        return ay1;
    }
}
