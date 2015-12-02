// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import com.google.common.a.es;

public class an
{

    private final es a;
    private final es b;
    private final es c;
    private final es d;
    private final es e;
    private final es f;
    private final boolean g;

    public an(es es1, es es2, es es3, es es4, es es5, es es6)
    {
        this(es1, es2, es3, es4, es5, es6, false);
    }

    public an(es es1, es es2, es es3, es es4, es es5, es es6, boolean flag)
    {
        a = es1;
        b = es2;
        c = es3;
        e = es5;
        d = es4;
        g = flag;
        f = es6;
    }

    public es a()
    {
        return a;
    }

    public es b()
    {
        return b;
    }

    public es c()
    {
        return c;
    }

    public es d()
    {
        return d;
    }

    public es e()
    {
        return e;
    }

    public es f()
    {
        return f;
    }

    public boolean g()
    {
        return g;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (a != null)
        {
            stringbuilder.append((new StringBuilder()).append(" favoriteFriends:").append(a.size()).toString());
        }
        if (b != null)
        {
            stringbuilder.append((new StringBuilder()).append(" topFriends:").append(b.size()).toString());
        }
        if (c != null)
        {
            stringbuilder.append((new StringBuilder()).append(" onlineFriends:").append(c.size()).toString());
        }
        if (e != null)
        {
            stringbuilder.append((new StringBuilder()).append(" mobileFriends:").append(e.size()).toString());
        }
        if (d != null)
        {
            stringbuilder.append((new StringBuilder()).append(" otherContacts:").append(d.size()).toString());
        }
        if (f != null)
        {
            stringbuilder.append((new StringBuilder()).append(" topGroups:").append(f.size()).toString());
        }
        stringbuilder.append((new StringBuilder()).append(" hasPendingUpdates:").append(Boolean.toString(g)).toString());
        return stringbuilder.toString();
    }
}
