// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.b.b.b;


final class h
{

    static h j;
    static h k;
    static h l;
    boolean a;
    boolean b;
    boolean c;
    boolean d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    int i;

    h()
    {
        a = true;
        b = true;
        c = false;
        d = false;
        e = false;
        f = true;
        g = true;
        h = true;
    }

    static String a(String s)
    {
        int i1 = s.lastIndexOf('-');
        if (i1 == -1)
        {
            return s;
        } else
        {
            return s.substring(i1 + 1);
        }
    }

    public final String a(Class class1)
    {
        return a(class1, class1.getName(), a);
    }

    final String a(Class class1, String s, boolean flag)
    {
        if (class1 == null)
        {
            return "ANONYMOUS";
        }
        if (class1.isArray())
        {
            class1 = class1.getComponentType();
            return a(class1, class1.getName(), flag) + "[]";
        }
        if (flag)
        {
            int i1 = s.lastIndexOf('.');
            if (i1 != -1)
            {
                s = s.substring(i1 + 1);
            }
            return s.replace('$', '.');
        } else
        {
            return s.replace('$', '.');
        }
    }

    public final void a(StringBuffer stringbuffer, Class aclass[])
    {
        for (int i1 = 0; i1 < aclass.length; i1++)
        {
            if (i1 > 0)
            {
                stringbuffer.append(", ");
            }
            stringbuffer.append(a(aclass[i1]));
        }

    }

    static 
    {
        h h1 = new h();
        j = h1;
        h1.a = true;
        j.b = false;
        j.c = false;
        j.d = false;
        j.e = true;
        j.f = false;
        j.g = false;
        j.i = 0;
        h1 = new h();
        k = h1;
        h1.a = true;
        k.b = true;
        k.c = false;
        k.d = false;
        k.e = false;
        j.i = 1;
        h1 = new h();
        l = h1;
        h1.a = false;
        l.b = true;
        l.c = false;
        l.d = true;
        l.e = false;
        l.h = false;
        l.i = 2;
    }
}
