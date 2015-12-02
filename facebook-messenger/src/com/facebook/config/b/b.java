// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.config.b;

import android.content.pm.PackageInfo;

// Referenced classes of package com.facebook.config.b:
//            a

public class b
    implements a
{

    private final PackageInfo a;

    public b(PackageInfo packageinfo)
    {
        a = packageinfo;
    }

    public String a()
    {
        return a.versionName;
    }

    public int b()
    {
        return 0x32506;
    }

    public int c()
    {
        return 1;
    }
}
