// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;

public final class gwe extends gwc
{

    private final Context a;

    public gwe(Context context)
    {
        a = context;
    }

    public final boolean a(gvz gvz1)
    {
        if (gvz1.e != 0)
        {
            return true;
        } else
        {
            return "android.resource".equals(gvz1.d.getScheme());
        }
    }

    public final gwd b(gvz gvz1)
    {
        android.content.res.Resources resources = gwm.a(a, gvz1);
        int i = gwm.a(resources, gvz1);
        android.graphics.BitmapFactory.Options options = d(gvz1);
        if (a(options))
        {
            BitmapFactory.decodeResource(resources, i, options);
            a(gvz1.h, gvz1.i, options, gvz1);
        }
        return new gwd(BitmapFactory.decodeResource(resources, i, options), com.squareup.picasso.Picasso.LoadedFrom.b);
    }
}
