// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;


// Referenced classes of package com.fitbit.util:
//            t

public class br
{

    private final StringBuilder a;
    private boolean b;

    public br()
    {
        b = true;
        a = new StringBuilder();
    }

    public br(String s)
    {
        b = true;
        a = new StringBuilder(s);
    }

    public br a(String s, Object obj)
    {
        obj = t.a(obj.toString());
        if (b)
        {
            a.append(s);
            b = false;
        } else
        {
            a.append('&');
            a.append(s);
        }
        a.append('=');
        a.append(((String) (obj)));
        return this;
    }

    public String toString()
    {
        return a.toString();
    }
}
