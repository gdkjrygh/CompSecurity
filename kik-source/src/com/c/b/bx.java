// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.Iterator;
import java.util.List;

public final class bx extends RuntimeException
{

    private final List a;

    public bx()
    {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        a = null;
    }

    public bx(List list)
    {
        super(a(list));
        a = list;
    }

    private static String a(List list)
    {
        StringBuilder stringbuilder = new StringBuilder("Message missing required fields: ");
        list = list.iterator();
        boolean flag = true;
        while (list.hasNext()) 
        {
            String s = (String)list.next();
            if (flag)
            {
                flag = false;
            } else
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(s);
        }
        return stringbuilder.toString();
    }
}
