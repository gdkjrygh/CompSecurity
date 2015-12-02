// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.util.List;

final class cfg extends cgu
{

    private static final int a = 22;
    private final AssetManager b;

    public cfg(Context context)
    {
        b = context.getAssets();
    }

    private static String c(cgr cgr1)
    {
        return cgr1.d.toString().substring(a);
    }

    public final boolean a(cgr cgr1)
    {
        boolean flag1 = false;
        cgr1 = cgr1.d;
        boolean flag = flag1;
        if ("file".equals(cgr1.getScheme()))
        {
            flag = flag1;
            if (!cgr1.getPathSegments().isEmpty())
            {
                flag = flag1;
                if ("android_asset".equals(cgr1.getPathSegments().get(0)))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final cgv b(cgr cgr1)
    {
        return new cgv(b.open(c(cgr1)), cgl.b);
    }

}
