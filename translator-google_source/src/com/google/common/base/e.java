// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            p, f

public class e
{

    final String a;

    e(e e1)
    {
        a = e1.a;
    }

    public e(String s)
    {
        a = (String)p.a(s);
    }

    public e a(String s)
    {
        p.a(s);
        return new f(this, this, s);
    }

    CharSequence a(Object obj)
    {
        p.a(obj);
        if (obj instanceof CharSequence)
        {
            return (CharSequence)obj;
        } else
        {
            return obj.toString();
        }
    }
}
