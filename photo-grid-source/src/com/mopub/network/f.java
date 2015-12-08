// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.network;

import android.graphics.Bitmap;
import android.support.v4.util.LruCache;

final class f
    implements com.mopub.volley.toolbox.ImageLoader.ImageCache
{

    final LruCache a;

    f(LruCache lrucache)
    {
        a = lrucache;
        super();
    }

    public final Bitmap getBitmap(String s)
    {
        return (Bitmap)a.get(s);
    }

    public final void putBitmap(String s, Bitmap bitmap)
    {
        a.put(s, bitmap);
    }
}
