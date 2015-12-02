// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.base.c:
//            b

class as extends d
{

    private as()
    {
    }

    as(b b1)
    {
        this();
    }

    public PackageInfo a()
    {
        Object obj = (PackageManager)a(android/content/pm/PackageManager);
        String s = ((Context)a(android/content/Context)).getPackageName();
        try
        {
            obj = ((PackageManager) (obj)).getPackageInfo(s, 0);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            throw new RuntimeException(namenotfoundexception);
        }
        return ((PackageInfo) (obj));
    }

    public Object b()
    {
        return a();
    }
}
