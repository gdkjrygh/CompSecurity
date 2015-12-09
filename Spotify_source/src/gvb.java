// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.util.List;

public final class gvb extends gwc
{

    private final AssetManager a;

    public gvb(Context context)
    {
        a = context.getAssets();
    }

    public final boolean a(gvz gvz1)
    {
        boolean flag1 = false;
        gvz1 = gvz1.d;
        boolean flag = flag1;
        if ("file".equals(gvz1.getScheme()))
        {
            flag = flag1;
            if (!gvz1.getPathSegments().isEmpty())
            {
                flag = flag1;
                if ("android_asset".equals(gvz1.getPathSegments().get(0)))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final gwd b(gvz gvz1)
    {
        return new gwd(a.open(gvz1.d.toString().substring(22)), com.squareup.picasso.Picasso.LoadedFrom.b);
    }
}
