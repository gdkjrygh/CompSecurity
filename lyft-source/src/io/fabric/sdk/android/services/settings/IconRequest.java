// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.settings;

import android.content.Context;
import android.graphics.BitmapFactory;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;

public class IconRequest
{

    public final String a;
    public final int b;
    public final int c;
    public final int d;

    public IconRequest(String s, int i, int j, int k)
    {
        a = s;
        b = i;
        c = j;
        d = k;
    }

    public static IconRequest a(Context context, String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        int i = CommonUtils.l(context);
        Fabric.g().a("Fabric", (new StringBuilder()).append("App icon resource ID is ").append(i).toString());
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(context.getResources(), i, options);
        context = new IconRequest(s, i, options.outWidth, options.outHeight);
        return context;
        context;
        Fabric.g().d("Fabric", "Failed to load icon", context);
        return null;
    }
}
