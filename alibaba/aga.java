// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Vector;
import java.util.regex.Pattern;

final class aga
{

    static final Vector a;
    static final Vector b;
    static final Vector c;
    static final Vector d;
    private static final Pattern e = Pattern.compile(",");

    static 
    {
        a = new Vector(5);
        a.add(axu.o);
        a.add(axu.p);
        a.add(axu.h);
        a.add(axu.g);
        a.add(axu.m);
        b = new Vector(a.size() + 4);
        b.addAll(a);
        b.add(axu.c);
        b.add(axu.d);
        b.add(axu.e);
        b.add(axu.i);
        c = new Vector(1);
        c.add(axu.l);
        d = new Vector(1);
        d.add(axu.f);
    }
}
