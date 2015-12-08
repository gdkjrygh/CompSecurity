// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class fgc
{

    public static final List a;
    private static final List d;
    public final myf b;
    public final ifj c;

    public fgc(myf myf, ifj ifj)
    {
        b = myf;
        c = ifj;
    }

    public static List a()
    {
        return d;
    }

    public static void a(List list)
    {
        int i = list.indexOf(ffw.c);
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "collections expected, but not found in items");
        list.add(i + 1, ffw.k);
        list.add(i + 2, ffw.d);
    }

    public static void b(List list)
    {
        int i = list.indexOf(ffw.e);
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "shared links expected, but not found in items");
        list.remove(i);
        list.add(i, ffw.f);
    }

    static 
    {
        d = Collections.unmodifiableList(Arrays.asList(new ffw[] {
            ffw.a, ffw.i, ffw.j
        }));
        a = Collections.unmodifiableList(Arrays.asList(new ffw[] {
            ffw.b, ffw.a, ffw.c, ffw.k, ffw.e, ffw.g, ffw.h, ffw.i, ffw.j
        }));
    }
}
