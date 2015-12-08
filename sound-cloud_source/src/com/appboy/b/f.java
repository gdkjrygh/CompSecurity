// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.b;

import bo.app.ai;
import com.appboy.d.e;

public final class f extends Enum
    implements e
{

    public static final f a;
    public static final f b;
    public static final f c;
    private static final f d[];

    private f(String s, int i)
    {
        super(s, i);
    }

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/appboy/b/f, s);
    }

    public static f[] values()
    {
        return (f[])d.clone();
    }

    public final String a()
    {
        switch (ai.a[ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return "unsubscribed";

        case 2: // '\002'
            return "subscribed";

        case 3: // '\003'
            return "opted_in";
        }
    }

    public final Object forJsonPut()
    {
        return a();
    }

    static 
    {
        a = new f("OPTED_IN", 0);
        b = new f("SUBSCRIBED", 1);
        c = new f("UNSUBSCRIBED", 2);
        d = (new f[] {
            a, b, c
        });
    }
}
