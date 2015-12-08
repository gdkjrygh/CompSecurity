// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bd;

import java.util.Vector;
import p.bg.az;
import p.bg.bv;
import p.bg.bw;
import p.bg.bz;
import p.bh.n;
import p.bh.r;

public class f
{

    public static az a(bv bv1, String s, Vector vector, String s1, Vector vector1, Boolean boolean1, n n1, n n2, 
            Vector vector2, String s2, Integer integer)
    {
        az az1 = new az();
        Integer integer1 = integer;
        if (integer == null)
        {
            integer1 = Integer.valueOf(1);
        }
        az1.a(integer1);
        integer = bv1;
        if (bv1 == null)
        {
            integer = new bv();
            integer.a(Integer.valueOf(1));
            integer.b(Integer.valueOf(0));
        }
        az1.a(integer);
        az1.a(s);
        az1.a(vector);
        bv1 = s1;
        if (s1 == null)
        {
            bv1 = s;
        }
        az1.b(bv1);
        bv1 = vector1;
        if (vector1 == null)
        {
            bv1 = new Vector();
            bv1.add(s);
        }
        az1.b(bv1);
        az1.a(boolean1);
        bv1 = n1;
        if (n1 == null)
        {
            bv1 = n.a;
        }
        az1.a(bv1);
        bv1 = n2;
        if (n2 == null)
        {
            bv1 = n.a;
        }
        az1.b(bv1);
        az1.c(vector2);
        az1.d(s2);
        return az1;
    }

    public static bw a(String s, Integer integer)
    {
        if (s == null)
        {
            return null;
        } else
        {
            bw bw1 = new bw();
            bw1.a(r.f);
            bw1.a(integer);
            bw1.a(s.getBytes());
            return bw1;
        }
    }

    public static bw a(Vector vector, Integer integer)
    {
        if (vector == null)
        {
            return null;
        } else
        {
            bw bw1 = new bw(true);
            bw1.a(integer);
            bw1.a(vector);
            return bw1;
        }
    }

    public static bz a(Integer integer)
    {
        bz bz1 = new bz();
        bz1.a(integer);
        return bz1;
    }
}
