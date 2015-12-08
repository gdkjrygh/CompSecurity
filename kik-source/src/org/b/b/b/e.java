// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.b.b.b;

import java.lang.reflect.Modifier;
import org.b.a.a.c;

// Referenced classes of package org.b.b.b:
//            a, f, h

final class e extends a
    implements c
{

    Class d;

    e(int i, String s, Class class1, Class aclass[], String as[], Class aclass1[], Class class2)
    {
        super(i, s, class1, aclass, as, aclass1);
        d = class2;
    }

    protected final String a(h h1)
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (super.e == -1)
        {
            super.e = Integer.parseInt(a(0), 16);
        }
        int i = super.e;
        Class aclass[];
        if (!h1.d)
        {
            aclass = "";
        } else
        {
            aclass = Modifier.toString(i);
            if (aclass.length() == 0)
            {
                aclass = "";
            } else
            {
                aclass = aclass + " ";
            }
        }
        stringbuffer.append(aclass);
        if (h1.b)
        {
            if (d == null)
            {
                d = b(6);
            }
            stringbuffer.append(h1.a(d));
        }
        if (h1.b)
        {
            stringbuffer.append(" ");
        }
        aclass = a();
        if (super.g == null)
        {
            super.g = a().getName();
        }
        stringbuffer.append(h1.a(aclass, super.g, h1.e));
        stringbuffer.append(".");
        if (super.f == null)
        {
            super.f = a(1);
        }
        stringbuffer.append(super.f);
        if (super.a == null)
        {
            super.a = c(3);
        }
        aclass = super.a;
        if (aclass != null)
        {
            if (!h1.b)
            {
                if (aclass.length == 0)
                {
                    stringbuffer.append("()");
                } else
                {
                    stringbuffer.append("(..)");
                }
            } else
            {
                stringbuffer.append("(");
                h1.a(stringbuffer, aclass);
                stringbuffer.append(")");
            }
        }
        if (super.c == null)
        {
            super.c = c(5);
        }
        aclass = super.c;
        if (h1.c && aclass != null && aclass.length != 0)
        {
            stringbuffer.append(" throws ");
            h1.a(stringbuffer, aclass);
        }
        return stringbuffer.toString();
    }
}
