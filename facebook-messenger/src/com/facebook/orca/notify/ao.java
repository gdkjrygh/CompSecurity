// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import android.content.Intent;

// Referenced classes of package com.facebook.orca.notify:
//            ai, aj

public class ao extends ai
{

    private final String b;
    private final String c;
    private final String d;
    private final Intent e;
    private boolean f;

    public ao(String s, String s1, String s2, Intent intent)
    {
        super(aj.NEW_BUILD);
        b = s;
        c = s1;
        d = s2;
        e = intent;
    }

    public String a()
    {
        return b;
    }

    public void a(boolean flag)
    {
        f = flag;
    }

    public String b()
    {
        return c;
    }

    public String c()
    {
        return d;
    }

    public Intent d()
    {
        return e;
    }
}
