// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.settings;

import android.content.Context;
import android.graphics.BitmapFactory;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;
import io.fabric.sdk.android.services.common.CommonUtils;

public final class n
{

    public final String a;
    public final int b;
    public final int c;
    public final int d;

    private n(String s, int i, int j, int l)
    {
        a = s;
        b = i;
        c = j;
        d = l;
    }

    public static n a(Context context, String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        int i = CommonUtils.j(context);
        io.fabric.sdk.android.c.a().a("Fabric", (new StringBuilder("App icon resource ID is ")).append(i).toString());
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(context.getResources(), i, options);
        context = new n(s, i, options.outWidth, options.outHeight);
        return context;
        context;
        io.fabric.sdk.android.c.a().c("Fabric", "Failed to load icon", context);
        return null;
    }
}
