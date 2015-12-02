// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.core.d;

import android.content.pm.PackageInfo;

// Referenced classes of package com.qihoo360.mobilesafe.core.d:
//            e

public static class a
{

    long a;
    PackageInfo b;

    public PackageInfo a()
    {
        return b;
    }

    public boolean b()
    {
        return System.currentTimeMillis() - a - 60000L > 0L;
    }

    public String toString()
    {
        return (new StringBuilder("PackageInfo==")).append(b).toString();
    }

    public (PackageInfo packageinfo)
    {
        b = packageinfo;
        a = System.currentTimeMillis();
    }
}
