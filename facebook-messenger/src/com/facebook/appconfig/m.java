// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.appconfig;


// Referenced classes of package com.facebook.appconfig:
//            n, b

public class m extends n
{

    public m(b b1)
    {
        super(b1);
    }

    public String a()
    {
        return a("min_version", null);
    }

    public String b()
    {
        return a("current_version", null);
    }

    public int c()
    {
        return a("min_version_code", 0);
    }

    public int d()
    {
        return a("current_version_code", 0);
    }

    public String e()
    {
        return a("new_version_url", null);
    }
}
