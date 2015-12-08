// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.h;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.bumptech.glide.load.c;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.bumptech.glide.h:
//            c

public final class a
{

    private static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static c a(Context context)
    {
        String s = context.getPackageName();
        c c1 = (c)a.get(s);
        Object obj = c1;
        if (c1 == null)
        {
            context = b(context);
            c c2 = (c)a.putIfAbsent(s, context);
            obj = c2;
            if (c2 == null)
            {
                obj = context;
            }
        }
        return ((c) (obj));
    }

    private static c b(Context context)
    {
        try
        {
            context = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            context = null;
        }
        if (context != null)
        {
            context = String.valueOf(((PackageInfo) (context)).versionCode);
        } else
        {
            context = UUID.randomUUID().toString();
        }
        return new com.bumptech.glide.h.c(context);
    }

}
