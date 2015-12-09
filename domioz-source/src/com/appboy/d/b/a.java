// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.d.b;

import a.a.dm;
import com.appboy.d.c;
import com.appboy.f;
import com.appboy.f.d;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
    implements c
{

    private static final String a;
    private JSONObject b;

    public a()
    {
        b = new JSONObject();
    }

    private static boolean b(String s)
    {
        if (dm.c(s))
        {
            com.appboy.f.a.c(a, "The Appboy property key cannot be null or contain only whitespaces. Not adding property.");
            return false;
        }
        if (s.startsWith("$"))
        {
            com.appboy.f.a.c(a, "The leading character in the key string may not be '$'. Not adding property.");
            return false;
        } else
        {
            return true;
        }
    }

    public final a a(String s)
    {
        if (!b(s))
        {
            return this;
        }
        try
        {
            b.put(d.b(s), true);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.appboy.f.a.c(a, "Caught json exception trying to add property.", s);
            return this;
        }
        return this;
    }

    public final a a(String s, String s1)
    {
label0:
        {
            if (b(s))
            {
                boolean flag;
                if (dm.c(s1))
                {
                    com.appboy.f.a.c(a, "The Appboy property value cannot be null or contain only whitespaces. Not adding property.");
                    flag = false;
                } else
                {
                    flag = true;
                }
                if (flag)
                {
                    break label0;
                }
            }
            return this;
        }
        try
        {
            b.put(d.b(s), d.b(s1));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.appboy.f.a.c(a, "Caught json exception trying to add property.", s);
            return this;
        }
        return this;
    }

    public final volatile Object a()
    {
        return b;
    }

    public final int b()
    {
        return b.length();
    }

    public final JSONObject c()
    {
        return b;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, com/appboy/d/b/a.getName()
        });
    }
}
