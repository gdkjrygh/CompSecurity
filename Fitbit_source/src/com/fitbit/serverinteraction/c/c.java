// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction.c;

import android.content.Context;
import android.graphics.Bitmap;
import com.squareup.picasso.LruCache;

final class c extends LruCache
{

    public c(Context context)
    {
        super(context);
    }

    private static String a(String s)
    {
        return s.replaceAll("static[0-9]*\\.fitbit\\.com/", "static0.fitbit.com/").replaceAll("###.*", "");
    }

    public Bitmap get(String s)
    {
        return super.get(a(s));
    }

    public void set(String s, Bitmap bitmap)
    {
        super.set(a(s), bitmap);
    }
}
