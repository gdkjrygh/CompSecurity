// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tealium.library;

import java.util.Locale;

final class <init>
{

    String a;
    a b;
    String c;

    public final String toString()
    {
        Locale locale = Locale.ROOT;
        String s1 = c;
        String s;
        if (b != null)
        {
            s = b.b;
        } else
        {
            s = "(null)";
        }
        return String.format(locale, "%s %s \"%s\"", new Object[] {
            s1, s, a
        });
    }

    private ()
    {
        a = null;
        b = null;
        c = null;
    }

    c(byte byte0)
    {
        this();
    }
}
