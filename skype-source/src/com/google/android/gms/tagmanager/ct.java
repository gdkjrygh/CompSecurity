// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.e;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            o, cl, ak

final class ct extends o
{

    private static final String a;
    private final Context b;

    public ct(Context context)
    {
        super(a, new String[0]);
        b = context;
    }

    public final com.google.android.gms.internal.h.a a(Map map)
    {
        try
        {
            map = cl.a(Integer.valueOf(b.getPackageManager().getPackageInfo(b.getPackageName(), 0).versionCode));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            ak.a((new StringBuilder("Package name ")).append(b.getPackageName()).append(" not found. ").append(map.getMessage()).toString());
            return cl.f();
        }
        return map;
    }

    public final boolean a()
    {
        return true;
    }

    static 
    {
        a = e.e.toString();
    }
}
