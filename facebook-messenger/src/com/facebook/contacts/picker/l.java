// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.picker;

import com.google.common.a.es;

// Referenced classes of package com.facebook.contacts.picker:
//            m

public class l
{

    private final m a;
    private final CharSequence b;
    private final es c;

    private l(m m1, CharSequence charsequence, es es1)
    {
        a = m1;
        b = charsequence;
        c = es1;
    }

    public static l a(CharSequence charsequence)
    {
        return new l(m.EMPTY_CONSTRAINT, charsequence, null);
    }

    public static l a(CharSequence charsequence, es es1)
    {
        return new l(m.OK, charsequence, es1);
    }

    public static l b(CharSequence charsequence)
    {
        return new l(m.EXCEPTION, charsequence, null);
    }

    public m a()
    {
        return a;
    }

    public CharSequence b()
    {
        return b;
    }

    public int c()
    {
        if (c != null)
        {
            return c.size();
        } else
        {
            return 0;
        }
    }

    public es d()
    {
        return c;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("State: ").append(a).append(", ");
        stringbuilder.append("Constraints: ").append(b);
        if (c != null)
        {
            stringbuilder.append(", ").append("Count: ").append(c.size());
        }
        return stringbuilder.toString();
    }
}
