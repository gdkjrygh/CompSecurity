// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.util.List;

// Referenced classes of package com.c.b:
//            az, aw, ba, ap

final class c extends az
{

    private static final int a = 22;
    private final AssetManager b;

    public c(Context context)
    {
        b = context.getAssets();
    }

    public final boolean a(aw aw1)
    {
        boolean flag1 = false;
        aw1 = aw1.d;
        boolean flag = flag1;
        if ("file".equals(aw1.getScheme()))
        {
            flag = flag1;
            if (!aw1.getPathSegments().isEmpty())
            {
                flag = flag1;
                if ("android_asset".equals(aw1.getPathSegments().get(0)))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final ba b(aw aw1)
    {
        return new ba(b.open(aw1.d.toString().substring(a)), ap.b);
    }

}
