// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.IOException;
import java.util.List;

// Referenced classes of package com.squareup.picasso:
//            t, r

final class b extends t
{

    private static final int a = 22;
    private final AssetManager b;

    public b(Context context)
    {
        b = context.getAssets();
    }

    public final boolean a(r r1)
    {
        boolean flag1 = false;
        r1 = r1.d;
        boolean flag = flag1;
        if ("file".equals(r1.getScheme()))
        {
            flag = flag1;
            if (!r1.getPathSegments().isEmpty())
            {
                flag = flag1;
                if ("android_asset".equals(r1.getPathSegments().get(0)))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final t.a b(r r1)
        throws IOException
    {
        return new t.a(b.open(r1.d.toString().substring(a)), Picasso.LoadedFrom.b);
    }

}
