// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.util.List;

// Referenced classes of package com.squareup.a:
//            bb, ax, bc, aq

class c extends bb
{

    private static final int a = "file:///android_asset/".length();
    private final AssetManager b;

    public c(Context context)
    {
        b = context.getAssets();
    }

    static String b(ax ax1)
    {
        return ax1.d.toString().substring(a);
    }

    public bc a(ax ax1, int i)
    {
        return new bc(b.open(b(ax1)), aq.b);
    }

    public boolean a(ax ax1)
    {
        boolean flag1 = false;
        ax1 = ax1.d;
        boolean flag = flag1;
        if ("file".equals(ax1.getScheme()))
        {
            flag = flag1;
            if (!ax1.getPathSegments().isEmpty())
            {
                flag = flag1;
                if ("android_asset".equals(ax1.getPathSegments().get(0)))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

}
