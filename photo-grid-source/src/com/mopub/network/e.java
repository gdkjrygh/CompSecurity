// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.network;

import android.graphics.Bitmap;
import android.support.v4.util.LruCache;

final class e extends LruCache
{

    e(int i)
    {
        super(i);
    }

    protected final int sizeOf(Object obj, Object obj1)
    {
        obj = (String)obj;
        obj1 = (Bitmap)obj1;
        if (obj1 != null)
        {
            return ((Bitmap) (obj1)).getRowBytes() * ((Bitmap) (obj1)).getHeight();
        } else
        {
            return super.sizeOf(obj, obj1);
        }
    }
}
