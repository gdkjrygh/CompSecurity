// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.util.List;
import java.util.Map;

public abstract class n
{

    Map a;

    public n(Map map)
    {
        a = map;
    }

    private String c(String s)
    {
        s = (List)a.get(s);
        if (s != null)
        {
            return (String)s.get(s.size() - 1);
        } else
        {
            return null;
        }
    }

    public final long a(String s)
    {
        long l = 0x7fffffffffffffffL;
        s = c(s);
        if (s != null)
        {
            try
            {
                l = Long.parseLong(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return 0x7fffffffffffffffL;
            }
        }
        return l;
    }

    public final int b(String s)
    {
        int i = -1;
        s = c(s);
        if (s != null)
        {
            try
            {
                i = Integer.parseInt(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return -1;
            }
        }
        return i;
    }

    public final String toString()
    {
        return a.toString();
    }
}
