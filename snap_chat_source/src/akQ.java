// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Modifier;

final class akQ extends akM
    implements akK
{

    private Class d;

    akQ(int i, String s, Class class1, Class aclass[], Class aclass1[], Class class2)
    {
        super(i, s, class1, aclass, aclass1);
        d = class2;
    }

    protected final String a(akT akt)
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (super.a == -1)
        {
            super.a = Integer.parseInt(akR.a(0), 16);
        }
        int i = super.a;
        Class aclass[];
        if (!akt.b)
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
        if (akt.a)
        {
            if (d == null)
            {
                d = b(6);
            }
            stringbuffer.append(akt.a(d));
        }
        if (akt.a)
        {
            stringbuffer.append(" ");
        }
        aclass = c();
        if (super.c == null)
        {
            super.c = c().getName();
        }
        stringbuffer.append(akt.a(aclass, super.c, akt.c));
        stringbuffer.append(".");
        if (super.b == null)
        {
            super.b = akR.a(1);
        }
        stringbuffer.append(super.b);
        aclass = a();
        if (aclass != null)
        {
            if (!akt.a)
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
                akt.a(stringbuffer, aclass);
                stringbuffer.append(")");
            }
        }
        b();
        return stringbuffer.toString();
    }
}
