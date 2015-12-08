// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.b.b.b;

import org.b.a.d;

// Referenced classes of package org.b.b.b:
//            h, f

final class c
    implements org.b.a.c
{
    static final class a
        implements org.b.a.a.a
    {

        String a;
        d b;
        org.b.a.a.d c;
        private int d;

        public final String toString()
        {
            h h1 = h.k;
            StringBuffer stringbuffer = new StringBuffer();
            stringbuffer.append(h.a(a));
            stringbuffer.append("(");
            stringbuffer.append(((f)b).b(h1));
            stringbuffer.append(")");
            return stringbuffer.toString();
        }

        public a(int i, String s, d d1, org.b.a.a.d d2)
        {
            a = s;
            b = d1;
            c = d2;
            d = i;
        }
    }


    Object a;
    Object b;
    Object c[];
    org.b.a.a.a d;

    public c(org.b.a.a.a a1, Object obj, Object obj1, Object aobj[])
    {
        d = a1;
        a = obj;
        b = obj1;
        c = aobj;
    }

    public final Object a()
    {
        return b;
    }

    public final String toString()
    {
        return d.toString();
    }
}
