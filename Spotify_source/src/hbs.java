// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.BitmapFactory;
import io.fabric.sdk.android.services.common.CommonUtils;

public final class hbs
{

    public final String a;
    public final int b;
    public final int c;
    public final int d;

    private hbs(String s, int i, int j, int k)
    {
        a = s;
        b = i;
        c = j;
        d = k;
    }

    public static hbs a(Context context, String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        int i = CommonUtils.j(context);
        gya.a().a("Fabric", (new StringBuilder("App icon resource ID is ")).append(i).toString());
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(context.getResources(), i, options);
        context = new hbs(s, i, options.outWidth, options.outHeight);
        return context;
        context;
        gya.a().c("Fabric", "Failed to load icon", context);
        return null;
    }
}
